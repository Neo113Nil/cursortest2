package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class e8 extends aq3<e8, d8> implements lr3 {
    private static final e8 zzb;
    private int zze;
    private int zzf = 2;

    static {
        e8 e8Var = new e8();
        zzb = e8Var;
        aq3.v(e8.class, e8Var);
    }

    private e8() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", f8.f5027a});
        }
        if (i8 == 3) {
            return new e8();
        }
        a8 a8Var = null;
        if (i8 == 4) {
            return new d8(a8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
