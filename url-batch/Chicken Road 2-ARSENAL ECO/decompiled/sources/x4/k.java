package x4;

/* loaded from: classes.dex */
public final class k extends z3.i {
    @Override // z3.i
    public final Object b(V5.g gVar) {
        n6.f fVar;
        n6.i value = n6.i.f5525i;
        A3.d dVar = new A3.d();
        long h7 = gVar.h();
        while (true) {
            int f7 = ((z3.a) gVar.f2734g).f();
            if (f7 == -1) {
                break;
            }
            if (f7 != 1) {
                gVar.o(f7);
            } else {
                dVar.add((j) j.f6218j.b(gVar));
            }
        }
        n6.i unknownFields = gVar.i(h7);
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            fVar = new n6.f();
            kotlin.jvm.internal.i.e(value, "value");
            fVar.G(value);
            value = n6.i.f5525i;
            fVar.G(unknownFields);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            value = fVar.f(fVar.f5524g);
        }
        return new l(dVar, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        l lVar = (l) obj;
        j.f6218j.a().e(dVar, 1, lVar.f6222h);
        dVar.l(lVar.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        l lVar = (l) obj;
        return lVar.a().a() + j.f6218j.a().g(1, lVar.f6222h);
    }
}
