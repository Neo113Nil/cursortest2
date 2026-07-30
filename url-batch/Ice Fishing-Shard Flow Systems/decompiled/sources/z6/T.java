package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class T implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final T f8757a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8758b = new O("kotlin.Short", x6.c.f8428i);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.u());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.n(shortValue);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8758b;
    }
}
