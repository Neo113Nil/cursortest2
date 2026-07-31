package y4;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Objects;
import x4.j;
import z3.i;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762a extends i {
    @Override // z3.i
    public final Object b(V5.g gVar) {
        n6.f fVar;
        a6.d dVar;
        a6.d dVar2;
        n6.f fVar2;
        n6.i iVar = n6.i.f5525i;
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        A3.d dVar3 = new A3.d();
        long h7 = gVar.h();
        a6.d dVar4 = null;
        n6.i iVar2 = iVar;
        n6.i iVar3 = iVar2;
        x4.b bVar = null;
        long j4 = 0;
        long j7 = 0;
        String str = "";
        int i7 = 0;
        int i8 = 0;
        h hVar2 = hVar;
        n6.f fVar3 = null;
        String str2 = str;
        n6.i iVar4 = iVar3;
        while (true) {
            a6.d dVar5 = dVar4;
            int f7 = ((z3.a) gVar.f2734g).f();
            if (f7 == -1) {
                n6.f fVar4 = fVar3;
                String str3 = str;
                n6.i unknownFields = gVar.i(h7);
                kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
                if (unknownFields.a() > 0) {
                    if (fVar4 == null) {
                        fVar = new n6.f();
                        dVar = new a6.d((n6.g) fVar);
                        dVar.l(iVar4);
                        iVar4 = n6.i.f5525i;
                    } else {
                        dVar = dVar5;
                        fVar = fVar4;
                    }
                    kotlin.jvm.internal.i.b(dVar);
                    dVar.l(unknownFields);
                } else {
                    fVar = fVar4;
                }
                if (fVar != null) {
                    iVar4 = fVar.f(fVar.f5524g);
                }
                return new C0763b(j4, j7, hVar2, str2, bVar, dVar3, i7, i8, iVar2, iVar3, str3, iVar4);
            }
            z3.c cVar = i.f6317n;
            n6.f fVar5 = fVar3;
            z3.c cVar2 = i.f6315l;
            String str4 = str;
            z3.c cVar3 = i.f6318o;
            switch (f7) {
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                    j4 = ((Long) cVar2.b(gVar)).longValue();
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                    try {
                        hVar2 = (h) h.f6261F.b(gVar);
                        dVar4 = dVar5;
                    } catch (z3.h e4) {
                        z3.d dVar6 = z3.d.f6297g;
                        Long valueOf = Long.valueOf(e4.f6308f);
                        if (fVar5 == null) {
                            fVar2 = new n6.f();
                            dVar2 = new a6.d((n6.g) fVar2);
                            dVar2.l(iVar4);
                            iVar4 = n6.i.f5525i;
                        } else {
                            dVar2 = dVar5;
                            fVar2 = fVar5;
                        }
                        n6.i iVar5 = iVar4;
                        i a7 = dVar6.a();
                        fVar5 = fVar2;
                        kotlin.jvm.internal.i.c(a7, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                        kotlin.jvm.internal.i.b(dVar2);
                        a7.e(dVar2, f7, valueOf);
                        dVar4 = dVar2;
                        iVar4 = iVar5;
                    }
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 3:
                    str2 = (String) cVar3.b(gVar);
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 4:
                default:
                    gVar.o(f7);
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 5:
                    bVar = (x4.b) x4.b.f6198o.b(gVar);
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 6:
                    dVar3.add((j) j.f6218j.b(gVar));
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 7:
                    i7 = ((Integer) i.f6311h.b(gVar)).intValue();
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 8:
                    i8 = ((Integer) i.f6312i.b(gVar)).intValue();
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 9:
                    iVar2 = (n6.i) cVar.b(gVar);
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                    iVar3 = (n6.i) cVar.b(gVar);
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 11:
                    j7 = ((Long) cVar2.b(gVar)).longValue();
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    str = str4;
                    break;
                case 12:
                    str = (String) cVar3.b(gVar);
                    dVar4 = dVar5;
                    fVar3 = fVar5;
                    break;
            }
        }
    }

    @Override // z3.i
    public final void d(a6.d dVar, Object obj) {
        int i7;
        int i8;
        C0763b c0763b = (C0763b) obj;
        long j4 = c0763b.f6237h;
        String str = c0763b.f6247r;
        n6.i iVar = c0763b.f6246q;
        n6.i iVar2 = c0763b.f6245p;
        int i9 = c0763b.f6244o;
        int i10 = c0763b.f6243n;
        x4.b bVar = c0763b.f6241l;
        String str2 = c0763b.f6240k;
        h hVar = c0763b.f6239j;
        long j7 = c0763b.f6238i;
        boolean equals = Long.valueOf(j4).equals(0L);
        z3.c cVar = i.f6315l;
        if (equals) {
            i7 = i9;
            i8 = i10;
        } else {
            i7 = i9;
            i8 = i10;
            cVar.e(dVar, 1, Long.valueOf(c0763b.f6237h));
        }
        if (!Long.valueOf(j7).equals(0L)) {
            cVar.e(dVar, 11, Long.valueOf(j7));
        }
        if (!Objects.equals(hVar, h.SEVERITY_NUMBER_UNSPECIFIED)) {
            h.f6261F.e(dVar, 2, hVar);
        }
        boolean equals2 = Objects.equals(str2, "");
        z3.c cVar2 = i.f6318o;
        if (!equals2) {
            cVar2.e(dVar, 3, str2);
        }
        if (!Objects.equals(bVar, null)) {
            x4.b.f6198o.e(dVar, 5, bVar);
        }
        j.f6218j.a().e(dVar, 6, c0763b.f6242m);
        if (!Integer.valueOf(i8).equals(0)) {
            i.f6311h.e(dVar, 7, Integer.valueOf(i8));
        }
        if (!Integer.valueOf(i7).equals(0)) {
            i.f6312i.e(dVar, 8, Integer.valueOf(i7));
        }
        n6.i iVar3 = n6.i.f5525i;
        boolean equals3 = Objects.equals(iVar2, iVar3);
        z3.c cVar3 = i.f6317n;
        if (!equals3) {
            cVar3.e(dVar, 9, iVar2);
        }
        if (!Objects.equals(iVar, iVar3)) {
            cVar3.e(dVar, 10, iVar);
        }
        if (!Objects.equals(str, "")) {
            cVar2.e(dVar, 12, str);
        }
        dVar.l(c0763b.a());
    }

    @Override // z3.i
    public final int f(Object obj) {
        int i7;
        int i8;
        C0763b c0763b = (C0763b) obj;
        int i9 = 0;
        long j4 = c0763b.f6237h;
        String str = c0763b.f6247r;
        n6.i iVar = c0763b.f6246q;
        n6.i iVar2 = c0763b.f6245p;
        int i10 = c0763b.f6244o;
        int i11 = c0763b.f6243n;
        x4.b bVar = c0763b.f6241l;
        String str2 = c0763b.f6240k;
        h hVar = c0763b.f6239j;
        long j7 = c0763b.f6238i;
        boolean equals = Long.valueOf(j4).equals(0L);
        z3.c cVar = i.f6315l;
        if (equals) {
            i7 = i10;
            i8 = i11;
        } else {
            i7 = i10;
            i8 = i11;
            i9 = cVar.g(1, Long.valueOf(c0763b.f6237h));
        }
        if (!Long.valueOf(j7).equals(0L)) {
            i9 += cVar.g(11, Long.valueOf(j7));
        }
        if (!Objects.equals(hVar, h.SEVERITY_NUMBER_UNSPECIFIED)) {
            i9 += h.f6261F.g(2, hVar);
        }
        boolean equals2 = Objects.equals(str2, "");
        z3.c cVar2 = i.f6318o;
        if (!equals2) {
            i9 += cVar2.g(3, str2);
        }
        if (!Objects.equals(bVar, null)) {
            i9 += x4.b.f6198o.g(5, bVar);
        }
        int g7 = j.f6218j.a().g(6, c0763b.f6242m) + i9;
        if (!Integer.valueOf(i8).equals(0)) {
            g7 += i.f6311h.g(7, Integer.valueOf(i8));
        }
        if (!Integer.valueOf(i7).equals(0)) {
            g7 += i.f6312i.g(8, Integer.valueOf(i7));
        }
        n6.i iVar3 = n6.i.f5525i;
        boolean equals3 = Objects.equals(iVar2, iVar3);
        z3.c cVar3 = i.f6317n;
        if (!equals3) {
            g7 += cVar3.g(9, iVar2);
        }
        if (!Objects.equals(iVar, iVar3)) {
            g7 += cVar3.g(10, iVar);
        }
        if (!Objects.equals(str, "")) {
            g7 += cVar2.g(12, str);
        }
        return c0763b.a().a() + g7;
    }
}
