package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class W extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final W f8763c;

    static {
        Intrinsics.checkNotNullParameter(R5.t.f2432e, "<this>");
        f8763c = new W(X.f8764a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        byte[] collectionSize = ((R5.v) obj).f2437d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        V builder = (V) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte q4 = decoder.c(this.f8750b, i2).q();
        R5.s sVar = R5.t.f2432e;
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f8761a;
        int i5 = builder.f8762b;
        builder.f8762b = i5 + 1;
        bArr[i5] = q4;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        byte[] bufferWithData = ((R5.v) obj).f2437d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        V v7 = new V();
        v7.f8761a = bufferWithData;
        v7.f8762b = bufferWithData.length;
        v7.b(10);
        return v7;
    }

    @Override // z6.N
    public final Object m() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new R5.v(storage);
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        byte[] content = ((R5.v) obj).f2437d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            B6.t i7 = encoder.i(this.f8750b, i5);
            byte b7 = content[i5];
            R5.s sVar = R5.t.f2432e;
            i7.c(b7);
        }
    }
}
