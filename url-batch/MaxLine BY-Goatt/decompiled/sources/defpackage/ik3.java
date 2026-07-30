package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ik3 extends in3 {
    private static final ik3 zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private rn3 zze = vo3.q;

    static {
        ik3 ik3Var = new ik3();
        zzf = ik3Var;
        in3.m(ik3.class, ik3Var);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", nk3.class});
        }
        if (i2 == 3) {
            return new ik3();
        }
        if (i2 == 4) {
            return new lg3(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }
}
