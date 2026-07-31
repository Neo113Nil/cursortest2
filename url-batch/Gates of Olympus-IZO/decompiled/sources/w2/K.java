package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class K implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final V f8616a;

    public K() {
        a0 a0Var = a0.f8646a;
        this.f8616a = new V(a0.f8647b);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.m()) {
            return decoder.h(a0.f8646a);
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
        Object obj2 = a0.f8646a;
        return obj2.equals(obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f8616a;
    }

    public final int hashCode() {
        return a0.f8646a.hashCode();
    }
}
