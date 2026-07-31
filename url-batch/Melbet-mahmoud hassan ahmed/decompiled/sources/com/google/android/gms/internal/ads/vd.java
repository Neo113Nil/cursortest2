package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vd extends aq3<vd, ud> implements lr3 {
    private static final vd zzb;
    private int zze;
    private yd zzf;
    private uo3 zzg;
    private uo3 zzh;

    static {
        vd vdVar = new vd();
        zzb = vdVar;
        aq3.v(vd.class, vdVar);
    }

    private vd() {
        uo3 uo3Var = uo3.f12885g;
        this.zzg = uo3Var;
        this.zzh = uo3Var;
    }

    public static vd G(uo3 uo3Var, mp3 mp3Var) {
        return (vd) aq3.C(zzb, uo3Var, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new vd();
        }
        td tdVar = null;
        if (i8 == 4) {
            return new ud(tdVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final yd H() {
        yd ydVar = this.zzf;
        return ydVar == null ? yd.K() : ydVar;
    }

    public final uo3 I() {
        return this.zzh;
    }

    public final uo3 J() {
        return this.zzg;
    }
}
