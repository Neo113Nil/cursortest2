package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class VI extends AbstractC3199fL {
    private static final VI zzf;
    private static volatile GL zzg;
    private int zza;
    private int zzb;
    private RI zzc;
    private SK zzd;
    private SK zze;

    static {
        VI vi = new VI();
        zzf = vi;
        AbstractC3199fL.u(VI.class, vi);
    }

    public VI() {
        QK qk = SK.f27529u;
        this.zzd = qk;
        this.zze = qk;
    }

    public static VI E(SK sk, YK yk) {
        return (VI) AbstractC3199fL.m(zzf, sk, yk);
    }

    public static UI F() {
        return (UI) zzf.r();
    }

    public static VI G() {
        return zzf;
    }

    public static GL H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final RI B() {
        RI ri = this.zzc;
        return ri == null ? RI.E() : ri;
    }

    public final SK C() {
        return this.zzd;
    }

    public final SK D() {
        return this.zze;
    }

    public final /* synthetic */ void I(int i) {
        this.zzb = 0;
    }

    public final /* synthetic */ void J(RI ri) {
        this.zzc = ri;
        this.zza |= 1;
    }

    public final /* synthetic */ void K(QK qk) {
        qk.getClass();
        this.zzd = qk;
    }

    public final /* synthetic */ void L(QK qk) {
        qk.getClass();
        this.zze = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new VI();
        }
        if (d2 == 4) {
            return new UI(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (VI.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
