package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class RI extends AbstractC3199fL {
    private static final RI zzd;
    private static volatile GL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        RI ri = new RI();
        zzd = ri;
        AbstractC3199fL.u(RI.class, ri);
    }

    public static QI D() {
        return (QI) zzd.r();
    }

    public static RI E() {
        return zzd;
    }

    public final EnumC3032cI A() {
        EnumC3032cI b9 = EnumC3032cI.b(this.zza);
        return b9 == null ? EnumC3032cI.UNRECOGNIZED : b9;
    }

    public final EnumC3032cI B() {
        EnumC3032cI b9 = EnumC3032cI.b(this.zzb);
        return b9 == null ? EnumC3032cI.UNRECOGNIZED : b9;
    }

    public final int C() {
        return this.zzc;
    }

    public final /* synthetic */ void F(EnumC3032cI enumC3032cI) {
        this.zza = enumC3032cI.a();
    }

    public final /* synthetic */ void G(EnumC3032cI enumC3032cI) {
        this.zzb = enumC3032cI.a();
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new RI();
        }
        if (d2 == 4) {
            return new QI(zzd);
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
        synchronized (RI.class) {
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
