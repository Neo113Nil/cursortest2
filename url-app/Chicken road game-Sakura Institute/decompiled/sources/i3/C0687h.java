package i3;

import M2.C0251c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687h extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0687h f7075c;

    static {
        Intrinsics.checkNotNullParameter(C0251c.f3588a, "<this>");
        f7075c = new C0687h(C0688i.f7078a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        C0686g builder = (C0686g) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte F3 = decoder.F(this.f7043b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f7071a;
        int i4 = builder.f7072b;
        builder.f7072b = i4 + 1;
        bArr[i4] = F3;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        C0686g c0686g = new C0686g();
        c0686g.f7071a = bufferWithData;
        c0686g.f7072b = bufferWithData.length;
        c0686g.b(10);
        return c0686g;
    }

    @Override // i3.S
    public final Object h() {
        return new byte[0];
    }
}
