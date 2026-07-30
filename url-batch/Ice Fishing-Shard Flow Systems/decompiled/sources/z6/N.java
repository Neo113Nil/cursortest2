package z6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class N extends AbstractC1073m {

    /* renamed from: b, reason: collision with root package name */
    public final M f8750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(w6.a primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f8750b = new M(primitiveSerializer.c());
    }

    @Override // z6.AbstractC1061a, w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return h(decoder);
    }

    @Override // z6.AbstractC1073m, w6.a
    public final void b(B6.t encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int g7 = g(obj);
        M descriptor = this.f8750b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        B6.t a7 = encoder.a(descriptor);
        n(a7, obj, g7);
        a7.p(descriptor);
    }

    @Override // w6.a
    public final x6.e c() {
        return this.f8750b;
    }

    @Override // z6.AbstractC1061a
    public final Object d() {
        return (L) j(m());
    }

    @Override // z6.AbstractC1061a
    public final int e(Object obj) {
        L l7 = (L) obj;
        Intrinsics.checkNotNullParameter(l7, "<this>");
        return l7.d();
    }

    @Override // z6.AbstractC1061a
    public final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // z6.AbstractC1061a
    public final Object k(Object obj) {
        L l7 = (L) obj;
        Intrinsics.checkNotNullParameter(l7, "<this>");
        return l7.a();
    }

    @Override // z6.AbstractC1073m
    public final void l(Object obj, int i2, Object obj2) {
        Intrinsics.checkNotNullParameter((L) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object m();

    public abstract void n(B6.t tVar, Object obj, int i2);
}
