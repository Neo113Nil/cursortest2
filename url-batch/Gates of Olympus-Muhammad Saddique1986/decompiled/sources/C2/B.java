package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class B implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final B f689a = new B();

    /* renamed from: b, reason: collision with root package name */
    public static final T f690b = new T("kotlin.Int", A2.d.f235h);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.i());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f690b;
    }
}
