package a8;

/* loaded from: classes2.dex */
public final class S implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final S f4449a = new S();

    /* renamed from: b, reason: collision with root package name */
    public static final N f4450b = new N("kotlin.Short", Y7.c.f4040n);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.n(((Number) obj).shortValue());
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return Short.valueOf(decoder.v());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4450b;
    }
}
