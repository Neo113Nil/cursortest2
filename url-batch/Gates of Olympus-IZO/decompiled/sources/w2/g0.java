package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class g0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f8664a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1044x f8665b = M.a("kotlin.UInt", B.f8602a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new L1.s(decoder.c(f8665b).l());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8665b;
    }
}
