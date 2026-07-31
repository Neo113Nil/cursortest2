package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class Z implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f731a = new Z();

    /* renamed from: b, reason: collision with root package name */
    public static final T f732b = new T("kotlin.Short", A2.d.f237j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.s());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f732b;
    }
}
