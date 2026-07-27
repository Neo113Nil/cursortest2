package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class K implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final V f7023a;

    public K() {
        a0 serializer = a0.f7055a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f7023a = new V(a0.f7056b);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder.m()) {
            return decoder.h(a0.f7055a);
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
        Object obj2 = a0.f7055a;
        return obj2.equals(obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f7023a;
    }

    public final int hashCode() {
        return a0.f7055a.hashCode();
    }
}
