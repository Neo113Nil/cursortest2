package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ih3 extends in3 {
    private static final ih3 zzh;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        ih3 ih3Var = new ih3();
        zzh = ih3Var;
        in3.m(ih3.class, ih3Var);
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ih3();
        }
        if (i2 == 4) {
            return new hh3(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }

    public final boolean q() {
        return (this.zzb & 2) != 0;
    }

    public final boolean r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final int v() {
        return this.zzg;
    }

    public final /* synthetic */ void w(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
