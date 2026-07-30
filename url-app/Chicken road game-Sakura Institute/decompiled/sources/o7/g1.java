package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g1 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final g1 f6883a = new g1();

    /* renamed from: b, reason: collision with root package name */
    public static final x f6884b = n0.a("kotlin.UInt", b0.f6858a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new d6.s(decoder.o(f6884b).s());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f6884b;
    }
}
