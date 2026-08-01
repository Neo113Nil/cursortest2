package m2;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.o0;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.b1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6515d;

    public /* synthetic */ u(x2.e eVar) {
        this.f6515d = 24;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c cVar;
        int i3;
        int i10;
        int i11;
        int i12;
        w2.s sVar;
        long j;
        h hVar = null;
        hVar = null;
        switch (this.f6515d) {
            case 0:
                obj.getClass();
                return new w2.h(((Integer) obj).intValue());
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                g gVar = obj2 != null ? (g) obj2 : null;
                gVar.getClass();
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                switch (gVar.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        p pVar = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (p) ((Function1) y.g.f1810i).invoke(obj6);
                        pVar.getClass();
                        cVar = new c(intValue, intValue2, pVar, str);
                        break;
                    case 1:
                        Object obj7 = list.get(1);
                        a0 a0Var = (Intrinsics.a(obj7, Boolean.FALSE) || obj7 == null) ? null : (a0) ((Function1) y.f6526h.f1810i).invoke(obj7);
                        a0Var.getClass();
                        cVar = new c(intValue, intValue2, a0Var, str);
                        break;
                    case 2:
                        Object obj8 = list.get(1);
                        j0 j0Var = (Intrinsics.a(obj8, Boolean.FALSE) || obj8 == null) ? null : (j0) ((Function1) y.f6522c.f1810i).invoke(obj8);
                        j0Var.getClass();
                        cVar = new c(intValue, intValue2, j0Var, str);
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        Object obj9 = list.get(1);
                        i0 i0Var = (Intrinsics.a(obj9, Boolean.FALSE) || obj9 == null) ? null : (i0) ((Function1) y.f6523d.f1810i).invoke(obj9);
                        i0Var.getClass();
                        cVar = new c(intValue, intValue2, i0Var, str);
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Object obj10 = list.get(1);
                        j jVar = (Intrinsics.a(obj10, Boolean.FALSE) || obj10 == null) ? null : (j) ((Function1) y.f6524e.f1810i).invoke(obj10);
                        jVar.getClass();
                        cVar = new c(intValue, intValue2, jVar, str);
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Object obj11 = list.get(1);
                        i iVar = (Intrinsics.a(obj11, Boolean.FALSE) || obj11 == null) ? null : (i) ((Function1) y.f6525f.f1810i).invoke(obj11);
                        iVar.getClass();
                        cVar = new c(intValue, intValue2, iVar, str);
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        str2.getClass();
                        cVar = new c(intValue, intValue2, new c0(str2), str);
                        break;
                    default:
                        a2.r.p();
                        return null;
                }
                return cVar;
            case 2:
                obj.getClass();
                return new w2.g(((Integer) obj).intValue());
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new j0(str3);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new i0(str4);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                obj.getClass();
                List list2 = (List) obj;
                Object obj13 = list2.get(0);
                x xVar = y.f6534q;
                Boolean bool = Boolean.FALSE;
                Intrinsics.a(obj13, bool);
                w2.k kVar = obj13 != null ? (w2.k) xVar.f6519e.invoke(obj13) : null;
                kVar.getClass();
                int i13 = kVar.f10043a;
                Object obj14 = list2.get(1);
                x xVar2 = y.f6535r;
                Intrinsics.a(obj14, bool);
                w2.m mVar = obj14 != null ? (w2.m) xVar2.f6519e.invoke(obj14) : null;
                mVar.getClass();
                int i14 = mVar.f10047a;
                Object obj15 = list2.get(2);
                x2.o[] oVarArr = x2.n.f10334b;
                x xVar3 = y.f6539v;
                Intrinsics.a(obj15, bool);
                x2.n nVar = obj15 != null ? (x2.n) xVar3.f6519e.invoke(obj15) : null;
                nVar.getClass();
                long j3 = nVar.f10336a;
                Object obj16 = list2.get(3);
                w2.q qVar = w2.q.f10052c;
                w2.q qVar2 = (Intrinsics.a(obj16, bool) || obj16 == null) ? null : (w2.q) ((Function1) y.f6529l.f1810i).invoke(obj16);
                Object obj17 = list2.get(4);
                r rVar = (Intrinsics.a(obj17, bool) || obj17 == null) ? null : (r) ((Function1) z.f6544a.f1810i).invoke(obj17);
                Object obj18 = list2.get(5);
                w2.i iVar2 = w2.i.f10036d;
                w2.i iVar3 = (Intrinsics.a(obj18, bool) || obj18 == null) ? null : (w2.i) ((Function1) y.A.f1810i).invoke(obj18);
                Object obj19 = list2.get(6);
                w2.e eVar = (Intrinsics.a(obj19, bool) || obj19 == null) ? null : (w2.e) ((Function1) z.f6546c.f1810i).invoke(obj19);
                eVar.getClass();
                int i15 = eVar.f10029a;
                Object obj20 = list2.get(7);
                x xVar4 = y.f6536s;
                Intrinsics.a(obj20, bool);
                w2.d dVar = obj20 != null ? (w2.d) xVar4.f6519e.invoke(obj20) : null;
                dVar.getClass();
                int i16 = dVar.f10027a;
                Object obj21 = list2.get(8);
                boolean a9 = Intrinsics.a(obj21, bool);
                c6.c cVar2 = z.f6547d;
                if (a9 || obj21 == null) {
                    i3 = i16;
                    i10 = i13;
                    i11 = i15;
                    i12 = i14;
                    j = j3;
                    sVar = null;
                } else {
                    i3 = i16;
                    i10 = i13;
                    i11 = i15;
                    i12 = i14;
                    sVar = (w2.s) ((Function1) cVar2.f1810i).invoke(obj21);
                    j = j3;
                }
                return new p(i10, i12, j, qVar2, rVar, iVar3, i11, i3, sVar);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                obj.getClass();
                List list3 = (List) obj;
                Object obj22 = list3.get(0);
                int i17 = k1.p.f5341h;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.a(obj22, bool2);
                k1.p pVar2 = obj22 != null ? obj22.equals(bool2) ? new k1.p(k1.p.g) : new k1.p(k1.v.b(((Integer) obj22).intValue())) : null;
                pVar2.getClass();
                long j10 = pVar2.f5342a;
                Object obj23 = list3.get(1);
                x2.o[] oVarArr2 = x2.n.f10334b;
                Function1 function1 = y.f6539v.f6519e;
                Intrinsics.a(obj23, bool2);
                x2.n nVar2 = obj23 != null ? (x2.n) function1.invoke(obj23) : null;
                nVar2.getClass();
                long j11 = nVar2.f10336a;
                Object obj24 = list3.get(2);
                p2.s sVar2 = p2.s.f7642e;
                p2.s sVar3 = (Intrinsics.a(obj24, bool2) || obj24 == null) ? null : (p2.s) ((Function1) y.f6530m.f1810i).invoke(obj24);
                Object obj25 = list3.get(3);
                p2.o oVar = (Intrinsics.a(obj25, bool2) || obj25 == null) ? null : (p2.o) ((Function1) y.f6537t.f1810i).invoke(obj25);
                Object obj26 = list3.get(4);
                p2.p pVar3 = (Intrinsics.a(obj26, bool2) || obj26 == null) ? null : (p2.p) ((Function1) y.f6538u.f1810i).invoke(obj26);
                Object obj27 = list3.get(6);
                String str5 = obj27 != null ? (String) obj27 : null;
                Object obj28 = list3.get(7);
                Intrinsics.a(obj28, bool2);
                x2.n nVar3 = obj28 != null ? (x2.n) function1.invoke(obj28) : null;
                nVar3.getClass();
                long j12 = nVar3.f10336a;
                Object obj29 = list3.get(8);
                w2.a aVar = (Intrinsics.a(obj29, bool2) || obj29 == null) ? null : (w2.a) ((Function1) y.f6531n.f1810i).invoke(obj29);
                Object obj30 = list3.get(9);
                w2.p pVar4 = (Intrinsics.a(obj30, bool2) || obj30 == null) ? null : (w2.p) ((Function1) y.f6528k.f1810i).invoke(obj30);
                Object obj31 = list3.get(10);
                s2.b bVar = s2.b.f8409i;
                s2.b bVar2 = (Intrinsics.a(obj31, bool2) || obj31 == null) ? null : (s2.b) ((Function1) y.f6542y.f1810i).invoke(obj31);
                Object obj32 = list3.get(11);
                Intrinsics.a(obj32, bool2);
                k1.p pVar5 = obj32 != null ? obj32.equals(bool2) ? new k1.p(k1.p.g) : new k1.p(k1.v.b(((Integer) obj32).intValue())) : null;
                pVar5.getClass();
                long j13 = pVar5.f5342a;
                Object obj33 = list3.get(12);
                w2.l lVar = (Intrinsics.a(obj33, bool2) || obj33 == null) ? null : (w2.l) ((Function1) y.j.f1810i).invoke(obj33);
                Object obj34 = list3.get(13);
                k1.e0 e0Var = k1.e0.f5315d;
                return new a0(j10, j11, sVar3, oVar, pVar3, (p2.i) null, str5, j12, aVar, pVar4, bVar2, j13, lVar, (Intrinsics.a(obj34, bool2) || obj34 == null) ? null : (k1.e0) ((Function1) y.f6532o.f1810i).invoke(obj34), 49184);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                obj.getClass();
                List list4 = (List) obj;
                Object obj35 = list4.get(0);
                Boolean bool3 = obj35 != null ? (Boolean) obj35 : null;
                bool3.getClass();
                boolean booleanValue = bool3.booleanValue();
                Object obj36 = list4.get(1);
                boolean a10 = Intrinsics.a(obj36, Boolean.FALSE);
                c6.c cVar3 = z.f6545b;
                if (!a10 && obj36 != null) {
                    hVar = (h) ((Function1) cVar3.f1810i).invoke(obj36);
                }
                hVar.getClass();
                return new r(hVar.f6479a, booleanValue);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                obj.getClass();
                return new h(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                return new w2.e(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                List list5 = (List) obj;
                Object obj37 = list5.get(0);
                w2.r rVar2 = (Intrinsics.a(obj37, Boolean.FALSE) || obj37 == null) ? null : (w2.r) ((Function1) z.f6548e.f1810i).invoke(obj37);
                rVar2.getClass();
                int i18 = rVar2.f10055a;
                Object obj38 = list5.get(1);
                Boolean bool4 = obj38 != null ? (Boolean) obj38 : null;
                bool4.getClass();
                return new w2.s(i18, bool4.booleanValue());
            case RequestError.STOP_TRACKING /* 11 */:
                obj.getClass();
                return new w2.r(((Integer) obj).intValue());
            case 12:
                a2.a0 a0Var2 = ((b1) obj).f6641a;
                if (a0Var2 != null) {
                    a0Var2.invoke();
                }
                return Unit.f5554a;
            case 13:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 14:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 15:
                ((k4.b) obj).getClass();
                return new n4.l();
            case 16:
                n4.s sVar4 = (n4.s) obj;
                sVar4.getClass();
                return sVar4.f7116i;
            case 17:
                n4.s sVar5 = (n4.s) obj;
                sVar5.getClass();
                if (!(sVar5 instanceof n4.u)) {
                    return null;
                }
                e3.o oVar2 = ((n4.u) sVar5).f7125t;
                return oVar2.p(oVar2.f3827a);
            case 18:
                n4.b0 b0Var = (n4.b0) obj;
                b0Var.getClass();
                b0Var.f7032b = true;
                return Unit.f5554a;
            case 19:
                return new o4.a(o0.b((k4.b) obj));
            case 20:
                return u.d0.a(v.c.h(700, 6, null));
            case 21:
                n4.s sVar6 = ((n4.h) ((u.o) obj).c()).f7063e;
                sVar6.getClass();
                int i19 = n4.s.f7113s;
                for (n4.s sVar7 : a.a.B((o4.h) sVar6)) {
                }
                return null;
            case 22:
                return u.d0.b(v.c.h(700, 6, null));
            case 23:
                return ((n4.h) obj).f7067t;
            case 24:
                throw n0.l.e(obj);
            case 25:
                ce.b bVar3 = (ce.b) obj;
                bVar3.getClass();
                pe.a H = cf.c.H(bVar3);
                if (H != null) {
                    return H;
                }
                if (a.a.D(bVar3).isInterface()) {
                    return new pe.d(bVar3);
                }
                return null;
            case 26:
                ce.b bVar4 = (ce.b) obj;
                bVar4.getClass();
                pe.a H2 = cf.c.H(bVar4);
                if (H2 == null) {
                    H2 = a.a.D(bVar4).isInterface() ? new pe.d(bVar4) : null;
                }
                if (H2 != null) {
                    return g8.b.C(H2);
                }
                return null;
            case 27:
                k4.b bVar5 = (k4.b) obj;
                bVar5.getClass();
                return new q4.b(o0.b(bVar5));
            case 28:
                n4.s sVar8 = (n4.s) obj;
                sVar8.getClass();
                n4.u uVar = sVar8.f7116i;
                if (uVar == null || uVar.f7125t.f3827a != sVar8.f7115e.f1694a) {
                    return null;
                }
                return uVar;
            default:
                n4.s sVar9 = (n4.s) obj;
                sVar9.getClass();
                n4.u uVar2 = sVar9.f7116i;
                if (uVar2 == null || uVar2.f7125t.f3827a != sVar9.f7115e.f1694a) {
                    return null;
                }
                return uVar2;
        }
    }

    public /* synthetic */ u(int i3) {
        this.f6515d = i3;
    }
}
