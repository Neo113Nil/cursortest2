package E6;

import I0.j;
import Y5.i;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a extends i {
    @Override // Y5.i
    public final Object b(j jVar) {
        u8.e eVar;
        C4523c c4523c;
        C4523c c4523c2;
        u8.e eVar2;
        u8.h hVar = u8.h.f41278w;
        h hVar2 = h.SEVERITY_NUMBER_UNSPECIFIED;
        Z5.d dVar = new Z5.d();
        long a9 = jVar.a();
        C4523c c4523c3 = null;
        u8.h hVar3 = hVar;
        u8.h hVar4 = hVar3;
        D6.b bVar = null;
        long j9 = 0;
        long j10 = 0;
        String str = "";
        int i = 0;
        int i4 = 0;
        h hVar5 = hVar2;
        u8.e eVar3 = null;
        String str2 = str;
        u8.h hVar6 = hVar4;
        while (true) {
            C4523c c4523c4 = c4523c3;
            int f6 = ((Y5.a) jVar.f1233u).f();
            if (f6 == -1) {
                u8.e eVar4 = eVar3;
                String str3 = str;
                u8.h unknownFields = jVar.l(a9);
                kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
                if (unknownFields.a() > 0) {
                    if (eVar4 == null) {
                        eVar = new u8.e();
                        c4523c = new C4523c(eVar);
                        c4523c.C(hVar6);
                        hVar6 = u8.h.f41278w;
                    } else {
                        c4523c = c4523c4;
                        eVar = eVar4;
                    }
                    kotlin.jvm.internal.h.b(c4523c);
                    c4523c.C(unknownFields);
                } else {
                    eVar = eVar4;
                }
                if (eVar != null) {
                    hVar6 = eVar.B(eVar.f41277u);
                }
                return new b(j9, j10, hVar5, str2, bVar, dVar, i, i4, hVar3, hVar4, str3, hVar6);
            }
            Y5.c cVar = i.f4002n;
            u8.e eVar5 = eVar3;
            Y5.c cVar2 = i.f4000l;
            String str4 = str;
            Y5.c cVar3 = i.f4003o;
            switch (f6) {
                case 1:
                    j9 = ((Long) cVar2.b(jVar)).longValue();
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 2:
                    try {
                        hVar5 = (h) h.f884T.b(jVar);
                        c4523c3 = c4523c4;
                    } catch (Y5.h e6) {
                        Y5.d dVar2 = Y5.d.f3983u;
                        Long valueOf = Long.valueOf(e6.f3994n);
                        if (eVar5 == null) {
                            eVar2 = new u8.e();
                            c4523c2 = new C4523c(eVar2);
                            c4523c2.C(hVar6);
                            hVar6 = u8.h.f41278w;
                        } else {
                            c4523c2 = c4523c4;
                            eVar2 = eVar5;
                        }
                        u8.h hVar7 = hVar6;
                        i a10 = dVar2.a();
                        eVar5 = eVar2;
                        kotlin.jvm.internal.h.c(a10, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                        kotlin.jvm.internal.h.b(c4523c2);
                        a10.e(c4523c2, f6, valueOf);
                        c4523c3 = c4523c2;
                        hVar6 = hVar7;
                    }
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 3:
                    str2 = (String) cVar3.b(jVar);
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 4:
                default:
                    jVar.w(f6);
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 5:
                    bVar = (D6.b) D6.b.f705C.b(jVar);
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 6:
                    dVar.add((D6.j) D6.j.f725x.b(jVar));
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 7:
                    i = ((Integer) i.f3997h.b(jVar)).intValue();
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 8:
                    i4 = ((Integer) i.i.b(jVar)).intValue();
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 9:
                    hVar3 = (u8.h) cVar.b(jVar);
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 10:
                    hVar4 = (u8.h) cVar.b(jVar);
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 11:
                    j10 = ((Long) cVar2.b(jVar)).longValue();
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    str = str4;
                    break;
                case 12:
                    str = (String) cVar3.b(jVar);
                    c4523c3 = c4523c4;
                    eVar3 = eVar5;
                    break;
            }
        }
    }

    @Override // Y5.i
    public final void d(C4523c c4523c, Object obj) {
        b bVar = (b) obj;
        boolean equals = Long.valueOf(bVar.f853v).equals(0L);
        Y5.c cVar = i.f4000l;
        if (!equals) {
            cVar.e(c4523c, 1, Long.valueOf(bVar.f853v));
        }
        long j9 = bVar.f854w;
        if (!Long.valueOf(j9).equals(0L)) {
            cVar.e(c4523c, 11, Long.valueOf(j9));
        }
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        h hVar2 = bVar.f855x;
        if (!Objects.equals(hVar2, hVar)) {
            h.f884T.e(c4523c, 2, hVar2);
        }
        String str = bVar.f856y;
        boolean equals2 = Objects.equals(str, "");
        Y5.c cVar2 = i.f4003o;
        if (!equals2) {
            cVar2.e(c4523c, 3, str);
        }
        D6.b bVar2 = bVar.f857z;
        if (!Objects.equals(bVar2, null)) {
            D6.b.f705C.e(c4523c, 5, bVar2);
        }
        D6.j.f725x.a().e(c4523c, 6, bVar.f847A);
        int i = bVar.f848B;
        if (!Integer.valueOf(i).equals(0)) {
            i.f3997h.e(c4523c, 7, Integer.valueOf(i));
        }
        int i4 = bVar.f849C;
        if (!Integer.valueOf(i4).equals(0)) {
            i.i.e(c4523c, 8, Integer.valueOf(i4));
        }
        u8.h hVar3 = u8.h.f41278w;
        u8.h hVar4 = bVar.f850D;
        boolean equals3 = Objects.equals(hVar4, hVar3);
        Y5.c cVar3 = i.f4002n;
        if (!equals3) {
            cVar3.e(c4523c, 9, hVar4);
        }
        u8.h hVar5 = bVar.f851E;
        if (!Objects.equals(hVar5, hVar3)) {
            cVar3.e(c4523c, 10, hVar5);
        }
        String str2 = bVar.f852F;
        if (!Objects.equals(str2, "")) {
            cVar2.e(c4523c, 12, str2);
        }
        c4523c.C(bVar.a());
    }

    @Override // Y5.i
    public final int f(Object obj) {
        b bVar = (b) obj;
        boolean equals = Long.valueOf(bVar.f853v).equals(0L);
        Y5.c cVar = i.f4000l;
        int g9 = equals ? 0 : cVar.g(1, Long.valueOf(bVar.f853v));
        long j9 = bVar.f854w;
        if (!Long.valueOf(j9).equals(0L)) {
            g9 += cVar.g(11, Long.valueOf(j9));
        }
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        h hVar2 = bVar.f855x;
        if (!Objects.equals(hVar2, hVar)) {
            g9 += h.f884T.g(2, hVar2);
        }
        String str = bVar.f856y;
        boolean equals2 = Objects.equals(str, "");
        Y5.c cVar2 = i.f4003o;
        if (!equals2) {
            g9 += cVar2.g(3, str);
        }
        D6.b bVar2 = bVar.f857z;
        if (!Objects.equals(bVar2, null)) {
            g9 += D6.b.f705C.g(5, bVar2);
        }
        int g10 = D6.j.f725x.a().g(6, bVar.f847A) + g9;
        int i = bVar.f848B;
        if (!Integer.valueOf(i).equals(0)) {
            g10 += i.f3997h.g(7, Integer.valueOf(i));
        }
        int i4 = bVar.f849C;
        if (!Integer.valueOf(i4).equals(0)) {
            g10 += i.i.g(8, Integer.valueOf(i4));
        }
        u8.h hVar3 = u8.h.f41278w;
        u8.h hVar4 = bVar.f850D;
        boolean equals3 = Objects.equals(hVar4, hVar3);
        Y5.c cVar3 = i.f4002n;
        if (!equals3) {
            g10 += cVar3.g(9, hVar4);
        }
        u8.h hVar5 = bVar.f851E;
        if (!Objects.equals(hVar5, hVar3)) {
            g10 += cVar3.g(10, hVar5);
        }
        String str2 = bVar.f852F;
        if (!Objects.equals(str2, "")) {
            g10 += cVar2.g(12, str2);
        }
        return bVar.a().a() + g10;
    }
}
