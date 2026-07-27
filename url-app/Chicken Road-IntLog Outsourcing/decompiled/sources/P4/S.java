package P4;

/* loaded from: classes.dex */
public final class S implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final S f2342a = new S();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2343b = new N("kotlin.Short", N4.c.f2172i);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return Short.valueOf(decoder.t());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.n(((Number) obj).shortValue());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2343b;
    }
}
