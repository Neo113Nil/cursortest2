package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fh3 extends in3 {
    private static final fh3 zzg;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private rn3 zze = vo3.q;
    private boolean zzf;

    static {
        fh3 fh3Var = new fh3();
        zzg = fh3Var;
        in3.m(fh3.class, fh3Var);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", sh3.class, "zzf"});
        }
        if (i2 == 3) {
            return new fh3();
        }
        if (i2 == 4) {
            return new lg3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
