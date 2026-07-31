package N;

import S1.AbstractC0222a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends AbstractC0222a {

    /* renamed from: d, reason: collision with root package name */
    public final c f3520d;

    public l(c cVar) {
        this.f3520d = cVar;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        c cVar = this.f3520d;
        cVar.getClass();
        return cVar.f3504e;
    }

    @Override // S1.AbstractC0222a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f3520d.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c cVar = this.f3520d;
        n[] nVarArr = new n[8];
        for (int i3 = 0; i3 < 8; i3++) {
            nVarArr[i3] = new o(2);
        }
        return new k(cVar.f3503d, nVarArr);
    }
}
