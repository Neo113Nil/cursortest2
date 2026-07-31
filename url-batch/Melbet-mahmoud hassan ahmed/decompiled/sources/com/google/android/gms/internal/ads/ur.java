package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ur extends aq3<ur, or> implements lr3 {
    private static final ur zzb;
    private jq3<nr> zze = aq3.r();

    static {
        ur urVar = new ur();
        zzb = urVar;
        aq3.v(ur.class, urVar);
    }

    private ur() {
    }

    public static or F() {
        return zzb.x();
    }

    static /* synthetic */ void H(ur urVar, nr nrVar) {
        nrVar.getClass();
        jq3<nr> jq3Var = urVar.zze;
        if (!jq3Var.c()) {
            urVar.zze = aq3.s(jq3Var);
        }
        urVar.zze.add(nrVar);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", nr.class});
        }
        if (i8 == 3) {
            return new ur();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new or(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
