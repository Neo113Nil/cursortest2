package i3;

import M2.C0250b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684e extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0684e f7065c;

    static {
        Intrinsics.checkNotNullParameter(C0250b.f3587a, "<this>");
        f7065c = new C0684e(C0685f.f7068a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        C0683d builder = (C0683d) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean z5 = decoder.z(this.f7043b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f7061a;
        int i4 = builder.f7062b;
        builder.f7062b = i4 + 1;
        zArr[i4] = z5;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C0683d c0683d = new C0683d();
        c0683d.f7061a = bufferWithData;
        c0683d.f7062b = bufferWithData.length;
        c0683d.b(10);
        return c0683d;
    }

    @Override // i3.S
    public final Object h() {
        return new boolean[0];
    }
}
