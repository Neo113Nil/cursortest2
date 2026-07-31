package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class m0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f769a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0060x f770b = M.a("kotlin.UShort", Z.f731a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new R1.w(decoder.b(f770b).s());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f770b;
    }
}
