package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class H implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final H f8611a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final T f8612b = new T("kotlin.Long", u2.d.f8534h);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Long.valueOf(decoder.d());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8612b;
    }
}
