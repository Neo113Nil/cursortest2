package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class P implements InterfaceC4148x0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3341i0 f26790a;

    /* renamed from: b, reason: collision with root package name */
    public final C3393j0 f26791b;

    /* renamed from: c, reason: collision with root package name */
    public final C3663o0 f26792c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f26793d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f26794e;

    /* renamed from: f, reason: collision with root package name */
    public TP f26795f;

    /* renamed from: g, reason: collision with root package name */
    public long f26796g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4040v0 f26797h;
    public Executor i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC3233g0 f26798j;

    public P(C3341i0 c3341i0, C3393j0 c3393j0, T2 t22) {
        this.f26790a = c3341i0;
        this.f26791b = c3393j0;
        c3341i0.f31303k = t22;
        this.f26792c = new C3663o0(new C2881Yl(this), c3341i0, c3393j0);
        this.f26793d = new ArrayDeque();
        this.f26795f = new TP(new C4065vP());
        this.f26796g = com.anythink.basead.exoplayer.b.f6539b;
        this.f26797h = InterfaceC4040v0.f34696a;
        this.i = N.f26408n;
        this.f26798j = M.f26275u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean A0(TP tp) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void G() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void M() {
        C3341i0 c3341i0 = this.f26790a;
        if (c3341i0.f31297d == 0) {
            c3341i0.f31297d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void a() {
        this.f26791b.c();
        this.f26790a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void d() {
        this.f26791b.c();
        C3341i0 c3341i0 = this.f26790a;
        c3341i0.f31296c = false;
        c3341i0.f31301h = com.anythink.basead.exoplayer.b.f6539b;
        C3609n0 c3609n0 = c3341i0.f31295b;
        c3609n0.f32788d = false;
        AbstractC3447k0 abstractC3447k0 = c3609n0.f32787c;
        if (abstractC3447k0 != null) {
            abstractC3447k0.b();
        }
        c3609n0.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean d0(boolean z8) {
        return this.f26790a.e(z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean h() {
        C3663o0 c3663o0 = this.f26792c;
        long j9 = c3663o0.i;
        return j9 != com.anythink.basead.exoplayer.b.f6539b && c3663o0.f33080h == j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final Surface j() {
        Surface surface = this.f26794e;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void l() {
        C3663o0 c3663o0 = this.f26792c;
        long j9 = c3663o0.f33079g;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            j9 = Long.MIN_VALUE;
            c3663o0.f33079g = Long.MIN_VALUE;
            c3663o0.f33080h = Long.MIN_VALUE;
        }
        c3663o0.i = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void n() {
        this.f26794e = null;
        this.f26790a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void o0(boolean z8) {
        if (z8) {
            C3341i0 c3341i0 = this.f26790a;
            c3341i0.f31295b.a();
            c3341i0.f31300g = com.anythink.basead.exoplayer.b.f6539b;
            c3341i0.f31298e = com.anythink.basead.exoplayer.b.f6539b;
            c3341i0.f31297d = Math.min(c3341i0.f31297d, 1);
            c3341i0.f31301h = com.anythink.basead.exoplayer.b.f6539b;
            c3341i0.f31305m = false;
        }
        this.f26791b.c();
        C3663o0 c3663o0 = this.f26792c;
        B0 b02 = c3663o0.f33077e;
        b02.f23938u = 0;
        b02.f23939v = -1;
        b02.f23940w = 0;
        c3663o0.f33079g = com.anythink.basead.exoplayer.b.f6539b;
        c3663o0.f33080h = com.anythink.basead.exoplayer.b.f6539b;
        c3663o0.i = com.anythink.basead.exoplayer.b.f6539b;
        F3.q qVar = c3663o0.f33076d;
        if (qVar.d() > 0) {
            PA.n(qVar.d() > 0);
            while (qVar.d() > 1) {
                qVar.e();
            }
            Object e6 = qVar.e();
            e6.getClass();
            c3663o0.f33082k = ((Long) e6).longValue();
        }
        F3.q qVar2 = c3663o0.f33075c;
        if (qVar2.d() > 0) {
            PA.n(qVar2.d() > 0);
            while (qVar2.d() > 1) {
                qVar2.e();
            }
            Object e9 = qVar2.e();
            e9.getClass();
            qVar2.c(0L, (C3100dd) e9);
        }
        this.f26793d.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void p0(InterfaceC3233g0 interfaceC3233g0) {
        this.f26798j = interfaceC3233g0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void q0(float f6) {
        this.f26790a.g(f6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void r0(U u7) {
        HD hd = HD.f25326n;
        this.f26797h = u7;
        this.i = hd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void s0(Surface surface, Xr xr) {
        this.f26794e = surface;
        this.f26790a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final boolean t0(long j9, V v6) {
        this.f26793d.add(v6);
        C3663o0 c3663o0 = this.f26792c;
        B0 b02 = c3663o0.f33077e;
        int i = b02.f23940w;
        long[] jArr = (long[]) b02.f23942y;
        int length = jArr.length;
        if (i == length) {
            int i4 = length + length;
            if (i4 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i4];
            int i9 = b02.f23938u;
            int i10 = length - i9;
            System.arraycopy(jArr, i9, jArr2, 0, i10);
            System.arraycopy((long[]) b02.f23942y, 0, jArr2, i10, i9);
            b02.f23938u = 0;
            b02.f23939v = b02.f23940w - 1;
            b02.f23942y = jArr2;
            b02.f23941x = i4 - 1;
            jArr = jArr2;
        }
        int i11 = (b02.f23939v + 1) & b02.f23941x;
        b02.f23939v = i11;
        jArr[i11] = j9;
        b02.f23940w++;
        c3663o0.f33079g = j9;
        c3663o0.i = com.anythink.basead.exoplayer.b.f6539b;
        this.i.execute(new RunnableC3068d(1, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void u0(long j9, long j10) {
        try {
            this.f26792c.a(j9, j10);
        } catch (RN e6) {
            throw new C4094w0(e6, this.f26795f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void v0(int i) {
        C3609n0 c3609n0 = this.f26790a.f31295b;
        if (c3609n0.f32793j == i) {
            return;
        }
        c3609n0.f32793j = i;
        c3609n0.c(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void w0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void x0(boolean z8) {
        C3341i0 c3341i0 = this.f26790a;
        c3341i0.i = z8;
        c3341i0.f31301h = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void y0(long j9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4148x0
    public final void z0(TP tp, long j9, int i, List list) {
        PA.T(list.isEmpty());
        int i4 = tp.f27783v;
        TP tp2 = this.f26795f;
        int i9 = tp2.f27783v;
        C3663o0 c3663o0 = this.f26792c;
        int i10 = tp.f27784w;
        if (i4 != i9 || i10 != tp2.f27784w) {
            long j10 = c3663o0.f33079g;
            c3663o0.f33075c.c(j10 == com.anythink.basead.exoplayer.b.f6539b ? 0L : j10 + 1, new C3100dd(i4, i10, 1.0f));
        }
        float f6 = this.f26795f.f27787z;
        float f9 = tp.f27787z;
        if (f9 != f6) {
            this.f26790a.d(f9);
        }
        this.f26795f = tp;
        if (j9 != this.f26796g) {
            if (c3663o0.f33077e.f23940w == 0) {
                c3663o0.f33073a.a(i);
                c3663o0.f33082k = j9;
            } else {
                long j11 = c3663o0.f33079g;
                c3663o0.f33076d.c(j11 == com.anythink.basead.exoplayer.b.f6539b ? -4611686018427387904L : j11 + 1, Long.valueOf(j9));
            }
            this.f26796g = j9;
        }
    }
}
