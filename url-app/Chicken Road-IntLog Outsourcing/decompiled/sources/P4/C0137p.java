package P4;

/* renamed from: P4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137p implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0137p f2388a = new C0137p();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2389b = new N("kotlin.Double", N4.c.f2168e);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return Double.valueOf(decoder.x());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.e(((Number) obj).doubleValue());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2389b;
    }
}
