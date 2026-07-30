package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069i implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1069i f8792a = new C1069i();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8793b = new O("kotlin.Byte", x6.c.f8422c);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.q());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.c(byteValue);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8793b;
    }
}
