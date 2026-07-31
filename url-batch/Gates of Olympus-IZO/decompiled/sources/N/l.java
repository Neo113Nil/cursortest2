package N;

import M1.AbstractC0140a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends AbstractC0140a {

    /* renamed from: d, reason: collision with root package name */
    public final c f2838d;

    public l(c cVar) {
        this.f2838d = cVar;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        c cVar = this.f2838d;
        cVar.getClass();
        return cVar.f2822e;
    }

    @Override // M1.AbstractC0140a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f2838d.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c cVar = this.f2838d;
        n[] nVarArr = new n[8];
        for (int i3 = 0; i3 < 8; i3++) {
            nVarArr[i3] = new o(2);
        }
        return new k(cVar.f2821d, nVarArr);
    }
}
