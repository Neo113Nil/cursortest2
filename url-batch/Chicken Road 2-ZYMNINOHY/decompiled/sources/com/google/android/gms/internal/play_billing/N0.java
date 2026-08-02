package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class N0 implements S0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0320h0 f5894a;

    /* renamed from: b, reason: collision with root package name */
    public final C0349u0 f5895b;

    public N0(C0349u0 c0349u0, AbstractC0320h0 abstractC0320h0) {
        C0349u0 c0349u02 = AbstractC0342q0.f5996a;
        this.f5895b = c0349u0;
        this.f5894a = abstractC0320h0;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void a(Object obj) {
        this.f5895b.getClass();
        W0 w02 = ((AbstractC0353w0) obj).zzc;
        if (w02.f5927e) {
            w02.f5927e = false;
        }
        C0349u0 c0349u0 = AbstractC0342q0.f5996a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final int b(AbstractC0353w0 abstractC0353w0) {
        return abstractC0353w0.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean c(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void d(Object obj, Object obj2) {
        T0.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void e(Object obj, H0 h02) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final AbstractC0353w0 f() {
        AbstractC0320h0 abstractC0320h0 = this.f5894a;
        return abstractC0320h0 instanceof AbstractC0353w0 ? (AbstractC0353w0) ((AbstractC0353w0) abstractC0320h0).d(4) : ((AbstractC0351v0) ((AbstractC0353w0) abstractC0320h0).d(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final int g(AbstractC0320h0 abstractC0320h0) {
        W0 w02 = ((AbstractC0353w0) abstractC0320h0).zzc;
        int i4 = w02.f5926d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < w02.f5923a; i6++) {
            int i7 = w02.f5924b[i6] >>> 3;
            C0336n0 c0336n0 = (C0336n0) w02.f5925c[i6];
            int W4 = C0338o0.W(8);
            int W5 = C0338o0.W(i7) + C0338o0.W(16);
            int W6 = C0338o0.W(24);
            int d4 = c0336n0.d();
            i5 += W4 + W4 + W5 + AbstractC0005f.d(d4, d4, W6);
        }
        w02.f5926d = i5;
        return i5;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void h(Object obj, byte[] bArr, int i4, int i5, C0329k0 c0329k0) {
        AbstractC0353w0 abstractC0353w0 = (AbstractC0353w0) obj;
        if (abstractC0353w0.zzc == W0.f5922f) {
            abstractC0353w0.zzc = W0.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean i(AbstractC0353w0 abstractC0353w0, AbstractC0353w0 abstractC0353w02) {
        return abstractC0353w0.zzc.equals(abstractC0353w02.zzc);
    }
}
