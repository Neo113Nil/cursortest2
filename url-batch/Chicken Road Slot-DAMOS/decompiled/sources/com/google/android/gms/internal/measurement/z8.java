package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z8 extends k1 {
    private static final z8 zzk;
    private static volatile j2 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private t1 zzj = m2.f2524s;

    static {
        z8 z8Var = new z8();
        zzk = z8Var;
        k1.o(z8.class, z8Var);
    }

    public static y8 F() {
        return (y8) zzk.j();
    }

    public final float A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final double C() {
        return this.zzi;
    }

    public final t1 D() {
        return this.zzj;
    }

    public final int E() {
        return this.zzj.size();
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void L(double d10) {
        this.zzb |= 16;
        this.zzi = d10;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void N(z8 z8Var) {
        t1 t1Var = this.zzj;
        if (!((p0) t1Var).f2659d) {
            this.zzj = v4.a.g(t1Var);
        }
        this.zzj.add(z8Var);
    }

    public final void O(ArrayList arrayList) {
        t1 t1Var = this.zzj;
        if (!((p0) t1Var).f2659d) {
            this.zzj = v4.a.g(t1Var);
        }
        o0.d(arrayList, this.zzj);
    }

    public final void P() {
        this.zzj = m2.f2524s;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", z8.class});
        }
        if (i10 == 3) {
            return new z8();
        }
        if (i10 == 4) {
            return new y8(zzk);
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
        synchronized (z8.class) {
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

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
