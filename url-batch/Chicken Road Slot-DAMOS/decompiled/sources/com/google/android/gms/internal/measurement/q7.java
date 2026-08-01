package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q7 extends k1 {
    private static final q7 zzk;
    private static volatile j2 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private m7 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        q7 q7Var = new q7();
        zzk = q7Var;
        k1.o(q7.class, q7Var);
    }

    public static p7 B() {
        return (p7) zzk.j();
    }

    public final boolean A() {
        return this.zzj;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new q7();
        }
        if (i10 == 4) {
            return new p7(zzk);
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
        synchronized (q7.class) {
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

    public final int u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }

    public final m7 w() {
        m7 m7Var = this.zzg;
        return m7Var == null ? m7.B() : m7Var;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zzb & 32) != 0;
    }
}
