package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class a0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f733a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final T f734b = new T("kotlin.String", A2.d.f238k);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return decoder.t();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f734b;
    }
}
