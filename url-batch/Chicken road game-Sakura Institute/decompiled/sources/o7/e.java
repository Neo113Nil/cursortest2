package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f6871c = new e(f.f6875a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        d dVar = (d) obj;
        r6.k.f(dVar, "builder");
        boolean c4 = aVar.c(this.f6944b, i7);
        dVar.b(dVar.d() + 1);
        boolean[] zArr = dVar.f6866a;
        int i8 = dVar.f6867b;
        dVar.f6867b = i8 + 1;
        zArr[i8] = c4;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        r6.k.f(zArr, "<this>");
        d dVar = new d();
        dVar.f6866a = zArr;
        dVar.f6867b = zArr.length;
        dVar.b(10);
        return dVar;
    }

    @Override // o7.s0
    public final Object h() {
        return new boolean[0];
    }
}
