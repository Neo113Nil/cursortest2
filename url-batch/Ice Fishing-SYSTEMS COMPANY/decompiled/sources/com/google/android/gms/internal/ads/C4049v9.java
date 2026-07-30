package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.v9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4049v9 extends AbstractC3199fL {
    public static final int zza = 1;
    private static final C4049v9 zzd;
    private static volatile GL zze;
    private int zzb;
    private int zzc;

    static {
        C4049v9 c4049v9 = new C4049v9();
        zzd = c4049v9;
        AbstractC3199fL.u(C4049v9.class, c4049v9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", C3293h6.f31168t});
        }
        if (d2 == 3) {
            return new C4049v9();
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
        synchronized (C4049v9.class) {
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
