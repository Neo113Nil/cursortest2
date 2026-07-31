package C2;

import kotlin.jvm.internal.C3245k;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class B extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final B f183c = new B();

    private B() {
        super(AbstractC3551a.C(C3245k.f41159a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, A builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.D(getDescriptor(), i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public A k(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new A(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(B2.d encoder, double[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.B(getDescriptor(), i5, content[i5]);
        }
    }
}
