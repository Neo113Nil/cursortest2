package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import defpackage.ds3;
import defpackage.ic2;
import defpackage.mi2;
import defpackage.vs3;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private ic2 rpc;

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable(Constants.TAG, 3)) {
            return true;
        }
        Log.d(Constants.TAG, "Received duplicate message: " + str);
        return true;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (NotificationParams.isNotification(extras)) {
            NotificationParams notificationParams = new NotificationParams(extras);
            ExecutorService newNetworkIOExecutor = FcmExecutors.newNetworkIOExecutor();
            try {
                if (new DisplayNotification(this, notificationParams, newNetworkIOExecutor).handleNotification()) {
                    return;
                }
                newNetworkIOExecutor.shutdown();
                if (MessagingAnalytics.shouldUploadScionMetrics(intent)) {
                    MessagingAnalytics.logNotificationForeground(intent);
                }
            } finally {
                newNetworkIOExecutor.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        return stringExtra == null ? intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER) : stringExtra;
    }

    private ic2 getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new ic2(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        int i;
        if (!alreadyReceivedMessage(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID))) {
            passMessageIntentToSdk(intent);
        }
        ic2 rpc = getRpc(this);
        if (rpc.c.u() < 233700000) {
            mi2.i(new IOException("SERVICE_NOT_AVAILABLE"));
            return;
        }
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        bundle.putString(Constants.MessagePayloadKeys.MSGID, stringExtra);
        Integer valueOf = intent.hasExtra(Constants.MessagePayloadKeys.PRODUCT_ID) ? Integer.valueOf(intent.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, 0)) : null;
        if (valueOf != null) {
            bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, valueOf.intValue());
        }
        vs3 j = vs3.j(rpc.b);
        synchronized (j) {
            i = j.a;
            j.a = i + 1;
        }
        j.k(new ds3(i, 3, bundle, 0));
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = Constants.MessageTypes.MESSAGE;
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                MessagingAnalytics.logNotificationReceived(intent);
                dispatchMessage(intent);
                break;
            case "send_error":
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID));
                break;
            default:
                Log.w(Constants.TAG, "Received message with unknown type: ".concat(stringExtra));
                break;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return ServiceStarter.getInstance().getMessagingEvent();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d(Constants.TAG, "Unknown intent action: " + intent.getAction());
        }
    }

    public void setRpcForTesting(ic2 ic2Var) {
        this.rpc = ic2Var;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }
}
