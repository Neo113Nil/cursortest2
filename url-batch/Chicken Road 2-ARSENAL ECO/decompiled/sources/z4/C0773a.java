package z4;

import A3.d;
import V5.g;
import n6.f;
import x4.j;
import z3.i;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773a extends i {
    @Override // z3.i
    public final Object b(g gVar) {
        f fVar;
        n6.i value = n6.i.f5525i;
        d dVar = new d();
        d dVar2 = new d();
        long h7 = gVar.h();
        int i7 = 0;
        while (true) {
            int f7 = ((z3.a) gVar.f2734g).f();
            if (f7 == -1) {
                break;
            }
            if (f7 == 1) {
                dVar.add((j) j.f6218j.b(gVar));
            } else if (f7 == 2) {
                i7 = ((Integer) i.f6311h.b(gVar)).intValue();
            } else if (f7 != 3) {
                gVar.o(f7);
            } else {
                dVar2.add((x4.f) x4.f.f6208l.b(gVar));
            }
        }
        n6.i unknownFields = gVar.i(h7);
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            fVar = new f();
            kotlin.jvm.internal.i.e(value, "value");
            fVar.G(value);
            value = n6.i.f5525i;
            fVar.G(unknownFields);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            value = fVar.f(fVar.f5524g);
        }
        return new C0774b(dVar, i7, dVar2, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        C0774b c0774b = (C0774b) obj;
        j.f6218j.a().e(dVar, 1, c0774b.f6341h);
        int i7 = c0774b.f6342i;
        if (!Integer.valueOf(i7).equals(0)) {
            i.f6311h.e(dVar, 2, Integer.valueOf(i7));
        }
        x4.f.f6208l.a().e(dVar, 3, c0774b.f6343j);
        dVar.l(c0774b.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        C0774b c0774b = (C0774b) obj;
        int g7 = j.f6218j.a().g(1, c0774b.f6341h);
        int i7 = c0774b.f6342i;
        if (!Integer.valueOf(i7).equals(0)) {
            g7 += i.f6311h.g(2, Integer.valueOf(i7));
        }
        return c0774b.a().a() + x4.f.f6208l.a().g(3, c0774b.f6343j) + g7;
    }
}
