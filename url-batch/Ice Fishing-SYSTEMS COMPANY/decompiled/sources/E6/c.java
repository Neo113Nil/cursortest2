package E6;

import I0.j;
import Y5.i;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c extends i {
    @Override // Y5.i
    public final Object b(j jVar) {
        u8.h value = u8.h.f41278w;
        Z5.d dVar = new Z5.d();
        long a9 = jVar.a();
        u8.e eVar = null;
        String str = "";
        F6.b bVar = null;
        while (true) {
            int f6 = ((Y5.a) jVar.f1233u).f();
            if (f6 == -1) {
                break;
            }
            if (f6 == 1) {
                bVar = (F6.b) F6.b.f1137y.b(jVar);
            } else if (f6 == 2) {
                dVar.add((f) f.f862y.b(jVar));
            } else if (f6 != 3) {
                jVar.w(f6);
            } else {
                str = (String) i.f4003o.b(jVar);
            }
        }
        u8.h unknownFields = jVar.l(a9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new u8.e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = u8.h.f41278w;
            eVar.K(unknownFields);
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41277u);
        }
        return new d(bVar, dVar, str, value);
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        d dVar = (d) obj;
        if (!Objects.equals(dVar.f859v, null)) {
            F6.b.f1137y.e(c4523c, 1, dVar.f859v);
        }
        f.f862y.a().e(c4523c, 2, dVar.f860w);
        String str = dVar.f861x;
        if (!Objects.equals(str, "")) {
            i.f4003o.e(c4523c, 3, str);
        }
        c4523c.C(dVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        d dVar = (d) obj;
        int g9 = f.f862y.a().g(2, dVar.f860w) + (!Objects.equals(dVar.f859v, null) ? F6.b.f1137y.g(1, dVar.f859v) : 0);
        String str = dVar.f861x;
        if (!Objects.equals(str, "")) {
            g9 += i.f4003o.g(3, str);
        }
        return dVar.a().a() + g9;
    }
}
