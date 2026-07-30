package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class S extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final S f8756c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.G.f6154a, "<this>");
        f8756c = new S(T.f8757a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        Q builder = (Q) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short s7 = decoder.s(this.f8750b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f8754a;
        int i5 = builder.f8755b;
        builder.f8755b = i5 + 1;
        sArr[i5] = s7;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        short[] bufferWithData = (short[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        Q q4 = new Q();
        q4.f8754a = bufferWithData;
        q4.f8755b = bufferWithData.length;
        q4.b(10);
        return q4;
    }

    @Override // z6.N
    public final Object m() {
        return new short[0];
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        short[] content = (short[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            short s7 = content[i5];
            encoder.getClass();
            M descriptor = this.f8750b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i5);
            encoder.n(s7);
        }
    }
}
