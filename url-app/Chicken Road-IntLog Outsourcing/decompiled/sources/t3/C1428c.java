package t3;

import V0.j;
import j5.i;
import java.util.Objects;
import m2.AbstractC1286i;
import m2.C1278a;
import n2.C1342d;
import u3.C1480b;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428c extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(j jVar) {
        i value = i.f10496d;
        C1342d c1342d = new C1342d();
        long z = jVar.z();
        j5.f fVar = null;
        String str = "";
        C1480b c1480b = null;
        while (true) {
            int f3 = ((C1278a) jVar.f3212b).f();
            if (f3 == -1) {
                break;
            }
            if (f3 == 1) {
                c1480b = (C1480b) C1480b.f12050f.b(jVar);
            } else if (f3 == 2) {
                c1342d.add((f) f.f11938f.b(jVar));
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
        return new C1429d(c1480b, c1342d, str, value);
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e eVar, Object obj) {
        C1429d c1429d = (C1429d) obj;
        if (!Objects.equals(c1429d.f11935c, null)) {
            C1480b.f12050f.e(eVar, 1, c1429d.f11935c);
        }
        f.f11938f.a().e(eVar, 2, c1429d.f11936d);
        String str = c1429d.f11937e;
        if (!Objects.equals(str, "")) {
            AbstractC1286i.f11172o.e(eVar, 3, str);
        }
        eVar.D(c1429d.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        C1429d c1429d = (C1429d) obj;
        int g6 = f.f11938f.a().g(2, c1429d.f11936d) + (!Objects.equals(c1429d.f11935c, null) ? C1480b.f12050f.g(1, c1429d.f11935c) : 0);
        String str = c1429d.f11937e;
        if (!Objects.equals(str, "")) {
            g6 += AbstractC1286i.f11172o.g(3, str);
        }
        return c1429d.a().a() + g6;
    }
}
