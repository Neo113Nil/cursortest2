package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class B implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final B f8602a = new B();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8603b = new T("kotlin.Int", u2.d.f8533g);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.l());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8603b;
    }
}
