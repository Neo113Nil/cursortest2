package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pi3 extends in3 {
    private static final pi3 zzh;
    private int zzb;
    private int zzd;
    private xj3 zze;
    private xj3 zzf;
    private boolean zzg;

    static {
        pi3 pi3Var = new pi3();
        zzh = pi3Var;
        in3.m(pi3.class, pi3Var);
    }

    public static oi3 w() {
        return (oi3) zzh.h();
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new pi3();
        }
        if (i2 == 4) {
            return new oi3(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final xj3 r() {
        xj3 xj3Var = this.zze;
        return xj3Var == null ? xj3.y() : xj3Var;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final xj3 t() {
        xj3 xj3Var = this.zzf;
        return xj3Var == null ? xj3.y() : xj3Var;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void y(xj3 xj3Var) {
        this.zze = xj3Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void z(xj3 xj3Var) {
        this.zzf = xj3Var;
        this.zzb |= 4;
    }
}
