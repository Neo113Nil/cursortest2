package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sg3 extends in3 {
    private static final sg3 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        sg3 sg3Var = new sg3();
        zzf = sg3Var;
        in3.m(sg3.class, sg3Var);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            mg3 mg3Var = mg3.e;
            return new wo3(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", mg3Var, "zze", mg3Var});
        }
        if (i2 == 3) {
            return new sg3();
        }
        if (i2 == 4) {
            return new lg3(zzf);
        }
        if (i2 == 5) {
            return zzf;
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
        int l = zj2.l(this.zze);
        if (l == 0) {
            return 1;
        }
        return l;
    }
}
