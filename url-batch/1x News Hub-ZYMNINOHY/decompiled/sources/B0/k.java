package B0;

import U1.C;
import U1.C0080a;
import U1.C0082c;
import U1.C0084e;
import U1.C0085f;
import U1.E;
import U1.F;
import U1.G;
import U1.I;
import U1.s;
import U1.t;
import U1.u;
import U1.v;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import f0.C0322a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import n0.C1147i;
import n0.C1149k;
import n0.C1150l;
import n0.C1151m;
import n0.C1152n;
import n0.C1158t;
import n0.InterfaceC1153o;
import org.json.JSONObject;
import s0.EnumC1186c;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements D0.b, C0.i, P1.c, InterfaceC1153o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f144c;

    public /* synthetic */ k(Object obj, int i3, Object obj2) {
        this.f142a = i3;
        this.f143b = obj;
        this.f144c = obj2;
    }

    public void a(C0322a c0322a) {
        List list;
        ((C0080a) this.f143b).getClass();
        JSONObject jSONObject = (JSONObject) c0322a.f4977b;
        String optString = jSONObject.optString("externalTransactionToken");
        String optString2 = jSONObject.optString("originalExternalTransactionId");
        if (optString2.isEmpty()) {
            optString2 = null;
        }
        ArrayList<C1158t> arrayList = (ArrayList) c0322a.f4978c;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (C1158t c1158t : arrayList) {
                String str = c1158t.f10123a;
                v K2 = S0.a.K(c1158t.f10124b);
                G g3 = new G();
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                g3.f1484a = str;
                g3.f1485b = c1158t.f10125c;
                g3.f1486c = K2;
                arrayList2.add(g3);
            }
            list = arrayList2;
        }
        F f = new F();
        f.f1481a = optString2;
        if (optString == null) {
            throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
        }
        f.f1482b = optString;
        if (list == null) {
            throw new IllegalStateException("Nonnull field \"products\" is null.");
        }
        f.f1483c = list;
        C0080a c0080a = new C0080a(0);
        C0.e eVar = (C0.e) this.f144c;
        eVar.getClass();
        new p((P1.f) eVar.f201b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling", (P1.k) C0085f.f1505a, (K0.j) null).h(new ArrayList(Collections.singletonList(f)), new k(c0080a, 6, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling"));
    }

    @Override // C0.i, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C0.k kVar = (C0.k) this.f143b;
        C0.a aVar = kVar.f211d;
        int i3 = aVar.f193b;
        v0.i iVar = (v0.i) this.f144c;
        ArrayList d3 = kVar.d(sQLiteDatabase, iVar, i3);
        for (EnumC1186c enumC1186c : EnumC1186c.values()) {
            if (enumC1186c != iVar.f10556c) {
                int size = aVar.f193b - d3.size();
                if (size <= 0) {
                    break;
                }
                A0.f a3 = v0.i.a();
                a3.R(iVar.f10554a);
                if (enumC1186c == null) {
                    throw new NullPointerException("Null priority");
                }
                a3.f25d = enumC1186c;
                a3.f24c = iVar.f10555b;
                d3.addAll(kVar.d(sQLiteDatabase, a3.t(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < d3.size(); i4++) {
            sb.append(((C0.b) d3.get(i4)).f197a);
            if (i4 < d3.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                long j3 = cursor.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new C0.j(cursor.getString(1), cursor.getString(2)));
            }
            query.close();
            ListIterator listIterator = d3.listIterator();
            while (listIterator.hasNext()) {
                C0.b bVar = (C0.b) listIterator.next();
                if (hashMap.containsKey(Long.valueOf(bVar.f197a))) {
                    F1.c c3 = bVar.f199c.c();
                    long j4 = bVar.f197a;
                    for (C0.j jVar : (Set) hashMap.get(Long.valueOf(j4))) {
                        c3.a(jVar.f206a, jVar.f207b);
                    }
                    listIterator.set(new C0.b(j4, bVar.f198b, c3.c()));
                }
            }
            return d3;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    @Override // D0.b
    public Object execute() {
        switch (this.f142a) {
            case 0:
                C0.k kVar = (C0.k) ((m) this.f143b).f150c;
                kVar.getClass();
                Iterable iterable = (Iterable) this.f144c;
                if (iterable.iterator().hasNext()) {
                    kVar.a().compileStatement("DELETE FROM events WHERE _id in " + C0.k.g(iterable)).execute();
                    break;
                }
                break;
            default:
                m mVar = (m) this.f143b;
                mVar.getClass();
                Iterator it = ((HashMap) this.f144c).entrySet().iterator();
                while (it.hasNext()) {
                    ((C0.k) mVar.f155i).e(((Integer) r2.getValue()).intValue(), y0.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // P1.c
    public void n(Object obj) {
        switch (this.f142a) {
            case 4:
                boolean z = obj instanceof List;
                C0080a c0080a = (C0080a) this.f143b;
                if (!z) {
                    c0080a.f(C2.b.i((String) this.f144c));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        c0080a.f(new C0082c((String) list.get(0), (String) list.get(1), list.get(2)));
                        break;
                    }
                }
                break;
            case 5:
                boolean z2 = obj instanceof List;
                C0080a c0080a2 = (C0080a) this.f143b;
                if (!z2) {
                    c0080a2.f(C2.b.i((String) this.f144c));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        c0080a2.f(new C0082c((String) list2.get(0), (String) list2.get(1), list2.get(2)));
                        break;
                    }
                }
                break;
            default:
                boolean z3 = obj instanceof List;
                C0080a c0080a3 = (C0080a) this.f143b;
                if (!z3) {
                    c0080a3.f(C2.b.i((String) this.f144c));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        c0080a3.f(new C0082c((String) list3.get(0), (String) list3.get(1), list3.get(2)));
                        break;
                    }
                }
                break;
        }
    }

    @Override // n0.InterfaceC1153o
    public void onProductDetailsResponse(C1147i c1147i, List list) {
        U1.p pVar;
        ArrayList arrayList;
        U1.o oVar;
        I i3 = (I) this.f143b;
        i3.getClass();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C1152n c1152n = (C1152n) it.next();
            i3.f.put(c1152n.f10113c, c1152n);
        }
        U1.n j3 = S0.a.j(c1147i);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C1152n c1152n2 = (C1152n) it2.next();
            String str = c1152n2.f10115e;
            v K2 = S0.a.K(c1152n2.f10114d);
            C1149k a3 = c1152n2.a();
            if (a3 == null) {
                pVar = null;
            } else {
                Long valueOf = Long.valueOf(a3.f10097b);
                pVar = new U1.p();
                pVar.f1539a = valueOf;
                String str2 = a3.f10096a;
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                pVar.f1540b = str2;
                String str3 = a3.f10098c;
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                pVar.f1541c = str3;
            }
            ArrayList arrayList3 = c1152n2.f10119j;
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C1151m c1151m = (C1151m) it3.next();
                    String str4 = c1151m.f10107b;
                    ArrayList arrayList5 = c1151m.f10110e;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = it2;
                    Iterator it5 = ((ArrayList) c1151m.f10109d.f2543a).iterator();
                    while (it5.hasNext()) {
                        Iterator it6 = it5;
                        C1150l c1150l = (C1150l) it5.next();
                        Iterator it7 = it3;
                        String str5 = c1150l.f10101a;
                        U1.n nVar = j3;
                        Long valueOf2 = Long.valueOf(c1150l.f10102b);
                        ArrayList arrayList7 = arrayList2;
                        Long valueOf3 = Long.valueOf(c1150l.f10105e);
                        U1.p pVar2 = pVar;
                        int i4 = c1150l.f;
                        C c3 = i4 != 1 ? i4 != 2 ? C.NON_RECURRING : C.FINITE_RECURRING : C.INFINITE_RECURRING;
                        s sVar = new s();
                        sVar.f1545a = valueOf3;
                        sVar.f1546b = c3;
                        sVar.f1547c = valueOf2;
                        String str6 = c1150l.f10104d;
                        if (str6 == null) {
                            throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
                        }
                        sVar.f1548d = str6;
                        if (str5 == null) {
                            throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                        }
                        sVar.f1549e = str5;
                        String str7 = c1150l.f10103c;
                        if (str7 == null) {
                            throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                        }
                        sVar.f = str7;
                        arrayList6.add(sVar);
                        it3 = it7;
                        it5 = it6;
                        j3 = nVar;
                        arrayList2 = arrayList7;
                        pVar = pVar2;
                    }
                    U1.n nVar2 = j3;
                    ArrayList arrayList8 = arrayList2;
                    Iterator it8 = it3;
                    U1.p pVar3 = pVar;
                    if (c1151m.f == null) {
                        oVar = null;
                    } else {
                        Long valueOf4 = Long.valueOf(r0.f291b);
                        Long valueOf5 = Long.valueOf(r0.f292c);
                        oVar = new U1.o();
                        oVar.f1537a = valueOf4;
                        oVar.f1538b = valueOf5;
                    }
                    E e3 = new E();
                    String str8 = c1151m.f10106a;
                    if (str8 == null) {
                        throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
                    }
                    e3.f1476a = str8;
                    e3.f1477b = str4;
                    String str9 = c1151m.f10108c;
                    if (str9 == null) {
                        throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
                    }
                    e3.f1478c = str9;
                    if (arrayList5 == null) {
                        throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
                    }
                    e3.f1479d = arrayList5;
                    e3.f1480e = arrayList6;
                    e3.f = oVar;
                    arrayList4.add(e3);
                    it2 = it4;
                    it3 = it8;
                    j3 = nVar2;
                    arrayList2 = arrayList8;
                    pVar = pVar3;
                }
                arrayList = arrayList4;
            }
            U1.n nVar3 = j3;
            ArrayList arrayList9 = arrayList2;
            Iterator it9 = it2;
            U1.p pVar4 = pVar;
            t tVar = new t();
            String str10 = c1152n2.f10116g;
            if (str10 == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            tVar.f1550a = str10;
            String str11 = c1152n2.f;
            if (str11 == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            tVar.f1551b = str11;
            String str12 = c1152n2.f10113c;
            if (str12 == null) {
                throw new IllegalStateException("Nonnull field \"productId\" is null.");
            }
            tVar.f1552c = str12;
            tVar.f1553d = K2;
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"title\" is null.");
            }
            tVar.f1554e = str;
            tVar.f = pVar4;
            tVar.f1555g = arrayList;
            arrayList9.add(tVar);
            it2 = it9;
            arrayList2 = arrayList9;
            j3 = nVar3;
        }
        u uVar = new u();
        uVar.f1556a = j3;
        uVar.f1557b = arrayList2;
        ((C0084e) this.f144c).a(uVar);
    }
}
