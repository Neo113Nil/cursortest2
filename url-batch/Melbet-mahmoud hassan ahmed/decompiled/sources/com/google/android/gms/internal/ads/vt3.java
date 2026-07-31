package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vt3 extends aq3<vt3, ut3> implements lr3 {
    private static final vt3 zzb;
    private int zze;
    private uo3 zzf;
    private uo3 zzg;
    private byte zzh = 2;

    static {
        vt3 vt3Var = new vt3();
        zzb = vt3Var;
        aq3.v(vt3.class, vt3Var);
    }

    private vt3() {
        uo3 uo3Var = uo3.f12885g;
        this.zzf = uo3Var;
        this.zzg = uo3Var;
    }

    public static ut3 F() {
        return zzb.x();
    }

    static /* synthetic */ void H(vt3 vt3Var, uo3 uo3Var) {
        vt3Var.zze |= 1;
        vt3Var.zzf = uo3Var;
    }

    static /* synthetic */ void I(vt3 vt3Var, uo3 uo3Var) {
        vt3Var.zze |= 2;
        vt3Var.zzg = uo3Var;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new vt3();
        }
        ot3 ot3Var = null;
        if (i8 == 4) {
            return new ut3(ot3Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
