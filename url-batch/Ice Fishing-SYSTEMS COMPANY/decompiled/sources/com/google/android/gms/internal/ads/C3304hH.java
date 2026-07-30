package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.hH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3304hH extends AbstractC3199fL {
    private static final C3304hH zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private SK zzc = SK.f27529u;
    private C3518lH zzd;

    static {
        C3304hH c3304hH = new C3304hH();
        zze = c3304hH;
        AbstractC3199fL.u(C3304hH.class, c3304hH);
    }

    public static C3304hH D(SK sk, YK yk) {
        return (C3304hH) AbstractC3199fL.m(zze, sk, yk);
    }

    public static C3250gH E() {
        return (C3250gH) zze.r();
    }

    public static GL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final SK B() {
        return this.zzc;
    }

    public final C3518lH C() {
        C3518lH c3518lH = this.zzd;
        return c3518lH == null ? C3518lH.C() : c3518lH;
    }

    public final /* synthetic */ void G(SK sk) {
        sk.getClass();
        this.zzc = sk;
    }

    public final /* synthetic */ void H(C3518lH c3518lH) {
        this.zzd = c3518lH;
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
            return new KL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3304hH();
        }
        if (d2 == 4) {
            return new C3250gH(zze);
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
        synchronized (C3304hH.class) {
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
