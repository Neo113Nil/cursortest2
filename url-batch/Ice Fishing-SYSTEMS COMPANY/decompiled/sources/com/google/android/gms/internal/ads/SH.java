package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class SH extends AbstractC3199fL {
    private static final SH zzd;
    private static volatile GL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        SH sh = new SH();
        zzd = sh;
        AbstractC3199fL.u(SH.class, sh);
    }

    public static RH B() {
        return (RH) zzd.r();
    }

    public static SH C() {
        return zzd;
    }

    public final EnumC3032cI A() {
        EnumC3032cI b9 = EnumC3032cI.b(this.zza);
        return b9 == null ? EnumC3032cI.UNRECOGNIZED : b9;
    }

    public final /* synthetic */ void D(EnumC3032cI enumC3032cI) {
        this.zza = enumC3032cI.a();
    }

    public final int E() {
        int i = this.zzb;
        int i4 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final int F() {
        int i = this.zzc;
        int i4 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final void G(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            AbstractC3684oL.a();
            throw null;
        }
    }

    public final void H(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            AbstractC3684oL.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new SH();
        }
        if (d2 == 4) {
            return new RH(zzd);
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
        synchronized (SH.class) {
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
