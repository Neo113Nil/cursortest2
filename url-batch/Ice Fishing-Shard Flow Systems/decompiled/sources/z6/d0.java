package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f8777a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1081v f8778b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.q.f6168a, "<this>");
        f8778b = J.a("kotlin.ULong", F.f8737a);
    }

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new R5.A(decoder.k(f8778b).a());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        long j = ((R5.A) obj).f2401d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(f8778b).k(j);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8778b;
    }
}
