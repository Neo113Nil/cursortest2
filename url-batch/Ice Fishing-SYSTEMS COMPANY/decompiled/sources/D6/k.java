package D6;

import g1.C4523c;

/* loaded from: classes2.dex */
public final class k extends Y5.i {
    @Override // Y5.i
    public final Object b(I0.j jVar) {
        u8.e eVar;
        u8.h value = u8.h.f41278w;
        Z5.d dVar = new Z5.d();
        long a9 = jVar.a();
        while (true) {
            int f6 = ((Y5.a) jVar.f1233u).f();
            if (f6 == -1) {
                break;
            }
            if (f6 != 1) {
                jVar.w(f6);
            } else {
                dVar.add((j) j.f725x.b(jVar));
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
        return new l(dVar, value);
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        l lVar = (l) obj;
        j.f725x.a().e(c4523c, 1, lVar.f729v);
        c4523c.C(lVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        l lVar = (l) obj;
        return lVar.a().a() + j.f725x.a().g(1, lVar.f729v);
    }
}
