package C2;

import kotlin.jvm.internal.C3239e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* renamed from: C2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0317k extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0317k f302c = new C0317k();

    private C0317k() {
        super(AbstractC3551a.A(C3239e.f41148a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] r() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, C0315j builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.k(getDescriptor(), i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C0315j k(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new C0315j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(B2.d encoder, byte[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.s(getDescriptor(), i5, content[i5]);
        }
    }
}
