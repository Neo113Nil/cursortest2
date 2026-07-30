package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final F f8737a = new F();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8738b = new O("kotlin.Long", x6.c.f8427h);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.a());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        long longValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.k(longValue);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8738b;
    }
}
