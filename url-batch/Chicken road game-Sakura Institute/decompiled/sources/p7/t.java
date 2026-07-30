package p7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final t f7236a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final m7.f f7237b = a8.d.o("kotlinx.serialization.json.JsonNull", m7.g.f6462h, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        t6.a.p(decoder);
        if (decoder.j()) {
            throw new q7.c("Expected 'null' literal");
        }
        return s.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7237b;
    }
}
