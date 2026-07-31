package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class U0 extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final U0 f254c = new U0();

    private U0() {
        super(AbstractC3551a.v(W1.t.f9627c));
    }

    @Override // C2.AbstractC0297a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((W1.u) obj).t());
    }

    @Override // C2.AbstractC0297a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((W1.u) obj).t());
    }

    @Override // C2.C0
    public /* bridge */ /* synthetic */ Object r() {
        return W1.u.b(w());
    }

    @Override // C2.C0
    public /* bridge */ /* synthetic */ void u(B2.d dVar, Object obj, int i4) {
        z(dVar, ((W1.u) obj).t(), i4);
    }

    protected int v(int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return W1.u.n(collectionSize);
    }

    protected int[] w() {
        return W1.u.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, T0 builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(W1.t.b(decoder.l(getDescriptor(), i4).j()));
    }

    protected T0 y(int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new T0(toBuilder, null);
    }

    protected void z(B2.d encoder, int[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.z(getDescriptor(), i5).w(W1.u.l(content, i5));
        }
    }
}
