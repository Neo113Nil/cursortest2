package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f6900a;

    public k0() {
        a1 a1Var = a1.f6856a;
        this.f6900a = new v0(a1.f6857b);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.j()) {
            return decoder.g(a1.f6856a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        Object obj2 = a1.f6856a;
        return obj2.equals(obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f6900a;
    }

    public final int hashCode() {
        return a1.f6856a.hashCode();
    }
}
