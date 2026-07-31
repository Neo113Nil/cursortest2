package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* renamed from: C2.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0308f0 extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0308f0 f281c = new C0308f0();

    private C0308f0() {
        super(AbstractC3551a.F(kotlin.jvm.internal.t.f41162a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] r() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, C0306e0 builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.C(getDescriptor(), i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C0306e0 k(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new C0306e0(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(B2.d encoder, long[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.F(getDescriptor(), i5, content[i5]);
        }
    }
}
