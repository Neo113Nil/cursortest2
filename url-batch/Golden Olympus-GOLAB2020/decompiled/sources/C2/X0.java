package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class X0 extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final X0 f262c = new X0();

    private X0() {
        super(AbstractC3551a.w(W1.v.f9632c));
    }

    @Override // C2.AbstractC0297a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((W1.w) obj).t());
    }

    @Override // C2.AbstractC0297a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((W1.w) obj).t());
    }

    @Override // C2.C0
    public /* bridge */ /* synthetic */ Object r() {
        return W1.w.b(w());
    }

    @Override // C2.C0
    public /* bridge */ /* synthetic */ void u(B2.d dVar, Object obj, int i4) {
        z(dVar, ((W1.w) obj).t(), i4);
    }

    protected int v(long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return W1.w.n(collectionSize);
    }

    protected long[] w() {
        return W1.w.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, W0 builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(W1.v.b(decoder.l(getDescriptor(), i4).q()));
    }

    protected W0 y(long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new W0(toBuilder, null);
    }

    protected void z(B2.d encoder, long[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.z(getDescriptor(), i5).A(W1.w.l(content, i5));
        }
    }
}
