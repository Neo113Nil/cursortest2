package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.jM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3415jM extends AbstractC3199fL {
    private static final C3415jM zzd;
    private static volatile GL zze;
    private int zza;
    private String zzb = "";
    private InterfaceC3414jL zzc = C3254gL.f30989x;

    static {
        C3415jM c3415jM = new C3415jM();
        zzd = c3415jM;
        AbstractC3199fL.u(C3415jM.class, c3415jM);
    }

    public static C3363iM A() {
        return (C3363iM) zzd.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = 15;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3415jM();
        }
        if (d2 == 4) {
            return new C3363iM(zzd);
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
        synchronized (C3415jM.class) {
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
