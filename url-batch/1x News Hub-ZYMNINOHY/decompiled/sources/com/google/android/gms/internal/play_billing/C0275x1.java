package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;

/* renamed from: com.google.android.gms.internal.play_billing.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275x1 implements D1 {

    /* renamed from: a, reason: collision with root package name */
    public final S0 f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final C0219e1 f2962b;

    public C0275x1(C0219e1 c0219e1, S0 s02) {
        C0219e1 c0219e12 = AbstractC0210b1.f2833a;
        this.f2962b = c0219e1;
        this.f2961a = s02;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void a(Object obj) {
        this.f2962b.getClass();
        H1 h12 = ((AbstractC0225g1) obj).zzc;
        if (h12.f2743e) {
            h12.f2743e = false;
        }
        C0219e1 c0219e1 = AbstractC0210b1.f2833a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void b(Object obj, byte[] bArr, int i3, int i4, V0 v02) {
        AbstractC0225g1 abstractC0225g1 = (AbstractC0225g1) obj;
        if (abstractC0225g1.zzc == H1.f) {
            abstractC0225g1.zzc = H1.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final int c(AbstractC0225g1 abstractC0225g1) {
        H1 h12 = abstractC0225g1.zzc;
        int i3 = h12.f2742d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < h12.f2739a; i5++) {
            int i6 = h12.f2740b[i5] >>> 3;
            Y0 y02 = (Y0) h12.f2741c[i5];
            int d02 = Z0.d0(8);
            int d03 = Z0.d0(i6) + Z0.d0(16);
            int d04 = Z0.d0(24);
            int d3 = y02.d();
            i4 += d02 + d02 + d03 + AbstractC0033i.e(d3, d3, d04);
        }
        h12.f2742d = i4;
        return i4;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void d(Object obj, Object obj2) {
        E1.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final int e(AbstractC0225g1 abstractC0225g1) {
        return abstractC0225g1.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean f(AbstractC0225g1 abstractC0225g1, AbstractC0225g1 abstractC0225g12) {
        return abstractC0225g1.zzc.equals(abstractC0225g12.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final AbstractC0225g1 g() {
        S0 s02 = this.f2961a;
        return s02 instanceof AbstractC0225g1 ? (AbstractC0225g1) ((AbstractC0225g1) s02).d(4) : ((AbstractC0222f1) ((AbstractC0225g1) s02).d(5)).c();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void h(Object obj, C0257r1 c0257r1) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean i(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }
}
