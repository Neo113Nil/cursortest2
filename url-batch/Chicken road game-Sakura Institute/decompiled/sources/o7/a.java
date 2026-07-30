package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public final Object c(Decoder decoder) {
        Object a3 = a();
        int b9 = b(a3);
        n7.a a9 = decoder.a(getDescriptor());
        while (true) {
            int m8 = a9.m(getDescriptor());
            if (m8 == -1) {
                a9.n(getDescriptor());
                return f(a3);
            }
            d(a9, m8 + b9, a3);
        }
    }

    public abstract void d(n7.a aVar, int i7, Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return c(decoder);
    }

    public abstract Object e(Object obj);

    public abstract Object f(Object obj);
}
