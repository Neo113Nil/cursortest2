package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mu3 extends aq3<mu3, lu3> implements lr3 {
    private static final mu3 zzb;
    private int zze;
    private int zzf;
    private zt3 zzh;
    private du3 zzi;
    private int zzj;
    private int zzm;
    private byte zzo = 2;
    private String zzg = "";
    private fq3 zzk = aq3.o();
    private String zzl = "";
    private jq3<String> zzn = aq3.r();

    static {
        mu3 mu3Var = new mu3();
        zzb = mu3Var;
        aq3.v(mu3.class, mu3Var);
    }

    private mu3() {
    }

    public static lu3 G() {
        return zzb.x();
    }

    static /* synthetic */ void J(mu3 mu3Var, int i7) {
        mu3Var.zze |= 1;
        mu3Var.zzf = i7;
    }

    static /* synthetic */ void K(mu3 mu3Var, String str) {
        str.getClass();
        mu3Var.zze |= 2;
        mu3Var.zzg = str;
    }

    static /* synthetic */ void L(mu3 mu3Var, zt3 zt3Var) {
        zt3Var.getClass();
        mu3Var.zzh = zt3Var;
        mu3Var.zze |= 4;
    }

    static /* synthetic */ void M(mu3 mu3Var, String str) {
        str.getClass();
        jq3<String> jq3Var = mu3Var.zzn;
        if (!jq3Var.c()) {
            mu3Var.zzn = aq3.s(jq3Var);
        }
        mu3Var.zzn.add(str);
    }

    static /* synthetic */ void N(mu3 mu3Var, int i7) {
        mu3Var.zzm = i7 - 1;
        mu3Var.zze |= 64;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", ju3.f7255a, "zzn"});
        }
        if (i8 == 3) {
            return new mu3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new lu3(ot3Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int F() {
        return this.zzn.size();
    }

    public final String I() {
        return this.zzg;
    }
}
