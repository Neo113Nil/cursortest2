package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wi3 extends in3 {
    private static final wi3 zzd;
    private rn3 zzb = vo3.q;

    static {
        wi3 wi3Var = new wi3();
        zzd = wi3Var;
        in3.m(wi3.class, wi3Var);
    }

    public static ri3 q() {
        return (ri3) zzd.h();
    }

    public static wi3 r() {
        return zzd;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", vi3.class});
        }
        if (i2 == 3) {
            return new wi3();
        }
        if (i2 == 4) {
            return new ri3(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        rn3 rn3Var = this.zzb;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzb = rn3Var.h(size + size);
        }
        zl3.c(arrayList, this.zzb);
    }
}
