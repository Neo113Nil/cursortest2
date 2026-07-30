package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class G9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final G9 zzl;
    private static volatile GL zzm;
    private int zzf;
    private int zzg = 1000;
    private C4049v9 zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        G9 g9 = new G9();
        zzl = g9;
        AbstractC3199fL.u(G9.class, g9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", C3293h6.f31172x, "zzh", "zzi", "zzj", "zzk"});
        }
        if (d2 == 3) {
            return new G9();
        }
        if (d2 == 4) {
            return new F9(zzl);
        }
        if (d2 == 5) {
            return zzl;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzm;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (G9.class) {
            try {
                gl = zzm;
                if (gl == null) {
                    gl = new C3144eL(zzl);
                    zzm = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
