package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075o extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C1075o f8802c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.j.f6164a, "<this>");
        f8802c = new C1075o(C1076p.f8803a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        C1074n builder = (C1074n) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        double j = decoder.j(this.f8750b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        double[] dArr = builder.f8800a;
        int i5 = builder.f8801b;
        builder.f8801b = i5 + 1;
        dArr[i5] = j;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        double[] bufferWithData = (double[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1074n c1074n = new C1074n();
        c1074n.f8800a = bufferWithData;
        c1074n.f8801b = bufferWithData.length;
        c1074n.b(10);
        return c1074n;
    }

    @Override // z6.N
    public final Object m() {
        return new double[0];
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        double[] content = (double[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            double d7 = content[i5];
            encoder.getClass();
            M descriptor = this.f8750b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i5);
            encoder.e(d7);
        }
    }
}
