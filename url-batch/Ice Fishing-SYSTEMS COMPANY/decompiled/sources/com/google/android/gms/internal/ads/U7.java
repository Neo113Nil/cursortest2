package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class U7 extends AbstractC3199fL {
    private static final U7 zzc;
    private static volatile GL zzd;
    private int zza;
    private C3239g6 zzb;

    static {
        U7 u7 = new U7();
        zzc = u7;
        AbstractC3199fL.u(U7.class, u7);
    }

    public static T7 A() {
        return (T7) zzc.r();
    }

    public final /* synthetic */ void B(C3239g6 c3239g6) {
        this.zzb = c3239g6;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new U7();
        }
        if (d2 == 4) {
            return new T7(zzc);
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
        synchronized (U7.class) {
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
