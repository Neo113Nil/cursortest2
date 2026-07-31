package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class m9 extends aq3<m9, k9> implements lr3 {
    private static final m9 zzb;
    private int zze;
    private String zzf = "";

    static {
        m9 m9Var = new m9();
        zzb = m9Var;
        aq3.v(m9.class, m9Var);
    }

    private m9() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new m9();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new k9(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
