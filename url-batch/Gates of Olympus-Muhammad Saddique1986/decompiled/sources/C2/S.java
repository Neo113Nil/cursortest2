package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public abstract class S extends AbstractC0051n {

    /* renamed from: b, reason: collision with root package name */
    public final Q f721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(KSerializer kSerializer) {
        super(kSerializer);
        f2.j.f(kSerializer, "primitiveSerializer");
        this.f721b = new Q(kSerializer.getDescriptor());
    }

    @Override // C2.AbstractC0038a
    public final Object a() {
        return (P) e(h());
    }

    @Override // C2.AbstractC0038a
    public final int b(Object obj) {
        P p3 = (P) obj;
        f2.j.f(p3, "<this>");
        return p3.d();
    }

    @Override // C2.AbstractC0038a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return c(decoder);
    }

    @Override // C2.AbstractC0038a
    public final Object f(Object obj) {
        P p3 = (P) obj;
        f2.j.f(p3, "<this>");
        return p3.a();
    }

    @Override // C2.AbstractC0051n
    public final void g(Object obj, int i3, Object obj2) {
        f2.j.f((P) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f721b;
    }

    public abstract Object h();
}
