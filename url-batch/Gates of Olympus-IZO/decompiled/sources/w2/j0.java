package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class j0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f8672a = new j0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1044x f8673b = M.a("kotlin.ULong", H.f8611a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new L1.u(decoder.c(f8673b).d());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8673b;
    }
}
