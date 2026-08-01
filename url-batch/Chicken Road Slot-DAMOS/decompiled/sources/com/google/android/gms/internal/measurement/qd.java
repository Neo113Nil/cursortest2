package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class qd extends k1 {
    private static final qd zzh;
    private static volatile j2 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        qd qdVar = new qd();
        zzh = qdVar;
        k1.o(qd.class, qdVar);
    }

    public static pd z() {
        return (pd) zzh.j();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void B(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void C(boolean z10) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z10);
    }

    public final /* synthetic */ void D(double d10) {
        this.zze = 4;
        this.zzf = Double.valueOf(d10);
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void F(v0 v0Var) {
        v0Var.getClass();
        this.zze = 6;
        this.zzf = v0Var;
    }

    public final int G() {
        int i3 = this.zze;
        if (i3 == 0) {
            return 6;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 3) {
            return 2;
        }
        if (i3 == 4) {
            return 3;
        }
        if (i3 != 5) {
            return i3 != 6 ? 0 : 5;
        }
        return 4;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i10 == 3) {
            return new qd();
        }
        if (i10 == 4) {
            return new pd(zzh);
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
        synchronized (qd.class) {
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
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean v() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double w() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String x() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    public final v0 y() {
        return this.zze == 6 ? (v0) this.zzf : v0.f2860e;
    }
}
