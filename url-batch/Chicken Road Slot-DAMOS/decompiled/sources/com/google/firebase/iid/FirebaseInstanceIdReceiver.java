package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.e0;
import com.onesignal.core.activities.PermissionsActivity;
import h7.a;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s7.f3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static SoftReference f3073a;

    /* renamed from: b, reason: collision with root package name */
    public static SoftReference f3074b;

    public static int a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        }
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!e0.i(putExtras)) {
            return -1;
        }
        e0.h("_nd", putExtras.getExtras());
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        boolean isOrderedBroadcast = isOrderedBroadcast();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = f3073a;
                ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService2 == null) {
                    executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new a("firebase-iid-executor")));
                    f3073a = new SoftReference(executorService2);
                }
                executorService = executorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new f3(this, intent, context, isOrderedBroadcast, goAsync));
    }
}
