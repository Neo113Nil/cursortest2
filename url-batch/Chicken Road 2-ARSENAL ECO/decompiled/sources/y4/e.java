package y4;

import java.util.Objects;
import z3.i;

/* loaded from: classes.dex */
public final class e extends i {
    @Override // z3.i
    public final Object b(V5.g gVar) {
        n6.i value = n6.i.f5525i;
        A3.d dVar = new A3.d();
        long h7 = gVar.h();
        n6.f fVar = null;
        String str = "";
        x4.h hVar = null;
        while (true) {
            int f7 = ((z3.a) gVar.f2734g).f();
            if (f7 == -1) {
                break;
            }
            if (f7 == 1) {
                hVar = (x4.h) x4.h.f6213l.b(gVar);
            } else if (f7 == 2) {
                dVar.add((C0763b) C0763b.f6236s.b(gVar));
            } else if (f7 != 3) {
                gVar.o(f7);
            } else {
                str = (String) i.f6318o.b(gVar);
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
        return new f(hVar, dVar, str, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        f fVar = (f) obj;
        x4.h hVar = fVar.f6253h;
        String str = fVar.f6255j;
        if (!Objects.equals(hVar, null)) {
            x4.h.f6213l.e(dVar, 1, fVar.f6253h);
        }
        C0763b.f6236s.a().e(dVar, 2, fVar.f6254i);
        if (!Objects.equals(str, "")) {
            i.f6318o.e(dVar, 3, str);
        }
        dVar.l(fVar.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        f fVar = (f) obj;
        x4.h hVar = fVar.f6253h;
        String str = fVar.f6255j;
        int g7 = C0763b.f6236s.a().g(2, fVar.f6254i) + (!Objects.equals(hVar, null) ? x4.h.f6213l.g(1, fVar.f6253h) : 0);
        if (!Objects.equals(str, "")) {
            g7 += i.f6318o.g(3, str);
        }
        return fVar.a().a() + g7;
    }
}
