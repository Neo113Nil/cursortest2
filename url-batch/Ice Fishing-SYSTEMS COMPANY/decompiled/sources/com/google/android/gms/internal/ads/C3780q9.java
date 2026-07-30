package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.q9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3780q9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3780q9 zzf;
    private static volatile GL zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3780q9 c3780q9 = new C3780q9();
        zzf = c3780q9;
        AbstractC3199fL.u(C3780q9.class, c3780q9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3780q9();
        }
        if (d2 == 4) {
            return new C3453k6(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3780q9.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
