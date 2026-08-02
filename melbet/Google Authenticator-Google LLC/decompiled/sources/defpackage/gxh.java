package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxh implements gvj {
    public final koe a;
    private final koe b;
    private final koe c;
    private final eoa d;
    private final koe e;

    public gxh(koe koeVar, koe koeVar2, gzp gzpVar, koe koeVar3, koe koeVar4) {
        this.b = koeVar;
        this.c = koeVar2;
        this.d = (eoa) ((gzs) gzpVar).a;
        this.e = koeVar3;
        this.a = koeVar4;
    }

    @Override // defpackage.gvj
    public final void a(final gvy gvyVar, final SparseArray sparseArray) {
        bnu bnuVar = (bnu) this.b;
        bnuVar.a();
        if (((erc) ((gzs) bnuVar.a()).a).b()) {
            final gzp h = hoq.aD(gvyVar.d, 1.0f) ? gzp.h(Float.valueOf(1.0f)) : gyf.a;
            if (h.f()) {
                new SparseArray();
                int i = hel.d;
                hel helVar = his.a;
                float floatValue = ((Float) h.b()).floatValue();
                boolean booleanValue = ((Boolean) this.a.b()).booleanValue();
                eoc a = this.d.a(sparseArray);
                if (a == null) {
                    a = null;
                }
                final hel a2 = ((eod) this.e.b()).a(sparseArray);
                gxp ak = hoq.ak(gvyVar, sparseArray, floatValue, a, a2, booleanValue);
                hac v = hoq.v(new hac() { // from class: gxg
                    @Override // defpackage.hac
                    public final Object bB() {
                        gxn a3 = gxo.a();
                        a3.f(gvyVar);
                        a3.e(sparseArray);
                        a3.g(((Float) h.b()).floatValue());
                        a3.c(((Boolean) gxh.this.a.b()).booleanValue());
                        a3.b(a2);
                        return hoq.al(a3.a());
                    }
                });
                if (((gxm) v.bB()).b) {
                    return;
                }
                Object b = this.c.b();
                ((erd) b).a(((gxm) v.bB()).a, ak.a.a, ak.d, ak.b);
            }
        }
    }
}
