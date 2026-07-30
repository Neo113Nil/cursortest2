package f5;

import T6.i;
import c4.AbstractC0303i;
import c4.C0295a;
import c4.C0297c;
import c4.C0302h;
import c4.EnumC0298d;
import com.appsflyer.attribution.RequestError;
import e5.j;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402a extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(B.f fVar) {
        T6.f fVar2;
        l2.c cVar;
        l2.c cVar2;
        i iVar = i.f2618l;
        h hVar = h.SEVERITY_NUMBER_UNSPECIFIED;
        d4.d F4 = V6.b.F();
        long e7 = fVar.e();
        l2.c cVar3 = null;
        i iVar2 = iVar;
        i iVar3 = iVar2;
        e5.b bVar = null;
        long j = 0;
        long j7 = 0;
        String str = "";
        int i2 = 0;
        int i5 = 0;
        h hVar2 = hVar;
        T6.f fVar3 = null;
        String str2 = str;
        i iVar4 = iVar3;
        while (true) {
            l2.c cVar4 = cVar3;
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                T6.f fVar4 = fVar3;
                String str3 = str;
                h hVar3 = hVar2;
                i unknownFields = fVar.i(e7);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                if (unknownFields.a() > 0) {
                    if (fVar4 == null) {
                        fVar2 = new T6.f();
                        cVar = new l2.c((T6.g) fVar2);
                        cVar.F(iVar4);
                        iVar4 = i.f2618l;
                    } else {
                        cVar = cVar4;
                        fVar2 = fVar4;
                    }
                    Intrinsics.b(cVar);
                    cVar.F(unknownFields);
                } else {
                    fVar2 = fVar4;
                }
                if (fVar2 != null) {
                    iVar4 = fVar2.e(fVar2.f2617e);
                }
                return new C0403b(j, j7, hVar3, str2, bVar, F4, i2, i5, iVar2, iVar3, str3, iVar4);
            }
            C0297c c0297c = AbstractC0303i.f4231n;
            T6.f fVar5 = fVar3;
            C0297c c0297c2 = AbstractC0303i.f4229l;
            String str4 = str;
            C0297c c0297c3 = AbstractC0303i.f4232o;
            switch (f7) {
                case 1:
                    j = ((Long) c0297c2.b(fVar)).longValue();
                    break;
                case 2:
                    try {
                        hVar2 = (h) h.f4834I.b(fVar);
                        break;
                    } catch (C0302h e8) {
                        EnumC0298d fieldEncoding = EnumC0298d.f4212e;
                        h hVar4 = hVar2;
                        Long valueOf = Long.valueOf(e8.f4223d);
                        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
                        if (fVar5 == null) {
                            T6.f fVar6 = new T6.f();
                            cVar2 = new l2.c((T6.g) fVar6);
                            cVar2.F(iVar4);
                            iVar4 = i.f2618l;
                            fVar5 = fVar6;
                        } else {
                            cVar2 = cVar4;
                        }
                        AbstractC0303i a7 = fieldEncoding.a();
                        Intrinsics.c(a7, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                        Intrinsics.b(cVar2);
                        a7.f(cVar2, f7, valueOf);
                        cVar3 = cVar2;
                        fVar3 = fVar5;
                        str = str4;
                        hVar2 = hVar4;
                        break;
                    }
                case 3:
                    str2 = (String) c0297c3.b(fVar);
                    break;
                case 4:
                default:
                    fVar.q(f7);
                    break;
                case 5:
                    bVar = (e5.b) e5.b.f4712r.b(fVar);
                    break;
                case 6:
                    F4.add((j) j.f4732m.b(fVar));
                    break;
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = ((Integer) AbstractC0303i.f4226h.b(fVar)).intValue();
                    break;
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    i5 = ((Integer) AbstractC0303i.f4227i.b(fVar)).intValue();
                    break;
                case 9:
                    iVar2 = (i) c0297c.b(fVar);
                    break;
                case 10:
                    iVar3 = (i) c0297c.b(fVar);
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    j7 = ((Long) c0297c2.b(fVar)).longValue();
                    break;
                case 12:
                    str = (String) c0297c3.b(fVar);
                    cVar3 = cVar4;
                    fVar3 = fVar5;
                    continue;
            }
            cVar3 = cVar4;
            fVar3 = fVar5;
            str = str4;
        }
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c cVar, Object obj) {
        int i2;
        int i5;
        C0403b c0403b = (C0403b) obj;
        long j = c0403b.f4807i;
        String str = c0403b.f4817u;
        i iVar = c0403b.f4816t;
        i iVar2 = c0403b.f4815s;
        int i7 = c0403b.f4814r;
        int i8 = c0403b.f4813q;
        e5.b bVar = c0403b.f4811o;
        String str2 = c0403b.f4810n;
        h hVar = c0403b.f4809m;
        long j7 = c0403b.f4808l;
        boolean equals = Long.valueOf(j).equals(0L);
        C0297c c0297c = AbstractC0303i.f4229l;
        if (equals) {
            i2 = i7;
            i5 = i8;
        } else {
            i2 = i7;
            i5 = i8;
            c0297c.f(cVar, 1, Long.valueOf(c0403b.f4807i));
        }
        if (!Long.valueOf(j7).equals(0L)) {
            c0297c.f(cVar, 11, Long.valueOf(j7));
        }
        if (!Objects.equals(hVar, h.SEVERITY_NUMBER_UNSPECIFIED)) {
            h.f4834I.f(cVar, 2, hVar);
        }
        boolean equals2 = Objects.equals(str2, "");
        C0297c c0297c2 = AbstractC0303i.f4232o;
        if (!equals2) {
            c0297c2.f(cVar, 3, str2);
        }
        if (!Objects.equals(bVar, null)) {
            e5.b.f4712r.f(cVar, 5, bVar);
        }
        j.f4732m.a().f(cVar, 6, c0403b.f4812p);
        if (!Integer.valueOf(i5).equals(0)) {
            AbstractC0303i.f4226h.f(cVar, 7, Integer.valueOf(i5));
        }
        if (!Integer.valueOf(i2).equals(0)) {
            AbstractC0303i.f4227i.f(cVar, 8, Integer.valueOf(i2));
        }
        i iVar3 = i.f2618l;
        boolean equals3 = Objects.equals(iVar2, iVar3);
        C0297c c0297c3 = AbstractC0303i.f4231n;
        if (!equals3) {
            c0297c3.f(cVar, 9, iVar2);
        }
        if (!Objects.equals(iVar, iVar3)) {
            c0297c3.f(cVar, 10, iVar);
        }
        if (!Objects.equals(str, "")) {
            c0297c2.f(cVar, 12, str);
        }
        cVar.F(c0403b.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        int i2;
        int i5;
        C0403b c0403b = (C0403b) obj;
        int i7 = 0;
        long j = c0403b.f4807i;
        String str = c0403b.f4817u;
        i iVar = c0403b.f4816t;
        i iVar2 = c0403b.f4815s;
        int i8 = c0403b.f4814r;
        int i9 = c0403b.f4813q;
        e5.b bVar = c0403b.f4811o;
        String str2 = c0403b.f4810n;
        h hVar = c0403b.f4809m;
        long j7 = c0403b.f4808l;
        boolean equals = Long.valueOf(j).equals(0L);
        C0297c c0297c = AbstractC0303i.f4229l;
        if (equals) {
            i2 = i8;
            i5 = i9;
        } else {
            i2 = i8;
            i5 = i9;
            i7 = c0297c.h(1, Long.valueOf(c0403b.f4807i));
        }
        if (!Long.valueOf(j7).equals(0L)) {
            i7 += c0297c.h(11, Long.valueOf(j7));
        }
        if (!Objects.equals(hVar, h.SEVERITY_NUMBER_UNSPECIFIED)) {
            i7 += h.f4834I.h(2, hVar);
        }
        boolean equals2 = Objects.equals(str2, "");
        C0297c c0297c2 = AbstractC0303i.f4232o;
        if (!equals2) {
            i7 += c0297c2.h(3, str2);
        }
        if (!Objects.equals(bVar, null)) {
            i7 += e5.b.f4712r.h(5, bVar);
        }
        int h7 = j.f4732m.a().h(6, c0403b.f4812p) + i7;
        if (!Integer.valueOf(i5).equals(0)) {
            h7 += AbstractC0303i.f4226h.h(7, Integer.valueOf(i5));
        }
        if (!Integer.valueOf(i2).equals(0)) {
            h7 += AbstractC0303i.f4227i.h(8, Integer.valueOf(i2));
        }
        i iVar3 = i.f2618l;
        boolean equals3 = Objects.equals(iVar2, iVar3);
        C0297c c0297c3 = AbstractC0303i.f4231n;
        if (!equals3) {
            h7 += c0297c3.h(9, iVar2);
        }
        if (!Objects.equals(iVar, iVar3)) {
            h7 += c0297c3.h(10, iVar);
        }
        if (!Objects.equals(str, "")) {
            h7 += c0297c2.h(12, str);
        }
        return c0403b.a().a() + h7;
    }
}
