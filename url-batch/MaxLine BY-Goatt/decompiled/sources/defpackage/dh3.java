package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dh3 extends in3 {
    private static final dh3 zzi;
    private int zzb;
    private rn3 zzd;
    private rn3 zze;
    private rn3 zzf;
    private boolean zzg;
    private rn3 zzh;

    static {
        dh3 dh3Var = new dh3();
        zzi = dh3Var;
        in3.m(dh3.class, dh3Var);
    }

    public dh3() {
        vo3 vo3Var = vo3.q;
        this.zzd = vo3Var;
        this.zze = vo3Var;
        this.zzf = vo3Var;
        this.zzh = vo3Var;
    }

    public static dh3 v() {
        return zzi;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", rg3.class, "zze", sg3.class, "zzf", ah3.class, "zzg", "zzh", rg3.class});
        }
        if (i2 == 3) {
            return new dh3();
        }
        if (i2 == 4) {
            return new lg3(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final rn3 u() {
        return this.zzh;
    }
}
