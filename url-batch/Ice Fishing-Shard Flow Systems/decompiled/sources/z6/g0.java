package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f8787a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1081v f8788b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.G.f6154a, "<this>");
        f8788b = J.a("kotlin.UShort", T.f8757a);
    }

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new R5.E(decoder.k(f8788b).u());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        short s7 = ((R5.E) obj).f2405d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(f8788b).n(s7);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8788b;
    }
}
