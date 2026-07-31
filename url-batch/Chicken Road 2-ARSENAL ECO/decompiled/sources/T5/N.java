package T5;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class N extends AbstractC0197m {

    /* renamed from: b, reason: collision with root package name */
    public final M f2398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q5.a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.i.e(primitiveSerializer, "primitiveSerializer");
        this.f2398b = new M(primitiveSerializer.c());
    }

    @Override // T5.AbstractC0197m, Q5.a
    public final void a(V5.s sVar, Object obj) {
        int g7 = g(obj);
        M descriptor = this.f2398b;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        V5.s a7 = sVar.a(descriptor);
        n(a7, obj, g7);
        a7.p(descriptor);
    }

    @Override // T5.AbstractC0185a, Q5.a
    public final Object b(S5.b bVar) {
        return h(bVar);
    }

    @Override // Q5.a
    public final R5.e c() {
        return this.f2398b;
    }

    @Override // T5.AbstractC0185a
    public final Object d() {
        return (L) j(m());
    }

    @Override // T5.AbstractC0185a
    public final int e(Object obj) {
        L l7 = (L) obj;
        kotlin.jvm.internal.i.e(l7, "<this>");
        return l7.d();
    }

    @Override // T5.AbstractC0185a
    public final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // T5.AbstractC0185a
    public final Object k(Object obj) {
        L l7 = (L) obj;
        kotlin.jvm.internal.i.e(l7, "<this>");
        return l7.a();
    }

    @Override // T5.AbstractC0197m
    public final void l(Object obj, int i7, Object obj2) {
        kotlin.jvm.internal.i.e((L) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object m();

    public abstract void n(V5.s sVar, Object obj, int i7);
}
