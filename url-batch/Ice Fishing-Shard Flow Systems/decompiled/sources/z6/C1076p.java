package z6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076p implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1076p f8803a = new C1076p();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8804b = new O("kotlin.Double", x6.c.f8424e);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.x());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.e(doubleValue);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8804b;
    }
}
