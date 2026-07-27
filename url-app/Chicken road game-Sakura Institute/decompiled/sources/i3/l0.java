package i3;

import kotlin.jvm.internal.Intrinsics;
import y2.C1322B;
import y2.C1323C;

/* loaded from: classes.dex */
public final class l0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f7088c;

    static {
        Intrinsics.checkNotNullParameter(C1322B.f11655e, "<this>");
        f7088c = new l0(m0.f7091a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        k0 builder = (k0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short t4 = decoder.y(this.f7043b, i2).t();
        C1322B.a aVar = C1322B.f11655e;
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f7085a;
        int i4 = builder.f7086b;
        builder.f7086b = i4 + 1;
        sArr[i4] = t4;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        short[] bufferWithData = ((C1323C) obj).f11657d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        k0 k0Var = new k0();
        k0Var.f7085a = bufferWithData;
        k0Var.f7086b = bufferWithData.length;
        k0Var.b(10);
        return k0Var;
    }

    @Override // i3.S
    public final Object h() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C1323C(storage);
    }
}
