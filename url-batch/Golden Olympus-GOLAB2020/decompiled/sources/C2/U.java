package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class U extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final U f253c = new U();

    private U() {
        super(AbstractC3551a.E(kotlin.jvm.internal.r.f41161a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, T builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.s(getDescriptor(), i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public T k(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new T(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(B2.d encoder, int[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.f(getDescriptor(), i5, content[i5]);
        }
    }
}
