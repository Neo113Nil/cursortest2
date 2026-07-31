package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t8 extends aq3<t8, s8> implements lr3 {
    private static final t8 zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        t8 t8Var = new t8();
        zzb = t8Var;
        aq3.v(t8.class, t8Var);
    }

    private t8() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", p8.f10117a, "zzg"});
        }
        if (i8 == 3) {
            return new t8();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new s8(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
