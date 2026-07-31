package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class e9 extends aq3<e9, d9> implements lr3 {
    private static final e9 zzb;
    private int zze;
    private uo3 zzf;
    private uo3 zzg;
    private uo3 zzh;
    private uo3 zzi;

    static {
        e9 e9Var = new e9();
        zzb = e9Var;
        aq3.v(e9.class, e9Var);
    }

    private e9() {
        uo3 uo3Var = uo3.f12885g;
        this.zzf = uo3Var;
        this.zzg = uo3Var;
        this.zzh = uo3Var;
        this.zzi = uo3Var;
    }

    public static d9 F() {
        return zzb.x();
    }

    public static e9 H(byte[] bArr, mp3 mp3Var) {
        return (e9) aq3.D(zzb, bArr, mp3Var);
    }

    static /* synthetic */ void M(e9 e9Var, uo3 uo3Var) {
        e9Var.zze |= 1;
        e9Var.zzf = uo3Var;
    }

    static /* synthetic */ void N(e9 e9Var, uo3 uo3Var) {
        e9Var.zze |= 2;
        e9Var.zzg = uo3Var;
    }

    static /* synthetic */ void O(e9 e9Var, uo3 uo3Var) {
        e9Var.zze |= 4;
        e9Var.zzh = uo3Var;
    }

    static /* synthetic */ void P(e9 e9Var, uo3 uo3Var) {
        e9Var.zze |= 8;
        e9Var.zzi = uo3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new e9();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new d9(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final uo3 I() {
        return this.zzf;
    }

    public final uo3 J() {
        return this.zzg;
    }

    public final uo3 K() {
        return this.zzi;
    }

    public final uo3 L() {
        return this.zzh;
    }
}
