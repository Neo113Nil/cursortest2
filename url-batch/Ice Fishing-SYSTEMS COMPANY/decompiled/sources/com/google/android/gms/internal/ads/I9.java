package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class I9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final I9 zzn;
    private static volatile GL zzo;
    private int zzg;
    private int zzh = 1000;
    private C4049v9 zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        I9 i9 = new I9();
        zzn = i9;
        AbstractC3199fL.u(I9.class, i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", C3293h6.f31172x, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (d2 == 3) {
            return new I9();
        }
        if (d2 == 4) {
            return new F9(zzn);
        }
        if (d2 == 5) {
            return zzn;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzo;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (I9.class) {
            try {
                gl = zzo;
                if (gl == null) {
                    gl = new C3144eL(zzn);
                    zzo = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
