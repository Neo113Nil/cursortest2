package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j9 extends aq3<j9, i9> implements lr3 {
    private static final j9 zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private uo3 zzh = uo3.f12885g;

    static {
        j9 j9Var = new j9();
        zzb = j9Var;
        aq3.v(j9.class, j9Var);
    }

    private j9() {
    }

    public static j9 H() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new j9();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new i9(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final long F() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zze & 1) != 0;
    }
}
