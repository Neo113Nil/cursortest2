package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class QH extends AbstractC3199fL {
    private static final QH zzd;
    private static volatile GL zze;
    private int zza;
    private SH zzb;
    private int zzc;

    static {
        QH qh = new QH();
        zzd = qh;
        AbstractC3199fL.u(QH.class, qh);
    }

    public static QH B(SK sk, YK yk) {
        return (QH) AbstractC3199fL.m(zzd, sk, yk);
    }

    public static PH C() {
        return (PH) zzd.r();
    }

    public final SH A() {
        SH sh = this.zzb;
        return sh == null ? SH.C() : sh;
    }

    public final /* synthetic */ void D(SH sh) {
        this.zzb = sh;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new QH();
        }
        if (d2 == 4) {
            return new PH(zzd);
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
        synchronized (QH.class) {
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
