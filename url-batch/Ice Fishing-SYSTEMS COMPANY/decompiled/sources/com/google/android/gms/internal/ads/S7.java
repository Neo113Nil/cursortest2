package com.google.android.gms.internal.ads;

import java.util.List;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class S7 extends AbstractC3199fL {
    private static final S7 zzd;
    private static volatile GL zze;
    private int zza;
    private C2913a8 zzb;
    private InterfaceC3414jL zzc = C3254gL.f30989x;

    static {
        S7 s72 = new S7();
        zzd = s72;
        AbstractC3199fL.u(S7.class, s72);
    }

    public static S7 C(byte[] bArr, YK yk) {
        AbstractC3199fL y6 = AbstractC3199fL.y(zzd, bArr, bArr.length, yk);
        AbstractC3199fL.z(y6);
        return (S7) y6;
    }

    public final C2913a8 A() {
        C2913a8 c2913a8 = this.zzb;
        return c2913a8 == null ? C2913a8.E() : c2913a8;
    }

    public final List B() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new S7();
        }
        if (d2 == 4) {
            return new C3453k6(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zze;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (S7.class) {
            try {
                gl = zze;
                if (gl == null) {
                    gl = new C3144eL(zzd);
                    zze = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
