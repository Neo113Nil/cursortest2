package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y7 extends k1 {
    private static final y7 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        y7 y7Var = new y7();
        zzi = y7Var;
        k1.o(y7.class, y7Var);
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new y7();
        }
        if (i10 == 4) {
            return new x7(zzi);
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
        synchronized (y7.class) {
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

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final int z() {
        return this.zzh;
    }
}
