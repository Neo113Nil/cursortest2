package te;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a implements pe.a {
    @Override // pe.a
    public Object b(y6.l lVar) {
        return i(lVar);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(y6.l lVar) {
        Object e2 = e();
        int f3 = f(e2);
        d().getClass();
        while (true) {
            int a9 = lVar.a(d());
            if (a9 == -1) {
                d().getClass();
                return l(e2);
            }
            j(lVar, a9 + f3, e2);
        }
    }

    public abstract void j(y6.l lVar, int i3, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
