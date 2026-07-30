package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kg3 extends in3 {
    private static final kg3 zzh;
    private int zzb;
    private qg3 zzd;
    private ng3 zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;

    static {
        kg3 kg3Var = new kg3();
        zzh = kg3Var;
        in3.m(kg3.class, kg3Var);
    }

    public static kg3 x() {
        return zzh;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new kg3();
        }
        if (i2 == 4) {
            return new jg3(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final qg3 q() {
        qg3 qg3Var = this.zzd;
        return qg3Var == null ? qg3.w() : qg3Var;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final ng3 s() {
        ng3 ng3Var = this.zze;
        return ng3Var == null ? ng3.y() : ng3Var;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
