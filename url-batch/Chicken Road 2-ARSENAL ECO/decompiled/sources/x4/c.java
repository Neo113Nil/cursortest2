package x4;

/* loaded from: classes.dex */
public final class c extends z3.i {
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
                dVar.add((b) b.f6198o.b(gVar));
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
        return new d(dVar, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        d dVar2 = (d) obj;
        b.f6198o.a().e(dVar, 1, dVar2.f6207h);
        dVar.l(dVar2.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        d dVar = (d) obj;
        return dVar.a().a() + b.f6198o.a().g(1, dVar.f6207h);
    }
}
