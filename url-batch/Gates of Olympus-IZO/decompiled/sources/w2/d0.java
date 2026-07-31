package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class d0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f8654a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1044x f8655b = M.a("kotlin.UByte", C1030i.f8669a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new L1.p(decoder.c(f8655b).q());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8655b;
    }
}
