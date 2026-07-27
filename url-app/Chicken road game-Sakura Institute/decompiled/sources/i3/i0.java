package i3;

import kotlin.jvm.internal.Intrinsics;
import y2.y;

/* loaded from: classes.dex */
public final class i0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f7080c;

    static {
        Intrinsics.checkNotNullParameter(y2.y.f11688e, "<this>");
        f7080c = new i0(j0.f7081a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        h0 builder = (h0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long e4 = decoder.y(this.f7043b, i2).e();
        y.a aVar = y2.y.f11688e;
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f7076a;
        int i4 = builder.f7077b;
        builder.f7077b = i4 + 1;
        jArr[i4] = e4;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        long[] bufferWithData = ((y2.z) obj).f11690d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        h0 h0Var = new h0();
        h0Var.f7076a = bufferWithData;
        h0Var.f7077b = bufferWithData.length;
        h0Var.b(10);
        return h0Var;
    }

    @Override // i3.S
    public final Object h() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new y2.z(storage);
    }
}
