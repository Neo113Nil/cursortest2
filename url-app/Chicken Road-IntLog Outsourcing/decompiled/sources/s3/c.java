package s3;

import m2.AbstractC1286i;
import m2.C1278a;
import n2.C1342d;

/* loaded from: classes.dex */
public final class c extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(V0.j jVar) {
        j5.f fVar;
        j5.i value = j5.i.f10496d;
        C1342d c1342d = new C1342d();
        long z = jVar.z();
        while (true) {
            int f3 = ((C1278a) jVar.f3212b).f();
            if (f3 == -1) {
                break;
            }
            if (f3 != 1) {
                jVar.O(f3);
            } else {
                c1342d.add((b) b.f11812j.b(jVar));
            }
        }
        j5.i unknownFields = jVar.D(z);
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            fVar = new j5.f();
            kotlin.jvm.internal.i.e(value, "value");
            fVar.G(value);
            value = j5.i.f10496d;
            fVar.G(unknownFields);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            value = fVar.o(fVar.f10495b);
        }
        return new d(c1342d, value);
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e eVar, Object obj) {
        d dVar = (d) obj;
        b.f11812j.a().e(eVar, 1, dVar.f11821c);
        eVar.D(dVar.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        d dVar = (d) obj;
        return dVar.a().a() + b.f11812j.a().g(1, dVar.f11821c);
    }
}
