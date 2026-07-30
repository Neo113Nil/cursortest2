package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vi3 extends in3 {
    private static final vi3 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        vi3 vi3Var = new vi3();
        zzf = vi3Var;
        in3.m(vi3.class, vi3Var);
    }

    public static ui3 p() {
        return (ui3) zzf.h();
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", mg3.h, "zze", mg3.i});
        }
        if (i2 == 3) {
            return new vi3();
        }
        if (i2 == 4) {
            return new ui3(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int q() {
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

    public final int r() {
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

    public final /* synthetic */ void s(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }
}
