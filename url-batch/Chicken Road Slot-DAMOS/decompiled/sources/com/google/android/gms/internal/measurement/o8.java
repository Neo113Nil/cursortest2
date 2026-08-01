package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o8 extends k1 {
    private static final o8 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private int zze;
    private h9 zzf;
    private h9 zzg;
    private boolean zzh;

    static {
        o8 o8Var = new o8();
        zzi = o8Var;
        k1.o(o8.class, o8Var);
    }

    public static n8 A() {
        return (n8) zzi.j();
    }

    public final /* synthetic */ void B(int i3) {
        this.zzb |= 1;
        this.zze = i3;
    }

    public final /* synthetic */ void C(h9 h9Var) {
        this.zzf = h9Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void D(h9 h9Var) {
        this.zzg = h9Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void E(boolean z10) {
        this.zzb |= 8;
        this.zzh = z10;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new o8();
        }
        if (i10 == 4) {
            return new n8(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzj;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (o8.class) {
            try {
                j2Var = zzj;
                if (j2Var == null) {
                    j2Var = new j1(zzi);
                    zzj = j2Var;
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

    public final h9 v() {
        h9 h9Var = this.zzf;
        return h9Var == null ? h9.C() : h9Var;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final h9 x() {
        h9 h9Var = this.zzg;
        return h9Var == null ? h9.C() : h9Var;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final boolean z() {
        return this.zzh;
    }
}
