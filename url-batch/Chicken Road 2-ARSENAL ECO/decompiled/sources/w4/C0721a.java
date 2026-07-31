package w4;

import A3.d;
import V5.g;
import n6.f;
import y4.C0765d;
import z3.i;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721a extends i {
    @Override // z3.i
    public final Object b(g gVar) {
        f fVar;
        n6.i value = n6.i.f5525i;
        d dVar = new d();
        long h7 = gVar.h();
        while (true) {
            int f7 = ((z3.a) gVar.f2734g).f();
            if (f7 == -1) {
                break;
            }
            if (f7 != 1) {
                gVar.o(f7);
            } else {
                dVar.add((C0765d) C0765d.f6248k.b(gVar));
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
        return new C0722b(dVar, value);
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        C0722b c0722b = (C0722b) obj;
        C0765d.f6248k.a().e(dVar, 1, c0722b.f6197h);
        dVar.l(c0722b.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        C0722b c0722b = (C0722b) obj;
        return c0722b.a().a() + C0765d.f6248k.a().g(1, c0722b.f6197h);
    }
}
