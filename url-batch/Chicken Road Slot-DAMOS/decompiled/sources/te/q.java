package te;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q extends a {

    /* renamed from: a, reason: collision with root package name */
    public final pe.a f9421a;

    public q(pe.a aVar) {
        this.f9421a = aVar;
    }

    @Override // pe.a
    public void a(e3.o oVar, Object obj) {
        int h10 = h(obj);
        d().getClass();
        Iterator g = g(obj);
        for (int i3 = 0; i3 < h10; i3++) {
            oVar.k(d(), i3, this.f9421a, g.next());
        }
    }

    @Override // te.a
    public void j(y6.l lVar, int i3, Object obj) {
        m(i3, obj, y6.l.d(lVar, d(), i3, this.f9421a));
    }

    public abstract void m(int i3, Object obj, Object obj2);
}
