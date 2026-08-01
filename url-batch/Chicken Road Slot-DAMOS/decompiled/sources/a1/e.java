package a1;

import com.appsflyer.attribution.RequestError;
import com.manholeroboramprush.cardestroy.data.database.RecipeVault;
import ge.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k1.e0;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.collections.y;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import le.z;
import n0.i0;
import q1.a0;
import q1.g0;
import q1.t;
import q1.u;
import q1.x;
import s.h0;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        char c10 = 7;
        switch (this.f17d) {
            case 0:
                j jVar = (j) obj2;
                Map map = jVar.f33a;
                h0 h0Var = jVar.f34b;
                Object[] objArr = h0Var.f8313b;
                Object[] objArr2 = h0Var.f8314c;
                long[] jArr = h0Var.f8312a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << c10) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j) < 128) {
                                    int i12 = (i3 << 3) + i11;
                                    Object obj3 = objArr[i12];
                                    Map d10 = ((m) objArr2[i12]).d();
                                    if (d10.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d10);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i10 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                            c10 = 7;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 1:
                return obj2;
            case 2:
                lf.a aVar = (lf.a) obj;
                aVar.getClass();
                ((gf.a) obj2).getClass();
                return new i9.c(a.a.g(aVar));
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((lf.a) obj).getClass();
                ((gf.a) obj2).getClass();
                i9.d dVar = new i9.d();
                dVar.f4677a = "";
                dVar.f4678b = "";
                return dVar;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                lf.a aVar2 = (lf.a) obj;
                aVar2.getClass();
                ((gf.a) obj2).getClass();
                return (RecipeVault) z4.m.a(a.a.g(aVar2), RecipeVault.class, "game_database").b();
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                lf.a aVar3 = (lf.a) obj;
                aVar3.getClass();
                ((gf.a) obj2).getClass();
                return ((RecipeVault) aVar3.d(c0.a(RecipeVault.class), null)).w();
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                lf.a aVar4 = (lf.a) obj;
                aVar4.getClass();
                ((gf.a) obj2).getClass();
                return new k9.a((h9.c) aVar4.d(c0.a(h9.c.class), null));
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return ((CoroutineContext) obj).p((CoroutineContext.Element) obj2);
            case 9:
                return ((CoroutineContext) obj).p((CoroutineContext.Element) obj2);
            case 10:
                i0 i0Var = (i0) obj;
                int intValue = ((Integer) obj2).intValue();
                if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    q1.f fVar = i7.a.f4664d;
                    if (fVar == null) {
                        q1.e eVar = new q1.e(24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        j0 j0Var = g0.f7869a;
                        k1.h0 h0Var2 = new k1.h0(k1.p.f5336b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new q1.n(17.65f, 6.35f));
                        arrayList.add(new q1.k(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f));
                        arrayList.add(new q1.s(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f));
                        arrayList.add(new x(3.57f, 8.0f, 7.99f, 8.0f));
                        arrayList.add(new q1.s(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f));
                        arrayList.add(new t(-2.08f));
                        arrayList.add(new q1.s(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f));
                        arrayList.add(new q1.s(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f));
                        arrayList.add(new x(2.69f, -6.0f, 6.0f, -6.0f));
                        arrayList.add(new q1.s(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f));
                        arrayList.add(new q1.m(13.0f, 11.0f));
                        arrayList.add(new t(7.0f));
                        arrayList.add(new a0(4.0f));
                        arrayList.add(new u(-2.35f, 2.35f));
                        arrayList.add(q1.j.f7898c);
                        if (eVar.f7835k) {
                            z1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        ArrayList arrayList2 = eVar.f7834i;
                        ((q1.d) arrayList2.get(arrayList2.size() - 1)).j.add(new q1.j0("", arrayList, 0, h0Var2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
                        fVar = eVar.a();
                        i7.a.f4664d = fVar;
                    }
                    j0.l.b(fVar, null, k1.p.f5336b, i0Var, 3120);
                } else {
                    i0Var.R();
                }
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                ((Integer) obj2).getClass();
                i9.a.a(n0.h.z(7), (i0) obj);
                return Unit.f5554a;
            case 12:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 13:
                String str = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                str.getClass();
                element.getClass();
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            case 14:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element2.getClass();
                CoroutineContext F = coroutineContext.F(element2.getKey());
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f5592d;
                if (F == gVar) {
                    return element2;
                }
                ld.b bVar = kotlin.coroutines.d.f5591n;
                kotlin.coroutines.d dVar2 = (kotlin.coroutines.d) F.m(bVar);
                if (dVar2 == null) {
                    cVar = new kotlin.coroutines.c(element2, F);
                } else {
                    CoroutineContext F2 = F.F(bVar);
                    if (F2 == gVar) {
                        return new kotlin.coroutines.c(dVar2, element2);
                    }
                    cVar = new kotlin.coroutines.c(dVar2, new kotlin.coroutines.c(element2, F2));
                }
                return cVar;
            case 15:
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (!(element3 instanceof t1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue2 = num != null ? num.intValue() : 1;
                return intValue2 == 0 ? element3 : Integer.valueOf(intValue2 + 1);
            case 16:
                t1 t1Var = (t1) obj;
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                if (t1Var != null) {
                    return t1Var;
                }
                if (element4 instanceof t1) {
                    return (t1) element4;
                }
                return null;
            case 17:
                z zVar = (z) obj;
                CoroutineContext.Element element5 = (CoroutineContext.Element) obj2;
                if (element5 instanceof t1) {
                    t1 t1Var2 = (t1) element5;
                    CoroutineContext coroutineContext2 = zVar.f6012a;
                    Object j3 = t1Var2.j();
                    Object[] objArr3 = zVar.f6013b;
                    int i13 = zVar.f6015d;
                    objArr3[i13] = j3;
                    t1[] t1VarArr = zVar.f6014c;
                    zVar.f6015d = i13 + 1;
                    t1VarArr[i13] = t1Var2;
                }
                return zVar;
            case 18:
                m2.e eVar2 = (m2.e) obj2;
                return y.d(eVar2.f6454e, m2.y.a(eVar2.f6453d, m2.y.f6520a, (c) obj));
            case 19:
                return Integer.valueOf(((w2.l) obj2).f10046a);
            case 20:
                w2.p pVar = (w2.p) obj2;
                return y.d(Float.valueOf(pVar.f10050a), Float.valueOf(pVar.f10051b));
            case 21:
                c cVar2 = (c) obj;
                w2.q qVar = (w2.q) obj2;
                x2.n nVar = new x2.n(qVar.f10053a);
                m2.x xVar = m2.y.f6539v;
                return y.d(m2.y.a(nVar, xVar, cVar2), m2.y.a(new x2.n(qVar.f10054b), xVar, cVar2));
            case 22:
                return Integer.valueOf(((p2.s) obj2).f7648d);
            case 23:
                m2.j jVar2 = (m2.j) obj2;
                return y.d(jVar2.f6487a, m2.y.a(jVar2.f6488b, m2.y.f6527i, (c) obj));
            case 24:
                return Float.valueOf(((w2.a) obj2).f10023a);
            case 25:
                c cVar3 = (c) obj;
                List list = (List) obj2;
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList3.add(m2.y.a((m2.c) list.get(i14), m2.y.f6521b, cVar3));
                }
                return arrayList3;
            case 26:
                m2.g0 g0Var = (m2.g0) obj2;
                return y.d(Integer.valueOf((int) (g0Var.f6478a >> 32)), Integer.valueOf((int) (g0Var.f6478a & 4294967295L)));
            case 27:
                c cVar4 = (c) obj;
                e0 e0Var = (e0) obj2;
                return y.d(m2.y.a(new k1.p(e0Var.f5316a), m2.y.f6533p, cVar4), m2.y.a(new j1.b(e0Var.f5317b), m2.y.f6541x, cVar4), Float.valueOf(e0Var.f5318c));
            case 28:
                return Integer.valueOf(((w2.k) obj2).f10043a);
            default:
                return Integer.valueOf(((w2.m) obj2).f10047a);
        }
    }

    public /* synthetic */ e(int i3, byte b10) {
        this.f17d = i3;
    }
}
