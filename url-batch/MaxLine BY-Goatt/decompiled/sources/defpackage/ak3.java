package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ak3 extends in3 {
    private static final ak3 zzf;
    private int zzb;
    private int zzd;
    private qn3 zze = co3.q;

    static {
        ak3 ak3Var = new ak3();
        zzf = ak3Var;
        in3.m(ak3.class, ak3Var);
    }

    public static zj3 u() {
        return (zj3) zzf.h();
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new ak3();
        }
        if (i2 == 4) {
            return new zj3(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return ((co3) this.zze).size();
    }

    public final long t(int i) {
        return ((co3) this.zze).b(i);
    }

    public final /* synthetic */ void v(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((bm3) randomAccess).m) {
            co3 co3Var = (co3) randomAccess;
            int i = co3Var.o;
            this.zze = co3Var.h(i + i);
        }
        zl3.c(list, this.zze);
    }
}
