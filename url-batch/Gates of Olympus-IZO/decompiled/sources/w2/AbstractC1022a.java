package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1022a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public final Object c(Decoder decoder) {
        Object a3 = a();
        int b2 = b(a3);
        v2.a a4 = decoder.a(getDescriptor());
        while (true) {
            int s3 = a4.s(getDescriptor());
            if (s3 == -1) {
                a4.z(getDescriptor());
                return f(a3);
            }
            d(a4, s3 + b2, a3, true);
        }
    }

    public abstract void d(v2.a aVar, int i3, Object obj, boolean z3);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return c(decoder);
    }

    public abstract Object e(Object obj);

    public abstract Object f(Object obj);
}
