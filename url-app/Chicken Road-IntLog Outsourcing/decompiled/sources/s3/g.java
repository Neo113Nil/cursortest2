package s3;

import java.util.Objects;
import m2.AbstractC1286i;
import m2.C1278a;
import m2.C1280c;
import n2.C1342d;

/* loaded from: classes.dex */
public final class g extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(V0.j jVar) {
        j5.f fVar;
        j5.i value = j5.i.f10496d;
        C1342d c1342d = new C1342d();
        long z = jVar.z();
        String str = "";
        int i2 = 0;
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
                c1342d.add((j) j.f11832e.b(jVar));
            } else if (f3 != 4) {
                jVar.O(f3);
            } else {
                i2 = ((Integer) AbstractC1286i.f11165h.b(jVar)).intValue();
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
        return new h(str, str2, c1342d, i2, value);
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e eVar, Object obj) {
        h hVar = (h) obj;
        boolean equals = Objects.equals(hVar.f11828c, "");
        C1280c c1280c = AbstractC1286i.f11172o;
        if (!equals) {
            c1280c.e(eVar, 1, hVar.f11828c);
        }
        String str = hVar.f11829d;
        if (!Objects.equals(str, "")) {
            c1280c.e(eVar, 2, str);
        }
        j.f11832e.a().e(eVar, 3, hVar.f11830e);
        int i2 = hVar.f11831f;
        if (!Integer.valueOf(i2).equals(0)) {
            AbstractC1286i.f11165h.e(eVar, 4, Integer.valueOf(i2));
        }
        eVar.D(hVar.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        h hVar = (h) obj;
        boolean equals = Objects.equals(hVar.f11828c, "");
        C1280c c1280c = AbstractC1286i.f11172o;
        int g6 = !equals ? c1280c.g(1, hVar.f11828c) : 0;
        String str = hVar.f11829d;
        if (!Objects.equals(str, "")) {
            g6 += c1280c.g(2, str);
        }
        int g7 = j.f11832e.a().g(3, hVar.f11830e) + g6;
        int i2 = hVar.f11831f;
        if (!Integer.valueOf(i2).equals(0)) {
            g7 += AbstractC1286i.f11165h.g(4, Integer.valueOf(i2));
        }
        return hVar.a().a() + g7;
    }
}
