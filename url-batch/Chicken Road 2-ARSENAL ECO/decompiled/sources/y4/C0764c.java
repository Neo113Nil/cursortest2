package y4;

import java.util.Objects;
import z3.i;
import z4.C0774b;

/* renamed from: y4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764c extends i {
    @Override // z3.i
    public final Object b(V5.g gVar) {
        n6.i value = n6.i.f5525i;
        A3.d dVar = new A3.d();
        long h7 = gVar.h();
        n6.f fVar = null;
        String str = "";
        C0774b c0774b = null;
        while (true) {
            int f7 = ((z3.a) gVar.f2734g).f();
            if (f7 == -1) {
                break;
            }
            if (f7 == 1) {
                c0774b = (C0774b) C0774b.f6340k.b(gVar);
            } else if (f7 == 2) {
                dVar.add((f) f.f6252k.b(gVar));
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
        return new C0765d(c0774b, dVar, str, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        C0765d c0765d = (C0765d) obj;
        C0774b c0774b = c0765d.f6249h;
        String str = c0765d.f6251j;
        if (!Objects.equals(c0774b, null)) {
            C0774b.f6340k.e(dVar, 1, c0765d.f6249h);
        }
        f.f6252k.a().e(dVar, 2, c0765d.f6250i);
        if (!Objects.equals(str, "")) {
            i.f6318o.e(dVar, 3, str);
        }
        dVar.l(c0765d.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        C0765d c0765d = (C0765d) obj;
        C0774b c0774b = c0765d.f6249h;
        String str = c0765d.f6251j;
        int g7 = f.f6252k.a().g(2, c0765d.f6250i) + (!Objects.equals(c0774b, null) ? C0774b.f6340k.g(1, c0765d.f6249h) : 0);
        if (!Objects.equals(str, "")) {
            g7 += i.f6318o.g(3, str);
        }
        return c0765d.a().a() + g7;
    }
}
