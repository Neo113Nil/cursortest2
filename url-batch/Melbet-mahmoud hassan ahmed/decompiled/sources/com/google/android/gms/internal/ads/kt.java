package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class kt extends aq3<kt, jt> implements lr3 {
    private static final gq3<Integer, xr> zzb = new it();
    private static final kt zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private fq3 zzk = aq3.o();
    private ft zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;

    static {
        kt ktVar = new kt();
        zze = ktVar;
        aq3.v(kt.class, ktVar);
    }

    private kt() {
    }

    static /* synthetic */ void F(kt ktVar, int i7) {
        ktVar.zzo = i7 - 1;
        ktVar.zzf |= 128;
    }

    static /* synthetic */ void G(kt ktVar, int i7) {
        ktVar.zzq = i7 - 1;
        ktVar.zzf |= 512;
    }

    public static jt M() {
        return zze.x();
    }

    public static kt O(byte[] bArr) {
        return (kt) aq3.B(zze, bArr);
    }

    static /* synthetic */ void R(kt ktVar, long j7) {
        ktVar.zzf |= 1;
        ktVar.zzg = j7;
    }

    static /* synthetic */ void S(kt ktVar, long j7) {
        ktVar.zzf |= 4;
        ktVar.zzi = j7;
    }

    static /* synthetic */ void T(kt ktVar, long j7) {
        ktVar.zzf |= 8;
        ktVar.zzj = j7;
    }

    static /* synthetic */ void U(kt ktVar, Iterable iterable) {
        fq3 fq3Var = ktVar.zzk;
        if (!fq3Var.c()) {
            ktVar.zzk = aq3.p(fq3Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ktVar.zzk.O(((xr) it.next()).zza());
        }
    }

    static /* synthetic */ void V(kt ktVar, ft ftVar) {
        ftVar.getClass();
        ktVar.zzl = ftVar;
        ktVar.zzf |= 16;
    }

    static /* synthetic */ void W(kt ktVar, int i7) {
        ktVar.zzf |= 256;
        ktVar.zzp = i7;
    }

    static /* synthetic */ void X(kt ktVar, ot otVar) {
        ktVar.zzr = otVar.zza();
        ktVar.zzf |= 1024;
    }

    static /* synthetic */ void d0(kt ktVar, int i7) {
        ktVar.zzh = i7 - 1;
        ktVar.zzf |= 2;
    }

    static /* synthetic */ void e0(kt ktVar, int i7) {
        ktVar.zzm = i7 - 1;
        ktVar.zzf |= 32;
    }

    static /* synthetic */ void f0(kt ktVar, int i7) {
        ktVar.zzn = i7 - 1;
        ktVar.zzf |= 64;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            eq3 eq3Var = ns.f9273a;
            return aq3.u(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzf", "zzg", "zzh", eq3Var, "zzi", "zzj", "zzk", xr.d(), "zzl", "zzm", eq3Var, "zzn", eq3Var, "zzo", eq3Var, "zzp", "zzq", eq3Var, "zzr", ot.d()});
        }
        if (i8 == 3) {
            return new kt();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new jt(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zze;
    }

    public final int H() {
        return this.zzp;
    }

    public final long I() {
        return this.zzj;
    }

    public final long J() {
        return this.zzi;
    }

    public final long K() {
        return this.zzg;
    }

    public final ft L() {
        ft ftVar = this.zzl;
        return ftVar == null ? ft.H() : ftVar;
    }

    public final ot P() {
        ot b7 = ot.b(this.zzr);
        return b7 == null ? ot.UNSPECIFIED : b7;
    }

    public final List<xr> Q() {
        return new hq3(this.zzk, zzb);
    }

    public final int Y() {
        int a7 = os.a(this.zzn);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }

    public final int Z() {
        int a7 = os.a(this.zzo);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }

    public final int a0() {
        int a7 = os.a(this.zzq);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }

    public final int b0() {
        int a7 = os.a(this.zzh);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }

    public final int c0() {
        int a7 = os.a(this.zzm);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }
}
