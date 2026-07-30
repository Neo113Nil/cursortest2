package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class E9 extends AbstractC3199fL {
    public static final int zza = 1;
    private static final E9 zzc;
    private static volatile GL zzd;
    private InterfaceC3630nL zzb = JL.f25761x;

    static {
        E9 e9 = new E9();
        zzc = e9;
        AbstractC3199fL.u(E9.class, e9);
    }

    public static C4265z9 A() {
        return (C4265z9) zzc.r();
    }

    public final void B(C4211y9 c4211y9) {
        InterfaceC3630nL interfaceC3630nL = this.zzb;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzb = interfaceC3630nL.A(size + size);
        }
        this.zzb.add(c4211y9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C4211y9.class});
        }
        if (d2 == 3) {
            return new E9();
        }
        if (d2 == 4) {
            return new C4265z9(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzd;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (E9.class) {
            try {
                gl = zzd;
                if (gl == null) {
                    gl = new C3144eL(zzc);
                    zzd = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
