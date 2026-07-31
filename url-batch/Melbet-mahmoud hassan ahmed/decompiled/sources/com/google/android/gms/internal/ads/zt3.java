package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zt3 extends aq3<zt3, wt3> implements lr3 {
    private static final zt3 zzb;
    private int zze;
    private yt3 zzf;
    private uo3 zzh;
    private uo3 zzi;
    private int zzj;
    private byte zzk = 2;
    private jq3<vt3> zzg = aq3.r();

    static {
        zt3 zt3Var = new zt3();
        zzb = zt3Var;
        aq3.v(zt3.class, zt3Var);
    }

    private zt3() {
        uo3 uo3Var = uo3.f12885g;
        this.zzh = uo3Var;
        this.zzi = uo3Var;
    }

    public static wt3 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(zt3 zt3Var, vt3 vt3Var) {
        vt3Var.getClass();
        jq3<vt3> jq3Var = zt3Var.zzg;
        if (!jq3Var.c()) {
            zt3Var.zzg = aq3.s(jq3Var);
        }
        zt3Var.zzg.add(vt3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", vt3.class, "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new zt3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new wt3(ot3Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
