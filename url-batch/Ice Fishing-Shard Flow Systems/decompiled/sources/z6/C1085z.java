package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1085z implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1085z f8830a = new C1085z();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8831b = new O("kotlin.Int", x6.c.f8426g);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.p());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        int intValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.j(intValue);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8831b;
    }
}
