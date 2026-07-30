package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wh3 extends in3 {
    private static final wh3 zzi;
    private int zzb;
    private int zzg;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        wh3 wh3Var = new wh3();
        zzi = wh3Var;
        in3.m(wh3.class, wh3Var);
    }

    public static wh3 r() {
        return zzi;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new wh3();
        }
        if (i2 == 4) {
            return new lg3(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final int p() {
        return this.zzg;
    }

    public final String q() {
        return this.zzh;
    }
}
