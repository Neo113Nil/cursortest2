package P4;

import f4.C0437n;

/* loaded from: classes.dex */
public final class V extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final V f2348c = new V(W.f2349a);

    @Override // P4.AbstractC0122a
    public final int g(Object obj) {
        byte[] collectionSize = ((C0437n) obj).f5681a;
        kotlin.jvm.internal.i.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // P4.AbstractC0134m, P4.AbstractC0122a
    public final void i(O4.a aVar, int i2, Object obj, boolean z) {
        U builder = (U) obj;
        kotlin.jvm.internal.i.e(builder, "builder");
        byte s2 = aVar.a(this.f2335b, i2).s();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f2346a;
        int i3 = builder.f2347b;
        builder.f2347b = i3 + 1;
        bArr[i3] = s2;
    }

    @Override // P4.AbstractC0122a
    public final Object j(Object obj) {
        byte[] toBuilder = ((C0437n) obj).f5681a;
        kotlin.jvm.internal.i.e(toBuilder, "$this$toBuilder");
        U u5 = new U();
        u5.f2346a = toBuilder;
        u5.f2347b = toBuilder.length;
        u5.b(10);
        return u5;
    }

    @Override // P4.M
    public final Object m() {
        return new C0437n(new byte[0]);
    }

    @Override // P4.M
    public final void n(R4.s encoder, Object obj, int i2) {
        byte[] bArr = ((C0437n) obj).f5681a;
        kotlin.jvm.internal.i.e(encoder, "encoder");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.i(this.f2335b, i3).c(bArr[i3]);
        }
    }
}
