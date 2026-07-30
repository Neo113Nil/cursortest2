package p7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f7212a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final m7.f f7213b = a8.d.o("kotlinx.serialization.json.JsonPrimitive", m7.d.f6449o, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        k p02 = t6.a.p(decoder).p0();
        if (p02 instanceof z) {
            return (z) p02;
        }
        throw q7.f.a(-1, "Unexpected JSON element, expected JsonPrimitive, had " + r6.w.a(p02.getClass()), p02.toString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7213b;
    }
}
