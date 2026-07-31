package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qs extends aq3<qs, ps> implements lr3 {
    private static final qs zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private bu zzj;
    private is zzl;
    private ls zzm;
    private ft zzn;
    private lr zzo;
    private pt zzp;
    private xu zzq;
    private ur zzr;
    private String zzg = "";
    private int zzi = 1000;
    private iq3 zzk = aq3.q();

    static {
        qs qsVar = new qs();
        zzb = qsVar;
        aq3.v(qs.class, qsVar);
    }

    private qs() {
    }

    public static ps H() {
        return zzb.x();
    }

    static /* synthetic */ void K(qs qsVar, String str) {
        str.getClass();
        qsVar.zze |= 2;
        qsVar.zzg = str;
    }

    static /* synthetic */ void L(qs qsVar, Iterable iterable) {
        iq3 iq3Var = qsVar.zzk;
        if (!iq3Var.c()) {
            int size = iq3Var.size();
            qsVar.zzk = iq3Var.e(size == 0 ? 10 : size + size);
        }
        bo3.k(iterable, qsVar.zzk);
    }

    static /* synthetic */ void N(qs qsVar, is isVar) {
        isVar.getClass();
        qsVar.zzl = isVar;
        qsVar.zze |= 32;
    }

    static /* synthetic */ void O(qs qsVar, lr lrVar) {
        lrVar.getClass();
        qsVar.zzo = lrVar;
        qsVar.zze |= 256;
    }

    static /* synthetic */ void P(qs qsVar, pt ptVar) {
        ptVar.getClass();
        qsVar.zzp = ptVar;
        qsVar.zze |= 512;
    }

    static /* synthetic */ void Q(qs qsVar, xu xuVar) {
        xuVar.getClass();
        qsVar.zzq = xuVar;
        qsVar.zze |= 1024;
    }

    static /* synthetic */ void R(qs qsVar, ur urVar) {
        urVar.getClass();
        qsVar.zzr = urVar;
        qsVar.zze |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", ns.f9273a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i8 == 3) {
            return new qs();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new ps(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final lr F() {
        lr lrVar = this.zzo;
        return lrVar == null ? lr.G() : lrVar;
    }

    public final is G() {
        is isVar = this.zzl;
        return isVar == null ? is.G() : isVar;
    }

    public final String J() {
        return this.zzg;
    }
}
