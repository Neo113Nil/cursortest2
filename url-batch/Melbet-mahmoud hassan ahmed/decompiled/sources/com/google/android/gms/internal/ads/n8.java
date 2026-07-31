package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n8 extends aq3<n8, m8> implements lr3 {
    private static final n8 zzb;
    private int zze;
    private int zzf;

    static {
        n8 n8Var = new n8();
        zzb = n8Var;
        aq3.v(n8.class, n8Var);
    }

    private n8() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", r8.f11049a});
        }
        if (i8 == 3) {
            return new n8();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new m8(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
