package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f8774c;

    static {
        Intrinsics.checkNotNullParameter(R5.A.f2400e, "<this>");
        f8774c = new c0(d0.f8777a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        long[] collectionSize = ((R5.B) obj).f2402d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        b0 builder = (b0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long a7 = decoder.c(this.f8750b, i2).a();
        R5.z zVar = R5.A.f2400e;
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f8771a;
        int i5 = builder.f8772b;
        builder.f8772b = i5 + 1;
        jArr[i5] = a7;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        long[] bufferWithData = ((R5.B) obj).f2402d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        b0 b0Var = new b0();
        b0Var.f8771a = bufferWithData;
        b0Var.f8772b = bufferWithData.length;
        b0Var.b(10);
        return b0Var;
    }

    @Override // z6.N
    public final Object m() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new R5.B(storage);
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        long[] content = ((R5.B) obj).f2402d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            B6.t i7 = encoder.i(this.f8750b, i5);
            long j = content[i5];
            R5.z zVar = R5.A.f2400e;
            i7.k(j);
        }
    }
}
