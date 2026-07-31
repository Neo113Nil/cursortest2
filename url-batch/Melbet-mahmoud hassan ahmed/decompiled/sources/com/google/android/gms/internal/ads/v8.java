package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v8 extends aq3<v8, u8> implements lr3 {
    private static final v8 zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        v8 v8Var = new v8();
        zzb = v8Var;
        aq3.v(v8.class, v8Var);
    }

    private v8() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", g9.f5492a});
        }
        if (i8 == 3) {
            return new v8();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new u8(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
