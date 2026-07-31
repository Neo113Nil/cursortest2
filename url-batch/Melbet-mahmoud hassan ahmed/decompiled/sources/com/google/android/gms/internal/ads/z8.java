package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z8 extends aq3<z8, y8> implements lr3 {
    private static final z8 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        z8 z8Var = new z8();
        zzb = z8Var;
        aq3.v(z8.class, z8Var);
    }

    private z8() {
    }

    public static y8 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(z8 z8Var, long j7) {
        z8Var.zze |= 4;
        z8Var.zzh = j7;
    }

    static /* synthetic */ void I(z8 z8Var, long j7) {
        z8Var.zze |= 8;
        z8Var.zzi = j7;
    }

    static /* synthetic */ void J(z8 z8Var, long j7) {
        z8Var.zze |= 16;
        z8Var.zzj = j7;
    }

    static /* synthetic */ void K(z8 z8Var, long j7) {
        z8Var.zze |= 32;
        z8Var.zzk = j7;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i8 == 3) {
            return new z8();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new y8(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
