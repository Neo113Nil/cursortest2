package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class MH extends AbstractC3199fL {
    private static final MH zzc;
    private static volatile GL zzd;
    private int zza;
    private SK zzb = SK.f27529u;

    static {
        MH mh = new MH();
        zzc = mh;
        AbstractC3199fL.u(MH.class, mh);
    }

    public static MH C(SK sk, YK yk) {
        return (MH) AbstractC3199fL.m(zzc, sk, yk);
    }

    public static LH D() {
        return (LH) zzc.r();
    }

    public static GL E() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final SK B() {
        return this.zzb;
    }

    public final /* synthetic */ void F(SK sk) {
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
            return new MH();
        }
        if (d2 == 4) {
            return new LH(zzc);
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
        synchronized (MH.class) {
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
