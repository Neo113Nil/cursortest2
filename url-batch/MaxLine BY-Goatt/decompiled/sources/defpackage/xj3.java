package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xj3 extends in3 {
    private static final xj3 zzg;
    private qn3 zzb;
    private qn3 zzd;
    private rn3 zze;
    private rn3 zzf;

    static {
        xj3 xj3Var = new xj3();
        zzg = xj3Var;
        in3.m(xj3.class, xj3Var);
    }

    public xj3() {
        co3 co3Var = co3.q;
        this.zzb = co3Var;
        this.zzd = co3Var;
        vo3 vo3Var = vo3.q;
        this.zze = vo3Var;
        this.zzf = vo3Var;
    }

    public static wj3 x() {
        return (wj3) zzg.h();
    }

    public static xj3 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = co3.q;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((bm3) randomAccess).m) {
            co3 co3Var = (co3) randomAccess;
            int i = co3Var.o;
            this.zzd = co3Var.h(i + i);
        }
        zl3.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = co3.q;
    }

    public final void D(ArrayList arrayList) {
        rn3 rn3Var = this.zze;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zze = rn3Var.h(size + size);
        }
        zl3.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = vo3.q;
    }

    public final void F(Iterable iterable) {
        rn3 rn3Var = this.zzf;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzf = rn3Var.h(size + size);
        }
        zl3.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = vo3.q;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", aj3.class, "zzf", ak3.class});
        }
        if (i2 == 3) {
            return new xj3();
        }
        if (i2 == 4) {
            return new wj3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((co3) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((co3) this.zzd).size();
    }

    public final rn3 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((bm3) randomAccess).m) {
            co3 co3Var = (co3) randomAccess;
            int i = co3Var.o;
            this.zzb = co3Var.h(i + i);
        }
        zl3.c(iterable, this.zzb);
    }
}
