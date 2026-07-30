package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Do, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2527Do {

    /* renamed from: d, reason: collision with root package name */
    public final long f24558d;

    /* renamed from: f, reason: collision with root package name */
    public final Context f24560f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f24561g;

    /* renamed from: h, reason: collision with root package name */
    public final C2781Sn f24562h;
    public final SD i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f24563j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f24564k;

    /* renamed from: l, reason: collision with root package name */
    public final C3542lo f24565l;

    /* renamed from: m, reason: collision with root package name */
    public final C5107a f24566m;

    /* renamed from: o, reason: collision with root package name */
    public final C3916sl f24568o;

    /* renamed from: p, reason: collision with root package name */
    public final Zu f24569p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24555a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24556b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24557c = false;

    /* renamed from: e, reason: collision with root package name */
    public final C3320hg f24559e = new C3320hg();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f24567n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f24570q = true;

    public C2527Do(Executor executor, Context context, WeakReference weakReference, SD sd, C2781Sn c2781Sn, ScheduledExecutorService scheduledExecutorService, C3542lo c3542lo, C5107a c5107a, C3916sl c3916sl, Zu zu) {
        this.f24562h = c2781Sn;
        this.f24560f = context;
        this.f24561g = weakReference;
        this.i = sd;
        this.f24564k = scheduledExecutorService;
        this.f24563j = executor;
        this.f24565l = c3542lo;
        this.f24566m = c5107a;
        this.f24568o = c3916sl;
        this.f24569p = zu;
        p2.j.f39798C.f39810k.getClass();
        this.f24558d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        if (!((Boolean) AbstractC2751Ra.f27373a.r()).booleanValue()) {
            int i = this.f24566m.f41219v;
            C3151ea c3151ea = AbstractC3368ia.f31800u2;
            q2.r rVar = q2.r.f40116e;
            if (i >= ((Integer) rVar.f40119c.a(c3151ea)).intValue() && this.f24570q) {
                if (this.f24555a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f24555a) {
                            return;
                        }
                        this.f24565l.d();
                        this.f24568o.c();
                        C3320hg c3320hg = this.f24559e;
                        final int i4 = 0;
                        Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ao

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C2527Do f23903u;

                            {
                                this.f23903u = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        C2527Do c2527Do = this.f23903u;
                                        C3542lo c3542lo = c2527Do.f24565l;
                                        synchronized (c3542lo) {
                                            try {
                                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31445G2)).booleanValue() && !c3542lo.f32596d) {
                                                    HashMap e6 = c3542lo.e();
                                                    e6.put(NativeAdvancedJsUtils.f18064p, "init_finished");
                                                    ArrayList arrayList = c3542lo.f32594b;
                                                    arrayList.add(e6);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        c3542lo.f32598f.b((Map) it.next());
                                                    }
                                                    c3542lo.f32596d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        c2527Do.f24568o.f();
                                        c2527Do.f24556b = true;
                                        return;
                                    default:
                                        C2527Do c2527Do2 = this.f23903u;
                                        synchronized (c2527Do2) {
                                            try {
                                                if (c2527Do2.f24557c) {
                                                    return;
                                                }
                                                p2.j.f39798C.f39810k.getClass();
                                                c2527Do2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2527Do2.f24558d), "Timeout.", false);
                                                c2527Do2.f24565l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2527Do2.f24568o.i("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2527Do2.f24559e.b(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        };
                        SD sd = this.i;
                        c3320hg.f31242n.c(runnable, sd);
                        this.f24555a = true;
                        J3.a c4 = c();
                        final int i9 = 1;
                        this.f24564k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ao

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C2527Do f23903u;

                            {
                                this.f23903u = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i9) {
                                    case 0:
                                        C2527Do c2527Do = this.f23903u;
                                        C3542lo c3542lo = c2527Do.f24565l;
                                        synchronized (c3542lo) {
                                            try {
                                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31445G2)).booleanValue() && !c3542lo.f32596d) {
                                                    HashMap e6 = c3542lo.e();
                                                    e6.put(NativeAdvancedJsUtils.f18064p, "init_finished");
                                                    ArrayList arrayList = c3542lo.f32594b;
                                                    arrayList.add(e6);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        c3542lo.f32598f.b((Map) it.next());
                                                    }
                                                    c3542lo.f32596d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        c2527Do.f24568o.f();
                                        c2527Do.f24556b = true;
                                        return;
                                    default:
                                        C2527Do c2527Do2 = this.f23903u;
                                        synchronized (c2527Do2) {
                                            try {
                                                if (c2527Do2.f24557c) {
                                                    return;
                                                }
                                                p2.j.f39798C.f39810k.getClass();
                                                c2527Do2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2527Do2.f24558d), "Timeout.", false);
                                                c2527Do2.f24565l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2527Do2.f24568o.i("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2527Do2.f24559e.b(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        }, ((Long) rVar.f40119c.a(AbstractC3368ia.f31818w2)).longValue(), TimeUnit.SECONDS);
                        c4.c(new MD(0, c4, new C3761pr(this)), sd);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f24555a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f24559e.a(Boolean.FALSE);
        this.f24555a = true;
        this.f24556b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f24567n;
        for (String str : concurrentHashMap.keySet()) {
            C4015uc c4015uc = (C4015uc) concurrentHashMap.get(str);
            arrayList.add(new C4015uc(str, c4015uc.f34622v, c4015uc.f34623w, c4015uc.f34621u));
        }
        return arrayList;
    }

    public final synchronized J3.a c() {
        p2.j jVar = p2.j.f39798C;
        String str = jVar.f39808h.g().n().f28423e;
        if (!TextUtils.isEmpty(str)) {
            return C3686oN.c(str);
        }
        C3320hg c3320hg = new C3320hg();
        t2.E g9 = jVar.f39808h.g();
        g9.f40832c.add(new MD(28, this, c3320hg));
        return c3320hg;
    }

    public final void d(String str, int i, String str2, boolean z8) {
        this.f24567n.put(str, new C4015uc(str, i, str2, z8));
    }
}
