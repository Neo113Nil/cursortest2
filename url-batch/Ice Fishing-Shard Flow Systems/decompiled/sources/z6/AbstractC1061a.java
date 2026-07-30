package z6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1061a implements w6.a {
    @Override // w6.a
    public Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return h(decoder);
    }

    public abstract Object d();

    public abstract int e(Object obj);

    public abstract Iterator f(Object obj);

    public abstract int g(Object obj);

    public final Object h(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object d7 = d();
        int e7 = e(d7);
        y6.a t6 = decoder.t(c());
        while (true) {
            int o7 = t6.o(c());
            if (o7 == -1) {
                t6.b(c());
                return k(d7);
            }
            i(t6, o7 + e7, d7);
        }
    }

    public abstract void i(y6.a aVar, int i2, Object obj);

    public abstract Object j(Object obj);

    public abstract Object k(Object obj);
}
