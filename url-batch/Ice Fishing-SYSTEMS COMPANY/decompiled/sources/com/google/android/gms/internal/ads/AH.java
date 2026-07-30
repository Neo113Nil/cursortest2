package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class AH extends AbstractC3199fL {
    private static final AH zzd;
    private static volatile GL zze;
    private int zza;
    private CH zzb;
    private int zzc;

    static {
        AH ah = new AH();
        zzd = ah;
        AbstractC3199fL.u(AH.class, ah);
    }

    public static AH C(SK sk, YK yk) {
        return (AH) AbstractC3199fL.m(zzd, sk, yk);
    }

    public static C4273zH D() {
        return (C4273zH) zzd.r();
    }

    public final CH A() {
        CH ch = this.zzb;
        return ch == null ? CH.C() : ch;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(CH ch) {
        this.zzb = ch;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
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
            return new KL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new AH();
        }
        if (d2 == 4) {
            return new C4273zH(zzd);
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
        synchronized (AH.class) {
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
