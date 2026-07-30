package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class XH extends AbstractC3199fL {
    private static final XH zzb;
    private static volatile GL zzc;
    private int zza;

    static {
        XH xh = new XH();
        zzb = xh;
        AbstractC3199fL.u(XH.class, xh);
    }

    public static XH B(SK sk, YK yk) {
        return (XH) AbstractC3199fL.m(zzb, sk, yk);
    }

    public static XH C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new XH();
        }
        if (d2 == 4) {
            return new F9(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzc;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (XH.class) {
            try {
                gl = zzc;
                if (gl == null) {
                    gl = new C3144eL(zzb);
                    zzc = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
