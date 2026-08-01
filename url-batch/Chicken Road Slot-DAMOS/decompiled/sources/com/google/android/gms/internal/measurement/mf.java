package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class mf {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f2542a;

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f2543b;

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f2544c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f2545d;

    static {
        b8.i.m(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f2542a = new AtomicReference(b8.y.f1460x);
        f2543b = new h1(17);
        f2544c = new WeakHashMap();
        f2545d = new g0(1);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static bg a() {
        ag c10 = c();
        bg bgVar = c10.f2149b;
        if (bgVar != null && bgVar != sf.f2803u) {
            return bgVar;
        }
        b1.j jVar = qf.f2716u;
        UUID b10 = nf.f2582c.b();
        String a9 = ff.a(b10);
        b8.i iVar = (b8.i) f2542a.get();
        if (!iVar.isEmpty()) {
            iVar.forEach(new pf(0));
        }
        return new qf(b10, a9, qf.f2716u, c10);
    }

    public static bg b(ag agVar, bg bgVar) {
        boolean equals;
        agVar.getClass();
        bg bgVar2 = agVar.f2149b;
        if (bgVar2 != bgVar) {
            if (bgVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    equals = Trace.isEnabled();
                } else {
                    td.f2826a.getClass();
                    f2543b.getClass();
                    String str = "false";
                    try {
                        str = (String) ud.f2855a.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e2) {
                        Log.e("SystemProperties", "get error", e2);
                    }
                    equals = str.equals("true");
                }
                agVar.f2148a = equals;
            }
            if (agVar.f2148a) {
                if (bgVar2 != null) {
                    if (bgVar != null) {
                        if (((ff) bgVar2).f2295d == bgVar && !g1.g(bgVar2)) {
                            Trace.endSection();
                        } else if (bgVar2 == ((ff) bgVar).f2295d && !g1.g(bgVar)) {
                            g1.h(bgVar);
                        }
                    }
                    g1.f(bgVar2);
                }
                if (bgVar != null) {
                    g1.e(bgVar);
                }
            }
            if (bgVar2 != bgVar) {
                agVar.f2149b = bgVar;
                return bgVar2;
            }
        }
        return bgVar;
    }

    public static ag c() {
        return (ag) f2545d.get();
    }
}
