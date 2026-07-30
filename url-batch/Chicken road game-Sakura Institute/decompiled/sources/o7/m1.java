package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m1 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f6909a = new m1();

    /* renamed from: b, reason: collision with root package name */
    public static final x f6910b = n0.a("kotlin.UShort", z0.f6963a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new d6.x(decoder.o(f6910b).x());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f6910b;
    }
}
