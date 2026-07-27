package t3;

import V0.j;
import j5.i;
import java.util.Objects;
import m2.AbstractC1286i;
import m2.C1278a;
import n2.C1342d;

/* loaded from: classes.dex */
public final class e extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(j jVar) {
        i value = i.f10496d;
        C1342d c1342d = new C1342d();
        long z = jVar.z();
        j5.f fVar = null;
        String str = "";
        s3.h hVar = null;
        while (true) {
            int f3 = ((C1278a) jVar.f3212b).f();
            if (f3 == -1) {
                break;
            }
            if (f3 == 1) {
                hVar = (s3.h) s3.h.f11827g.b(jVar);
            } else if (f3 == 2) {
                c1342d.add((C1427b) C1427b.f11922n.b(jVar));
            } else if (f3 != 3) {
                jVar.O(f3);
            } else {
                str = (String) AbstractC1286i.f11172o.b(jVar);
            }
        }
        i unknownFields = jVar.D(z);
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            fVar = new j5.f();
            kotlin.jvm.internal.i.e(value, "value");
            fVar.G(value);
            value = i.f10496d;
            fVar.G(unknownFields);
        }
        if (fVar != null) {
            value = fVar.o(fVar.f10495b);
        }
        return new f(hVar, c1342d, str, value);
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e eVar, Object obj) {
        f fVar = (f) obj;
        if (!Objects.equals(fVar.f11939c, null)) {
            s3.h.f11827g.e(eVar, 1, fVar.f11939c);
        }
        C1427b.f11922n.a().e(eVar, 2, fVar.f11940d);
        String str = fVar.f11941e;
        if (!Objects.equals(str, "")) {
            AbstractC1286i.f11172o.e(eVar, 3, str);
        }
        eVar.D(fVar.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        f fVar = (f) obj;
        int g6 = C1427b.f11922n.a().g(2, fVar.f11940d) + (!Objects.equals(fVar.f11939c, null) ? s3.h.f11827g.g(1, fVar.f11939c) : 0);
        String str = fVar.f11941e;
        if (!Objects.equals(str, "")) {
            g6 += AbstractC1286i.f11172o.g(3, str);
        }
        return fVar.a().a() + g6;
    }
}
