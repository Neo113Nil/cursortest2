package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lk3 extends in3 {
    private static final lk3 zzf;
    private int zzb;
    private rn3 zzd = vo3.q;
    private gk3 zze;

    static {
        lk3 lk3Var = new lk3();
        zzf = lk3Var;
        in3.m(lk3.class, lk3Var);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", nk3.class, "zze"});
        }
        if (i2 == 3) {
            return new lk3();
        }
        if (i2 == 4) {
            return new lg3(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final gk3 q() {
        gk3 gk3Var = this.zze;
        return gk3Var == null ? gk3.r() : gk3Var;
    }
}
