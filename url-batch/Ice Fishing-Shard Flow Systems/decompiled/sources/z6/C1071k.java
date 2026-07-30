package z6;

import kotlin.jvm.internal.C0640e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071k extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C1071k f8796c;

    static {
        Intrinsics.checkNotNullParameter(C0640e.f6159a, "<this>");
        f8796c = new C1071k(C1072l.f8797a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        C1070j builder = (C1070j) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char i5 = decoder.i(this.f8750b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.f8794a;
        int i7 = builder.f8795b;
        builder.f8795b = i7 + 1;
        cArr[i7] = i5;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1070j c1070j = new C1070j();
        c1070j.f8794a = bufferWithData;
        c1070j.f8795b = bufferWithData.length;
        c1070j.b(10);
        return c1070j;
    }

    @Override // z6.N
    public final Object m() {
        return new char[0];
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        char[] content = (char[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            char c7 = content[i5];
            encoder.getClass();
            M descriptor = this.f8750b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i5);
            encoder.d(c7);
        }
    }
}
