package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t1 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f9441a = new t1();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f9442b;

    static {
        wd.b.f10140a.getClass();
        f9442b = b1.a("kotlin.UByte", i.f9386a);
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        byte b10 = ((hd.t) obj).f4524d;
        oVar.g(f9442b);
        oVar.b(b10);
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        lVar.b(f9442b);
        return new hd.t(((Byte) lVar.e()).byteValue());
    }

    @Override // pe.a
    public final re.e d() {
        return f9442b;
    }
}
