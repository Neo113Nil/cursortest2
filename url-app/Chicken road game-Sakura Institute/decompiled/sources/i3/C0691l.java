package i3;

import M2.C0254f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691l extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0691l f7087c;

    static {
        Intrinsics.checkNotNullParameter(C0254f.f3596a, "<this>");
        f7087c = new C0691l(C0692m.f7089a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        C0690k builder = (C0690k) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char q2 = decoder.q(this.f7043b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.f7083a;
        int i4 = builder.f7084b;
        builder.f7084b = i4 + 1;
        cArr[i4] = q2;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C0690k c0690k = new C0690k();
        c0690k.f7083a = bufferWithData;
        c0690k.f7084b = bufferWithData.length;
        c0690k.b(10);
        return c0690k;
    }

    @Override // i3.S
    public final Object h() {
        return new char[0];
    }
}
