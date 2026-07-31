package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class a0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f8646a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8647b = new T("kotlin.String", u2.d.f8536j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return decoder.u();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8647b;
    }
}
