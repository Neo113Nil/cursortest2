package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class m0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f8682a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1044x f8683b = M.a("kotlin.UShort", Z.f8644a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new L1.x(decoder.c(f8683b).t());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8683b;
    }
}
