package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c2 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c2 f9349a = new c2();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f9350b;

    static {
        wd.e0.f10151a.getClass();
        f9350b = b1.a("kotlin.UShort", o1.f9414a);
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        short s3 = ((hd.e0) obj).f4500d;
        oVar.g(f9350b);
        oVar.m(s3);
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        lVar.b(f9350b);
        return new hd.e0(((Short) lVar.e()).shortValue());
    }

    @Override // pe.a
    public final re.e d() {
        return f9350b;
    }
}
