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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends g {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_FCM_REGISTERED = "com.google.firebase.messaging.FCM_REGISTERED";
    static final String ACTION_FCM_UNREGISTERED = "com.google.firebase.messaging.FCM_UNREGISTERED";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private y6.c rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.g
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) v.c().f3178r).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e0  */
    @Override // com.google.firebase.messaging.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        String stringExtra;
        FirebaseMessagingService firebaseMessagingService;
        y6.c cVar;
        int i3;
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
                    firebaseMessagingService.rpc = new y6.c(getApplicationContext());
                }
                cVar = firebaseMessagingService.rpc;
                if (cVar.f10636c.p() < 233700000) {
                    z4.w.p(new IOException("SERVICE_NOT_AVAILABLE"));
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
                y6.l k10 = y6.l.k(cVar.f10635b);
                synchronized (k10) {
                    i3 = k10.f10659d;
                    k10.f10659d = i3 + 1;
                }
                k10.l(new y6.k(i3, 3, bundle, 0));
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
                cVar = firebaseMessagingService.rpc;
                if (cVar.f10636c.p() < 233700000) {
                }
                break;
            case "gcm":
                e0.g(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (d9.c.p(extras)) {
                    d9.c cVar2 = new d9.c(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new h7.a("Firebase-Messaging-Network-Io"));
                    firebaseMessagingService = this;
                    try {
                        if (new a1.n(firebaseMessagingService, cVar2, newSingleThreadExecutor, 13, false).v()) {
                            if (firebaseMessagingService.rpc == null) {
                            }
                            cVar = firebaseMessagingService.rpc;
                            if (cVar.f10636c.p() < 233700000) {
                            }
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (e0.i(intent)) {
                                e0.h("_nf", intent.getExtras());
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                } else {
                    firebaseMessagingService = this;
                }
                onMessageReceived(new u(extras));
                if (firebaseMessagingService.rpc == null) {
                }
                cVar = firebaseMessagingService.rpc;
                if (cVar.f10636c.p() < 233700000) {
                }
                break;
            case "send_error":
                String stringExtra4 = intent.getStringExtra("google.message_id");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("message_id");
                }
                String stringExtra5 = intent.getStringExtra("error");
                b1.j jVar = new b1.j(stringExtra5, 7);
                if (stringExtra5 != null) {
                    stringExtra5.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra4, jVar);
                firebaseMessagingService = this;
                if (firebaseMessagingService.rpc == null) {
                }
                cVar = firebaseMessagingService.rpc;
                if (cVar.f10636c.p() < 233700000) {
                }
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                firebaseMessagingService = this;
                if (firebaseMessagingService.rpc == null) {
                }
                cVar = firebaseMessagingService.rpc;
                if (cVar.f10636c.p() < 233700000) {
                }
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                firebaseMessagingService = this;
                if (firebaseMessagingService.rpc == null) {
                }
                cVar = firebaseMessagingService.rpc;
                if (cVar.f10636c.p() < 233700000) {
                }
                break;
        }
    }

    public void setRpcForTesting(y6.c cVar) {
        this.rpc = cVar;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(u uVar) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onRegistered(String str) {
    }

    public void onUnregistered(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }
}
