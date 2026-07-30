package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.iI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3359iI extends AbstractC3199fL {
    private static final C3359iI zzc;
    private static volatile GL zzd;
    private int zza;
    private int zzb;

    static {
        C3359iI c3359iI = new C3359iI();
        zzc = c3359iI;
        AbstractC3199fL.u(C3359iI.class, c3359iI);
    }

    public static C3305hI C() {
        return (C3305hI) zzc.r();
    }

    public static C3359iI D() {
        return zzc;
    }

    public final EnumC3032cI A() {
        EnumC3032cI b9 = EnumC3032cI.b(this.zza);
        return b9 == null ? EnumC3032cI.UNRECOGNIZED : b9;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(EnumC3032cI enumC3032cI) {
        this.zza = enumC3032cI.a();
    }

    public final /* synthetic */ void F(int i) {
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new C3359iI();
        }
        if (d2 == 4) {
            return new C3305hI(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzd;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3359iI.class) {
            try {
                gl = zzd;
                if (gl == null) {
                    gl = new C3144eL(zzc);
                    zzd = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
