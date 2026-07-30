package a1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final i.p f246a;

    static {
        q qVar = d.f220c;
        int i7 = qVar.f217c;
        e eVar = new e(qVar, qVar, 1);
        int i8 = qVar.f217c;
        l lVar = d.f237t;
        int i9 = (lVar.f217c << 6) | i8;
        g gVar = new g(qVar, lVar, 0);
        int i10 = (i8 << 6) | lVar.f217c;
        g gVar2 = new g(lVar, qVar, 0);
        i.p pVar = i.i.f4750a;
        i.p pVar2 = new i.p();
        pVar2.i(i7 | (i7 << 6), eVar);
        pVar2.i(i9, gVar);
        pVar2.i(i10, gVar2);
        f246a = pVar2;
    }
}
