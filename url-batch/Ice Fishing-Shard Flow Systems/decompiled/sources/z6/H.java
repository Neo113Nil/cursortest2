package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class H implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final H f8740a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final G f8741b = G.f8739a;

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new w6.c("'kotlin.Nothing' does not have instances");
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new w6.c("'kotlin.Nothing' cannot be serialized");
    }

    @Override // w6.a
    public final x6.e c() {
        return f8741b;
    }
}
