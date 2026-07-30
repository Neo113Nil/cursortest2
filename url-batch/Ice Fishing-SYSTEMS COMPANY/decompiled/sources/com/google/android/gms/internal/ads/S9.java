package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class S9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final S9 zzn;
    private static volatile GL zzo;
    private int zzg;
    private int zzh;
    private C3780q9 zzi;
    private C3780q9 zzj;
    private C3780q9 zzk;
    private InterfaceC3630nL zzl = JL.f25761x;
    private int zzm;

    static {
        S9 s9 = new S9();
        zzn = s9;
        AbstractC3199fL.u(S9.class, s9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C3780q9.class, "zzm"});
        }
        if (d2 == 3) {
            return new S9();
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
        synchronized (S9.class) {
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
