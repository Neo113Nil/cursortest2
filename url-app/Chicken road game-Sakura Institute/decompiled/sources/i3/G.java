package i3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class G extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final G f7017c;

    static {
        Intrinsics.checkNotNullParameter(M2.q.f3608a, "<this>");
        f7017c = new G(H.f7018a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        F builder = (F) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long o4 = decoder.o(this.f7043b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f7015a;
        int i4 = builder.f7016b;
        builder.f7016b = i4 + 1;
        jArr[i4] = o4;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        long[] bufferWithData = (long[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        F f4 = new F();
        f4.f7015a = bufferWithData;
        f4.f7016b = bufferWithData.length;
        f4.b(10);
        return f4;
    }

    @Override // i3.S
    public final Object h() {
        return new long[0];
    }
}
