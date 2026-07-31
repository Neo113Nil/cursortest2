package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z7 extends aq3<z7, v7> implements lr3 {
    private static final z7 zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private jq3<x7> zzq = aq3.r();

    static {
        z7 z7Var = new z7();
        zzb = z7Var;
        aq3.v(z7.class, z7Var);
    }

    private z7() {
    }

    public static v7 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(z7 z7Var, long j7) {
        z7Var.zze |= 2;
        z7Var.zzg = j7;
    }

    static /* synthetic */ void I(z7 z7Var, String str) {
        str.getClass();
        z7Var.zze |= 4;
        z7Var.zzh = str;
    }

    static /* synthetic */ void J(z7 z7Var, String str) {
        str.getClass();
        z7Var.zze |= 8;
        z7Var.zzi = str;
    }

    static /* synthetic */ void K(z7 z7Var, String str) {
        z7Var.zze |= 16;
        z7Var.zzj = str;
    }

    static /* synthetic */ void L(z7 z7Var, String str) {
        z7Var.zze |= 1024;
        z7Var.zzp = str;
    }

    static /* synthetic */ void M(z7 z7Var, String str) {
        str.getClass();
        z7Var.zze |= 1;
        z7Var.zzf = str;
    }

    static /* synthetic */ void N(z7 z7Var, int i7) {
        z7Var.zzr = i7 - 1;
        z7Var.zze |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", x7.class, "zzr", y7.f14566a});
        }
        if (i8 == 3) {
            return new z7();
        }
        u7 u7Var = null;
        if (i8 == 4) {
            return new v7(u7Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
