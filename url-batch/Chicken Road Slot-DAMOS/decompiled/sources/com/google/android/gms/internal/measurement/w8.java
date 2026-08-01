package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w8 extends k1 {
    private static final w8 zzm;
    private static volatile j2 zzn;
    private int zzb;
    private t1 zze = m2.f2524s;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        w8 w8Var = new w8();
        zzm = w8Var;
        k1.o(w8.class, w8Var);
    }

    public static v8 J() {
        return (v8) zzm.j();
    }

    public final long A() {
        return this.zzg;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final int E() {
        return this.zzi;
    }

    public final boolean F() {
        return (this.zzb & 32) != 0;
    }

    public final long G() {
        return this.zzk;
    }

    public final boolean H() {
        return (this.zzb & 64) != 0;
    }

    public final long I() {
        return this.zzl;
    }

    public final /* synthetic */ void K(int i3, z8 z8Var) {
        u();
        this.zze.set(i3, z8Var);
    }

    public final /* synthetic */ void L(z8 z8Var) {
        z8Var.getClass();
        u();
        this.zze.add(z8Var);
    }

    public final /* synthetic */ void M(Iterable iterable) {
        u();
        o0.d(iterable, this.zze);
    }

    public final void N() {
        this.zze = m2.f2524s;
    }

    public final /* synthetic */ void O(int i3) {
        u();
        this.zze.remove(i3);
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void T(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", z8.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i10 == 3) {
            return new w8();
        }
        if (i10 == 4) {
            return new v8(zzm);
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
        synchronized (w8.class) {
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

    public final /* synthetic */ void t(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void u() {
        t1 t1Var = this.zze;
        if (((p0) t1Var).f2659d) {
            return;
        }
        this.zze = v4.a.g(t1Var);
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return this.zze.size();
    }

    public final z8 x(int i3) {
        return (z8) this.zze.get(i3);
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
