package z6;

import kotlin.jvm.internal.C0636a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1065e extends N {

    /* renamed from: c, reason: collision with root package name */
    public static final C1065e f8779c;

    static {
        Intrinsics.checkNotNullParameter(C0636a.f6156a, "<this>");
        f8779c = new C1065e(C1066f.f8782a);
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // z6.AbstractC1073m, z6.AbstractC1061a
    public final void i(y6.a decoder, int i2, Object obj) {
        C1064d builder = (C1064d) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean l7 = decoder.l(this.f8750b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f8775a;
        int i5 = builder.f8776b;
        builder.f8776b = i5 + 1;
        zArr[i5] = l7;
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C1064d c1064d = new C1064d();
        c1064d.f8775a = bufferWithData;
        c1064d.f8776b = bufferWithData.length;
        c1064d.b(10);
        return c1064d;
    }

    @Override // z6.N
    public final Object m() {
        return new boolean[0];
    }

    @Override // z6.N
    public final void n(B6.t encoder, Object obj, int i2) {
        boolean[] content = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i2; i5++) {
            boolean z7 = content[i5];
            encoder.getClass();
            M descriptor = this.f8750b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.f(descriptor, i5);
            encoder.b(z7);
        }
    }
}
