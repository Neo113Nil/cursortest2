package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class al3 extends aq3<al3, zk3> implements lr3 {
    private static final al3 zzb;
    private qk3 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        al3 al3Var = new al3();
        zzb = al3Var;
        aq3.v(al3.class, al3Var);
    }

    private al3() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new al3();
        }
        xk3 xk3Var = null;
        if (i8 == 4) {
            return new zk3(xk3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zzg;
    }

    public final qk3 G() {
        qk3 qk3Var = this.zze;
        return qk3Var == null ? qk3.H() : qk3Var;
    }

    public final boolean I() {
        return this.zze != null;
    }

    public final int J() {
        int i7 = this.zzf;
        int i8 = 3;
        if (i7 == 0) {
            i8 = 2;
        } else if (i7 != 1) {
            i8 = i7 != 2 ? i7 != 3 ? 0 : 5 : 4;
        }
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    public final int K() {
        int b7 = vl3.b(this.zzh);
        if (b7 == 0) {
            return 1;
        }
        return b7;
    }
}
