package p7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final m f7230a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final m7.f f7231b;

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        c7.r rVar = new c7.r(6);
        r6.k.f("kotlinx.serialization.json.JsonElement", "serialName");
        if (z6.h.G("kotlinx.serialization.json.JsonElement")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        m7.h hVar = m7.h.f6463g;
        m7.c cVar = m7.c.f6440g;
        if (cVar.equals(hVar)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        m7.a aVar = new m7.a("kotlinx.serialization.json.JsonElement");
        rVar.f(aVar);
        f7231b = new m7.f("kotlinx.serialization.json.JsonElement", cVar, aVar.f6435b.size(), e6.k.i0(serialDescriptorArr), aVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return t6.a.p(decoder).p0();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7231b;
    }
}
