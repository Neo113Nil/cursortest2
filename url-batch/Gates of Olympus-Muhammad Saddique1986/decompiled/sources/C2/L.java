package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class L implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final Object f704a = R1.a.c(R1.g.f4147d, new A2.f(1, this));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        B2.a a3 = decoder.a(descriptor);
        int r3 = a3.r(getDescriptor());
        if (r3 != -1) {
            throw new z2.c(A.k.h("Unexpected index ", r3));
        }
        a3.z(descriptor);
        return R1.y.f4171a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R1.f, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f704a.getValue();
    }
}
