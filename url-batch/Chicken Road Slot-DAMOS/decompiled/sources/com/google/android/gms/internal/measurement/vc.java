package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class vc {

    /* renamed from: i, reason: collision with root package name */
    public static final v5 f2884i = new v5(14);
    public static final nc j;

    /* renamed from: a, reason: collision with root package name */
    public volatile b7.h f2885a;

    /* renamed from: b, reason: collision with root package name */
    public final sa f2886b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2887c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2888d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2889e;

    /* renamed from: f, reason: collision with root package name */
    public final b8.i f2890f;
    public final v5 g;

    /* renamed from: h, reason: collision with root package name */
    public final a1.n f2891h;

    static {
        e3 e3Var = e3.f2249i;
        int i3 = b8.i.f1427i;
        j = new nc(e3Var, false, b8.y.f1460x);
    }

    public vc(sa saVar, nc ncVar) {
        this.f2886b = saVar;
        Context context = saVar.f2787b;
        String str = ncVar.f2580d;
        if (str == null) {
            str = (String) ncVar.f2577a.apply(context);
            ncVar.f2580d = str;
        }
        this.f2887c = str;
        this.f2888d = "";
        this.f2889e = ncVar.f2578b;
        this.f2890f = ncVar.f2579c;
        this.f2885a = null;
        this.g = new v5(15);
        this.f2891h = new a1.n(saVar, str);
    }

    public final b7.h a() {
        b7.h hVar;
        b7.h hVar2 = this.f2885a;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (this) {
            try {
                hVar = this.f2885a;
                if (hVar == null) {
                    StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        b7.h M = this.f2891h.M();
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        int i3 = ((md) M.f1296e).f2540b - 2;
                        if (i3 != 15 && i3 != 16) {
                            sa saVar = this.f2886b;
                            saVar.g.a();
                            if (this.f2889e || this.f2891h.P() || !((String) M.f1293b).isEmpty()) {
                                final int i10 = 3;
                                saVar.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.pc

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ vc f2674e;

                                    {
                                        this.f2674e = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        sa saVar2;
                                        a8.i iVar;
                                        a8.i iVar2;
                                        f8.g0 g0Var;
                                        f8.a b10;
                                        int i11 = 2;
                                        int i12 = 1;
                                        int i13 = 0;
                                        switch (i10) {
                                            case 0:
                                                this.f2674e.b();
                                                return;
                                            case 1:
                                                vc vcVar = this.f2674e;
                                                sa saVar3 = vcVar.f2886b;
                                                String str = vcVar.f2887c;
                                                ye yeVar = ad.f2142a;
                                                Object obj = h1.f2356i;
                                                byte b11 = (byte) (((byte) 2) | 1);
                                                Context context = saVar3.f2787b;
                                                Pattern pattern = de.f2235a;
                                                ra raVar = new ra(context);
                                                raVar.j("phenotype");
                                                raVar.k("all_accounts.pb");
                                                Uri l10 = raVar.l();
                                                if (l10 == null) {
                                                    a2.r.j("Null uri");
                                                    return;
                                                }
                                                ec u2 = ec.u();
                                                if (u2 == null) {
                                                    a2.r.j("Null schema");
                                                    return;
                                                }
                                                ye yeVar2 = ad.f2142a;
                                                yeVar2.getClass();
                                                a8.i iVar3 = new a8.i(yeVar2);
                                                byte b12 = (byte) (b11 | 2);
                                                b8.d dVar = b8.g.f1423e;
                                                b8.s sVar = b8.s.f1440s;
                                                if (b12 != 3) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    if ((b12 & 1) == 0) {
                                                        sb2.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((2 & b12) == 0) {
                                                        sb2.append(" enableTracing");
                                                    }
                                                    kotlin.collections.i0.l("Missing required properties:".concat(sb2.toString()));
                                                    return;
                                                }
                                                pe peVar = new pe(l10, u2, iVar3, sVar);
                                                se seVar = ad.f2144c;
                                                if (seVar == null) {
                                                    synchronized (ad.f2143b) {
                                                        try {
                                                            seVar = ad.f2144c;
                                                            if (seVar == null) {
                                                                HashMap hashMap = new HashMap();
                                                                f8.u0 a9 = saVar3.a();
                                                                zd zdVar = (zd) saVar3.f2791f.get();
                                                                z10 = true;
                                                                te teVar = te.f2827a;
                                                                saVar2 = saVar3;
                                                                iVar = iVar3;
                                                                i7.a.u(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                hashMap.put("singleproc", teVar);
                                                                se seVar2 = new se(a9, zdVar, hashMap);
                                                                ad.f2144c = seVar2;
                                                                seVar = seVar2;
                                                            } else {
                                                                z10 = true;
                                                                saVar2 = saVar3;
                                                                iVar = iVar3;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                } else {
                                                    z10 = true;
                                                    saVar2 = saVar3;
                                                    iVar = iVar3;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) seVar.f2798d;
                                                Pair pair = (Pair) concurrentHashMap.get(l10);
                                                if (pair == null) {
                                                    i7.a.u(l10.isHierarchical(), "Uri must be hierarchical: %s", l10);
                                                    String lastPathSegment = l10.getLastPathSegment();
                                                    int i14 = a8.h.f344a;
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    i7.a.u((lastIndexOf == -1 ? "" : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", l10);
                                                    te teVar2 = (te) ((HashMap) seVar.f2802s).get("singleproc");
                                                    i7.a.u(teVar2 != null ? z10 : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = l10.getLastPathSegment();
                                                    if (lastPathSegment2 == null) {
                                                        lastPathSegment2 = "";
                                                    }
                                                    int lastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                    if (lastIndexOf2 != -1) {
                                                        lastPathSegment2 = lastPathSegment2.substring(0, lastIndexOf2);
                                                    }
                                                    f8.s g = f8.l0.g(f8.l0.d(l10), (ib) seVar.f2801r, f8.d0.f4128d);
                                                    Executor executor = (Executor) seVar.f2799e;
                                                    zd zdVar2 = (zd) seVar.f2800i;
                                                    teVar2.getClass();
                                                    iVar2 = iVar;
                                                    re reVar = new re(new c2.b1(lastPathSegment2, f8.l0.d(l10), new ze(u2, c1.a()), executor, zdVar2, iVar, new h1(19)), g);
                                                    if (!sVar.isEmpty()) {
                                                        dd ddVar = new dd(z10 ? 1 : 0, sVar, executor);
                                                        synchronized (reVar.g) {
                                                            reVar.f2763i.add(ddVar);
                                                        }
                                                    }
                                                    pair = Pair.create(reVar, peVar);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(l10, pair);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                    }
                                                } else {
                                                    iVar2 = iVar;
                                                }
                                                re reVar2 = (re) pair.first;
                                                pe peVar2 = (pe) pair.second;
                                                if (peVar.equals(peVar2)) {
                                                    f8.t a10 = reVar2.a(new tc(1, str), saVar2.a());
                                                    a10.a(new rc(vcVar, a10, 0), saVar2.a());
                                                    return;
                                                }
                                                String y3 = k7.e.y("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", ec.class.getSimpleName(), l10);
                                                i7.a.u(l10.equals(peVar2.f2675a), y3, "uri");
                                                i7.a.u(u2.equals(peVar2.f2676b), y3, "schema");
                                                i7.a.u(iVar2.equals(peVar2.f2677c), y3, "handler");
                                                i7.a.u(sVar.equals(peVar2.f2678d), y3, "migrations");
                                                i7.a.u(obj.equals(obj), y3, "variantConfig");
                                                te.a1.e(k7.e.y(y3, "unknown"));
                                                return;
                                            case 2:
                                                vc vcVar2 = this.f2674e;
                                                fd fdVar = vcVar2.f2886b.f2793i;
                                                boolean z11 = vcVar2.f2889e;
                                                sc scVar = sc.f2797a;
                                                jd jdVar = (jd) fdVar.f2290c.get();
                                                if (jdVar == null && !z11) {
                                                    f8.o0 o0Var = f8.o0.f4157e;
                                                    return;
                                                }
                                                if ((fdVar.f2292e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = fdVar.f2293f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i15 = fdVar.f2292e;
                                                            if ((i15 & 64) == 0) {
                                                                copyOnWriteArrayList.add(scVar);
                                                                fdVar.f2292e = i15 | 64;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (fdVar.f2294h == null) {
                                                    synchronized (fdVar.g) {
                                                        try {
                                                            if (fdVar.f2294h == null) {
                                                                if (jdVar == null) {
                                                                    jdVar = ed.f2263a;
                                                                }
                                                                Context context2 = fdVar.f2288a;
                                                                if (ia.s(context2)) {
                                                                    f8.g0 a11 = ((jb) fdVar.f2291d.get()).a(new l5(fdVar, jdVar));
                                                                    fdVar.f2294h = a11;
                                                                    g0Var = a11;
                                                                } else {
                                                                    cd cdVar = cd.f2195e;
                                                                    a8.m mVar = fdVar.f2289b;
                                                                    f8.g0 g2 = f8.l0.g(ia.j(context2, Executors.callable(cdVar, null), (Executor) mVar.get()), new dd(i13, fdVar, jdVar), (Executor) mVar.get());
                                                                    fdVar.f2294h = g2;
                                                                    g0Var = g2;
                                                                }
                                                                g0Var.a(new bd(i11, g0Var), (Executor) fdVar.f2289b.get());
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                vc vcVar3 = this.f2674e;
                                                b7.h a12 = vcVar3.a();
                                                String str2 = (String) a12.f1293b;
                                                sa saVar4 = vcVar3.f2886b;
                                                a8.m mVar2 = saVar4.f2789d;
                                                kd b13 = saVar4.g.b();
                                                boolean z12 = b13.f2460i;
                                                if (b13.j) {
                                                    if (a8.h.a(str2) && !z12) {
                                                        f8.o0 o0Var2 = f8.o0.f4157e;
                                                        return;
                                                    }
                                                    za u10 = cb.u();
                                                    md mdVar = (md) a12.f1296e;
                                                    int i16 = mdVar.f2539a;
                                                    ab t6 = bb.t();
                                                    t6.b();
                                                    ((bb) t6.f2389e).u(i16);
                                                    int i17 = mdVar.f2540b;
                                                    t6.b();
                                                    ((bb) t6.f2389e).v(i17);
                                                    bb bbVar = (bb) t6.d();
                                                    u10.b();
                                                    ((cb) u10.f2389e).w(bbVar);
                                                    if (!a8.h.a(str2)) {
                                                        u10.b();
                                                        ((cb) u10.f2389e).v(str2);
                                                    }
                                                    if (z12) {
                                                        String str3 = vcVar3.f2887c;
                                                        u10.b();
                                                        ((cb) u10.f2389e).x(str3);
                                                    }
                                                    jb jbVar = (jb) mVar2.get();
                                                    cb cbVar = (cb) u10.d();
                                                    da daVar = jbVar.f2428a;
                                                    a8.l b14 = a8.l.b();
                                                    b14.f358c = new v5(7, cbVar);
                                                    b14.f359d = new z6.d[]{h.f2349a};
                                                    b14.f356a = false;
                                                    b10 = jb.b(daVar.b(0, b14.a()).g(f8.d0.f4128d, new l5(i12, daVar, cbVar)));
                                                } else {
                                                    if (a8.h.a(str2)) {
                                                        f8.o0 o0Var3 = f8.o0.f4157e;
                                                        return;
                                                    }
                                                    jb jbVar2 = (jb) mVar2.get();
                                                    jbVar2.getClass();
                                                    str2.getClass();
                                                    b10 = jb.b(jbVar2.f2428a.c(str2));
                                                }
                                                f8.l0.a(b10, hb.class, new qc(i13, vcVar3), saVar4.a());
                                                return;
                                        }
                                    }
                                });
                                saVar.f2786a.O((v0) M.f1294c, this.f2890f, this.f2887c);
                                if (!this.f2888d.equals("")) {
                                    final int i11 = 1;
                                    saVar.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.pc

                                        /* renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ vc f2674e;

                                        {
                                            this.f2674e = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z10;
                                            sa saVar2;
                                            a8.i iVar;
                                            a8.i iVar2;
                                            f8.g0 g0Var;
                                            f8.a b10;
                                            int i112 = 2;
                                            int i12 = 1;
                                            int i13 = 0;
                                            switch (i11) {
                                                case 0:
                                                    this.f2674e.b();
                                                    return;
                                                case 1:
                                                    vc vcVar = this.f2674e;
                                                    sa saVar3 = vcVar.f2886b;
                                                    String str = vcVar.f2887c;
                                                    ye yeVar = ad.f2142a;
                                                    Object obj = h1.f2356i;
                                                    byte b11 = (byte) (((byte) 2) | 1);
                                                    Context context = saVar3.f2787b;
                                                    Pattern pattern = de.f2235a;
                                                    ra raVar = new ra(context);
                                                    raVar.j("phenotype");
                                                    raVar.k("all_accounts.pb");
                                                    Uri l10 = raVar.l();
                                                    if (l10 == null) {
                                                        a2.r.j("Null uri");
                                                        return;
                                                    }
                                                    ec u2 = ec.u();
                                                    if (u2 == null) {
                                                        a2.r.j("Null schema");
                                                        return;
                                                    }
                                                    ye yeVar2 = ad.f2142a;
                                                    yeVar2.getClass();
                                                    a8.i iVar3 = new a8.i(yeVar2);
                                                    byte b12 = (byte) (b11 | 2);
                                                    b8.d dVar = b8.g.f1423e;
                                                    b8.s sVar = b8.s.f1440s;
                                                    if (b12 != 3) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        if ((b12 & 1) == 0) {
                                                            sb2.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((2 & b12) == 0) {
                                                            sb2.append(" enableTracing");
                                                        }
                                                        kotlin.collections.i0.l("Missing required properties:".concat(sb2.toString()));
                                                        return;
                                                    }
                                                    pe peVar = new pe(l10, u2, iVar3, sVar);
                                                    se seVar = ad.f2144c;
                                                    if (seVar == null) {
                                                        synchronized (ad.f2143b) {
                                                            try {
                                                                seVar = ad.f2144c;
                                                                if (seVar == null) {
                                                                    HashMap hashMap = new HashMap();
                                                                    f8.u0 a9 = saVar3.a();
                                                                    zd zdVar = (zd) saVar3.f2791f.get();
                                                                    z10 = true;
                                                                    te teVar = te.f2827a;
                                                                    saVar2 = saVar3;
                                                                    iVar = iVar3;
                                                                    i7.a.u(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    hashMap.put("singleproc", teVar);
                                                                    se seVar2 = new se(a9, zdVar, hashMap);
                                                                    ad.f2144c = seVar2;
                                                                    seVar = seVar2;
                                                                } else {
                                                                    z10 = true;
                                                                    saVar2 = saVar3;
                                                                    iVar = iVar3;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        z10 = true;
                                                        saVar2 = saVar3;
                                                        iVar = iVar3;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) seVar.f2798d;
                                                    Pair pair = (Pair) concurrentHashMap.get(l10);
                                                    if (pair == null) {
                                                        i7.a.u(l10.isHierarchical(), "Uri must be hierarchical: %s", l10);
                                                        String lastPathSegment = l10.getLastPathSegment();
                                                        int i14 = a8.h.f344a;
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        i7.a.u((lastIndexOf == -1 ? "" : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", l10);
                                                        te teVar2 = (te) ((HashMap) seVar.f2802s).get("singleproc");
                                                        i7.a.u(teVar2 != null ? z10 : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = l10.getLastPathSegment();
                                                        if (lastPathSegment2 == null) {
                                                            lastPathSegment2 = "";
                                                        }
                                                        int lastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                        if (lastIndexOf2 != -1) {
                                                            lastPathSegment2 = lastPathSegment2.substring(0, lastIndexOf2);
                                                        }
                                                        f8.s g = f8.l0.g(f8.l0.d(l10), (ib) seVar.f2801r, f8.d0.f4128d);
                                                        Executor executor = (Executor) seVar.f2799e;
                                                        zd zdVar2 = (zd) seVar.f2800i;
                                                        teVar2.getClass();
                                                        iVar2 = iVar;
                                                        re reVar = new re(new c2.b1(lastPathSegment2, f8.l0.d(l10), new ze(u2, c1.a()), executor, zdVar2, iVar, new h1(19)), g);
                                                        if (!sVar.isEmpty()) {
                                                            dd ddVar = new dd(z10 ? 1 : 0, sVar, executor);
                                                            synchronized (reVar.g) {
                                                                reVar.f2763i.add(ddVar);
                                                            }
                                                        }
                                                        pair = Pair.create(reVar, peVar);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(l10, pair);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                        }
                                                    } else {
                                                        iVar2 = iVar;
                                                    }
                                                    re reVar2 = (re) pair.first;
                                                    pe peVar2 = (pe) pair.second;
                                                    if (peVar.equals(peVar2)) {
                                                        f8.t a10 = reVar2.a(new tc(1, str), saVar2.a());
                                                        a10.a(new rc(vcVar, a10, 0), saVar2.a());
                                                        return;
                                                    }
                                                    String y3 = k7.e.y("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", ec.class.getSimpleName(), l10);
                                                    i7.a.u(l10.equals(peVar2.f2675a), y3, "uri");
                                                    i7.a.u(u2.equals(peVar2.f2676b), y3, "schema");
                                                    i7.a.u(iVar2.equals(peVar2.f2677c), y3, "handler");
                                                    i7.a.u(sVar.equals(peVar2.f2678d), y3, "migrations");
                                                    i7.a.u(obj.equals(obj), y3, "variantConfig");
                                                    te.a1.e(k7.e.y(y3, "unknown"));
                                                    return;
                                                case 2:
                                                    vc vcVar2 = this.f2674e;
                                                    fd fdVar = vcVar2.f2886b.f2793i;
                                                    boolean z11 = vcVar2.f2889e;
                                                    sc scVar = sc.f2797a;
                                                    jd jdVar = (jd) fdVar.f2290c.get();
                                                    if (jdVar == null && !z11) {
                                                        f8.o0 o0Var = f8.o0.f4157e;
                                                        return;
                                                    }
                                                    if ((fdVar.f2292e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = fdVar.f2293f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i15 = fdVar.f2292e;
                                                                if ((i15 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(scVar);
                                                                    fdVar.f2292e = i15 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (fdVar.f2294h == null) {
                                                        synchronized (fdVar.g) {
                                                            try {
                                                                if (fdVar.f2294h == null) {
                                                                    if (jdVar == null) {
                                                                        jdVar = ed.f2263a;
                                                                    }
                                                                    Context context2 = fdVar.f2288a;
                                                                    if (ia.s(context2)) {
                                                                        f8.g0 a11 = ((jb) fdVar.f2291d.get()).a(new l5(fdVar, jdVar));
                                                                        fdVar.f2294h = a11;
                                                                        g0Var = a11;
                                                                    } else {
                                                                        cd cdVar = cd.f2195e;
                                                                        a8.m mVar = fdVar.f2289b;
                                                                        f8.g0 g2 = f8.l0.g(ia.j(context2, Executors.callable(cdVar, null), (Executor) mVar.get()), new dd(i13, fdVar, jdVar), (Executor) mVar.get());
                                                                        fdVar.f2294h = g2;
                                                                        g0Var = g2;
                                                                    }
                                                                    g0Var.a(new bd(i112, g0Var), (Executor) fdVar.f2289b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    vc vcVar3 = this.f2674e;
                                                    b7.h a12 = vcVar3.a();
                                                    String str2 = (String) a12.f1293b;
                                                    sa saVar4 = vcVar3.f2886b;
                                                    a8.m mVar2 = saVar4.f2789d;
                                                    kd b13 = saVar4.g.b();
                                                    boolean z12 = b13.f2460i;
                                                    if (b13.j) {
                                                        if (a8.h.a(str2) && !z12) {
                                                            f8.o0 o0Var2 = f8.o0.f4157e;
                                                            return;
                                                        }
                                                        za u10 = cb.u();
                                                        md mdVar = (md) a12.f1296e;
                                                        int i16 = mdVar.f2539a;
                                                        ab t6 = bb.t();
                                                        t6.b();
                                                        ((bb) t6.f2389e).u(i16);
                                                        int i17 = mdVar.f2540b;
                                                        t6.b();
                                                        ((bb) t6.f2389e).v(i17);
                                                        bb bbVar = (bb) t6.d();
                                                        u10.b();
                                                        ((cb) u10.f2389e).w(bbVar);
                                                        if (!a8.h.a(str2)) {
                                                            u10.b();
                                                            ((cb) u10.f2389e).v(str2);
                                                        }
                                                        if (z12) {
                                                            String str3 = vcVar3.f2887c;
                                                            u10.b();
                                                            ((cb) u10.f2389e).x(str3);
                                                        }
                                                        jb jbVar = (jb) mVar2.get();
                                                        cb cbVar = (cb) u10.d();
                                                        da daVar = jbVar.f2428a;
                                                        a8.l b14 = a8.l.b();
                                                        b14.f358c = new v5(7, cbVar);
                                                        b14.f359d = new z6.d[]{h.f2349a};
                                                        b14.f356a = false;
                                                        b10 = jb.b(daVar.b(0, b14.a()).g(f8.d0.f4128d, new l5(i12, daVar, cbVar)));
                                                    } else {
                                                        if (a8.h.a(str2)) {
                                                            f8.o0 o0Var3 = f8.o0.f4157e;
                                                            return;
                                                        }
                                                        jb jbVar2 = (jb) mVar2.get();
                                                        jbVar2.getClass();
                                                        str2.getClass();
                                                        b10 = jb.b(jbVar2.f2428a.c(str2));
                                                    }
                                                    f8.l0.a(b10, hb.class, new qc(i13, vcVar3), saVar4.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.f2891h.P()) {
                                    final int i12 = 2;
                                    saVar.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.pc

                                        /* renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ vc f2674e;

                                        {
                                            this.f2674e = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z10;
                                            sa saVar2;
                                            a8.i iVar;
                                            a8.i iVar2;
                                            f8.g0 g0Var;
                                            f8.a b10;
                                            int i112 = 2;
                                            int i122 = 1;
                                            int i13 = 0;
                                            switch (i12) {
                                                case 0:
                                                    this.f2674e.b();
                                                    return;
                                                case 1:
                                                    vc vcVar = this.f2674e;
                                                    sa saVar3 = vcVar.f2886b;
                                                    String str = vcVar.f2887c;
                                                    ye yeVar = ad.f2142a;
                                                    Object obj = h1.f2356i;
                                                    byte b11 = (byte) (((byte) 2) | 1);
                                                    Context context = saVar3.f2787b;
                                                    Pattern pattern = de.f2235a;
                                                    ra raVar = new ra(context);
                                                    raVar.j("phenotype");
                                                    raVar.k("all_accounts.pb");
                                                    Uri l10 = raVar.l();
                                                    if (l10 == null) {
                                                        a2.r.j("Null uri");
                                                        return;
                                                    }
                                                    ec u2 = ec.u();
                                                    if (u2 == null) {
                                                        a2.r.j("Null schema");
                                                        return;
                                                    }
                                                    ye yeVar2 = ad.f2142a;
                                                    yeVar2.getClass();
                                                    a8.i iVar3 = new a8.i(yeVar2);
                                                    byte b12 = (byte) (b11 | 2);
                                                    b8.d dVar = b8.g.f1423e;
                                                    b8.s sVar = b8.s.f1440s;
                                                    if (b12 != 3) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        if ((b12 & 1) == 0) {
                                                            sb2.append(" useGeneratedExtensionRegistry");
                                                        }
                                                        if ((2 & b12) == 0) {
                                                            sb2.append(" enableTracing");
                                                        }
                                                        kotlin.collections.i0.l("Missing required properties:".concat(sb2.toString()));
                                                        return;
                                                    }
                                                    pe peVar = new pe(l10, u2, iVar3, sVar);
                                                    se seVar = ad.f2144c;
                                                    if (seVar == null) {
                                                        synchronized (ad.f2143b) {
                                                            try {
                                                                seVar = ad.f2144c;
                                                                if (seVar == null) {
                                                                    HashMap hashMap = new HashMap();
                                                                    f8.u0 a9 = saVar3.a();
                                                                    zd zdVar = (zd) saVar3.f2791f.get();
                                                                    z10 = true;
                                                                    te teVar = te.f2827a;
                                                                    saVar2 = saVar3;
                                                                    iVar = iVar3;
                                                                    i7.a.u(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    hashMap.put("singleproc", teVar);
                                                                    se seVar2 = new se(a9, zdVar, hashMap);
                                                                    ad.f2144c = seVar2;
                                                                    seVar = seVar2;
                                                                } else {
                                                                    z10 = true;
                                                                    saVar2 = saVar3;
                                                                    iVar = iVar3;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        z10 = true;
                                                        saVar2 = saVar3;
                                                        iVar = iVar3;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) seVar.f2798d;
                                                    Pair pair = (Pair) concurrentHashMap.get(l10);
                                                    if (pair == null) {
                                                        i7.a.u(l10.isHierarchical(), "Uri must be hierarchical: %s", l10);
                                                        String lastPathSegment = l10.getLastPathSegment();
                                                        int i14 = a8.h.f344a;
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        i7.a.u((lastIndexOf == -1 ? "" : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", l10);
                                                        te teVar2 = (te) ((HashMap) seVar.f2802s).get("singleproc");
                                                        i7.a.u(teVar2 != null ? z10 : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = l10.getLastPathSegment();
                                                        if (lastPathSegment2 == null) {
                                                            lastPathSegment2 = "";
                                                        }
                                                        int lastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                        if (lastIndexOf2 != -1) {
                                                            lastPathSegment2 = lastPathSegment2.substring(0, lastIndexOf2);
                                                        }
                                                        f8.s g = f8.l0.g(f8.l0.d(l10), (ib) seVar.f2801r, f8.d0.f4128d);
                                                        Executor executor = (Executor) seVar.f2799e;
                                                        zd zdVar2 = (zd) seVar.f2800i;
                                                        teVar2.getClass();
                                                        iVar2 = iVar;
                                                        re reVar = new re(new c2.b1(lastPathSegment2, f8.l0.d(l10), new ze(u2, c1.a()), executor, zdVar2, iVar, new h1(19)), g);
                                                        if (!sVar.isEmpty()) {
                                                            dd ddVar = new dd(z10 ? 1 : 0, sVar, executor);
                                                            synchronized (reVar.g) {
                                                                reVar.f2763i.add(ddVar);
                                                            }
                                                        }
                                                        pair = Pair.create(reVar, peVar);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(l10, pair);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                        }
                                                    } else {
                                                        iVar2 = iVar;
                                                    }
                                                    re reVar2 = (re) pair.first;
                                                    pe peVar2 = (pe) pair.second;
                                                    if (peVar.equals(peVar2)) {
                                                        f8.t a10 = reVar2.a(new tc(1, str), saVar2.a());
                                                        a10.a(new rc(vcVar, a10, 0), saVar2.a());
                                                        return;
                                                    }
                                                    String y3 = k7.e.y("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", ec.class.getSimpleName(), l10);
                                                    i7.a.u(l10.equals(peVar2.f2675a), y3, "uri");
                                                    i7.a.u(u2.equals(peVar2.f2676b), y3, "schema");
                                                    i7.a.u(iVar2.equals(peVar2.f2677c), y3, "handler");
                                                    i7.a.u(sVar.equals(peVar2.f2678d), y3, "migrations");
                                                    i7.a.u(obj.equals(obj), y3, "variantConfig");
                                                    te.a1.e(k7.e.y(y3, "unknown"));
                                                    return;
                                                case 2:
                                                    vc vcVar2 = this.f2674e;
                                                    fd fdVar = vcVar2.f2886b.f2793i;
                                                    boolean z11 = vcVar2.f2889e;
                                                    sc scVar = sc.f2797a;
                                                    jd jdVar = (jd) fdVar.f2290c.get();
                                                    if (jdVar == null && !z11) {
                                                        f8.o0 o0Var = f8.o0.f4157e;
                                                        return;
                                                    }
                                                    if ((fdVar.f2292e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = fdVar.f2293f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i15 = fdVar.f2292e;
                                                                if ((i15 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(scVar);
                                                                    fdVar.f2292e = i15 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (fdVar.f2294h == null) {
                                                        synchronized (fdVar.g) {
                                                            try {
                                                                if (fdVar.f2294h == null) {
                                                                    if (jdVar == null) {
                                                                        jdVar = ed.f2263a;
                                                                    }
                                                                    Context context2 = fdVar.f2288a;
                                                                    if (ia.s(context2)) {
                                                                        f8.g0 a11 = ((jb) fdVar.f2291d.get()).a(new l5(fdVar, jdVar));
                                                                        fdVar.f2294h = a11;
                                                                        g0Var = a11;
                                                                    } else {
                                                                        cd cdVar = cd.f2195e;
                                                                        a8.m mVar = fdVar.f2289b;
                                                                        f8.g0 g2 = f8.l0.g(ia.j(context2, Executors.callable(cdVar, null), (Executor) mVar.get()), new dd(i13, fdVar, jdVar), (Executor) mVar.get());
                                                                        fdVar.f2294h = g2;
                                                                        g0Var = g2;
                                                                    }
                                                                    g0Var.a(new bd(i112, g0Var), (Executor) fdVar.f2289b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    vc vcVar3 = this.f2674e;
                                                    b7.h a12 = vcVar3.a();
                                                    String str2 = (String) a12.f1293b;
                                                    sa saVar4 = vcVar3.f2886b;
                                                    a8.m mVar2 = saVar4.f2789d;
                                                    kd b13 = saVar4.g.b();
                                                    boolean z12 = b13.f2460i;
                                                    if (b13.j) {
                                                        if (a8.h.a(str2) && !z12) {
                                                            f8.o0 o0Var2 = f8.o0.f4157e;
                                                            return;
                                                        }
                                                        za u10 = cb.u();
                                                        md mdVar = (md) a12.f1296e;
                                                        int i16 = mdVar.f2539a;
                                                        ab t6 = bb.t();
                                                        t6.b();
                                                        ((bb) t6.f2389e).u(i16);
                                                        int i17 = mdVar.f2540b;
                                                        t6.b();
                                                        ((bb) t6.f2389e).v(i17);
                                                        bb bbVar = (bb) t6.d();
                                                        u10.b();
                                                        ((cb) u10.f2389e).w(bbVar);
                                                        if (!a8.h.a(str2)) {
                                                            u10.b();
                                                            ((cb) u10.f2389e).v(str2);
                                                        }
                                                        if (z12) {
                                                            String str3 = vcVar3.f2887c;
                                                            u10.b();
                                                            ((cb) u10.f2389e).x(str3);
                                                        }
                                                        jb jbVar = (jb) mVar2.get();
                                                        cb cbVar = (cb) u10.d();
                                                        da daVar = jbVar.f2428a;
                                                        a8.l b14 = a8.l.b();
                                                        b14.f358c = new v5(7, cbVar);
                                                        b14.f359d = new z6.d[]{h.f2349a};
                                                        b14.f356a = false;
                                                        b10 = jb.b(daVar.b(0, b14.a()).g(f8.d0.f4128d, new l5(i122, daVar, cbVar)));
                                                    } else {
                                                        if (a8.h.a(str2)) {
                                                            f8.o0 o0Var3 = f8.o0.f4157e;
                                                            return;
                                                        }
                                                        jb jbVar2 = (jb) mVar2.get();
                                                        jbVar2.getClass();
                                                        str2.getClass();
                                                        b10 = jb.b(jbVar2.f2428a.c(str2));
                                                    }
                                                    f8.l0.a(b10, hb.class, new qc(i13, vcVar3), saVar4.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                            } else {
                                final int i13 = 0;
                                saVar.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.pc

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ vc f2674e;

                                    {
                                        this.f2674e = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        sa saVar2;
                                        a8.i iVar;
                                        a8.i iVar2;
                                        f8.g0 g0Var;
                                        f8.a b10;
                                        int i112 = 2;
                                        int i122 = 1;
                                        int i132 = 0;
                                        switch (i13) {
                                            case 0:
                                                this.f2674e.b();
                                                return;
                                            case 1:
                                                vc vcVar = this.f2674e;
                                                sa saVar3 = vcVar.f2886b;
                                                String str = vcVar.f2887c;
                                                ye yeVar = ad.f2142a;
                                                Object obj = h1.f2356i;
                                                byte b11 = (byte) (((byte) 2) | 1);
                                                Context context = saVar3.f2787b;
                                                Pattern pattern = de.f2235a;
                                                ra raVar = new ra(context);
                                                raVar.j("phenotype");
                                                raVar.k("all_accounts.pb");
                                                Uri l10 = raVar.l();
                                                if (l10 == null) {
                                                    a2.r.j("Null uri");
                                                    return;
                                                }
                                                ec u2 = ec.u();
                                                if (u2 == null) {
                                                    a2.r.j("Null schema");
                                                    return;
                                                }
                                                ye yeVar2 = ad.f2142a;
                                                yeVar2.getClass();
                                                a8.i iVar3 = new a8.i(yeVar2);
                                                byte b12 = (byte) (b11 | 2);
                                                b8.d dVar = b8.g.f1423e;
                                                b8.s sVar = b8.s.f1440s;
                                                if (b12 != 3) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    if ((b12 & 1) == 0) {
                                                        sb2.append(" useGeneratedExtensionRegistry");
                                                    }
                                                    if ((2 & b12) == 0) {
                                                        sb2.append(" enableTracing");
                                                    }
                                                    kotlin.collections.i0.l("Missing required properties:".concat(sb2.toString()));
                                                    return;
                                                }
                                                pe peVar = new pe(l10, u2, iVar3, sVar);
                                                se seVar = ad.f2144c;
                                                if (seVar == null) {
                                                    synchronized (ad.f2143b) {
                                                        try {
                                                            seVar = ad.f2144c;
                                                            if (seVar == null) {
                                                                HashMap hashMap = new HashMap();
                                                                f8.u0 a9 = saVar3.a();
                                                                zd zdVar = (zd) saVar3.f2791f.get();
                                                                z10 = true;
                                                                te teVar = te.f2827a;
                                                                saVar2 = saVar3;
                                                                iVar = iVar3;
                                                                i7.a.u(!hashMap.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                hashMap.put("singleproc", teVar);
                                                                se seVar2 = new se(a9, zdVar, hashMap);
                                                                ad.f2144c = seVar2;
                                                                seVar = seVar2;
                                                            } else {
                                                                z10 = true;
                                                                saVar2 = saVar3;
                                                                iVar = iVar3;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                } else {
                                                    z10 = true;
                                                    saVar2 = saVar3;
                                                    iVar = iVar3;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) seVar.f2798d;
                                                Pair pair = (Pair) concurrentHashMap.get(l10);
                                                if (pair == null) {
                                                    i7.a.u(l10.isHierarchical(), "Uri must be hierarchical: %s", l10);
                                                    String lastPathSegment = l10.getLastPathSegment();
                                                    int i14 = a8.h.f344a;
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    i7.a.u((lastIndexOf == -1 ? "" : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", l10);
                                                    te teVar2 = (te) ((HashMap) seVar.f2802s).get("singleproc");
                                                    i7.a.u(teVar2 != null ? z10 : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = l10.getLastPathSegment();
                                                    if (lastPathSegment2 == null) {
                                                        lastPathSegment2 = "";
                                                    }
                                                    int lastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                    if (lastIndexOf2 != -1) {
                                                        lastPathSegment2 = lastPathSegment2.substring(0, lastIndexOf2);
                                                    }
                                                    f8.s g = f8.l0.g(f8.l0.d(l10), (ib) seVar.f2801r, f8.d0.f4128d);
                                                    Executor executor = (Executor) seVar.f2799e;
                                                    zd zdVar2 = (zd) seVar.f2800i;
                                                    teVar2.getClass();
                                                    iVar2 = iVar;
                                                    re reVar = new re(new c2.b1(lastPathSegment2, f8.l0.d(l10), new ze(u2, c1.a()), executor, zdVar2, iVar, new h1(19)), g);
                                                    if (!sVar.isEmpty()) {
                                                        dd ddVar = new dd(z10 ? 1 : 0, sVar, executor);
                                                        synchronized (reVar.g) {
                                                            reVar.f2763i.add(ddVar);
                                                        }
                                                    }
                                                    pair = Pair.create(reVar, peVar);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(l10, pair);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                    }
                                                } else {
                                                    iVar2 = iVar;
                                                }
                                                re reVar2 = (re) pair.first;
                                                pe peVar2 = (pe) pair.second;
                                                if (peVar.equals(peVar2)) {
                                                    f8.t a10 = reVar2.a(new tc(1, str), saVar2.a());
                                                    a10.a(new rc(vcVar, a10, 0), saVar2.a());
                                                    return;
                                                }
                                                String y3 = k7.e.y("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", ec.class.getSimpleName(), l10);
                                                i7.a.u(l10.equals(peVar2.f2675a), y3, "uri");
                                                i7.a.u(u2.equals(peVar2.f2676b), y3, "schema");
                                                i7.a.u(iVar2.equals(peVar2.f2677c), y3, "handler");
                                                i7.a.u(sVar.equals(peVar2.f2678d), y3, "migrations");
                                                i7.a.u(obj.equals(obj), y3, "variantConfig");
                                                te.a1.e(k7.e.y(y3, "unknown"));
                                                return;
                                            case 2:
                                                vc vcVar2 = this.f2674e;
                                                fd fdVar = vcVar2.f2886b.f2793i;
                                                boolean z11 = vcVar2.f2889e;
                                                sc scVar = sc.f2797a;
                                                jd jdVar = (jd) fdVar.f2290c.get();
                                                if (jdVar == null && !z11) {
                                                    f8.o0 o0Var = f8.o0.f4157e;
                                                    return;
                                                }
                                                if ((fdVar.f2292e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = fdVar.f2293f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i15 = fdVar.f2292e;
                                                            if ((i15 & 64) == 0) {
                                                                copyOnWriteArrayList.add(scVar);
                                                                fdVar.f2292e = i15 | 64;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (fdVar.f2294h == null) {
                                                    synchronized (fdVar.g) {
                                                        try {
                                                            if (fdVar.f2294h == null) {
                                                                if (jdVar == null) {
                                                                    jdVar = ed.f2263a;
                                                                }
                                                                Context context2 = fdVar.f2288a;
                                                                if (ia.s(context2)) {
                                                                    f8.g0 a11 = ((jb) fdVar.f2291d.get()).a(new l5(fdVar, jdVar));
                                                                    fdVar.f2294h = a11;
                                                                    g0Var = a11;
                                                                } else {
                                                                    cd cdVar = cd.f2195e;
                                                                    a8.m mVar = fdVar.f2289b;
                                                                    f8.g0 g2 = f8.l0.g(ia.j(context2, Executors.callable(cdVar, null), (Executor) mVar.get()), new dd(i132, fdVar, jdVar), (Executor) mVar.get());
                                                                    fdVar.f2294h = g2;
                                                                    g0Var = g2;
                                                                }
                                                                g0Var.a(new bd(i112, g0Var), (Executor) fdVar.f2289b.get());
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                vc vcVar3 = this.f2674e;
                                                b7.h a12 = vcVar3.a();
                                                String str2 = (String) a12.f1293b;
                                                sa saVar4 = vcVar3.f2886b;
                                                a8.m mVar2 = saVar4.f2789d;
                                                kd b13 = saVar4.g.b();
                                                boolean z12 = b13.f2460i;
                                                if (b13.j) {
                                                    if (a8.h.a(str2) && !z12) {
                                                        f8.o0 o0Var2 = f8.o0.f4157e;
                                                        return;
                                                    }
                                                    za u10 = cb.u();
                                                    md mdVar = (md) a12.f1296e;
                                                    int i16 = mdVar.f2539a;
                                                    ab t6 = bb.t();
                                                    t6.b();
                                                    ((bb) t6.f2389e).u(i16);
                                                    int i17 = mdVar.f2540b;
                                                    t6.b();
                                                    ((bb) t6.f2389e).v(i17);
                                                    bb bbVar = (bb) t6.d();
                                                    u10.b();
                                                    ((cb) u10.f2389e).w(bbVar);
                                                    if (!a8.h.a(str2)) {
                                                        u10.b();
                                                        ((cb) u10.f2389e).v(str2);
                                                    }
                                                    if (z12) {
                                                        String str3 = vcVar3.f2887c;
                                                        u10.b();
                                                        ((cb) u10.f2389e).x(str3);
                                                    }
                                                    jb jbVar = (jb) mVar2.get();
                                                    cb cbVar = (cb) u10.d();
                                                    da daVar = jbVar.f2428a;
                                                    a8.l b14 = a8.l.b();
                                                    b14.f358c = new v5(7, cbVar);
                                                    b14.f359d = new z6.d[]{h.f2349a};
                                                    b14.f356a = false;
                                                    b10 = jb.b(daVar.b(0, b14.a()).g(f8.d0.f4128d, new l5(i122, daVar, cbVar)));
                                                } else {
                                                    if (a8.h.a(str2)) {
                                                        f8.o0 o0Var3 = f8.o0.f4157e;
                                                        return;
                                                    }
                                                    jb jbVar2 = (jb) mVar2.get();
                                                    jbVar2.getClass();
                                                    str2.getClass();
                                                    b10 = jb.b(jbVar2.f2428a.c(str2));
                                                }
                                                f8.l0.a(b10, hb.class, new qc(i132, vcVar3), saVar4.a());
                                                return;
                                        }
                                    }
                                });
                                hVar = new b7.h(od.A(), (md) M.f1296e);
                                if (this.f2889e || ((md) hVar.f1296e).f2540b != 17) {
                                    this.f2885a = hVar;
                                }
                            }
                        }
                        hVar = M;
                        if (this.f2889e) {
                        }
                        this.f2885a = hVar;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        throw th;
                    }
                }
            } finally {
            }
        }
        return hVar;
    }

    public final void b() {
        a1.n nVar = this.f2891h;
        sa saVar = (sa) nVar.f41i;
        jb jbVar = (jb) saVar.f2789d.get();
        String str = (String) nVar.f40e;
        jbVar.getClass();
        str.getClass();
        da daVar = jbVar.f2428a;
        a8.l b10 = a8.l.b();
        b10.f358c = new yc(str, 1);
        f8.t f3 = f8.l0.f(jb.b(daVar.b(0, b10.a()).f(f8.d0.f4128d, new h1(13))), e3.f2250r, saVar.a());
        qc qcVar = new qc(1, nVar);
        sa saVar2 = this.f2886b;
        f8.l0.g(f3, qcVar, saVar2.a()).a(new rc(this, f3, 1), saVar2.a());
    }
}
