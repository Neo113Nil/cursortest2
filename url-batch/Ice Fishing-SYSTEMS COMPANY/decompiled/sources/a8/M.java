package a8;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class M extends AbstractC0446m {

    /* renamed from: b, reason: collision with root package name */
    public final L f4442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(X7.a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.h.e(primitiveSerializer, "primitiveSerializer");
        this.f4442b = new L(primitiveSerializer.c());
    }

    @Override // a8.AbstractC0446m, X7.a
    public final void a(c8.r rVar, Object obj) {
        int g9 = g(obj);
        L descriptor = this.f4442b;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        c8.r a9 = rVar.a(descriptor);
        n(a9, obj, g9);
        a9.p(descriptor);
    }

    @Override // a8.AbstractC0434a, X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return h(decoder);
    }

    @Override // X7.a
    public final Y7.e c() {
        return this.f4442b;
    }

    @Override // a8.AbstractC0434a
    public final Object d() {
        return (K) j(m());
    }

    @Override // a8.AbstractC0434a
    public final int e(Object obj) {
        K k6 = (K) obj;
        kotlin.jvm.internal.h.e(k6, "<this>");
        return k6.d();
    }

    @Override // a8.AbstractC0434a
    public final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // a8.AbstractC0434a
    public final Object k(Object obj) {
        K k6 = (K) obj;
        kotlin.jvm.internal.h.e(k6, "<this>");
        return k6.a();
    }

    @Override // a8.AbstractC0446m
    public final void l(int i, Object obj, Object obj2) {
        kotlin.jvm.internal.h.e((K) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object m();

    public abstract void n(c8.r rVar, Object obj, int i);
}
