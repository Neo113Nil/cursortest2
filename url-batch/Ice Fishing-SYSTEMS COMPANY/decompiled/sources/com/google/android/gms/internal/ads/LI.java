package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class LI extends AbstractC3199fL {
    private static final LI zzj;
    private static volatile GL zzk;
    private int zza;
    private int zzb;
    private NI zzc;
    private SK zzd;
    private SK zze;
    private SK zzf;
    private SK zzg;
    private SK zzh;
    private SK zzi;

    static {
        LI li = new LI();
        zzj = li;
        AbstractC3199fL.u(LI.class, li);
    }

    public LI() {
        QK qk = SK.f27529u;
        this.zzd = qk;
        this.zze = qk;
        this.zzf = qk;
        this.zzg = qk;
        this.zzh = qk;
        this.zzi = qk;
    }

    public static LI I(SK sk, YK yk) {
        return (LI) AbstractC3199fL.m(zzj, sk, yk);
    }

    public static KI J() {
        return (KI) zzj.r();
    }

    public static GL K() {
        return zzj.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final NI B() {
        NI ni = this.zzc;
        return ni == null ? NI.G() : ni;
    }

    public final SK C() {
        return this.zzd;
    }

    public final SK D() {
        return this.zze;
    }

    public final SK E() {
        return this.zzf;
    }

    public final SK F() {
        return this.zzg;
    }

    public final SK G() {
        return this.zzh;
    }

    public final SK H() {
        return this.zzi;
    }

    public final /* synthetic */ void L() {
        this.zzb = 0;
    }

    public final /* synthetic */ void M(NI ni) {
        this.zzc = ni;
        this.zza |= 1;
    }

    public final /* synthetic */ void N(QK qk) {
        qk.getClass();
        this.zzd = qk;
    }

    public final /* synthetic */ void O(QK qk) {
        qk.getClass();
        this.zze = qk;
    }

    public final /* synthetic */ void P(QK qk) {
        qk.getClass();
        this.zzf = qk;
    }

    public final /* synthetic */ void Q(QK qk) {
        qk.getClass();
        this.zzg = qk;
    }

    public final /* synthetic */ void R(QK qk) {
        qk.getClass();
        this.zzh = qk;
    }

    public final /* synthetic */ void S(QK qk) {
        qk.getClass();
        this.zzi = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new LI();
        }
        if (d2 == 4) {
            return new KI(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzk;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (LI.class) {
            try {
                gl = zzk;
                if (gl == null) {
                    gl = new C3144eL(zzj);
                    zzk = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
