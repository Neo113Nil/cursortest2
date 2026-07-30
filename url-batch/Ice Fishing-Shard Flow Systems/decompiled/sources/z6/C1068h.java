package z6;

import kotlin.jvm.internal.C0637b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068h extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C1068h f8789c;

    static {
        Intrinsics.checkNotNullParameter(C0637b.f6157a, "<this>");
        f8789c = new C1068h(C1069i.f8792a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        C1067g builder = (C1067g) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte m2 = decoder.m(this.f8750b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f8785a;
        int i5 = builder.f8786b;
        builder.f8786b = i5 + 1;
        bArr[i5] = m2;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1067g c1067g = new C1067g();
        c1067g.f8785a = bufferWithData;
        c1067g.f8786b = bufferWithData.length;
        c1067g.b(10);
        return c1067g;
    }

    @Override // z6.N
    public final Object m() {
        return new byte[0];
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        byte[] content = (byte[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            byte b7 = content[i5];
            encoder.getClass();
            M descriptor = this.f8750b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i5);
            encoder.c(b7);
        }
    }
}
