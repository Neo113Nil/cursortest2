package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.bI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2978bI extends AbstractC3199fL {
    private static final C2978bI zzc;
    private static volatile GL zzd;
    private int zza;
    private SK zzb = SK.f27529u;

    static {
        C2978bI c2978bI = new C2978bI();
        zzc = c2978bI;
        AbstractC3199fL.u(C2978bI.class, c2978bI);
    }

    public static C2978bI C(SK sk, YK yk) {
        return (C2978bI) AbstractC3199fL.m(zzc, sk, yk);
    }

    public static C2923aI D() {
        return (C2923aI) zzc.r();
    }

    public static C2978bI E() {
        return zzc;
    }

    public static GL F() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final SK B() {
        return this.zzb;
    }

    public final /* synthetic */ void G(SK sk) {
        sk.getClass();
        this.zzb = sk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new C2978bI();
        }
        if (d2 == 4) {
            return new C2923aI(zzc);
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
        synchronized (C2978bI.class) {
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
