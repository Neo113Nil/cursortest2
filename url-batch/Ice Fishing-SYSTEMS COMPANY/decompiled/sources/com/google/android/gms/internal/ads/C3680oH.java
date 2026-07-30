package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.oH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3680oH extends AbstractC3199fL {
    private static final C3680oH zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private C3895sH zzc;
    private C3141eI zzd;

    static {
        C3680oH c3680oH = new C3680oH();
        zze = c3680oH;
        AbstractC3199fL.u(C3680oH.class, c3680oH);
    }

    public static C3680oH D(SK sk, YK yk) {
        return (C3680oH) AbstractC3199fL.m(zze, sk, yk);
    }

    public static C3626nH E() {
        return (C3626nH) zze.r();
    }

    public static GL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3895sH B() {
        C3895sH c3895sH = this.zzc;
        return c3895sH == null ? C3895sH.E() : c3895sH;
    }

    public final C3141eI C() {
        C3141eI c3141eI = this.zzd;
        return c3141eI == null ? C3141eI.F() : c3141eI;
    }

    public final /* synthetic */ void G(C3895sH c3895sH) {
        this.zzc = c3895sH;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(C3141eI c3141eI) {
        this.zzd = c3141eI;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3680oH();
        }
        if (d2 == 4) {
            return new C3626nH(zze);
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
        synchronized (C3680oH.class) {
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
