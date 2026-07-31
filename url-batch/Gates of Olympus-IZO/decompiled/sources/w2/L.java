package w2;

import H2.AbstractC0080b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class L implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8617a = I2.d.E(L1.h.f2705d, new D1.g(6, this));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        v2.a a3 = decoder.a(descriptor);
        int s3 = a3.s(getDescriptor());
        if (s3 != -1) {
            throw new t2.c(AbstractC0080b.h("Unexpected index ", s3));
        }
        a3.z(descriptor);
        return L1.z.f2729a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L1.g, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f8617a.getValue();
    }
}
