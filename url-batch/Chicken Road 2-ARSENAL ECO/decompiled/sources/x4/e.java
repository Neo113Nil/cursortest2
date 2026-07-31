package x4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends z3.i {
    @Override // z3.i
    public final Object b(V5.g gVar) {
        n6.f fVar;
        n6.i value = n6.i.f5525i;
        A3.d dVar = new A3.d();
        A3.d dVar2 = new A3.d();
        long h7 = gVar.h();
        String str = "";
        String str2 = "";
        while (true) {
            int f7 = ((z3.a) gVar.f2734g).f();
            if (f7 == -1) {
                break;
            }
            z3.c cVar = z3.i.f6318o;
            if (f7 == 1) {
                str = (String) cVar.b(gVar);
            } else if (f7 == 2) {
                str2 = (String) cVar.b(gVar);
            } else if (f7 == 3) {
                dVar.add((String) cVar.b(gVar));
            } else if (f7 != 4) {
                gVar.o(f7);
            } else {
                dVar2.add((String) cVar.b(gVar));
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
        return new f(str, str2, dVar, dVar2, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        f fVar = (f) obj;
        String str = fVar.f6209h;
        String str2 = fVar.f6210i;
        boolean equals = Objects.equals(str, "");
        z3.c cVar = z3.i.f6318o;
        if (!equals) {
            cVar.e(dVar, 1, fVar.f6209h);
        }
        if (!Objects.equals(str2, "")) {
            cVar.e(dVar, 2, str2);
        }
        cVar.a().e(dVar, 3, fVar.f6211j);
        cVar.a().e(dVar, 4, fVar.f6212k);
        dVar.l(fVar.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        f fVar = (f) obj;
        String str = fVar.f6209h;
        String str2 = fVar.f6210i;
        boolean equals = Objects.equals(str, "");
        z3.c cVar = z3.i.f6318o;
        int g7 = !equals ? cVar.g(1, fVar.f6209h) : 0;
        if (!Objects.equals(str2, "")) {
            g7 += cVar.g(2, str2);
        }
        return fVar.a().a() + cVar.a().g(4, fVar.f6212k) + cVar.a().g(3, fVar.f6211j) + g7;
    }
}
