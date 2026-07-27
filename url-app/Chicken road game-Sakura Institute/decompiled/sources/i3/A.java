package i3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class A extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final A f7008c;

    static {
        Intrinsics.checkNotNullParameter(M2.n.f3606a, "<this>");
        f7008c = new A(B.f7009a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        C0704z builder = (C0704z) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int b4 = decoder.b(this.f7043b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f7117a;
        int i4 = builder.f7118b;
        builder.f7118b = i4 + 1;
        iArr[i4] = b4;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        int[] bufferWithData = (int[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C0704z c0704z = new C0704z();
        c0704z.f7117a = bufferWithData;
        c0704z.f7118b = bufferWithData.length;
        c0704z.b(10);
        return c0704z;
    }

    @Override // i3.S
    public final Object h() {
        return new int[0];
    }
}
