package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079t extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C1079t f8814c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.k.f6165a, "<this>");
        f8814c = new C1079t(C1080u.f8815a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        C1078s builder = (C1078s) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float r7 = decoder.r(this.f8750b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.f8812a;
        int i5 = builder.f8813b;
        builder.f8813b = i5 + 1;
        fArr[i5] = r7;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1078s c1078s = new C1078s();
        c1078s.f8812a = bufferWithData;
        c1078s.f8813b = bufferWithData.length;
        c1078s.b(10);
        return c1078s;
    }

    @Override // z6.N
    public final Object m() {
        return new float[0];
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        float[] content = (float[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            float f7 = content[i5];
            encoder.getClass();
            M descriptor = this.f8750b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i5);
            encoder.g(f7);
        }
    }
}
