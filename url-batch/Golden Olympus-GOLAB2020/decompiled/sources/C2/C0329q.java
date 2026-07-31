package C2;

import kotlin.jvm.internal.C3241g;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* renamed from: C2.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0329q extends C0 implements InterfaceC3527b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0329q f319c = new C0329q();

    private C0329q() {
        super(AbstractC3551a.B(C3241g.f41150a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w, C2.AbstractC0297a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(B2.c decoder, int i4, C0327p builder, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.G(getDescriptor(), i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C0327p k(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new C0327p(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.C0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(B2.d encoder, char[] content, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            encoder.C(getDescriptor(), i5, content[i5]);
        }
    }
}
