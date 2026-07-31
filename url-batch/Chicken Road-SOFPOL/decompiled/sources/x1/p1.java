package x1;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final d2.j f8527a;

    /* renamed from: b, reason: collision with root package name */
    public final o.y f8528b;

    public p1(d2.n nVar, o.l lVar) {
        this.f8527a = nVar.f2159d;
        this.f8528b = new o.y(d2.n.j(4, nVar).size());
        List j7 = d2.n.j(4, nVar);
        int size = j7.size();
        for (int i = 0; i < size; i++) {
            d2.n nVar2 = (d2.n) j7.get(i);
            if (lVar.a(nVar2.f2162g)) {
                this.f8528b.a(nVar2.f2162g);
            }
        }
    }
}
