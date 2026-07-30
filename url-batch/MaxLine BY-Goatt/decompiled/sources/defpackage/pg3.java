package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pg3 extends in3 {
    private static final pg3 zzj;
    private int zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private kg3 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        pg3 pg3Var = new pg3();
        zzj = pg3Var;
        in3.m(pg3.class, pg3Var);
    }

    public static og3 x() {
        return (og3) zzj.h();
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new pg3();
        }
        if (i2 == 4) {
            return new og3(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final kg3 s() {
        kg3 kg3Var = this.zzf;
        return kg3Var == null ? kg3.x() : kg3Var;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zzb & 32) != 0;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
