package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.kN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3470kN extends AbstractC3199fL {
    private static final C3470kN zze;
    private static volatile GL zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        C3470kN c3470kN = new C3470kN();
        zze = c3470kN;
        AbstractC3199fL.u(C3470kN.class, c3470kN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", C3793qM.f33708w, "zzd"});
        }
        if (d2 == 3) {
            return new C3470kN();
        }
        if (d2 == 4) {
            return new C3364iN(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzf;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3470kN.class) {
            try {
                gl = zzf;
                if (gl == null) {
                    gl = new C3144eL(zze);
                    zzf = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
