package i3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Y extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f7052c;

    static {
        Intrinsics.checkNotNullParameter(M2.H.f3582a, "<this>");
        f7052c = new Y(Z.f7053a);
    }

    @Override // i3.AbstractC0693n, i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        X builder = (X) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short B = decoder.B(this.f7043b, i2);
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f7050a;
        int i4 = builder.f7051b;
        builder.f7051b = i4 + 1;
        sArr[i4] = B;
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        short[] bufferWithData = (short[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        X x2 = new X();
        x2.f7050a = bufferWithData;
        x2.f7051b = bufferWithData.length;
        x2.b(10);
        return x2;
    }

    @Override // i3.S
    public final Object h() {
        return new short[0];
    }
}
