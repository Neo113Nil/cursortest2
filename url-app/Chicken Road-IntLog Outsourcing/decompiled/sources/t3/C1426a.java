package t3;

import V0.j;
import j5.i;
import java.util.Objects;
import m2.AbstractC1286i;
import m2.C1278a;
import m2.C1280c;
import m2.C1285h;
import m2.EnumC1281d;
import n2.C1342d;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426a extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(j jVar) {
        U.e eVar;
        C1342d c1342d;
        h hVar;
        U.e eVar2;
        i iVar = i.f10496d;
        h hVar2 = h.SEVERITY_NUMBER_UNSPECIFIED;
        C1342d c1342d2 = new C1342d();
        long z = jVar.z();
        U.e eVar3 = null;
        long j2 = 0;
        i iVar2 = iVar;
        i iVar3 = iVar2;
        h hVar3 = hVar2;
        s3.b bVar = null;
        String str = "";
        String str2 = str;
        int i2 = 0;
        int i3 = 0;
        i iVar4 = iVar3;
        j5.f fVar = null;
        long j6 = 0;
        while (true) {
            U.e eVar4 = eVar3;
            int f3 = ((C1278a) jVar.f3212b).f();
            if (f3 == -1) {
                C1342d c1342d3 = c1342d2;
                h hVar4 = hVar3;
                s3.b bVar2 = bVar;
                int i6 = i2;
                i unknownFields = jVar.D(z);
                kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
                if (unknownFields.a() > 0) {
                    if (fVar == null) {
                        fVar = new j5.f();
                        eVar = new U.e((j5.g) fVar);
                        eVar.D(iVar4);
                        iVar4 = i.f10496d;
                    } else {
                        eVar = eVar4;
                    }
                    kotlin.jvm.internal.i.b(eVar);
                    eVar.D(unknownFields);
                }
                return new C1427b(j2, j6, hVar4, str, bVar2, c1342d3, i6, i3, iVar2, iVar3, str2, fVar != null ? fVar.o(fVar.f10495b) : iVar4);
            }
            C1280c c1280c = AbstractC1286i.f11171n;
            int i7 = i2;
            C1280c c1280c2 = AbstractC1286i.f11169l;
            s3.b bVar3 = bVar;
            C1280c c1280c3 = AbstractC1286i.f11172o;
            switch (f3) {
                case 1:
                    c1342d = c1342d2;
                    hVar = hVar3;
                    j2 = ((Long) c1280c2.b(jVar)).longValue();
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    c1342d2 = c1342d;
                    hVar3 = hVar;
                    break;
                case 2:
                    try {
                        hVar3 = (h) h.f11942A.b(jVar);
                        eVar3 = eVar4;
                        i2 = i7;
                        bVar = bVar3;
                        break;
                    } catch (C1285h e3) {
                        EnumC1281d enumC1281d = EnumC1281d.f11151b;
                        c1342d = c1342d2;
                        hVar = hVar3;
                        Long valueOf = Long.valueOf(e3.f11162a);
                        if (fVar == null) {
                            fVar = new j5.f();
                            eVar2 = new U.e((j5.g) fVar);
                            eVar2.D(iVar4);
                            iVar4 = i.f10496d;
                        } else {
                            eVar2 = eVar4;
                        }
                        AbstractC1286i a6 = enumC1281d.a();
                        kotlin.jvm.internal.i.c(a6, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                        kotlin.jvm.internal.i.b(eVar2);
                        a6.e(eVar2, f3, valueOf);
                        eVar3 = eVar2;
                        break;
                    }
                case 3:
                    str = (String) c1280c3.b(jVar);
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    break;
                case 4:
                default:
                    jVar.O(f3);
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    break;
                case 5:
                    bVar = (s3.b) s3.b.f11812j.b(jVar);
                    eVar3 = eVar4;
                    i2 = i7;
                    break;
                case 6:
                    c1342d2.add((s3.j) s3.j.f11832e.b(jVar));
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    break;
                case 7:
                    i2 = ((Integer) AbstractC1286i.f11165h.b(jVar)).intValue();
                    eVar3 = eVar4;
                    bVar = bVar3;
                    break;
                case 8:
                    i3 = ((Integer) AbstractC1286i.f11166i.b(jVar)).intValue();
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    break;
                case 9:
                    iVar2 = (i) c1280c.b(jVar);
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    break;
                case 10:
                    iVar3 = (i) c1280c.b(jVar);
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    break;
                case 11:
                    j6 = ((Long) c1280c2.b(jVar)).longValue();
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    break;
                case 12:
                    str2 = (String) c1280c3.b(jVar);
                    eVar3 = eVar4;
                    i2 = i7;
                    bVar = bVar3;
                    break;
            }
        }
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e eVar, Object obj) {
        C1427b c1427b = (C1427b) obj;
        boolean equals = Long.valueOf(c1427b.f11923c).equals(0L);
        C1280c c1280c = AbstractC1286i.f11169l;
        if (!equals) {
            c1280c.e(eVar, 1, Long.valueOf(c1427b.f11923c));
        }
        long j2 = c1427b.f11924d;
        if (!Long.valueOf(j2).equals(0L)) {
            c1280c.e(eVar, 11, Long.valueOf(j2));
        }
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        h hVar2 = c1427b.f11925e;
        if (!Objects.equals(hVar2, hVar)) {
            h.f11942A.e(eVar, 2, hVar2);
        }
        String str = c1427b.f11926f;
        boolean equals2 = Objects.equals(str, "");
        C1280c c1280c2 = AbstractC1286i.f11172o;
        if (!equals2) {
            c1280c2.e(eVar, 3, str);
        }
        s3.b bVar = c1427b.f11927g;
        if (!Objects.equals(bVar, null)) {
            s3.b.f11812j.e(eVar, 5, bVar);
        }
        s3.j.f11832e.a().e(eVar, 6, c1427b.f11928h);
        int i2 = c1427b.f11929i;
        if (!Integer.valueOf(i2).equals(0)) {
            AbstractC1286i.f11165h.e(eVar, 7, Integer.valueOf(i2));
        }
        int i3 = c1427b.f11930j;
        if (!Integer.valueOf(i3).equals(0)) {
            AbstractC1286i.f11166i.e(eVar, 8, Integer.valueOf(i3));
        }
        i iVar = i.f10496d;
        i iVar2 = c1427b.f11931k;
        boolean equals3 = Objects.equals(iVar2, iVar);
        C1280c c1280c3 = AbstractC1286i.f11171n;
        if (!equals3) {
            c1280c3.e(eVar, 9, iVar2);
        }
        i iVar3 = c1427b.f11932l;
        if (!Objects.equals(iVar3, iVar)) {
            c1280c3.e(eVar, 10, iVar3);
        }
        String str2 = c1427b.f11933m;
        if (!Objects.equals(str2, "")) {
            c1280c2.e(eVar, 12, str2);
        }
        eVar.D(c1427b.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        C1427b c1427b = (C1427b) obj;
        boolean equals = Long.valueOf(c1427b.f11923c).equals(0L);
        C1280c c1280c = AbstractC1286i.f11169l;
        int g6 = equals ? 0 : c1280c.g(1, Long.valueOf(c1427b.f11923c));
        long j2 = c1427b.f11924d;
        if (!Long.valueOf(j2).equals(0L)) {
            g6 += c1280c.g(11, Long.valueOf(j2));
        }
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        h hVar2 = c1427b.f11925e;
        if (!Objects.equals(hVar2, hVar)) {
            g6 += h.f11942A.g(2, hVar2);
        }
        String str = c1427b.f11926f;
        boolean equals2 = Objects.equals(str, "");
        C1280c c1280c2 = AbstractC1286i.f11172o;
        if (!equals2) {
            g6 += c1280c2.g(3, str);
        }
        s3.b bVar = c1427b.f11927g;
        if (!Objects.equals(bVar, null)) {
            g6 += s3.b.f11812j.g(5, bVar);
        }
        int g7 = s3.j.f11832e.a().g(6, c1427b.f11928h) + g6;
        int i2 = c1427b.f11929i;
        if (!Integer.valueOf(i2).equals(0)) {
            g7 += AbstractC1286i.f11165h.g(7, Integer.valueOf(i2));
        }
        int i3 = c1427b.f11930j;
        if (!Integer.valueOf(i3).equals(0)) {
            g7 += AbstractC1286i.f11166i.g(8, Integer.valueOf(i3));
        }
        i iVar = i.f10496d;
        i iVar2 = c1427b.f11931k;
        boolean equals3 = Objects.equals(iVar2, iVar);
        C1280c c1280c3 = AbstractC1286i.f11171n;
        if (!equals3) {
            g7 += c1280c3.g(9, iVar2);
        }
        i iVar3 = c1427b.f11932l;
        if (!Objects.equals(iVar3, iVar)) {
            g7 += c1280c3.g(10, iVar3);
        }
        String str2 = c1427b.f11933m;
        if (!Objects.equals(str2, "")) {
            g7 += c1280c2.g(12, str2);
        }
        return c1427b.a().a() + g7;
    }
}
