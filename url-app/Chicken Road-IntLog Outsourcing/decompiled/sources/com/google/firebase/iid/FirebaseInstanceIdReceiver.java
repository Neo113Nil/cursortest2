package com.google.firebase.iid;

import G0.y;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static SoftReference f5316a;

    /* renamed from: b, reason: collision with root package name */
    public static SoftReference f5317b;

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
            return PermissionsViewModel.DELAY_TIME_CALLBACK_CALL;
        }
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!AbstractC1341c.F(putExtras)) {
            return -1;
        }
        AbstractC1341c.w(putExtras.getExtras(), "_nd");
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = f5316a;
                ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService2 == null) {
                    executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new y("firebase-iid-executor")));
                    f5316a = new SoftReference(executorService2);
                }
                executorService = executorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable() { // from class: k1.i
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor;
                int i2;
                int i3;
                FirebaseInstanceIdReceiver firebaseInstanceIdReceiver = FirebaseInstanceIdReceiver.this;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z = isOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                firebaseInstanceIdReceiver.getClass();
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        i3 = FirebaseInstanceIdReceiver.a(intent3);
                    } else if (intent2.getExtras() == null) {
                        i3 = PermissionsViewModel.DELAY_TIME_CALLBACK_CALL;
                    } else {
                        C1205a c1205a = new C1205a(intent2);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (FirebaseInstanceIdReceiver.class) {
                            try {
                                SoftReference softReference2 = FirebaseInstanceIdReceiver.f5317b;
                                executor = softReference2 != null ? (Executor) softReference2.get() : null;
                                if (executor == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new y("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.f5317b = new SoftReference(executor);
                                }
                            } finally {
                            }
                        }
                        executor.execute(new B.l(context2, c1205a, countDownLatch, 5));
                        try {
                            i2 = ((Integer) B0.f.b(new f2.j(context2).b(intent2))).intValue();
                        } catch (InterruptedException | ExecutionException e3) {
                            Log.e("FirebaseMessaging", "Failed to send message to service.", e3);
                            i2 = PermissionsViewModel.DELAY_TIME_CALLBACK_CALL;
                        }
                        try {
                            if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                Log.w("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e6) {
                            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e6.toString()));
                        }
                        i3 = i2;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i3);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            }
        });
    }
}
