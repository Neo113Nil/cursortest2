package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084y extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C1084y f8829c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.o.f6167a, "<this>");
        f8829c = new C1084y(C1085z.f8830a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        C1083x builder = (C1083x) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int h7 = decoder.h(this.f8750b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f8827a;
        int i5 = builder.f8828b;
        builder.f8828b = i5 + 1;
        iArr[i5] = h7;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        int[] bufferWithData = (int[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1083x c1083x = new C1083x();
        c1083x.f8827a = bufferWithData;
        c1083x.f8828b = bufferWithData.length;
        c1083x.b(10);
        return c1083x;
    }

    @Override // z6.N
    public final Object m() {
        return new int[0];
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        int[] content = (int[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            int i7 = content[i5];
            encoder.getClass();
            M descriptor = this.f8750b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i5);
            encoder.j(i7);
        }
    }
}
