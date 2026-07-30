package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072l implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1072l f8797a = new C1072l();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8798b = new O("kotlin.Char", x6.c.f8423d);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.f());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.d(charValue);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8798b;
    }
}
