package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rg3 extends in3 {
    private static final rg3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        rg3 rg3Var = new rg3();
        zzg = rg3Var;
        in3.m(rg3.class, rg3Var);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", mg3.e, "zze", mg3.d, "zzf", mg3.f});
        }
        if (i2 == 3) {
            return new rg3();
        }
        if (i2 == 4) {
            return new lg3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int l = zj2.l(this.zzd);
        if (l == 0) {
            return 1;
        }
        return l;
    }

    public final int q() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int r() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
