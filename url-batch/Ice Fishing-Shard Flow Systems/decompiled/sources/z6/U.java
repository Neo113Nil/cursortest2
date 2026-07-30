package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class U implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final U f8759a = new U();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8760b = new O("kotlin.String", x6.c.j);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.v();
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.o(value);
    }

    @Override // w6.a
    public final x6.e c() {
        return f8760b;
    }
}
