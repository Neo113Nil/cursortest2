package w2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public abstract class S extends AbstractC1035n {

    /* renamed from: b, reason: collision with root package name */
    public final Q f8634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(KSerializer kSerializer) {
        super(kSerializer);
        Z1.i.f(kSerializer, "primitiveSerializer");
        this.f8634b = new Q(kSerializer.getDescriptor());
    }

    @Override // w2.AbstractC1022a
    public final Object a() {
        return (P) e(h());
    }

    @Override // w2.AbstractC1022a
    public final int b(Object obj) {
        P p = (P) obj;
        Z1.i.f(p, "<this>");
        return p.d();
    }

    @Override // w2.AbstractC1022a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return c(decoder);
    }

    @Override // w2.AbstractC1022a
    public final Object f(Object obj) {
        P p = (P) obj;
        Z1.i.f(p, "<this>");
        return p.a();
    }

    @Override // w2.AbstractC1035n
    public final void g(Object obj, int i3, Object obj2) {
        Z1.i.f((P) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f8634b;
    }

    public abstract Object h();
}
