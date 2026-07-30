package a8;

import java.util.Iterator;

/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0434a implements X7.a {
    @Override // X7.a
    public Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return h(decoder);
    }

    public abstract Object d();

    public abstract int e(Object obj);

    public abstract Iterator f(Object obj);

    public abstract int g(Object obj);

    public final Object h(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        Object d2 = d();
        int e6 = e(d2);
        Z7.a s3 = decoder.s(c());
        while (true) {
            int o9 = s3.o(c());
            if (o9 == -1) {
                s3.p(c());
                return k(d2);
            }
            i(s3, o9 + e6, d2);
        }
    }

    public abstract void i(Z7.a aVar, int i, Object obj);

    public abstract Object j(Object obj);

    public abstract Object k(Object obj);
}
