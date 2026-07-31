package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class a1 extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f270c = new a1();

    private a1() {
        super(AbstractC3551a.x(W1.y.f9638c));
    }

    @Override // C2.AbstractC0297a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((W1.z) obj).t());
    }

    @Override // C2.AbstractC0297a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((W1.z) obj).t());
    }

    @Override // C2.C0
    public /* bridge */ /* synthetic */ Object r() {
        return W1.z.b(w());
    }

    @Override // C2.C0
    public /* bridge */ /* synthetic */ void u(B2.d dVar, Object obj, int i4) {
        z(dVar, ((W1.z) obj).t(), i4);
    }

    protected int v(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return W1.z.n(collectionSize);
    }

    protected short[] w() {
        return W1.z.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, Z0 builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(W1.y.b(decoder.l(getDescriptor(), i4).E()));
    }

    protected Z0 y(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new Z0(toBuilder, null);
    }

    protected void z(B2.d encoder, short[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.z(getDescriptor(), i5).h(W1.z.l(content, i5));
        }
    }
}
