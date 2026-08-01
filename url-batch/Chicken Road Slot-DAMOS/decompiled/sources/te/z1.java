package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z1 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f9472a = new z1();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f9473b;

    static {
        wd.q.f10161a.getClass();
        f9473b = b1.a("kotlin.ULong", o0.f9412a);
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        long j = ((hd.a0) obj).f4496d;
        oVar.g(f9473b);
        oVar.j(j);
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        lVar.b(f9473b);
        return new hd.a0(((Long) lVar.e()).longValue());
    }

    @Override // pe.a
    public final re.e d() {
        return f9473b;
    }
}
