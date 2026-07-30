package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class ZI extends AbstractC3199fL {
    private static final ZI zzd;
    private static volatile GL zze;
    private int zza;
    private int zzb;
    private C2979bJ zzc;

    static {
        ZI zi = new ZI();
        zzd = zi;
        AbstractC3199fL.u(ZI.class, zi);
    }

    public static ZI C(SK sk, YK yk) {
        return (ZI) AbstractC3199fL.m(zzd, sk, yk);
    }

    public static YI D() {
        return (YI) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final C2979bJ B() {
        C2979bJ c2979bJ = this.zzc;
        return c2979bJ == null ? C2979bJ.C() : c2979bJ;
    }

    public final /* synthetic */ void E(C2979bJ c2979bJ) {
        this.zzc = c2979bJ;
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
            return new KL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new ZI();
        }
        if (d2 == 4) {
            return new YI(zzd);
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
        synchronized (ZI.class) {
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
