package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class R0 extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final R0 f245c = new R0();

    private R0() {
        super(AbstractC3551a.u(W1.r.f9622c));
    }

    @Override // C2.AbstractC0297a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((W1.s) obj).t());
    }

    @Override // C2.AbstractC0297a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((W1.s) obj).t());
    }

    @Override // C2.C0
    public /* bridge */ /* synthetic */ Object r() {
        return W1.s.b(w());
    }

    @Override // C2.C0
    public /* bridge */ /* synthetic */ void u(B2.d dVar, Object obj, int i4) {
        z(dVar, ((W1.s) obj).t(), i4);
    }

    protected int v(byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return W1.s.n(collectionSize);
    }

    protected byte[] w() {
        return W1.s.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, Q0 builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(W1.r.b(decoder.l(getDescriptor(), i4).A()));
    }

    protected Q0 y(byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new Q0(toBuilder, null);
    }

    protected void z(B2.d encoder, byte[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.z(getDescriptor(), i5).i(W1.s.l(content, i5));
        }
    }
}
