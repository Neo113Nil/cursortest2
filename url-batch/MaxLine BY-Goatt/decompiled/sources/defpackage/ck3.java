package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ck3 extends in3 {
    private static final ck3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        ck3 ck3Var = new ck3();
        zzg = ck3Var;
        in3.m(ck3.class, ck3Var);
    }

    public static bk3 q() {
        return (bk3) zzg.h();
    }

    public static ck3 r() {
        return zzg;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", mg3.n, "zze", mg3.l, "zzf", mg3.m});
        }
        if (i2 == 3) {
            return new ck3();
        }
        if (i2 == 4) {
            return new bk3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int d = in1.d(this.zze);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    public final void s(int i) {
        this.zze = in1.e(i);
        this.zzb |= 2;
    }

    public final int t() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int u() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        }
                    }
                }
                i = i3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void v(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
