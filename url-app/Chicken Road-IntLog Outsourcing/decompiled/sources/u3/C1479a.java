package u3;

import U.e;
import V0.j;
import j5.f;
import j5.i;
import m2.AbstractC1286i;
import m2.C1278a;
import n2.C1342d;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479a extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(j jVar) {
        f fVar;
        i value = i.f10496d;
        C1342d c1342d = new C1342d();
        C1342d c1342d2 = new C1342d();
        long z = jVar.z();
        int i2 = 0;
        while (true) {
            int f3 = ((C1278a) jVar.f3212b).f();
            if (f3 == -1) {
                break;
            }
            if (f3 == 1) {
                c1342d.add((s3.j) s3.j.f11832e.b(jVar));
            } else if (f3 == 2) {
                i2 = ((Integer) AbstractC1286i.f11165h.b(jVar)).intValue();
            } else if (f3 != 3) {
                jVar.O(f3);
            } else {
                c1342d2.add((s3.f) s3.f.f11822g.b(jVar));
            }
        }
        i unknownFields = jVar.D(z);
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            fVar = new f();
            kotlin.jvm.internal.i.e(value, "value");
            fVar.G(value);
            value = i.f10496d;
            fVar.G(unknownFields);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            value = fVar.o(fVar.f10495b);
        }
        return new C1480b(c1342d, i2, c1342d2, value);
    }

    @Override // m2.AbstractC1286i
    public final void d(e eVar, Object obj) {
        C1480b c1480b = (C1480b) obj;
        s3.j.f11832e.a().e(eVar, 1, c1480b.f12051c);
        int i2 = c1480b.f12052d;
        if (!Integer.valueOf(i2).equals(0)) {
            AbstractC1286i.f11165h.e(eVar, 2, Integer.valueOf(i2));
        }
        s3.f.f11822g.a().e(eVar, 3, c1480b.f12053e);
        eVar.D(c1480b.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        C1480b c1480b = (C1480b) obj;
        int g6 = s3.j.f11832e.a().g(1, c1480b.f12051c);
        int i2 = c1480b.f12052d;
        if (!Integer.valueOf(i2).equals(0)) {
            g6 += AbstractC1286i.f11165h.g(2, Integer.valueOf(i2));
        }
        return c1480b.a().a() + s3.f.f11822g.a().g(3, c1480b.f12053e) + g6;
    }
}
