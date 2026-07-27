package L;

import java.util.Iterator;
import z2.AbstractC1418b;
import z2.AbstractC1423g;
import z2.C1424h;

/* loaded from: classes.dex */
public final class l extends AbstractC1418b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3481d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1423g f3482e;

    public /* synthetic */ l(AbstractC1423g abstractC1423g, int i2) {
        this.f3481d = i2;
        this.f3482e = abstractC1423g;
    }

    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f3481d) {
            case 0:
                return ((c) this.f3482e).containsValue(obj);
            default:
                return this.f3482e.containsValue(obj);
        }
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        switch (this.f3481d) {
            case 0:
                return ((c) this.f3482e).d();
            default:
                return this.f3482e.d();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3481d) {
            case 0:
                m mVar = ((c) this.f3482e).f3460j;
                n[] nVarArr = new n[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    nVarArr[i2] = new o(2);
                }
                return new k(mVar, nVarArr);
            default:
                return new C1424h(((j) this.f3482e.b()).iterator(), 1);
        }
    }
}
