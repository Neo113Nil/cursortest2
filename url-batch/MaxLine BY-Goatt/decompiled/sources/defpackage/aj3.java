package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aj3 extends in3 {
    private static final aj3 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        aj3 aj3Var = new aj3();
        zzf = aj3Var;
        in3.m(aj3.class, aj3Var);
    }

    public static yi3 t() {
        return (yi3) zzf.h();
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new aj3();
        }
        if (i2 == 4) {
            return new yi3(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final long s() {
        return this.zze;
    }

    public final /* synthetic */ void u(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
