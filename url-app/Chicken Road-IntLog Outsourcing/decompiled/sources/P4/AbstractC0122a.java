package P4;

import java.util.Iterator;

/* renamed from: P4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0122a implements M4.a {
    @Override // M4.a
    public Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return h(decoder);
    }

    public abstract Object d();

    public abstract int e(Object obj);

    public abstract Iterator f(Object obj);

    public abstract int g(Object obj);

    public final Object h(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        Object d6 = d();
        int e3 = e(d6);
        O4.a o2 = decoder.o(c());
        while (true) {
            int g6 = o2.g(c());
            if (g6 == -1) {
                o2.l(c());
                return k(d6);
            }
            i(o2, g6 + e3, d6, true);
        }
    }

    public abstract void i(O4.a aVar, int i2, Object obj, boolean z);

    public abstract Object j(Object obj);

    public abstract Object k(Object obj);
}
