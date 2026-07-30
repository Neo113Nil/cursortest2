package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final E f8736c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.q.f6168a, "<this>");
        f8736c = new E(F.f8737a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        D builder = (D) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long n7 = decoder.n(this.f8750b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f8734a;
        int i5 = builder.f8735b;
        builder.f8735b = i5 + 1;
        jArr[i5] = n7;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        long[] bufferWithData = (long[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        D d7 = new D();
        d7.f8734a = bufferWithData;
        d7.f8735b = bufferWithData.length;
        d7.b(10);
        return d7;
    }

    @Override // z6.N
    public final Object m() {
        return new long[0];
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        long[] content = (long[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            long j = content[i5];
            encoder.getClass();
            M descriptor = this.f8750b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i5);
            encoder.k(j);
        }
    }
}
