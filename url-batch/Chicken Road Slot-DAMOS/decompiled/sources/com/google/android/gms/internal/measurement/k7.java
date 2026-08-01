package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k7 extends k1 {
    private static final k7 zzm;
    private static volatile j2 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private t1 zzg = m2.f2524s;
    private boolean zzh;
    private o7 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        k7 k7Var = new k7();
        zzm = k7Var;
        k1.o(k7.class, k7Var);
    }

    public static j7 F() {
        return (j7) zzm.j();
    }

    public final o7 A() {
        o7 o7Var = this.zzi;
        return o7Var == null ? o7.C() : o7Var;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        return (this.zzb & 64) != 0;
    }

    public final boolean E() {
        return this.zzl;
    }

    public final /* synthetic */ void G(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void H(int i3, m7 m7Var) {
        t1 t1Var = this.zzg;
        if (!((p0) t1Var).f2659d) {
            this.zzg = v4.a.g(t1Var);
        }
        this.zzg.set(i3, m7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", m7.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i10 == 3) {
            return new k7();
        }
        if (i10 == 4) {
            return new j7(zzm);
        }
        if (i10 == 5) {
            return zzm;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzn;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (k7.class) {
            try {
                j2Var = zzn;
                if (j2Var == null) {
                    j2Var = new j1(zzm);
                    zzn = j2Var;
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

    public final List w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final m7 y(int i3) {
        return (m7) this.zzg.get(i3);
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
