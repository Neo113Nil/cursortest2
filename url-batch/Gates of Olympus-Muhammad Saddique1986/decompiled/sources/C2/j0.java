package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class j0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f759a = new j0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0060x f760b = M.a("kotlin.ULong", H.f698a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new R1.t(decoder.b(f760b).c());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f760b;
    }
}
