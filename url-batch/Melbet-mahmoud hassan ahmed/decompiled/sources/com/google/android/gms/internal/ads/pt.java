package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pt extends aq3<pt, lt> implements lr3 {
    private static final pt zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private long zzl;
    private jq3<kt> zzf = aq3.r();
    private String zzj = "";
    private String zzk = "";

    static {
        pt ptVar = new pt();
        zzb = ptVar;
        aq3.v(pt.class, ptVar);
    }

    private pt() {
    }

    public static lt F() {
        return zzb.x();
    }

    static /* synthetic */ void H(pt ptVar, Iterable iterable) {
        jq3<kt> jq3Var = ptVar.zzf;
        if (!jq3Var.c()) {
            ptVar.zzf = aq3.s(jq3Var);
        }
        bo3.k(iterable, ptVar.zzf);
    }

    static /* synthetic */ void I(pt ptVar, int i7) {
        ptVar.zze |= 1;
        ptVar.zzg = i7;
    }

    static /* synthetic */ void J(pt ptVar, int i7) {
        ptVar.zze |= 2;
        ptVar.zzh = i7;
    }

    static /* synthetic */ void K(pt ptVar, long j7) {
        ptVar.zze |= 4;
        ptVar.zzi = j7;
    }

    static /* synthetic */ void L(pt ptVar, String str) {
        str.getClass();
        ptVar.zze |= 8;
        ptVar.zzj = str;
    }

    static /* synthetic */ void M(pt ptVar, String str) {
        str.getClass();
        ptVar.zze |= 16;
        ptVar.zzk = str;
    }

    static /* synthetic */ void N(pt ptVar, long j7) {
        ptVar.zze |= 32;
        ptVar.zzl = j7;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zze", "zzf", kt.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i8 == 3) {
            return new pt();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new lt(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
