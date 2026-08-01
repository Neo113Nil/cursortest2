package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q1 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final pe.a f9424a;

    /* renamed from: b, reason: collision with root package name */
    public final pe.a f9425b;

    /* renamed from: c, reason: collision with root package name */
    public final pe.a f9426c;

    /* renamed from: d, reason: collision with root package name */
    public final re.f f9427d = g8.b.q("kotlin.Triple", new re.e[0], new a1.d(17, this));

    public q1(pe.a aVar, pe.a aVar2, pe.a aVar3) {
        this.f9424a = aVar;
        this.f9425b = aVar2;
        this.f9426c = aVar3;
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        hd.r rVar = (hd.r) obj;
        rVar.getClass();
        re.f fVar = this.f9427d;
        fVar.getClass();
        oVar.k(fVar, 0, this.f9424a, rVar.f4520d);
        oVar.k(fVar, 1, this.f9425b, rVar.f4521e);
        oVar.k(fVar, 2, this.f9426c, rVar.f4522i);
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        re.f fVar = this.f9427d;
        fVar.getClass();
        Object obj = b1.f9340c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int a9 = lVar.a(fVar);
            if (a9 == -1) {
                if (obj2 == obj) {
                    throw new ee.h("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new ee.h("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new hd.r(obj2, obj3, obj4);
                }
                throw new ee.h("Element 'third' is missing");
            }
            if (a9 == 0) {
                obj2 = lVar.e();
            } else if (a9 == 1) {
                obj3 = lVar.e();
            } else {
                if (a9 != 2) {
                    throw new ee.h(v4.a.j(a9, "Unexpected index "));
                }
                obj4 = lVar.e();
            }
        }
    }

    @Override // pe.a
    public final re.e d() {
        return this.f9427d;
    }
}
