package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qg3 extends in3 {
    private static final qg3 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = BuildConfig.FLAVOR;
    private rn3 zzg = vo3.q;

    static {
        qg3 qg3Var = new qg3();
        zzh = qg3Var;
        in3.m(qg3.class, qg3Var);
    }

    public static qg3 w() {
        return zzh;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", mg3.c, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new qg3();
        }
        if (i2 == 4) {
            return new lg3(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final boolean q() {
        return (this.zzb & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final rn3 u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int x() {
        int i;
        switch (this.zzd) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
