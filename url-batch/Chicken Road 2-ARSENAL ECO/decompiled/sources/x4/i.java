package x4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i extends z3.i {
    @Override // z3.i
    public final Object b(V5.g gVar) {
        n6.i value = n6.i.f5525i;
        long h7 = gVar.h();
        n6.f fVar = null;
        String str = "";
        b bVar = null;
        while (true) {
            int f7 = ((z3.a) gVar.f2734g).f();
            if (f7 == -1) {
                break;
            }
            if (f7 == 1) {
                str = (String) z3.i.f6318o.b(gVar);
            } else if (f7 != 2) {
                gVar.o(f7);
            } else {
                bVar = (b) b.f6198o.b(gVar);
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
        }
        if (fVar != null) {
            value = fVar.f(fVar.f5524g);
        }
        return new j(str, bVar, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        j jVar = (j) obj;
        String str = jVar.f6219h;
        b bVar = jVar.f6220i;
        if (!Objects.equals(str, "")) {
            z3.i.f6318o.e(dVar, 1, jVar.f6219h);
        }
        if (!Objects.equals(bVar, null)) {
            b.f6198o.e(dVar, 2, bVar);
        }
        dVar.l(jVar.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        int i7;
        j jVar = (j) obj;
        String str = jVar.f6219h;
        b bVar = jVar.f6220i;
        if (Objects.equals(str, "")) {
            i7 = 0;
        } else {
            i7 = z3.i.f6318o.g(1, jVar.f6219h);
        }
        if (!Objects.equals(bVar, null)) {
            i7 += b.f6198o.g(2, bVar);
        }
        return jVar.a().a() + i7;
    }
}
