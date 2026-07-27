package i3;

import kotlin.jvm.internal.Intrinsics;
import y2.w;

/* loaded from: classes.dex */
public final class f0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f7070c;

    static {
        Intrinsics.checkNotNullParameter(y2.w.f11685e, "<this>");
        f7070c = new f0(g0.f7073a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        e0 builder = (e0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int l4 = decoder.y(this.f7043b, i2).l();
        w.a aVar = y2.w.f11685e;
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f7066a;
        int i4 = builder.f7067b;
        builder.f7067b = i4 + 1;
        iArr[i4] = l4;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        int[] bufferWithData = ((y2.x) obj).f11687d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        e0 e0Var = new e0();
        e0Var.f7066a = bufferWithData;
        e0Var.f7067b = bufferWithData.length;
        e0Var.b(10);
        return e0Var;
    }

    @Override // i3.S
    public final Object h() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new y2.x(storage);
    }
}
