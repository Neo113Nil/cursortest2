package i3;

import kotlin.jvm.internal.Intrinsics;
import y2.u;

/* loaded from: classes.dex */
public final class c0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f7060c;

    static {
        Intrinsics.checkNotNullParameter(y2.u.f11682e, "<this>");
        f7060c = new c0(d0.f7063a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        b0 builder = (b0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte r2 = decoder.y(this.f7043b, i2).r();
        u.a aVar = y2.u.f11682e;
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f7057a;
        int i4 = builder.f7058b;
        builder.f7058b = i4 + 1;
        bArr[i4] = r2;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        byte[] bufferWithData = ((y2.v) obj).f11684d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        b0 b0Var = new b0();
        b0Var.f7057a = bufferWithData;
        b0Var.f7058b = bufferWithData.length;
        b0Var.b(10);
        return b0Var;
    }

    @Override // i3.S
    public final Object h() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new y2.v(storage);
    }
}
