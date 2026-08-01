package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class gb extends k1 {
    private static final gb zzh;
    private static volatile j2 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        gb gbVar = new gb();
        zzh = gbVar;
        k1.o(gb.class, gbVar);
    }

    public static gb A() {
        return zzh;
    }

    public static fb z() {
        return (fb) zzh.j();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void D(boolean z10) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z10);
    }

    public final /* synthetic */ void E(double d10) {
        this.zze = 3;
        this.zzf = Double.valueOf(d10);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void G(u0 u0Var) {
        u0Var.getClass();
        this.zze = 5;
        this.zzf = u0Var;
    }

    public final int H() {
        int i3 = this.zze;
        if (i3 == 0) {
            return 6;
        }
        int i10 = 1;
        if (i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                i10 = 3;
                if (i3 != 3) {
                    i10 = 4;
                    if (i3 != 4) {
                        i10 = 5;
                        if (i3 != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i10 == 3) {
            return new gb();
        }
        if (i10 == 4) {
            return new fb(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzi;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (gb.class) {
            try {
                j2Var = zzi;
                if (j2Var == null) {
                    j2Var = new j1(zzh);
                    zzi = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean v() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double w() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String x() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final v0 y() {
        return this.zze == 5 ? (v0) this.zzf : v0.f2860e;
    }
}
