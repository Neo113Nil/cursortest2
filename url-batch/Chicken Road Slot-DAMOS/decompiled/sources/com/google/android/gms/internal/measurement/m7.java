package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m7 extends k1 {
    private static final m7 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private r7 zze;
    private o7 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        m7 m7Var = new m7();
        zzi = m7Var;
        k1.o(m7.class, m7Var);
    }

    public static m7 B() {
        return zzi;
    }

    public final String A() {
        return this.zzh;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new m7();
        }
        if (i10 == 4) {
            return new l7(zzi);
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
        synchronized (m7.class) {
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

    public final r7 u() {
        r7 r7Var = this.zze;
        return r7Var == null ? r7.A() : r7Var;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final o7 w() {
        o7 o7Var = this.zzf;
        return o7Var == null ? o7.C() : o7Var;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
