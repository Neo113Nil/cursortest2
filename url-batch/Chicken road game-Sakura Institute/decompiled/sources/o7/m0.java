package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6908a = d6.a.c(d6.h.f2615f, new l0(this));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        n7.a a3 = decoder.a(descriptor);
        int m8 = a3.m(getDescriptor());
        if (m8 != -1) {
            throw new l7.c(a0.m.i("Unexpected index ", m8));
        }
        a3.n(descriptor);
        return d6.z.f2639a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.g, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f6908a.getValue();
    }
}
