package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w1 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w1 f9458a = new w1();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f9459b;

    static {
        wd.o.f10160a.getClass();
        f9459b = b1.a("kotlin.UInt", j0.f9391a);
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        int i3 = ((hd.x) obj).f4530d;
        oVar.g(f9459b);
        oVar.i(i3);
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        lVar.b(f9459b);
        return new hd.x(lVar.c());
    }

    @Override // pe.a
    public final re.e d() {
        return f9459b;
    }
}
