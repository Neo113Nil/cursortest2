package D6;

import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g extends Y5.i {
    @Override // Y5.i
    public final Object b(I0.j jVar) {
        u8.e eVar;
        u8.h value = u8.h.f41278w;
        Z5.d dVar = new Z5.d();
        long a9 = jVar.a();
        String str = "";
        int i = 0;
        String str2 = "";
        while (true) {
            int f6 = ((Y5.a) jVar.f1233u).f();
            if (f6 == -1) {
                break;
            }
            Y5.c cVar = Y5.i.f4003o;
            if (f6 == 1) {
                str = (String) cVar.b(jVar);
            } else if (f6 == 2) {
                str2 = (String) cVar.b(jVar);
            } else if (f6 == 3) {
                dVar.add((j) j.f725x.b(jVar));
            } else if (f6 != 4) {
                jVar.w(f6);
            } else {
                i = ((Integer) Y5.i.f3997h.b(jVar)).intValue();
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
        } else {
            eVar = null;
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41277u);
        }
        return new h(str, str2, dVar, i, value);
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        h hVar = (h) obj;
        boolean equals = Objects.equals(hVar.f721v, "");
        Y5.c cVar = Y5.i.f4003o;
        if (!equals) {
            cVar.e(c4523c, 1, hVar.f721v);
        }
        String str = hVar.f722w;
        if (!Objects.equals(str, "")) {
            cVar.e(c4523c, 2, str);
        }
        j.f725x.a().e(c4523c, 3, hVar.f723x);
        int i = hVar.f724y;
        if (!Integer.valueOf(i).equals(0)) {
            Y5.i.f3997h.e(c4523c, 4, Integer.valueOf(i));
        }
        c4523c.C(hVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        h hVar = (h) obj;
        boolean equals = Objects.equals(hVar.f721v, "");
        Y5.c cVar = Y5.i.f4003o;
        int g9 = !equals ? cVar.g(1, hVar.f721v) : 0;
        String str = hVar.f722w;
        if (!Objects.equals(str, "")) {
            g9 += cVar.g(2, str);
        }
        int g10 = j.f725x.a().g(3, hVar.f723x) + g9;
        int i = hVar.f724y;
        if (!Integer.valueOf(i).equals(0)) {
            g10 += Y5.i.f3997h.g(4, Integer.valueOf(i));
        }
        return hVar.a().a() + g10;
    }
}
