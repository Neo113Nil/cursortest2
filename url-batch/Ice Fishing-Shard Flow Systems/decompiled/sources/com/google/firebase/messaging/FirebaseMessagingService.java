package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p1.C0820c;
import y1.ThreadFactoryC1023a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC0319i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_FCM_REGISTERED = "com.google.firebase.messaging.FCM_REGISTERED";
    static final String ACTION_FCM_UNREGISTERED = "com.google.firebase.messaging.FCM_UNREGISTERED";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C0820c rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC0319i
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) z.a().f4538l).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01df  */
    @Override // com.google.firebase.messaging.AbstractServiceC0319i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        String stringExtra;
        FirebaseMessagingService firebaseMessagingService;
        C0820c c0820c;
        int i2;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            if (ACTION_FCM_REGISTERED.equals(action)) {
                onRegistered(intent.getStringExtra(EXTRA_TOKEN));
                return;
            } else {
                if (ACTION_FCM_UNREGISTERED.equals(action)) {
                    onUnregistered(intent.getStringExtra(EXTRA_TOKEN));
                    return;
                }
                Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
                return;
            }
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            Queue<String> queue = recentlyReceivedMessageIds;
            if (queue.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                firebaseMessagingService = this;
                if (firebaseMessagingService.rpc == null) {
                    firebaseMessagingService.rpc = new C0820c(getApplicationContext());
                }
                c0820c = firebaseMessagingService.rpc;
                if (c0820c.f7164c.c() < 233700000) {
                    AbstractC1053a.v(new IOException("SERVICE_NOT_AVAILABLE"));
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
                p1.l b7 = p1.l.b(c0820c.f7163b);
                synchronized (b7) {
                    i2 = b7.f7191a;
                    b7.f7191a = i2 + 1;
                }
                b7.c(new p1.k(i2, 3, bundle, 0));
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
                firebaseMessagingService = this;
                onDeletedMessages();
                if (firebaseMessagingService.rpc == null) {
                }
                c0820c = firebaseMessagingService.rpc;
                if (c0820c.f7164c.c() < 233700000) {
                }
                break;
            case "gcm":
                AbstractC1053a.z(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (l2.c.B(extras)) {
                    l2.c cVar = new l2.c(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1023a("Firebase-Messaging-Network-Io"));
                    firebaseMessagingService = this;
                    try {
                        if (new D0.j(firebaseMessagingService, cVar, newSingleThreadExecutor, 14, false).P()) {
                            if (firebaseMessagingService.rpc == null) {
                            }
                            c0820c = firebaseMessagingService.rpc;
                            if (c0820c.f7164c.c() < 233700000) {
                            }
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (AbstractC1053a.F(intent)) {
                                AbstractC1053a.A("_nf", intent.getExtras());
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                } else {
                    firebaseMessagingService = this;
                }
                onMessageReceived(new x(extras));
                if (firebaseMessagingService.rpc == null) {
                }
                c0820c = firebaseMessagingService.rpc;
                if (c0820c.f7164c.c() < 233700000) {
                }
                break;
            case "send_error":
                String stringExtra4 = intent.getStringExtra("google.message_id");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("message_id");
                }
                String stringExtra5 = intent.getStringExtra("error");
                y yVar = new y(stringExtra5);
                if (stringExtra5 != null) {
                    stringExtra5.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra4, yVar);
                firebaseMessagingService = this;
                if (firebaseMessagingService.rpc == null) {
                }
                c0820c = firebaseMessagingService.rpc;
                if (c0820c.f7164c.c() < 233700000) {
                }
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                firebaseMessagingService = this;
                if (firebaseMessagingService.rpc == null) {
                }
                c0820c = firebaseMessagingService.rpc;
                if (c0820c.f7164c.c() < 233700000) {
                }
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                firebaseMessagingService = this;
                if (firebaseMessagingService.rpc == null) {
                }
                c0820c = firebaseMessagingService.rpc;
                if (c0820c.f7164c.c() < 233700000) {
                }
                break;
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(x xVar) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onRegistered(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    public void onUnregistered(String str) {
    }

    public void setRpcForTesting(C0820c c0820c) {
        this.rpc = c0820c;
    }
}
