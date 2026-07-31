package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class za implements cb {

    /* renamed from: t, reason: collision with root package name */
    private static za f15039t;

    /* renamed from: f, reason: collision with root package name */
    private final Context f15040f;

    /* renamed from: g, reason: collision with root package name */
    private final k23 f15041g;

    /* renamed from: h, reason: collision with root package name */
    private final s23 f15042h;

    /* renamed from: i, reason: collision with root package name */
    private final u23 f15043i;

    /* renamed from: j, reason: collision with root package name */
    private final ac f15044j;

    /* renamed from: k, reason: collision with root package name */
    private final u03 f15045k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f15046l;

    /* renamed from: m, reason: collision with root package name */
    private final r23 f15047m;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f15051q;

    /* renamed from: s, reason: collision with root package name */
    private final int f15053s;

    /* renamed from: o, reason: collision with root package name */
    volatile long f15049o = 0;

    /* renamed from: p, reason: collision with root package name */
    private final Object f15050p = new Object();

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f15052r = false;

    /* renamed from: n, reason: collision with root package name */
    private final CountDownLatch f15048n = new CountDownLatch(1);

    za(Context context, u03 u03Var, k23 k23Var, s23 s23Var, u23 u23Var, ac acVar, Executor executor, p03 p03Var, int i7) {
        this.f15040f = context;
        this.f15045k = u03Var;
        this.f15041g = k23Var;
        this.f15042h = s23Var;
        this.f15043i = u23Var;
        this.f15044j = acVar;
        this.f15046l = executor;
        this.f15053s = i7;
        this.f15047m = new xa(this, p03Var);
    }

    public static synchronized za h(String str, Context context, boolean z6, boolean z7) {
        za i7;
        synchronized (za.class) {
            i7 = i(str, context, Executors.newCachedThreadPool(), z6, z7);
        }
        return i7;
    }

    @Deprecated
    public static synchronized za i(String str, Context context, Executor executor, boolean z6, boolean z7) {
        za zaVar;
        synchronized (za.class) {
            if (f15039t == null) {
                v03 a7 = w03.a();
                a7.a(str);
                a7.c(z6);
                w03 d7 = a7.d();
                u03 a8 = u03.a(context, executor, z7);
                jb c7 = ((Boolean) sw.c().b(m10.f8171c2)).booleanValue() ? jb.c(context) : null;
                o13 e7 = o13.e(context, executor, a8, d7);
                zb zbVar = new zb(context);
                ac acVar = new ac(d7, e7, new nc(context, zbVar), zbVar, c7);
                int b7 = x13.b(context, a8);
                p03 p03Var = new p03();
                za zaVar2 = new za(context, a8, new k23(context, b7), new s23(context, b7, new wa(a8), ((Boolean) sw.c().b(m10.B1)).booleanValue()), new u23(context, acVar, a8, p03Var), acVar, executor, p03Var, b7);
                f15039t = zaVar2;
                zaVar2.n();
                f15039t.o();
            }
            zaVar = f15039t;
        }
        return zaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r4.H().N().equals(r5.N()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void m(za zaVar) {
        String str;
        String str2;
        p23 a7;
        byte[] bArr;
        u03 u03Var;
        int i7;
        long currentTimeMillis;
        vd G;
        boolean b7;
        long currentTimeMillis2 = System.currentTimeMillis();
        j23 r7 = zaVar.r(1);
        if (r7 != null) {
            String O = r7.a().O();
            str2 = r7.a().N();
            str = O;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                a7 = e13.a(zaVar.f15040f, 1, zaVar.f15053s, str, str2, "1", zaVar.f15045k);
                bArr = a7.f10035g;
            } catch (mq3 e7) {
                zaVar.f15045k.c(4002, System.currentTimeMillis() - currentTimeMillis2, e7);
            }
            if (bArr == null || bArr.length == 0) {
                u03Var = zaVar.f15045k;
                i7 = 5009;
                currentTimeMillis = System.currentTimeMillis();
            } else {
                try {
                    G = vd.G(uo3.J(bArr), mp3.a());
                } catch (NullPointerException unused) {
                    u03Var = zaVar.f15045k;
                    i7 = 2030;
                    currentTimeMillis = System.currentTimeMillis();
                }
                if (!G.H().O().isEmpty() && !G.H().N().isEmpty() && G.I().m().length != 0) {
                    j23 r8 = zaVar.r(1);
                    if (r8 != null) {
                        yd a8 = r8.a();
                        if (G.H().O().equals(a8.O())) {
                        }
                    }
                    r23 r23Var = zaVar.f15047m;
                    int i8 = a7.f10036h;
                    if (!((Boolean) sw.c().b(m10.f8348z1)).booleanValue()) {
                        b7 = zaVar.f15041g.b(G, r23Var);
                    } else if (i8 == 3) {
                        b7 = zaVar.f15042h.a(G);
                    } else {
                        if (i8 == 4) {
                            b7 = zaVar.f15042h.b(G, r23Var);
                        }
                        u03Var = zaVar.f15045k;
                        i7 = 4009;
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    if (b7) {
                        j23 r9 = zaVar.r(1);
                        if (r9 != null) {
                            if (zaVar.f15043i.c(r9)) {
                                zaVar.f15052r = true;
                            }
                            zaVar.f15049o = System.currentTimeMillis() / 1000;
                        }
                    }
                    u03Var = zaVar.f15045k;
                    i7 = 4009;
                    currentTimeMillis = System.currentTimeMillis();
                }
                u03Var = zaVar.f15045k;
                i7 = 5010;
                currentTimeMillis = System.currentTimeMillis();
            }
            u03Var.d(i7, currentTimeMillis - currentTimeMillis2);
        } finally {
            zaVar.f15048n.countDown();
        }
    }

    private final j23 r(int i7) {
        if (x13.a(this.f15053s)) {
            return ((Boolean) sw.c().b(m10.f8348z1)).booleanValue() ? this.f15042h.c(1) : this.f15041g.d(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void a(MotionEvent motionEvent) {
        x03 a7 = this.f15043i.a();
        if (a7 != null) {
            try {
                a7.b(null, motionEvent);
            } catch (t23 e7) {
                this.f15045k.c(e7.a(), -1L, e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void b(View view) {
        this.f15044j.b(view);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String c(Context context, View view, Activity activity) {
        o();
        x03 a7 = this.f15043i.a();
        if (a7 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d7 = a7.d(context, null, view, null);
        this.f15045k.f(5002, System.currentTimeMillis() - currentTimeMillis, d7, null);
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String d(Context context) {
        o();
        x03 a7 = this.f15043i.a();
        if (a7 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a8 = a7.a(context, null);
        this.f15045k.f(5001, System.currentTimeMillis() - currentTimeMillis, a8, null);
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void e(int i7, int i8, int i9) {
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String f(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final String g(Context context, String str, View view, Activity activity) {
        o();
        x03 a7 = this.f15043i.a();
        if (a7 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c7 = a7.c(context, null, str, view, activity);
        this.f15045k.f(5000, System.currentTimeMillis() - currentTimeMillis, c7, null);
        return c7;
    }

    final synchronized void n() {
        long currentTimeMillis = System.currentTimeMillis();
        j23 r7 = r(1);
        if (r7 == null) {
            this.f15045k.d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f15043i.c(r7)) {
            this.f15052r = true;
            this.f15048n.countDown();
        }
    }

    public final void o() {
        if (this.f15051q) {
            return;
        }
        synchronized (this.f15050p) {
            if (!this.f15051q) {
                if ((System.currentTimeMillis() / 1000) - this.f15049o < 3600) {
                    return;
                }
                j23 b7 = this.f15043i.b();
                if ((b7 == null || b7.d(3600L)) && x13.a(this.f15053s)) {
                    this.f15046l.execute(new ya(this));
                }
            }
        }
    }

    public final synchronized boolean q() {
        return this.f15052r;
    }
}
