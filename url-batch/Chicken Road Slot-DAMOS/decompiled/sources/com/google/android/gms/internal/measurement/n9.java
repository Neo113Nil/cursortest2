package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n9 extends k1 {
    private static final n9 zzk;
    private static volatile j2 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        n9 n9Var = new n9();
        zzk = n9Var;
        k1.o(n9.class, n9Var);
    }

    public static m9 E() {
        return (m9) zzk.j();
    }

    public final boolean A() {
        return (this.zzb & 16) != 0;
    }

    public final float B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zzb & 32) != 0;
    }

    public final double D() {
        return this.zzj;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void L(double d10) {
        this.zzb |= 32;
        this.zzj = d10;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new n9();
        }
        if (i10 == 4) {
            return new m9(zzk);
        }
        if (i10 == 5) {
            return zzk;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzl;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (n9.class) {
            try {
                j2Var = zzl;
                if (j2Var == null) {
                    j2Var = new j1(zzk);
                    zzl = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final long u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final String x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final long z() {
        return this.zzh;
    }
}
