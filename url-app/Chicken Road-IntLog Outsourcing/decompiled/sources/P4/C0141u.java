package P4;

/* renamed from: P4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141u implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0141u f2400a = new C0141u();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2401b = new N("kotlin.Float", N4.c.f2169f);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return Float.valueOf(decoder.v());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.g(((Number) obj).floatValue());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2401b;
    }
}
