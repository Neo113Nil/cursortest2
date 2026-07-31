package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class du3 extends aq3<du3, au3> implements lr3 {
    private static final du3 zzb;
    private int zze;
    private cu3 zzf;
    private uo3 zzh;
    private uo3 zzi;
    private int zzj;
    private uo3 zzk;
    private byte zzl = 2;
    private jq3<vt3> zzg = aq3.r();

    static {
        du3 du3Var = new du3();
        zzb = du3Var;
        aq3.v(du3.class, du3Var);
    }

    private du3() {
        uo3 uo3Var = uo3.f12885g;
        this.zzh = uo3Var;
        this.zzi = uo3Var;
        this.zzk = uo3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", vt3.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new du3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new au3(ot3Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
