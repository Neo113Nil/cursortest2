package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.qH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3788qH extends AbstractC3199fL {
    private static final C3788qH zzd;
    private static volatile GL zze;
    private int zza;
    private C4003uH zzb;
    private C3251gI zzc;

    static {
        C3788qH c3788qH = new C3788qH();
        zzd = c3788qH;
        AbstractC3199fL.u(C3788qH.class, c3788qH);
    }

    public static C3788qH C(SK sk, YK yk) {
        return (C3788qH) AbstractC3199fL.m(zzd, sk, yk);
    }

    public static C3734pH D() {
        return (C3734pH) zzd.r();
    }

    public final C4003uH A() {
        C4003uH c4003uH = this.zzb;
        return c4003uH == null ? C4003uH.D() : c4003uH;
    }

    public final C3251gI B() {
        C3251gI c3251gI = this.zzc;
        return c3251gI == null ? C3251gI.F() : c3251gI;
    }

    public final /* synthetic */ void E(C4003uH c4003uH) {
        this.zzb = c4003uH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(C3251gI c3251gI) {
        this.zzc = c3251gI;
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
            return new KL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3788qH();
        }
        if (d2 == 4) {
            return new C3734pH(zzd);
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
        synchronized (C3788qH.class) {
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
