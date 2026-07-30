package F6;

import D6.f;
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
        d dVar2 = new d();
        long a9 = jVar.a();
        int i = 0;
        while (true) {
            int f6 = ((Y5.a) jVar.f1233u).f();
            if (f6 == -1) {
                break;
            }
            if (f6 == 1) {
                dVar.add((D6.j) D6.j.f725x.b(jVar));
            } else if (f6 == 2) {
                i = ((Integer) i.f3997h.b(jVar)).intValue();
            } else if (f6 != 3) {
                jVar.w(f6);
            } else {
                dVar2.add((f) f.f715z.b(jVar));
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
        return new b(dVar, i, dVar2, value);
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        b bVar = (b) obj;
        D6.j.f725x.a().e(c4523c, 1, bVar.f1138v);
        int i = bVar.f1139w;
        if (!Integer.valueOf(i).equals(0)) {
            i.f3997h.e(c4523c, 2, Integer.valueOf(i));
        }
        f.f715z.a().e(c4523c, 3, bVar.f1140x);
        c4523c.C(bVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        int g9 = D6.j.f725x.a().g(1, bVar.f1138v);
        int i = bVar.f1139w;
        if (!Integer.valueOf(i).equals(0)) {
            g9 += i.f3997h.g(2, Integer.valueOf(i));
        }
        return bVar.a().a() + f.f715z.a().g(3, bVar.f1140x) + g9;
    }
}
