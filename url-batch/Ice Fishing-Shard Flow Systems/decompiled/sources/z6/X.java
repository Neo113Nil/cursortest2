package z6;

import kotlin.jvm.internal.C0637b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class X implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final X f8764a = new X();

    /* renamed from: b, reason: collision with root package name */
    public static final C1081v f8765b;

    static {
        Intrinsics.checkNotNullParameter(C0637b.f6157a, "<this>");
        f8765b = J.a("kotlin.UByte", C1069i.f8792a);
    }

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new R5.t(decoder.k(f8765b).q());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        byte b7 = ((R5.t) obj).f2433d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(f8765b).c(b7);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8765b;
    }
}
