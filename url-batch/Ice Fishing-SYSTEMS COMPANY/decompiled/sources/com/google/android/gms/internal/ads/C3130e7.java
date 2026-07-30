package com.google.android.gms.internal.ads;

import a.AbstractC0415a;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.e7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3130e7 implements InterfaceC3240g7 {

    /* renamed from: K, reason: collision with root package name */
    public static C3130e7 f30305K;

    /* renamed from: A, reason: collision with root package name */
    public final X7 f30306A;

    /* renamed from: B, reason: collision with root package name */
    public final T2 f30307B;

    /* renamed from: D, reason: collision with root package name */
    public final D7 f30309D;

    /* renamed from: E, reason: collision with root package name */
    public final E0 f30310E;

    /* renamed from: F, reason: collision with root package name */
    public final Rx f30311F;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f30314I;
    public volatile boolean J;

    /* renamed from: n, reason: collision with root package name */
    public final Context f30315n;

    /* renamed from: u, reason: collision with root package name */
    public final C2518Df f30316u;

    /* renamed from: v, reason: collision with root package name */
    public final Zw f30317v;

    /* renamed from: w, reason: collision with root package name */
    public final C3011bx f30318w;

    /* renamed from: x, reason: collision with root package name */
    public final C3885s7 f30319x;

    /* renamed from: y, reason: collision with root package name */
    public final Dw f30320y;

    /* renamed from: z, reason: collision with root package name */
    public final ExecutorService f30321z;

    /* renamed from: G, reason: collision with root package name */
    public volatile long f30312G = 0;

    /* renamed from: H, reason: collision with root package name */
    public final Object f30313H = new Object();

    /* renamed from: C, reason: collision with root package name */
    public final CountDownLatch f30308C = new CountDownLatch(1);

    public C3130e7(Context context, Dw dw, C2518Df c2518Df, Zw zw, C3011bx c3011bx, C3885s7 c3885s7, ExecutorService executorService, Cw cw, X7 x72, D7 d72, E0 e02, Rx rx) {
        this.J = false;
        this.f30315n = context;
        this.f30320y = dw;
        this.f30316u = c2518Df;
        this.f30317v = zw;
        this.f30318w = c3011bx;
        this.f30319x = c3885s7;
        this.f30321z = executorService;
        this.f30306A = x72;
        this.f30309D = d72;
        this.f30310E = e02;
        this.f30311F = rx;
        this.J = false;
        this.f30307B = new T2(this, cw);
    }

    public static synchronized C3130e7 m(Context context, ExecutorService executorService, Fw fw, boolean z8) {
        C3130e7 c3130e7;
        synchronized (C3130e7.class) {
            try {
                if (f30305K == null) {
                    Dw a9 = Dw.a(context, executorService, z8);
                    C3562m7 g9 = C3562m7.g(context);
                    D7 a10 = D7.a(context, executorService);
                    E0 e02 = new E0();
                    Rx rx = new Rx(7);
                    C2518Df c2518Df = new C2518Df(context, executorService, a9, new Jw());
                    h3.n g10 = AbstractC0415a.g(new Vs(4, c2518Df), executorService);
                    g10.b(executorService, new C2478Aq(9, c2518Df));
                    c2518Df.f24456x = g10;
                    C3831r7 c3831r7 = new C3831r7(context);
                    C3885s7 c3885s7 = new C3885s7(fw, c2518Df, new B7(context, c3831r7), c3831r7, g9, a10, e02, rx);
                    X7 q6 = AbstractC3035cL.q(context, a9);
                    Cw cw = new Cw();
                    C3130e7 c3130e72 = new C3130e7(context, a9, new C2518Df(context, q6), new Zw(context, q6, new C3562m7(6, a9), ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31682h3)).booleanValue()), new C3011bx(context, c3885s7, a9, cw, false), c3885s7, executorService, cw, q6, a10, e02, rx);
                    f30305K = c3130e72;
                    c3130e72.j();
                    f30305K.k();
                }
                c3130e7 = f30305K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3130e7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void a(int i, int i4, int i9) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ud)).booleanValue() || (displayMetrics = this.f30315n.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f6 = i;
        float f9 = displayMetrics.density;
        float f10 = i4;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f6 * f9, f10 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain);
        obtain.recycle();
        float f11 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f6 * f11, f10 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain2);
        obtain2.recycle();
        float f12 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i9, 1, f6 * f12, f10 * f12, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        b(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void b(MotionEvent motionEvent) {
        Zw b9 = this.f30318w.b();
        if (b9 != null) {
            try {
                b9.i(motionEvent);
            } catch (C2956ax e6) {
                this.f30320y.c(e6.f29355n, -1L, e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String c(Context context, String str, View view, Activity activity) {
        D7 d72 = this.f30309D;
        if (d72.f24343d) {
            d72.f24341b = System.currentTimeMillis();
        }
        E0 e02 = this.f30310E;
        e02.f24628h = e02.f24627g;
        e02.f24627g = SystemClock.uptimeMillis();
        k();
        Zw b9 = this.f30318w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String h9 = b9.h(context, str, view, activity);
        this.f30320y.e(5000, System.currentTimeMillis() - currentTimeMillis, null, h9, null);
        return h9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        this.f30311F.f27448u = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String f(Context context) {
        D7 d72 = this.f30309D;
        if (d72.f24343d) {
            d72.f24341b = System.currentTimeMillis();
        }
        E0 e02 = this.f30310E;
        e02.f24622b = e02.f24621a;
        e02.f24621a = SystemClock.uptimeMillis();
        k();
        Zw b9 = this.f30318w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d2 = b9.d(context);
        this.f30320y.e(5001, System.currentTimeMillis() - currentTimeMillis, null, d2, null);
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void g(View view) {
        this.f30319x.f34200c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String i(Context context, View view, Activity activity) {
        D7 d72 = this.f30309D;
        if (d72.f24343d) {
            d72.f24341b = System.currentTimeMillis();
        }
        this.f30310E.b(context, view);
        k();
        Zw b9 = this.f30318w.b();
        if (b9 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String f6 = b9.f(context, view, activity);
        this.f30320y.e(5002, System.currentTimeMillis() - currentTimeMillis, null, f6, null);
        return f6;
    }

    public final synchronized void j() {
        long currentTimeMillis = System.currentTimeMillis();
        Vw n9 = n();
        if (n9 == null) {
            this.f30320y.b(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f30318w.a(n9)) {
            this.J = true;
            this.f30308C.countDown();
        }
    }

    public final void k() {
        Vw vw;
        if (this.f30314I) {
            return;
        }
        synchronized (this.f30313H) {
            try {
                if (!this.f30314I) {
                    if ((System.currentTimeMillis() / 1000) - this.f30312G < com.anythink.expressad.f.a.b.f18559P) {
                        return;
                    }
                    C3011bx c3011bx = this.f30318w;
                    synchronized (c3011bx.f29615g) {
                        try {
                            Zw zw = c3011bx.f29614f;
                            vw = zw != null ? (Vw) zw.f29112v : null;
                        } finally {
                        }
                    }
                    if ((vw == null || vw.f28322a.C() - (System.currentTimeMillis() / 1000) < com.anythink.expressad.f.a.b.f18559P) && AbstractC3035cL.o(this.f30306A)) {
                        this.f30321z.execute(new RunnableC3068d(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        String str;
        String str2;
        int length;
        boolean k6;
        long currentTimeMillis = System.currentTimeMillis();
        Vw n9 = n();
        if (n9 != null) {
            str = n9.f28322a.A();
            str2 = n9.f28322a.B();
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.f30315n;
                X7 x72 = this.f30306A;
                Dw dw = this.f30320y;
                Yw e6 = AbstractC3194fG.e(context, x72, str, str2, dw);
                byte[] bArr = e6.f28922u;
                if (bArr == null || (length = bArr.length) == 0) {
                    dw.b(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        QK s3 = SK.s(bArr, 0, length);
                        YK yk = YK.f28820a;
                        int i = KK.f25952a;
                        Z7 D8 = Z7.D(s3, YK.f28821b);
                        if (!D8.A().A().isEmpty()) {
                            if (!D8.A().B().isEmpty()) {
                                if (D8.C().a().length != 0) {
                                    Vw n10 = n();
                                    if (n10 != null) {
                                        C3077d8 c3077d8 = n10.f28322a;
                                        if (c3077d8 != null) {
                                            if (D8.A().A().equals(c3077d8.A())) {
                                                if (!D8.A().B().equals(c3077d8.B())) {
                                                }
                                            }
                                        }
                                    }
                                    T2 t22 = this.f30307B;
                                    int i4 = e6.f28923v;
                                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31663f3)).booleanValue()) {
                                        k6 = this.f30316u.k(D8, t22);
                                    } else if (i4 == 3) {
                                        k6 = this.f30317v.g(D8);
                                    } else {
                                        if (i4 == 4) {
                                            k6 = this.f30317v.e(D8, t22);
                                        }
                                        this.f30320y.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (k6) {
                                        Vw n11 = n();
                                        if (n11 != null) {
                                            if (this.f30318w.a(n11)) {
                                                this.J = true;
                                            }
                                            this.f30312G = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.f30320y.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.f30320y.b(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.f30320y.b(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (C3845rL e9) {
                this.f30320y.c(4002, System.currentTimeMillis() - currentTimeMillis, e9);
            }
            this.f30308C.countDown();
        } catch (Throwable th) {
            this.f30308C.countDown();
            throw th;
        }
    }

    public final Vw n() {
        if (AbstractC3035cL.o(this.f30306A)) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31663f3)).booleanValue()) {
                Zw zw = this.f30317v;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (Zw.f29109y) {
                    try {
                        C3077d8 r9 = zw.r(1);
                        if (r9 == null) {
                            zw.p(4022, currentTimeMillis);
                            return null;
                        }
                        File j9 = zw.j(r9.A());
                        File file = new File(j9, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(j9, "pcam");
                        }
                        File file2 = new File(j9, "pcbc");
                        File file3 = new File(j9, "pcopt");
                        zw.p(5016, currentTimeMillis);
                        return new Vw(r9, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C2518Df c2518Df = this.f30316u;
            C3077d8 t9 = c2518Df.t(1);
            if (t9 != null) {
                String A8 = t9.A();
                File c4 = AbstractC2720Pd.c(A8, "pcam.jar", c2518Df.w());
                if (!c4.exists()) {
                    c4 = AbstractC2720Pd.c(A8, "pcam", c2518Df.w());
                }
                return new Vw(t9, c4, AbstractC2720Pd.c(A8, "pcbc", c2518Df.w()), AbstractC2720Pd.c(A8, "pcopt", c2518Df.w()));
            }
        }
        return null;
    }
}
