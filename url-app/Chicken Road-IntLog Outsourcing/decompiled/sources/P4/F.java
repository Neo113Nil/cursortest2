package P4;

/* loaded from: classes.dex */
public final class F implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final F f2325a = new F();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2326b = new N("kotlin.Long", N4.c.f2171h);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return Long.valueOf(decoder.c());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.k(((Number) obj).longValue());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2326b;
    }
}
