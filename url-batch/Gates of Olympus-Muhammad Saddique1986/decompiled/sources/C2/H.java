package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class H implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final H f698a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final T f699b = new T("kotlin.Long", A2.d.f236i);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Long.valueOf(decoder.c());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f699b;
    }
}
