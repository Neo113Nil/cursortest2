package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x8 extends aq3<x8, w8> implements lr3 {
    private static final x8 zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        x8 x8Var = new x8();
        zzb = x8Var;
        aq3.v(x8.class, x8Var);
    }

    private x8() {
    }

    public static w8 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(x8 x8Var, long j7) {
        x8Var.zze |= 1;
        x8Var.zzf = j7;
    }

    static /* synthetic */ void I(x8 x8Var, long j7) {
        x8Var.zze |= 2;
        x8Var.zzg = j7;
    }

    static /* synthetic */ void J(x8 x8Var, long j7) {
        x8Var.zze |= 4;
        x8Var.zzh = j7;
    }

    static /* synthetic */ void K(x8 x8Var, long j7) {
        x8Var.zze |= 8;
        x8Var.zzi = j7;
    }

    static /* synthetic */ void L(x8 x8Var) {
        x8Var.zze &= -9;
        x8Var.zzi = -1L;
    }

    static /* synthetic */ void M(x8 x8Var, long j7) {
        x8Var.zze |= 16;
        x8Var.zzj = j7;
    }

    static /* synthetic */ void N(x8 x8Var, long j7) {
        x8Var.zze |= 32;
        x8Var.zzk = j7;
    }

    static /* synthetic */ void O(x8 x8Var, long j7) {
        x8Var.zze |= 128;
        x8Var.zzm = j7;
    }

    static /* synthetic */ void P(x8 x8Var, long j7) {
        x8Var.zze |= 256;
        x8Var.zzn = j7;
    }

    static /* synthetic */ void Q(x8 x8Var, long j7) {
        x8Var.zze |= 512;
        x8Var.zzo = j7;
    }

    static /* synthetic */ void R(x8 x8Var, long j7) {
        x8Var.zze |= 2048;
        x8Var.zzq = j7;
    }

    static /* synthetic */ void S(x8 x8Var, long j7) {
        x8Var.zze |= 4096;
        x8Var.zzr = j7;
    }

    static /* synthetic */ void T(x8 x8Var, long j7) {
        x8Var.zze |= 8192;
        x8Var.zzs = j7;
    }

    static /* synthetic */ void U(x8 x8Var, long j7) {
        x8Var.zze |= 16384;
        x8Var.zzt = j7;
    }

    static /* synthetic */ void V(x8 x8Var, long j7) {
        x8Var.zze |= 32768;
        x8Var.zzu = j7;
    }

    static /* synthetic */ void W(x8 x8Var, long j7) {
        x8Var.zze |= 65536;
        x8Var.zzv = j7;
    }

    static /* synthetic */ void X(x8 x8Var, long j7) {
        x8Var.zze |= 131072;
        x8Var.zzw = j7;
    }

    static /* synthetic */ void Y(x8 x8Var, long j7) {
        x8Var.zze |= 262144;
        x8Var.zzx = j7;
    }

    static /* synthetic */ void Z(x8 x8Var, int i7) {
        x8Var.zzl = i7 - 1;
        x8Var.zze |= 64;
    }

    static /* synthetic */ void a0(x8 x8Var, int i7) {
        x8Var.zzp = i7 - 1;
        x8Var.zze |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            eq3 eq3Var = g9.f5492a;
            return aq3.u(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", eq3Var, "zzm", "zzn", "zzo", "zzp", eq3Var, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i8 == 3) {
            return new x8();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new w8(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
