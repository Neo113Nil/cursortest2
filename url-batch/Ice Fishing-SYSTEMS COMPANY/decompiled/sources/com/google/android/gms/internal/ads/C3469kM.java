package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.kM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3469kM extends AbstractC3199fL {
    private static final C3469kM zzc;
    private static volatile GL zzd;
    private InterfaceC3414jL zza;
    private InterfaceC3414jL zzb;

    static {
        C3469kM c3469kM = new C3469kM();
        zzc = c3469kM;
        AbstractC3199fL.u(C3469kM.class, c3469kM);
    }

    public C3469kM() {
        C3254gL c3254gL = C3254gL.f30989x;
        this.zza = c3254gL;
        this.zzb = c3254gL;
    }

    public static C3469kM A(byte[] bArr, YK yk) {
        return (C3469kM) AbstractC3199fL.n(zzc, bArr, yk);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new C3469kM();
        }
        if (d2 == 4) {
            return new UL(zzc);
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
        synchronized (C3469kM.class) {
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
