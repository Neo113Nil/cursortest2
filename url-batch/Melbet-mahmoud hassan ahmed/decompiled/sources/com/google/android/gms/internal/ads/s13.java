package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class s13 extends aq3<s13, r13> implements lr3 {
    private static final gq3<Integer, Object> zzb = new p13();
    private static final s13 zze;
    private int zzf;
    private fq3 zzg = aq3.o();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        s13 s13Var = new s13();
        zze = s13Var;
        aq3.v(s13.class, s13Var);
    }

    private s13() {
    }

    public static r13 F() {
        return zze.x();
    }

    static /* synthetic */ void H(s13 s13Var, String str) {
        str.getClass();
        s13Var.zzf |= 1;
        s13Var.zzh = str;
    }

    static /* synthetic */ void I(s13 s13Var, int i7) {
        fq3 fq3Var = s13Var.zzg;
        if (!fq3Var.c()) {
            s13Var.zzg = aq3.p(fq3Var);
        }
        s13Var.zzg.O(2);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", q13.f10539a, "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new s13();
        }
        p13 p13Var = null;
        if (i8 == 4) {
            return new r13(p13Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zze;
    }
}
