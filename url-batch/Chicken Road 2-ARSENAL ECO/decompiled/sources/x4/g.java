package x4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class g extends z3.i {
    @Override // z3.i
    public final Object b(V5.g gVar) {
        n6.f fVar;
        n6.i value = n6.i.f5525i;
        A3.d dVar = new A3.d();
        long h7 = gVar.h();
        String str = "";
        int i7 = 0;
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
                dVar.add((j) j.f6218j.b(gVar));
            } else if (f7 != 4) {
                gVar.o(f7);
            } else {
                i7 = ((Integer) z3.i.f6311h.b(gVar)).intValue();
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
        return new h(str, str2, dVar, i7, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        h hVar = (h) obj;
        String str = hVar.f6214h;
        int i7 = hVar.f6217k;
        String str2 = hVar.f6215i;
        boolean equals = Objects.equals(str, "");
        z3.c cVar = z3.i.f6318o;
        if (!equals) {
            cVar.e(dVar, 1, hVar.f6214h);
        }
        if (!Objects.equals(str2, "")) {
            cVar.e(dVar, 2, str2);
        }
        j.f6218j.a().e(dVar, 3, hVar.f6216j);
        if (!Integer.valueOf(i7).equals(0)) {
            z3.i.f6311h.e(dVar, 4, Integer.valueOf(i7));
        }
        dVar.l(hVar.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        h hVar = (h) obj;
        String str = hVar.f6214h;
        int i7 = hVar.f6217k;
        String str2 = hVar.f6215i;
        boolean equals = Objects.equals(str, "");
        z3.c cVar = z3.i.f6318o;
        int g7 = !equals ? cVar.g(1, hVar.f6214h) : 0;
        if (!Objects.equals(str2, "")) {
            g7 += cVar.g(2, str2);
        }
        int g8 = j.f6218j.a().g(3, hVar.f6216j) + g7;
        if (!Integer.valueOf(i7).equals(0)) {
            g8 += z3.i.f6311h.g(4, Integer.valueOf(i7));
        }
        return hVar.a().a() + g8;
    }
}
