package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class KH extends AbstractC3199fL {
    private static final KH zzc;
    private static volatile GL zzd;
    private int zza;
    private int zzb;

    static {
        KH kh = new KH();
        zzc = kh;
        AbstractC3199fL.u(KH.class, kh);
    }

    public static KH C(SK sk, YK yk) {
        return (KH) AbstractC3199fL.m(zzc, sk, yk);
    }

    public static JH D() {
        return (JH) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (d2 == 3) {
            return new KH();
        }
        if (d2 == 4) {
            return new JH(zzc);
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
        synchronized (KH.class) {
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
