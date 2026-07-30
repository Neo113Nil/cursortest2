package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066f implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1066f f8782a = new C1066f();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8783b = new O("kotlin.Boolean", x6.c.f8421b);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.d());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.b(booleanValue);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8783b;
    }
}
