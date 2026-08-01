package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r7 extends k1 {
    private static final r7 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private t1 zzh = m2.f2524s;

    static {
        r7 r7Var = new r7();
        zzi = r7Var;
        k1.o(r7.class, r7Var);
    }

    public static r7 A() {
        return zzi;
    }

    public final int B() {
        int i3;
        switch (this.zze) {
            case 0:
                i3 = 1;
                break;
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                i3 = 4;
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                i3 = 5;
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                i3 = 6;
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                i3 = 7;
                break;
            default:
                i3 = 0;
                break;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", l0.f2477d, "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new r7();
        }
        if (i10 == 4) {
            return new n7(zzi);
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
        synchronized (r7.class) {
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

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final t1 y() {
        return this.zzh;
    }

    public final int z() {
        return this.zzh.size();
    }
}
