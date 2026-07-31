package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tx2 extends aq3<tx2, sx2> implements lr3 {
    private static final tx2 zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";

    static {
        tx2 tx2Var = new tx2();
        zzb = tx2Var;
        aq3.v(tx2.class, tx2Var);
    }

    private tx2() {
    }

    public static sx2 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(tx2 tx2Var, String str) {
        str.getClass();
        tx2Var.zzi = str;
    }

    static /* synthetic */ void I(tx2 tx2Var, String str) {
        str.getClass();
        tx2Var.zzj = str;
    }

    static /* synthetic */ void J(tx2 tx2Var, String str) {
        str.getClass();
        tx2Var.zzk = str;
    }

    static /* synthetic */ void N(tx2 tx2Var, String str) {
        str.getClass();
        tx2Var.zzq = str;
    }

    static /* synthetic */ void O(tx2 tx2Var, String str) {
        str.getClass();
        tx2Var.zzr = str;
    }

    static /* synthetic */ void P(tx2 tx2Var, String str) {
        str.getClass();
        tx2Var.zzs = str;
    }

    static /* synthetic */ void S(tx2 tx2Var, String str) {
        str.getClass();
        tx2Var.zzu = str;
    }

    static /* synthetic */ void V(tx2 tx2Var, int i7) {
        if (i7 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        tx2Var.zzm = i7 - 2;
    }

    static /* synthetic */ void W(tx2 tx2Var, int i7) {
        if (i7 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        tx2Var.zzp = i7 - 2;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i8 == 3) {
            return new tx2();
        }
        rx2 rx2Var = null;
        if (i8 == 4) {
            return new sx2(rx2Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
