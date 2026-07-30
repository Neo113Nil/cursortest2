package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Z extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final Z f8768c;

    static {
        Intrinsics.checkNotNullParameter(R5.x.f2438e, "<this>");
        f8768c = new Z(a0.f8769a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        int[] collectionSize = ((R5.y) obj).f2440d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        Y builder = (Y) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int p7 = decoder.c(this.f8750b, i2).p();
        R5.w wVar = R5.x.f2438e;
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f8766a;
        int i5 = builder.f8767b;
        builder.f8767b = i5 + 1;
        iArr[i5] = p7;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        int[] bufferWithData = ((R5.y) obj).f2440d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        Y y7 = new Y();
        y7.f8766a = bufferWithData;
        y7.f8767b = bufferWithData.length;
        y7.b(10);
        return y7;
    }

    @Override // z6.N
    public final Object m() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new R5.y(storage);
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        int[] content = ((R5.y) obj).f2440d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            B6.t i7 = encoder.i(this.f8750b, i5);
            int i8 = content[i5];
            R5.w wVar = R5.x.f2438e;
            i7.j(i8);
        }
    }
}
