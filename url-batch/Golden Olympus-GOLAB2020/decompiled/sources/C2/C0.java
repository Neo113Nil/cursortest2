package C2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public abstract class C0 extends AbstractC0340w {

    /* renamed from: b, reason: collision with root package name */
    private final A2.f f187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(InterfaceC3527b primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f187b = new B0(primitiveSerializer.getDescriptor());
    }

    @Override // C2.AbstractC0297a
    protected final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // C2.AbstractC0297a, y2.InterfaceC3526a
    public final Object deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // C2.AbstractC0340w, y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public final A2.f getDescriptor() {
        return this.f187b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final A0 a() {
        return (A0) k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(A0 a02) {
        Intrinsics.checkNotNullParameter(a02, "<this>");
        return a02.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(A0 a02, int i4) {
        Intrinsics.checkNotNullParameter(a02, "<this>");
        a02.b(i4);
    }

    protected abstract Object r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(A0 a02, int i4, Object obj) {
        Intrinsics.checkNotNullParameter(a02, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // C2.AbstractC0340w, y2.InterfaceC3535j
    public final void serialize(B2.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int e4 = e(obj);
        A2.f fVar = this.f187b;
        B2.d D4 = encoder.D(fVar, e4);
        u(D4, obj, e4);
        D4.c(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object l(A0 a02) {
        Intrinsics.checkNotNullParameter(a02, "<this>");
        return a02.a();
    }

    protected abstract void u(B2.d dVar, Object obj, int i4);
}
