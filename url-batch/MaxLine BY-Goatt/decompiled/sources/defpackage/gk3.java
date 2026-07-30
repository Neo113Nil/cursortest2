package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gk3 extends in3 {
    private static final gk3 zzd;
    private rn3 zzb = vo3.q;

    static {
        gk3 gk3Var = new gk3();
        zzd = gk3Var;
        in3.m(gk3.class, gk3Var);
    }

    public static gk3 r() {
        return zzd;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", ik3.class});
        }
        if (i2 == 3) {
            return new gk3();
        }
        if (i2 == 4) {
            return new lg3(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
