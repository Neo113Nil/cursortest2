package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class H0 implements K0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0349u0 f5849b = new C0349u0(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f5850a;

    public H0(K0... k0Arr) {
        this.f5850a = k0Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    public R0 a(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            K0 k02 = ((K0[]) this.f5850a)[i4];
            if (k02.b(cls)) {
                return k02.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    public boolean b(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (((K0[]) this.f5850a)[i4].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i4, Object obj, S0 s02) {
        C0338o0 c0338o0 = (C0338o0) this.f5850a;
        c0338o0.h0(i4, 3);
        s02.e((AbstractC0320h0) obj, c0338o0.f5990a);
        c0338o0.h0(i4, 4);
    }

    public void d(int i4, Object obj, S0 s02) {
        AbstractC0320h0 abstractC0320h0 = (AbstractC0320h0) obj;
        C0338o0 c0338o0 = (C0338o0) this.f5850a;
        c0338o0.j0((i4 << 3) | 2);
        c0338o0.j0(abstractC0320h0.b(s02));
        s02.e(abstractC0320h0, c0338o0.f5990a);
    }

    public H0() {
        P0 p02 = P0.f5897c;
        H0 h02 = new H0(C0349u0.f6020b, f5849b);
        Charset charset = B0.f5803a;
        this.f5850a = h02;
    }

    public H0(C0338o0 c0338o0) {
        Charset charset = B0.f5803a;
        this.f5850a = c0338o0;
        c0338o0.f5990a = this;
    }
}
