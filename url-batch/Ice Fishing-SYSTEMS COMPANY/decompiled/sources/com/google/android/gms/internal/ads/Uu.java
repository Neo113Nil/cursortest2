package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class Uu extends AbstractC3199fL {
    private static final Uu zzi;
    private static volatile GL zzj;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        Uu uu = new Uu();
        zzi = uu;
        AbstractC3199fL.u(Uu.class, uu);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (d2 == 3) {
            return new Uu();
        }
        if (d2 == 4) {
            return new F9(zzi);
        }
        if (d2 == 5) {
            return zzi;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzj;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (Uu.class) {
            try {
                gl = zzj;
                if (gl == null) {
                    gl = new C3144eL(zzi);
                    zzj = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
