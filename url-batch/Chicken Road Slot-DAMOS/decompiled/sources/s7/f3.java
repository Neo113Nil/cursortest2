package s7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.measurement.cf;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.onesignal.core.activities.PermissionsActivity;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Parcelable f8695e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f8696i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8697r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8698s;

    public f3(l3 l3Var, r4 r4Var, boolean z10, e eVar) {
        this.f8694d = 2;
        this.f8695e = r4Var;
        this.f8696i = z10;
        this.f8698s = eVar;
        Objects.requireNonNull(l3Var);
        this.f8697r = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i3;
        switch (this.f8694d) {
            case 0:
                l3 l3Var = (l3) this.f8697r;
                h0 h0Var = l3Var.f8813r;
                if (h0Var == null) {
                    v0 v0Var = ((q1) l3Var.f1478d).f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.a("Discarding data. Failed to set user property");
                    return;
                } else {
                    l3Var.K(h0Var, this.f8696i ? null : (m4) this.f8698s, (r4) this.f8695e);
                    l3Var.F();
                    return;
                }
            case 1:
                l3 l3Var2 = (l3) this.f8697r;
                h0 h0Var2 = l3Var2.f8813r;
                if (h0Var2 == null) {
                    v0 v0Var2 = ((q1) l3Var2.f1478d).f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.a("Discarding data. Failed to send event to service");
                    return;
                } else {
                    l3Var2.K(h0Var2, this.f8696i ? null : (u) this.f8698s, (r4) this.f8695e);
                    l3Var2.F();
                    return;
                }
            case 2:
                l3 l3Var3 = (l3) this.f8697r;
                h0 h0Var3 = l3Var3.f8813r;
                if (h0Var3 == null) {
                    v0 v0Var3 = ((q1) l3Var3.f1478d).f8937t;
                    q1.l(v0Var3);
                    v0Var3.f9050t.a("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    l3Var3.K(h0Var3, this.f8696i ? null : (e) this.f8698s, (r4) this.f8695e);
                    l3Var3.F();
                    return;
                }
            default:
                Intent intent = (Intent) this.f8695e;
                Context context = (Context) this.f8698s;
                boolean z10 = this.f8696i;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f8697r;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i3 = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        Bundle extras = intent.getExtras();
                        int i10 = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
                        if (extras != null) {
                            y6.a aVar = new y6.a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f3074b;
                                    executor = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h7.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f3074b = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new cf((Object) context, (Object) aVar, (Object) countDownLatch, 15));
                            try {
                                i10 = ((Integer) z4.w.f(new com.google.firebase.messaging.j(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e2) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e9) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e9.toString()));
                            }
                        }
                        i3 = i10;
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(i3);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ f3(l3 l3Var, r4 r4Var, boolean z10, d7.a aVar, int i3) {
        this.f8694d = i3;
        this.f8695e = r4Var;
        this.f8696i = z10;
        this.f8698s = aVar;
        this.f8697r = l3Var;
    }

    public /* synthetic */ f3(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f8694d = 3;
        this.f8695e = intent;
        this.f8698s = context;
        this.f8696i = z10;
        this.f8697r = pendingResult;
    }
}
