package l9;

import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k1.e0;
import k1.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2.a0;
import m2.f0;
import m2.g0;
import m2.x;
import m2.y;
import m2.z;
import n4.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5940d;

    public /* synthetic */ d(int i3) {
        this.f5940d = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a0 a0Var = null;
        r3 = null;
        f0 f0Var = null;
        r3 = null;
        f0 f0Var2 = null;
        a0Var = null;
        int i3 = 0;
        switch (this.f5940d) {
            case 0:
                ((b0) obj).getClass();
                return Unit.f5554a;
            case 1:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                n nVar = n.INSTANCE;
                nVar.getClass();
                b0Var.g = nVar;
                b0Var.f7035e = false;
                b0Var.a(-1);
                b0Var.f7035e = true;
                b0Var.f7036f = false;
                return Unit.f5554a;
            case 2:
                b0 b0Var2 = (b0) obj;
                b0Var2.getClass();
                f fVar = f.INSTANCE;
                fVar.getClass();
                b0Var2.g = fVar;
                b0Var2.f7035e = false;
                b0Var2.a(-1);
                b0Var2.f7035e = true;
                b0Var2.f7036f = false;
                return Unit.f5554a;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                b0 b0Var3 = (b0) obj;
                b0Var3.getClass();
                n nVar2 = n.INSTANCE;
                nVar2.getClass();
                b0Var3.g = nVar2;
                b0Var3.f7035e = false;
                b0Var3.a(-1);
                b0Var3.f7035e = true;
                b0Var3.f7036f = false;
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                b0 b0Var4 = (b0) obj;
                b0Var4.getClass();
                f fVar2 = f.INSTANCE;
                fVar2.getClass();
                b0Var4.g = fVar2;
                b0Var4.f7035e = false;
                b0Var4.a(-1);
                b0Var4.f7035e = true;
                b0Var4.f7036f = false;
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                m2.m mVar = (m2.m) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(mVar.f6493b);
                sb2.append(", ");
                return v4.a.m(sb2, mVar.f6494c, ')');
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Function1 function1 = (Function1) y.f6526h.f1810i;
                Boolean bool = Boolean.FALSE;
                a0 a0Var2 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (a0) function1.invoke(obj2);
                Object obj3 = list.get(1);
                a0 a0Var3 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (a0) function1.invoke(obj3);
                Object obj4 = list.get(2);
                a0 a0Var4 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (a0) function1.invoke(obj4);
                Object obj5 = list.get(3);
                if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                    a0Var = (a0) function1.invoke(obj5);
                }
                return new f0(a0Var2, a0Var3, a0Var4, a0Var);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) y.f6520a.f1810i).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new m2.e(list3, str);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                obj.getClass();
                return new w2.l(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                List list4 = (List) obj;
                return new w2.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 10:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                x2.o[] oVarArr = x2.n.f10334b;
                Function1 function12 = y.f6539v.f6519e;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.a(obj8, bool2);
                x2.n nVar3 = obj8 != null ? (x2.n) function12.invoke(obj8) : null;
                nVar3.getClass();
                long j = nVar3.f10336a;
                Object obj9 = list5.get(1);
                Intrinsics.a(obj9, bool2);
                x2.n nVar4 = obj9 != null ? (x2.n) function12.invoke(obj9) : null;
                nVar4.getClass();
                return new w2.q(j, nVar4.f10336a);
            case RequestError.STOP_TRACKING /* 11 */:
                obj.getClass();
                return new p2.s(((Integer) obj).intValue());
            case 12:
                obj.getClass();
                return new w2.a(((Float) obj).floatValue());
            case 13:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new g0(z.b(intValue, num2.intValue()));
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i10 = k1.p.f5341h;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.a(obj12, bool3);
                k1.p pVar = obj12 != null ? Intrinsics.a(obj12, Boolean.FALSE) ? new k1.p(k1.p.g) : new k1.p(v.b(((Integer) obj12).intValue())) : null;
                pVar.getClass();
                long j3 = pVar.f5342a;
                Object obj13 = list7.get(1);
                x xVar = y.f6541x;
                Intrinsics.a(obj13, bool3);
                j1.b bVar = obj13 != null ? (j1.b) xVar.f6519e.invoke(obj13) : null;
                bVar.getClass();
                long j10 = bVar.f4914a;
                Object obj14 = list7.get(2);
                Float f3 = obj14 != null ? (Float) obj14 : null;
                f3.getClass();
                return new e0(j3, j10, f3.floatValue());
            case 15:
                obj.getClass();
                return new w2.k(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                c6.c cVar = y.f6527i;
                if (!Intrinsics.a(obj16, Boolean.FALSE) && obj16 != null) {
                    f0Var2 = (f0) ((Function1) cVar.f1810i).invoke(obj16);
                }
                return new m2.j(str2, f0Var2);
            case 17:
                obj.getClass();
                return new w2.m(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                return new w2.d(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i3 < size) {
                    Object obj17 = list9.get(i3);
                    m2.c cVar2 = (Intrinsics.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (m2.c) ((Function1) y.f6521b.f1810i).invoke(obj17);
                    cVar2.getClass();
                    arrayList.add(cVar2);
                    i3++;
                }
                return arrayList;
            case 20:
                obj.getClass();
                return new p2.o(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                return new p2.p(((Integer) obj).intValue());
            case 22:
                Boolean bool4 = Boolean.FALSE;
                if (Intrinsics.a(obj, bool4)) {
                    return new x2.n(x2.n.f10335c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f10 = obj18 != null ? (Float) obj18 : null;
                f10.getClass();
                float floatValue = f10.floatValue();
                Object obj19 = list10.get(1);
                x xVar2 = y.f6540w;
                Intrinsics.a(obj19, bool4);
                x2.o oVar = obj19 != null ? (x2.o) xVar2.f6519e.invoke(obj19) : null;
                oVar.getClass();
                return new x2.n(z4.v.d(oVar.f10337a, floatValue));
            case 23:
                return Intrinsics.a(obj, 0) ? new x2.o(8589934592L) : Intrinsics.a(obj, 1) ? new x2.o(4294967296L) : new x2.o(0L);
            case 24:
                if (Intrinsics.a(obj, Boolean.FALSE)) {
                    return new j1.b(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f11 = obj20 != null ? (Float) obj20 : null;
                f11.getClass();
                float floatValue2 = f11.floatValue();
                Object obj21 = list11.get(1);
                (obj21 != null ? (Float) obj21 : null).getClass();
                return new j1.b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r3.floatValue()) & 4294967295L));
            case 25:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i3 < size2) {
                    Object obj22 = list12.get(i3);
                    s2.a aVar = (Intrinsics.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (s2.a) ((Function1) y.f6543z.f1810i).invoke(obj22);
                    aVar.getClass();
                    arrayList2.add(aVar);
                    i3++;
                }
                return new s2.b(arrayList2);
            case 26:
                obj.getClass();
                String str3 = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str3);
                if (Intrinsics.a(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new s2.a(forLanguageTag);
            case 27:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str4 = obj23 != null ? (String) obj23 : null;
                str4.getClass();
                Object obj24 = list13.get(1);
                c6.c cVar3 = y.f6527i;
                if (!Intrinsics.a(obj24, Boolean.FALSE) && obj24 != null) {
                    f0Var = (f0) ((Function1) cVar3.f1810i).invoke(obj24);
                }
                return new m2.i(str4, f0Var);
            case 28:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f12 = w2.f.f10030b;
                x xVar3 = y.B;
                Boolean bool5 = Boolean.FALSE;
                Intrinsics.a(obj25, bool5);
                w2.f fVar3 = obj25 != null ? (w2.f) xVar3.f6519e.invoke(obj25) : null;
                fVar3.getClass();
                float f13 = fVar3.f10033a;
                Object obj26 = list14.get(1);
                x xVar4 = y.C;
                Intrinsics.a(obj26, bool5);
                w2.h hVar = obj26 != null ? (w2.h) xVar4.f6519e.invoke(obj26) : null;
                hVar.getClass();
                int i11 = hVar.f10035a;
                Object obj27 = list14.get(2);
                x xVar5 = y.D;
                Intrinsics.a(obj27, bool5);
                w2.g gVar = obj27 != null ? (w2.g) xVar5.f6519e.invoke(obj27) : null;
                gVar.getClass();
                return new w2.i(f13, i11, gVar.f10034a);
            default:
                obj.getClass();
                float floatValue3 = ((Float) obj).floatValue();
                w2.f.a(floatValue3);
                return new w2.f(floatValue3);
        }
    }
}
