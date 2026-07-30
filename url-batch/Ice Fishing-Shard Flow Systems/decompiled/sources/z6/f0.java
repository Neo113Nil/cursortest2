package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f8784c;

    static {
        Intrinsics.checkNotNullParameter(R5.E.f2404e, "<this>");
        f8784c = new f0(g0.f8787a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        short[] collectionSize = ((R5.F) obj).f2406d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        e0 builder = (e0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short u7 = decoder.c(this.f8750b, i2).u();
        R5.D d7 = R5.E.f2404e;
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f8780a;
        int i5 = builder.f8781b;
        builder.f8781b = i5 + 1;
        sArr[i5] = u7;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        short[] bufferWithData = ((R5.F) obj).f2406d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        e0 e0Var = new e0();
        e0Var.f8780a = bufferWithData;
        e0Var.f8781b = bufferWithData.length;
        e0Var.b(10);
        return e0Var;
    }

    @Override // z6.N
    public final Object m() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new R5.F(storage);
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        short[] content = ((R5.F) obj).f2406d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            B6.t i7 = encoder.i(this.f8750b, i5);
            short s7 = content[i5];
            R5.D d7 = R5.E.f2404e;
            i7.n(s7);
        }
    }
}
