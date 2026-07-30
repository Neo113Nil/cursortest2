package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2960b0 implements InterfaceC4148x0 {

    /* renamed from: a, reason: collision with root package name */
    public UB f29373a;

    /* renamed from: b, reason: collision with root package name */
    public TP f29374b;

    /* renamed from: c, reason: collision with root package name */
    public long f29375c;

    /* renamed from: d, reason: collision with root package name */
    public long f29376d;

    /* renamed from: e, reason: collision with root package name */
    public int f29377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3178f0 f29378f;

    public C2960b0(C3178f0 c3178f0, Context context) {
        this.f29378f = c3178f0;
        AbstractC3548lu.l(context);
        SB sb = UB.f27942u;
        this.f29373a = C3675oC.f33115x;
        this.f29376d = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean A0(TP tp) {
        C3178f0 c3178f0 = this.f29378f;
        boolean z8 = false;
        boolean z9 = true;
        PA.T(c3178f0.f30575n == 0);
        C2980bK c2980bK = tp.f27752E;
        if (c2980bK == null || !c2980bK.d()) {
            c2980bK = C2980bK.f29469h;
        }
        try {
            int i = c2980bK.f29472c;
            if (i == 7) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 34) {
                    if (i4 >= 33 && AbstractC3194fG.C("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        c3178f0.f30572k = c3178f0.f30568f.A(myLooper, null);
                        c3178f0.f30564b.a();
                        throw null;
                    }
                }
                i = 7;
            }
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33 && AbstractC3194fG.C("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    z8 = true;
                }
                z9 = z8;
            } else if (i == 7) {
                z9 = AbstractC3194fG.C("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (!z9 && Build.VERSION.SDK_INT >= 29) {
                String str = AbstractC3548lu.f32613a;
                Locale locale = Locale.US;
                AbstractC3217fl.I("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                C2980bK c2980bK2 = C2980bK.f29469h;
                Looper myLooper2 = Looper.myLooper();
                myLooper2.getClass();
                c3178f0.f30572k = c3178f0.f30568f.A(myLooper2, null);
                c3178f0.f30564b.a();
                throw null;
            }
            if (i == 2 || i == 10) {
                C2980bK c2980bK3 = C2980bK.f29469h;
            }
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            c3178f0.f30572k = c3178f0.f30568f.A(myLooper22, null);
            c3178f0.f30564b.a();
            throw null;
        } catch (C2696Nn e6) {
            throw new C4094w0(e6, tp);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void G() {
        C3178f0 c3178f0 = this.f29378f;
        if (c3178f0.f30575n == 2) {
            return;
        }
        C3709ot c3709ot = c3178f0.f30572k;
        if (c3709ot != null) {
            c3709ot.f33230a.removeCallbacksAndMessages(null);
        }
        c3178f0.f30573l = null;
        c3178f0.f30575n = 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void M() {
        C3178f0 c3178f0 = this.f29378f;
        if (c3178f0.f30571j.d() == 0) {
            c3178f0.f30567e.M();
            return;
        }
        F3.q qVar = new F3.q();
        if (c3178f0.f30571j.d() <= 0) {
            c3178f0.f30571j = qVar;
        } else {
            ((AbstractC3123e0) c3178f0.f30571j.e()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void a() {
        C3178f0 c3178f0 = this.f29378f;
        if (c3178f0.f30566d) {
            c3178f0.f30567e.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean c() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void d() {
        C3178f0 c3178f0 = this.f29378f;
        if (c3178f0.f30566d) {
            c3178f0.f30567e.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean d0(boolean z8) {
        return this.f29378f.f30567e.f26790a.e(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final Surface j() {
        PA.T(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void l() {
        long j9 = this.f29376d;
        C3178f0 c3178f0 = this.f29378f;
        c3178f0.getClass();
        if (c3178f0.f30576o >= j9) {
            c3178f0.f30567e.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void n() {
        C3178f0 c3178f0 = this.f29378f;
        c3178f0.getClass();
        Xr.f28710c.getClass();
        c3178f0.f30573l = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void o0(boolean z8) {
        this.f29376d = com.anythink.basead.exoplayer.b.f6539b;
        C3178f0 c3178f0 = this.f29378f;
        if (c3178f0.f30575n == 1) {
            c3178f0.f30574m++;
            c3178f0.f30567e.o0(z8);
            while (c3178f0.f30571j.d() > 1) {
                c3178f0.f30571j.e();
            }
            if (c3178f0.f30571j.d() == 1) {
                ((AbstractC3123e0) c3178f0.f30571j.e()).getClass();
                SB sb = UB.f27942u;
                C3675oC c3675oC = C3675oC.f33115x;
                throw null;
            }
            c3178f0.f30576o = com.anythink.basead.exoplayer.b.f6539b;
            C3709ot c3709ot = c3178f0.f30572k;
            c3709ot.getClass();
            c3709ot.e(new RunnableC3068d(2, c3178f0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void p0(InterfaceC3233g0 interfaceC3233g0) {
        this.f29378f.f30567e.f26798j = interfaceC3233g0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void q0(float f6) {
        C3178f0 c3178f0 = this.f29378f;
        c3178f0.i.b(f6);
        c3178f0.f30567e.q0(f6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void s0(Surface surface, Xr xr) {
        C3178f0 c3178f0 = this.f29378f;
        Pair pair = c3178f0.f30573l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Xr) c3178f0.f30573l.second).equals(xr)) {
            return;
        }
        c3178f0.f30573l = Pair.create(surface, xr);
        xr.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean t0(long j9, V v6) {
        int i;
        PA.T(false);
        long j10 = j9 + this.f29375c;
        C3178f0 c3178f0 = this.f29378f;
        C3393j0 c3393j0 = c3178f0.i;
        long j11 = c3393j0.f32052a == com.anythink.basead.exoplayer.b.f6539b ? -9223372036854775807L : (long) (((j10 - r3) * c3393j0.f32054c) + c3393j0.f32053b);
        if (j11 != com.anythink.basead.exoplayer.b.f6539b && j11 < c3178f0.f30570h && (i = this.f29377e) < 2) {
            this.f29377e = i + 1;
            v6.a();
            return true;
        }
        int i4 = c3178f0.f30577p;
        if (i4 == -1 || i4 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void u0(long j9, long j10) {
        this.f29378f.f30567e.u0(j9 + this.f29375c, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void v0(int i) {
        this.f29378f.f30567e.v0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void w0(List list) {
        if (this.f29373a.equals(list)) {
            return;
        }
        this.f29373a = UB.n(list);
        TP tp = this.f29374b;
        if (tp == null) {
            return;
        }
        C4065vP c4065vP = new C4065vP(tp);
        C2980bK c2980bK = tp.f27752E;
        if (c2980bK == null || !c2980bK.d()) {
            c2980bK = C2980bK.f29469h;
        }
        c4065vP.f34763D = c2980bK;
        c4065vP.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void x0(boolean z8) {
        C3178f0 c3178f0 = this.f29378f;
        if (c3178f0.f30566d) {
            c3178f0.f30567e.x0(z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void y0(long j9) {
        this.f29375c = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void z0(TP tp, long j9, int i, List list) {
        PA.T(false);
        this.f29373a = UB.n(list);
        this.f29374b = tp;
        this.f29378f.getClass();
        C4065vP c4065vP = new C4065vP(tp);
        C2980bK c2980bK = tp.f27752E;
        if (c2980bK == null || !c2980bK.d()) {
            c2980bK = C2980bK.f29469h;
        }
        c4065vP.f34763D = c2980bK;
        c4065vP.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void r0(U u7) {
    }
}
