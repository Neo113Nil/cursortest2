package T5;

import java.util.Iterator;

/* renamed from: T5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0185a implements Q5.a {
    @Override // Q5.a
    public Object b(S5.b bVar) {
        return h(bVar);
    }

    public abstract Object d();

    public abstract int e(Object obj);

    public abstract Iterator f(Object obj);

    public abstract int g(Object obj);

    public final Object h(S5.b bVar) {
        Object d7 = d();
        int e4 = e(d7);
        S5.a w5 = bVar.w(c());
        while (true) {
            int j4 = w5.j(c());
            if (j4 == -1) {
                w5.i(c());
                return k(d7);
            }
            i(w5, j4 + e4, d7);
        }
    }

    public abstract void i(S5.a aVar, int i7, Object obj);

    public abstract Object j(Object obj);

    public abstract Object k(Object obj);
}
