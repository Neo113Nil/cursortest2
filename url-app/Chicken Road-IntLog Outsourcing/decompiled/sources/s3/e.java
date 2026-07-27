package s3;

import java.util.Objects;
import m2.AbstractC1286i;
import m2.C1278a;
import m2.C1280c;
import n2.C1342d;

/* loaded from: classes.dex */
public final class e extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(V0.j jVar) {
        j5.f fVar;
        j5.i value = j5.i.f10496d;
        C1342d c1342d = new C1342d();
        C1342d c1342d2 = new C1342d();
        long z = jVar.z();
        String str = "";
        String str2 = "";
        while (true) {
            int f3 = ((C1278a) jVar.f3212b).f();
            if (f3 == -1) {
                break;
            }
            C1280c c1280c = AbstractC1286i.f11172o;
            if (f3 == 1) {
                str = (String) c1280c.b(jVar);
            } else if (f3 == 2) {
                str2 = (String) c1280c.b(jVar);
            } else if (f3 == 3) {
                c1342d.add((String) c1280c.b(jVar));
            } else if (f3 != 4) {
                jVar.O(f3);
            } else {
                c1342d2.add((String) c1280c.b(jVar));
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
        return new f(str, str2, c1342d, c1342d2, value);
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e eVar, Object obj) {
        f fVar = (f) obj;
        boolean equals = Objects.equals(fVar.f11823c, "");
        C1280c c1280c = AbstractC1286i.f11172o;
        if (!equals) {
            c1280c.e(eVar, 1, fVar.f11823c);
        }
        String str = fVar.f11824d;
        if (!Objects.equals(str, "")) {
            c1280c.e(eVar, 2, str);
        }
        c1280c.a().e(eVar, 3, fVar.f11825e);
        c1280c.a().e(eVar, 4, fVar.f11826f);
        eVar.D(fVar.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        f fVar = (f) obj;
        boolean equals = Objects.equals(fVar.f11823c, "");
        C1280c c1280c = AbstractC1286i.f11172o;
        int g6 = !equals ? c1280c.g(1, fVar.f11823c) : 0;
        String str = fVar.f11824d;
        if (!Objects.equals(str, "")) {
            g6 += c1280c.g(2, str);
        }
        return fVar.a().a() + c1280c.a().g(4, fVar.f11826f) + c1280c.a().g(3, fVar.f11825e) + g6;
    }
}
