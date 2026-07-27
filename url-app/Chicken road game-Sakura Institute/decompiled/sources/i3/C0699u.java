package i3;

import M2.C0258j;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699u extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0699u f7112c;

    static {
        Intrinsics.checkNotNullParameter(C0258j.f3603a, "<this>");
        f7112c = new C0699u(C0700v.f7113a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        C0698t builder = (C0698t) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float c4 = decoder.c(this.f7043b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.f7110a;
        int i4 = builder.f7111b;
        builder.f7111b = i4 + 1;
        fArr[i4] = c4;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C0698t c0698t = new C0698t();
        c0698t.f7110a = bufferWithData;
        c0698t.f7111b = bufferWithData.length;
        c0698t.b(10);
        return c0698t;
    }

    @Override // i3.S
    public final Object h() {
        return new float[0];
    }
}
