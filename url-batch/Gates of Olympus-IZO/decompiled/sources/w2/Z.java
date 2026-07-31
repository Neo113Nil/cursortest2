package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class Z implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f8644a = new Z();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8645b = new T("kotlin.Short", u2.d.f8535i);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.t());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8645b;
    }
}
