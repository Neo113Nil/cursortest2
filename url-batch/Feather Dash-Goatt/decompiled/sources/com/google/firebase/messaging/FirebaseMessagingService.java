package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import defpackage.d91;
import defpackage.i8;
import defpackage.ka0;
import defpackage.nq0;
import defpackage.o21;
import defpackage.o91;
import defpackage.po0;
import defpackage.t41;
import defpackage.t80;
import defpackage.vu1;
import defpackage.xu1;
import defpackage.xv;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends xv {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private t41 rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // defpackage.xv
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) o91.i().h).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b8  */
    @Override // defpackage.xv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        String stringExtra;
        t41 t41Var;
        int i;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            Queue<String> queue = recentlyReceivedMessageIds;
            if (queue.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.rpc == null) {
                    this.rpc = new t41(getApplicationContext());
                }
                t41Var = this.rpc;
                if (t41Var.c.k() >= 233700000) {
                    t80.o(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle = new Bundle();
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                bundle.putString("google.message_id", stringExtra3);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle.putInt("google.product_id", valueOf.intValue());
                }
                xu1 k = xu1.k(t41Var.b);
                synchronized (k) {
                    i = k.a;
                    k.a = i + 1;
                }
                k.l(new vu1(i, 3, bundle, 0));
                return;
            }
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                ka0.w(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (nq0.B(extras)) {
                    nq0 nq0Var = new nq0(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new po0("Firebase-Messaging-Network-Io"));
                    try {
                        if (new i8(this, nq0Var, newSingleThreadExecutor).j()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (ka0.G(intent)) {
                                ka0.x(intent.getExtras(), "_nf");
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                onMessageReceived(new o21(extras));
                break;
            case "send_error":
                String stringExtra4 = intent.getStringExtra("google.message_id");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("message_id");
                }
                String stringExtra5 = intent.getStringExtra("error");
                d91 d91Var = new d91(stringExtra5);
                if (stringExtra5 != null) {
                    stringExtra5.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra4, d91Var);
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        if (this.rpc == null) {
        }
        t41Var = this.rpc;
        if (t41Var.c.k() >= 233700000) {
        }
    }

    public void setRpcForTesting(t41 t41Var) {
        this.rpc = t41Var;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(o21 o21Var) {
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
