package D6;

import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends Y5.i {
    @Override // Y5.i
    public final Object b(I0.j jVar) {
        u8.e eVar;
        u8.h value = u8.h.f41278w;
        Z5.d dVar = new Z5.d();
        Z5.d dVar2 = new Z5.d();
        long a9 = jVar.a();
        String str = "";
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
                dVar.add((String) cVar.b(jVar));
            } else if (f6 != 4) {
                jVar.w(f6);
            } else {
                dVar2.add((String) cVar.b(jVar));
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
        return new f(str, str2, dVar, dVar2, value);
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        f fVar = (f) obj;
        boolean equals = Objects.equals(fVar.f716v, "");
        Y5.c cVar = Y5.i.f4003o;
        if (!equals) {
            cVar.e(c4523c, 1, fVar.f716v);
        }
        String str = fVar.f717w;
        if (!Objects.equals(str, "")) {
            cVar.e(c4523c, 2, str);
        }
        cVar.a().e(c4523c, 3, fVar.f718x);
        cVar.a().e(c4523c, 4, fVar.f719y);
        c4523c.C(fVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        f fVar = (f) obj;
        boolean equals = Objects.equals(fVar.f716v, "");
        Y5.c cVar = Y5.i.f4003o;
        int g9 = !equals ? cVar.g(1, fVar.f716v) : 0;
        String str = fVar.f717w;
        if (!Objects.equals(str, "")) {
            g9 += cVar.g(2, str);
        }
        return fVar.a().a() + cVar.a().g(4, fVar.f719y) + cVar.a().g(3, fVar.f718x) + g9;
    }
}
