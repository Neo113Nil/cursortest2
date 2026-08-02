package R1;

import E.C0009j;
import T.C0086d;
import T.Q;
import T.T;
import W.C0112e;
import W.F;
import W.J;
import W.M;
import W.RunnableC0109b;
import W.p;
import W.r;
import W.s;
import a.AbstractC0124a;
import a0.C0127C;
import a0.C0130F;
import a0.C0134J;
import a0.C0136b;
import a0.C0137c;
import a0.C0155v;
import a0.SurfaceHolderCallbackC0125A;
import a0.g0;
import a0.l0;
import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.webkit.WebView;
import b.AbstractActivityC0253n;
import b.C0238A;
import c0.C0267A;
import c0.C0270c;
import c0.q;
import c0.x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.internal.a8;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.vk;
import com.startapp.sdk.internal.yk;
import com.startapp.sdk.internal.z7;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.C1353B;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2337c;

    public /* synthetic */ e(Object obj, int i4, Object obj2) {
        this.f2335a = i4;
        this.f2336b = obj;
        this.f2337c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        WifiManager.WifiLock wifiLock;
        int i4;
        long j4;
        boolean z;
        O2.d dVar;
        int i5 = 8;
        int i6 = 1;
        int i7 = 0;
        switch (this.f2335a) {
            case 0:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f2336b;
                JobParameters jobParameters = (JobParameters) this.f2337c;
                int i8 = JobInfoSchedulerService.f5750a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 1:
                Context context = (Context) this.f2336b;
                C0112e c0112e = (C0112e) this.f2337c;
                U.i.f3044a = (AudioManager) context.getSystemService("audio");
                c0112e.c();
                return;
            case 2:
                io.appmetrica.analytics.billing.impl.j.a((io.appmetrica.analytics.billing.impl.j) this.f2336b, (ProductInfo) this.f2337c);
                return;
            case 3:
                io.appmetrica.analytics.idsync.impl.n.a((io.appmetrica.analytics.idsync.impl.n) this.f2336b, (RequestConfig) this.f2337c);
                return;
            case 4:
                K3.n nVar = (K3.n) this.f2336b;
                Object apply = ((C0155v) this.f2337c).apply(nVar.f1600f);
                nVar.f1600f = apply;
                RunnableC0109b runnableC0109b = new RunnableC0109b(nVar, apply, i6);
                F f4 = (F) nVar.f1598d;
                if (f4.f3257a.getLooper().getThread().isAlive()) {
                    f4.c(runnableC0109b);
                    return;
                }
                return;
            case 5:
                s sVar = (s) this.f2336b;
                Context context2 = (Context) this.f2337c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new r(i7, sVar), intentFilter);
                return;
            case 6:
                r rVar = (r) this.f2336b;
                Context context3 = (Context) this.f2337c;
                s sVar2 = (s) rVar.f3335b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            if (type == 9) {
                                                i5 = 7;
                                            }
                                        }
                                        i5 = 5;
                                    }
                                }
                                i5 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i5 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i5 = 4;
                                    break;
                                case 13:
                                    i5 = 5;
                                    break;
                                case 16:
                                case C0583e9.f11743C /* 19 */:
                                default:
                                    i5 = 6;
                                    break;
                                case 18:
                                    i5 = 2;
                                    break;
                                case C0583e9.f11744D /* 20 */:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i5 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i5 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i5 != 5) {
                        sVar2.c(i5);
                        return;
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context3.getSystemService("phone");
                        telephonyManager.getClass();
                        p pVar = new p(sVar2);
                        telephonyManager.registerTelephonyCallback(sVar2.f3337a, pVar);
                        telephonyManager.unregisterTelephonyCallback(pVar);
                        return;
                    } catch (RuntimeException unused2) {
                        sVar2.c(5);
                        return;
                    }
                }
                i5 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                sVar2.c(i5);
                return;
            case 7:
                M m4 = (M) this.f2336b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2337c;
                l2.e eVar = (l2.e) m4.f3289f;
                eVar.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new e(eVar, i5, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 8:
                l2.e eVar2 = (l2.e) this.f2336b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f2337c;
                synchronized (eVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) eVar2.f14271c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 9:
                M m5 = (M) this.f2336b;
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.f2337c;
                l2.e eVar3 = (l2.e) m5.f3289f;
                eVar3.getClass();
                if (atomicBoolean3.get()) {
                    new Thread(new e(eVar3, 10, atomicBoolean3), "ExoPlayer:WifiLockManager").start();
                    return;
                }
                return;
            case 10:
                l2.e eVar4 = (l2.e) this.f2336b;
                AtomicBoolean atomicBoolean4 = (AtomicBoolean) this.f2337c;
                synchronized (eVar4) {
                    if (atomicBoolean4.get() && (wifiLock = (WifiManager.WifiLock) eVar4.f14271c) != null) {
                        wifiLock.release();
                    }
                }
                return;
            case 11:
                C0130F c0130f = (C0130F) this.f2336b;
                C0134J c0134j = (C0134J) this.f2337c;
                int i9 = c0130f.f3855J - c0134j.f3909a;
                c0130f.f3855J = i9;
                if (c0134j.f3911c) {
                    c0130f.f3856K = c0134j.f3912d;
                    c0130f.L = true;
                }
                if (i9 == 0) {
                    T t4 = ((g0) c0134j.f3913e).f4139a;
                    int i10 = -1;
                    if (!c0130f.f3886i0.f4139a.p() && t4.p()) {
                        c0130f.f3888j0 = -1;
                        c0130f.f3890k0 = 0L;
                    }
                    if (!t4.p()) {
                        List asList = Arrays.asList(((l0) t4).f4189h);
                        AbstractC0124a.t(asList.size() == c0130f.f3894q.size());
                        for (int i11 = 0; i11 < asList.size(); i11++) {
                            ((C0127C) c0130f.f3894q.get(i11)).f3842b = (T) asList.get(i11);
                        }
                    }
                    long j5 = -9223372036854775807L;
                    if (c0130f.L) {
                        boolean z4 = ((g0) c0134j.f3913e).f4139a.p() && c0130f.f3886i0.f4139a.p();
                        boolean equals = ((g0) c0134j.f3913e).f4140b.equals(c0130f.f3886i0.f4140b);
                        boolean z5 = ((g0) c0134j.f3913e).f4142d == c0130f.f3886i0.f4155s;
                        if (z4 || (equals && z5)) {
                            i6 = 0;
                        }
                        if (i6 != 0) {
                            i10 = c0130f.m();
                            if (t4.p() || ((g0) c0134j.f3913e).f4140b.b()) {
                                j5 = ((g0) c0134j.f3913e).f4142d;
                            } else {
                                g0 g0Var = (g0) c0134j.f3913e;
                                C1353B c1353b = g0Var.f4140b;
                                long j6 = g0Var.f4142d;
                                Object obj = c1353b.f14812a;
                                Q q4 = c0130f.f3893p;
                                t4.g(obj, q4);
                                j5 = j6 + q4.f2685e;
                            }
                        }
                        i4 = i10;
                        j4 = j5;
                        z = i6;
                    } else {
                        i4 = -1;
                        j4 = -9223372036854775807L;
                        z = 0;
                    }
                    c0130f.L = false;
                    c0130f.J((g0) c0134j.f3913e, 1, z, c0130f.f3856K, j4, i4);
                    return;
                }
                return;
            case 12:
                AbstractActivityC0253n this$0 = (AbstractActivityC0253n) this.f2336b;
                C0238A dispatcher = (C0238A) this.f2337c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(dispatcher, "$dispatcher");
                this$0.getLifecycle().a(new C0009j(dispatcher, 1, this$0));
                return;
            case 13:
                ((b0.h) this.f2336b).f5299d.reportTrackChangeEvent((TrackChangeEvent) this.f2337c);
                return;
            case 14:
                ((b0.h) this.f2336b).f5299d.reportNetworkEvent((NetworkEvent) this.f2337c);
                return;
            case 15:
                ((b0.h) this.f2336b).f5299d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f2337c);
                return;
            case 16:
                ((b0.h) this.f2336b).f5299d.reportPlaybackMetrics((PlaybackMetrics) this.f2337c);
                return;
            case 17:
                ((b0.h) this.f2336b).f5299d.reportPlaybackStateEvent((PlaybackStateEvent) this.f2337c);
                return;
            case 18:
                q qVar = (q) this.f2336b;
                synchronized (((C0137c) this.f2337c)) {
                }
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = qVar.f5601b;
                String str = J.f3263a;
                b0.d dVar2 = surfaceHolderCallbackC0125A.f3838a.f3897t;
                dVar2.l(dVar2.i((C1353B) dVar2.f5272d.f1637e), 1013, new b0.b(20));
                return;
            case C0583e9.f11743C /* 19 */:
                q qVar2 = (q) this.f2336b;
                C0136b c0136b = (C0136b) this.f2337c;
                SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A2 = qVar2.f5601b;
                String str2 = J.f3263a;
                l2.e.j(surfaceHolderCallbackC0125A2.f3838a.f3852G, c0136b);
                return;
            case C0583e9.f11744D /* 20 */:
                G1.c cVar = (G1.c) this.f2336b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f2337c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) cVar.f837d).post(new e(cVar, 21, routedDevice));
                    return;
                }
                return;
            case 21:
                G1.c cVar2 = (G1.c) this.f2336b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f2337c;
                if (((x) cVar2.f838e) == null || (dVar = ((C0267A) ((t1.h) cVar2.f836c).f15398b).f5405h) == null || audioDeviceInfo.equals((AudioDeviceInfo) dVar.f2054i)) {
                    return;
                }
                dVar.f2054i = audioDeviceInfo;
                dVar.a(C0270c.b((Context) dVar.f2047b, (C0086d) dVar.f2055j, audioDeviceInfo));
                return;
            case Build.API_LEVELS.API_22 /* 22 */:
                ((StartAppAd) this.f2336b).a((Activity) this.f2337c);
                return;
            case Build.API_LEVELS.API_23 /* 23 */:
                com.startapp.sdk.adsbase.periodic.a.a((com.startapp.sdk.adsbase.periodic.a) this.f2336b, (z7) this.f2337c);
                return;
            case 24:
                ((a8) this.f2336b).b((Boolean) this.f2337c);
                return;
            case 25:
                e7.a((Context) this.f2336b, null, "StartIoCachedAds", (Serializable) this.f2337c);
                return;
            case 26:
                gh.a((Context) this.f2336b, (Runnable) this.f2337c);
                return;
            case 27:
                ((vk) this.f2336b).a((String) this.f2337c);
                return;
            case Build.API_LEVELS.API_28 /* 28 */:
                ((WebView) this.f2336b).loadUrl((String) this.f2337c);
                return;
            default:
                yk.a((WebView) this.f2336b, (yk) this.f2337c);
                return;
        }
    }
}
