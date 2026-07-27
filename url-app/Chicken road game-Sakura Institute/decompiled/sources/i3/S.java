package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public abstract class S extends AbstractC0693n {

    /* renamed from: b, reason: collision with root package name */
    public final Q f7043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f7043b = new Q(primitiveSerializer.getDescriptor());
    }

    @Override // i3.AbstractC0680a
    public final Object a() {
        return (P) e(h());
    }

    @Override // i3.AbstractC0680a
    public final int b(Object obj) {
        P p4 = (P) obj;
        Intrinsics.checkNotNullParameter(p4, "<this>");
        return p4.d();
    }

    @Override // i3.AbstractC0680a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return c(decoder);
    }

    @Override // i3.AbstractC0680a
    public final Object f(Object obj) {
        P p4 = (P) obj;
        Intrinsics.checkNotNullParameter(p4, "<this>");
        return p4.a();
    }

    @Override // i3.AbstractC0693n
    public final void g(Object obj, int i2, Object obj2) {
        Intrinsics.checkNotNullParameter((P) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f7043b;
    }

    public abstract Object h();
}
