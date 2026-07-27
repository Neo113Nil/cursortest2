package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0680a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public final Object c(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object a4 = a();
        int b4 = b(a4);
        h3.a a5 = decoder.a(getDescriptor());
        while (true) {
            int s4 = a5.s(getDescriptor());
            if (s4 == -1) {
                a5.A(getDescriptor());
                return f(a4);
            }
            d(a5, s4 + b4, a4, true);
        }
    }

    public abstract void d(h3.a aVar, int i2, Object obj, boolean z4);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return c(decoder);
    }

    public abstract Object e(Object obj);

    public abstract Object f(Object obj);
}
