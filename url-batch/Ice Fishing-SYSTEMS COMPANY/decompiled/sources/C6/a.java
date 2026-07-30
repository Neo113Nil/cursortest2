package C6;

import I0.j;
import Y5.i;
import Z5.d;
import g1.C4523c;
import u8.e;
import u8.h;

/* loaded from: classes2.dex */
public final class a extends i {
    @Override // Y5.i
    public final Object b(j jVar) {
        e eVar;
        h value = h.f41278w;
        d dVar = new d();
        long a9 = jVar.a();
        while (true) {
            int f6 = ((Y5.a) jVar.f1233u).f();
            if (f6 == -1) {
                break;
            }
            if (f6 != 1) {
                jVar.w(f6);
            } else {
                dVar.add((E6.d) E6.d.f858y.b(jVar));
            }
        }
        h unknownFields = jVar.l(a9);
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            eVar = new e();
            kotlin.jvm.internal.h.e(value, "value");
            eVar.K(value);
            value = h.f41278w;
            eVar.K(unknownFields);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            value = eVar.B(eVar.f41277u);
        }
        return new b(dVar, value);
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        b bVar = (b) obj;
        E6.d.f858y.a().e(c4523c, 1, bVar.f489v);
        c4523c.C(bVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        return bVar.a().a() + E6.d.f858y.a().g(1, bVar.f489v);
    }
}
