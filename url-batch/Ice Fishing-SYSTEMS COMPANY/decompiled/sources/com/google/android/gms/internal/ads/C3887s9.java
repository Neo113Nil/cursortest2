package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.s9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3887s9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C3887s9 zzh;
    private static volatile GL zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C3887s9 c3887s9 = new C3887s9();
        zzh = c3887s9;
        AbstractC3199fL.u(C3887s9.class, c3887s9);
    }

    public static C3833r9 B() {
        return (C3833r9) zzh.r();
    }

    public final void A(int i) {
        this.zzd |= 4;
        this.zzg = i;
    }

    public final void C(int i) {
        this.zzd |= 1;
        this.zze = i;
    }

    public final void D(int i) {
        this.zzd |= 2;
        this.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (d2 == 3) {
            return new C3887s9();
        }
        if (d2 == 4) {
            return new C3833r9(zzh);
        }
        if (d2 == 5) {
            return zzh;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzi;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3887s9.class) {
            try {
                gl = zzi;
                if (gl == null) {
                    gl = new C3144eL(zzh);
                    zzi = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
