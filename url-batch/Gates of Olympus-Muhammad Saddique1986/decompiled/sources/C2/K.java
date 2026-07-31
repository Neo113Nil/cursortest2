package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class K implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final V f703a;

    public K() {
        a0 a0Var = a0.f733a;
        this.f703a = new V(a0.f734b);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.j()) {
            return decoder.f(a0.f733a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        Object obj2 = a0.f733a;
        return obj2.equals(obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f703a;
    }

    public final int hashCode() {
        return a0.f733a.hashCode();
    }
}
