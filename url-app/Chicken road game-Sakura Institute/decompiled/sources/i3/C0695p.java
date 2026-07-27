package i3;

import M2.C0257i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695p extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0695p f7100c;

    static {
        Intrinsics.checkNotNullParameter(C0257i.f3602a, "<this>");
        f7100c = new C0695p(C0696q.f7101a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        C0694o builder = (C0694o) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        double g4 = decoder.g(this.f7043b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        double[] dArr = builder.f7096a;
        int i4 = builder.f7097b;
        builder.f7097b = i4 + 1;
        dArr[i4] = g4;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        double[] bufferWithData = (double[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C0694o c0694o = new C0694o();
        c0694o.f7096a = bufferWithData;
        c0694o.f7097b = bufferWithData.length;
        c0694o.b(10);
        return c0694o;
    }

    @Override // i3.S
    public final Object h() {
        return new double[0];
    }
}
