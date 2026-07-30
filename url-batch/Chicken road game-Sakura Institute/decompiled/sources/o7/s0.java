package o7;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class s0 extends n {

    /* renamed from: b, reason: collision with root package name */
    public final r0 f6944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(KSerializer kSerializer) {
        super(kSerializer);
        r6.k.f(kSerializer, "primitiveSerializer");
        this.f6944b = new r0(kSerializer.getDescriptor());
    }

    @Override // o7.a
    public final Object a() {
        return (q0) e(h());
    }

    @Override // o7.a
    public final int b(Object obj) {
        q0 q0Var = (q0) obj;
        r6.k.f(q0Var, "<this>");
        return q0Var.d();
    }

    @Override // o7.a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return c(decoder);
    }

    @Override // o7.a
    public final Object f(Object obj) {
        q0 q0Var = (q0) obj;
        r6.k.f(q0Var, "<this>");
        return q0Var.a();
    }

    @Override // o7.n
    public final void g(Object obj, int i7, Object obj2) {
        r6.k.f((q0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f6944b;
    }

    public abstract Object h();
}
