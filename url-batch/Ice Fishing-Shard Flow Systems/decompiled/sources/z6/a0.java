package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f8769a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1081v f8770b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.o.f6167a, "<this>");
        f8770b = J.a("kotlin.UInt", C1085z.f8830a);
    }

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new R5.x(decoder.k(f8770b).p());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        int i2 = ((R5.x) obj).f2439d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(f8770b).j(i2);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8770b;
    }
}
