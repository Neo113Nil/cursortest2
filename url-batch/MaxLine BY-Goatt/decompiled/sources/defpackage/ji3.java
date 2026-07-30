package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ji3 extends in3 {
    private static final ji3 zzk;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;

    static {
        ji3 ji3Var = new ji3();
        zzk = ji3Var;
        in3.m(ji3.class, ji3Var);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new ji3();
        }
        if (i2 == 4) {
            return new lg3(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
