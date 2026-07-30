package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080u implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1080u f8815a = new C1080u();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8816b = new O("kotlin.Float", x6.c.f8425f);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.w());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(floatValue);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8816b;
    }
}
