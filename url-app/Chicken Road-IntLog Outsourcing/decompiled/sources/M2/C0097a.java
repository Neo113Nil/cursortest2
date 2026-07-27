package M2;

import E.C0028c;
import G0.C0060j;
import G0.C0063m;
import G0.C0064n;
import G0.C0065o;
import G0.C0066p;
import G0.InterfaceC0067q;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import b1.C0273j;
import c1.C0308a;
import c1.C0309b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import f2.AbstractServiceC0423g;
import h2.C0480a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import n2.AbstractC1341c;
import org.json.JSONObject;
import r.C1392b;

/* renamed from: M2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0097a implements H2.c, InterfaceC0067q, d1.b, c1.g, I1.c, I1.a, N1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1856c;

    public /* synthetic */ C0097a(Object obj, int i2, Object obj2) {
        this.f1854a = i2;
        this.f1855b = obj;
        this.f1856c = obj2;
    }

    public void a(B0.c cVar) {
        List list;
        ((W1.e) this.f1855b).getClass();
        JSONObject jSONObject = (JSONObject) cVar.f140b;
        String optString = jSONObject.optString("externalTransactionToken");
        String optString2 = jSONObject.optString("originalExternalTransactionId");
        if (optString2.isEmpty()) {
            optString2 = null;
        }
        ArrayList<G0.v> arrayList = (ArrayList) cVar.f141c;
        if (arrayList.isEmpty()) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (G0.v vVar : arrayList) {
                String str = vVar.f897a;
                z H5 = AbstractC1341c.H(vVar.f898b);
                K k3 = new K();
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                k3.f1841a = str;
                k3.f1842b = vVar.f899c;
                k3.f1843c = H5;
                arrayList2.add(k3);
            }
            list = arrayList2;
        }
        J j2 = new J();
        j2.f1838a = optString2;
        if (optString == null) {
            throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
        }
        j2.f1839b = optString;
        if (list == null) {
            throw new IllegalStateException("Nonnull field \"products\" is null.");
        }
        j2.f1840c = list;
        l1.j jVar = new l1.j(6);
        B1.g gVar = (B1.g) this.f1856c;
        gVar.getClass();
        new f2.t((H2.f) gVar.f215b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling", C0106j.f1877a, null).g(new ArrayList(Collections.singletonList(j2)), new C0097a(jVar, 3, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling"));
    }

    @Override // c1.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        c1.i iVar = (c1.i) this.f1855b;
        C0308a c0308a = iVar.f4911d;
        int i2 = c0308a.f4895b;
        V0.i iVar2 = (V0.i) this.f1856c;
        ArrayList g6 = iVar.g(sQLiteDatabase, iVar2, i2);
        for (S0.d dVar : S0.d.values()) {
            if (dVar != iVar2.f3210c) {
                int size = c0308a.f4895b - g6.size();
                if (size <= 0) {
                    break;
                }
                B4.i a6 = V0.i.a();
                a6.R(iVar2.f3208a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a6.f313d = dVar;
                a6.f312c = iVar2.f3209b;
                g6.addAll(iVar.g(sQLiteDatabase, a6.v(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i3 = 0; i3 < g6.size(); i3++) {
            sb.append(((C0309b) g6.get(i3)).f4899a);
            if (i3 < g6.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                long j2 = cursor.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j2));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j2), set);
                }
                set.add(new c1.h(cursor.getString(1), cursor.getString(2)));
            }
            query.close();
            ListIterator listIterator = g6.listIterator();
            while (listIterator.hasNext()) {
                C0309b c0309b = (C0309b) listIterator.next();
                if (hashMap.containsKey(Long.valueOf(c0309b.f4899a))) {
                    M0.e c2 = c0309b.f4901c.c();
                    long j6 = c0309b.f4899a;
                    for (c1.h hVar : (Set) hashMap.get(Long.valueOf(j6))) {
                        c2.a(hVar.f4905a, hVar.f4906b);
                    }
                    listIterator.set(new C0309b(j6, c0309b.f4900b, c2.c()));
                }
            }
            return g6;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    @Override // H2.c
    public void b(Object obj) {
        switch (this.f1854a) {
            case 1:
                boolean z = obj instanceof List;
                l1.j jVar = (l1.j) this.f1855b;
                if (!z) {
                    jVar.j(e5.g.k((String) this.f1856c));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        jVar.j(new C0099c((String) list.get(0), (String) list.get(1), list.get(2)));
                        break;
                    }
                }
                break;
            case 2:
                boolean z5 = obj instanceof List;
                W1.e eVar = (W1.e) this.f1855b;
                if (!z5) {
                    eVar.p(e5.g.k((String) this.f1856c));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        eVar.p(new C0099c((String) list2.get(0), (String) list2.get(1), list2.get(2)));
                        break;
                    }
                }
                break;
            default:
                boolean z6 = obj instanceof List;
                l1.j jVar2 = (l1.j) this.f1855b;
                if (!z6) {
                    jVar2.j(e5.g.k((String) this.f1856c));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        jVar2.j(new C0099c((String) list3.get(0), (String) list3.get(1), list3.get(2)));
                        break;
                    }
                }
                break;
        }
    }

    @Override // N1.d
    public Object d(B.d dVar) {
        String str;
        switch (this.f1854a) {
            case 10:
                Context context = (Context) dVar.a(Context.class);
                switch (((C0028c) this.f1856c).f602a) {
                    case 2:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 3:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case 4:
                        int i2 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i2 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str = "embedded";
                                        break;
                                    } else {
                                        str = "";
                                        break;
                                    }
                                } else {
                                    str = "auto";
                                    break;
                                }
                            } else {
                                str = "watch";
                                break;
                            }
                        } else {
                            str = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            str = "";
                            break;
                        } else {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new C0480a((String) this.f1855b, str);
            default:
                String str2 = (String) this.f1855b;
                N1.a aVar = (N1.a) this.f1856c;
                try {
                    Trace.beginSection(str2);
                    return aVar.f2001f.d(dVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // d1.b
    public Object execute() {
        switch (this.f1854a) {
            case 5:
                c1.i iVar = (c1.i) ((C0273j) this.f1855b).f4789c;
                iVar.getClass();
                Iterable iterable = (Iterable) this.f1856c;
                if (iterable.iterator().hasNext()) {
                    iVar.a().compileStatement("DELETE FROM events WHERE _id in " + c1.i.q(iterable)).execute();
                    break;
                }
                break;
            default:
                C0273j c0273j = (C0273j) this.f1855b;
                c0273j.getClass();
                Iterator it = ((HashMap) this.f1856c).entrySet().iterator();
                while (it.hasNext()) {
                    ((c1.i) c0273j.f4795i).o(((Integer) r2.getValue()).intValue(), Y0.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // I1.a
    public Object j(Task task) {
        f2.j jVar = (f2.j) this.f1855b;
        String str = (String) this.f1856c;
        synchronized (jVar) {
            ((C1392b) jVar.f5614b).remove(str);
        }
        return task;
    }

    @Override // I1.c
    public void onComplete(Task task) {
        ((AbstractServiceC0423g) this.f1855b).a((Intent) this.f1856c);
    }

    @Override // G0.InterfaceC0067q
    public void onProductDetailsResponse(C0060j c0060j, List list) {
        t tVar;
        r rVar;
        ArrayList arrayList;
        Iterator it;
        t tVar2;
        ArrayList arrayList2;
        s sVar;
        M m6 = (M) this.f1855b;
        m6.getClass();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C0066p c0066p = (C0066p) it2.next();
            m6.f1853f.put(c0066p.f886c, c0066p);
        }
        r j2 = AbstractC1341c.j(c0060j);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = ((ArrayList) list).iterator();
        while (it3.hasNext()) {
            C0066p c0066p2 = (C0066p) it3.next();
            String str = c0066p2.f888e;
            z H5 = AbstractC1341c.H(c0066p2.f887d);
            C0063m a6 = c0066p2.a();
            if (a6 == null) {
                tVar = null;
            } else {
                Long valueOf = Long.valueOf(a6.f867b);
                tVar = new t();
                tVar.f1913a = valueOf;
                String str2 = a6.f866a;
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                tVar.f1914b = str2;
                String str3 = a6.f868c;
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                tVar.f1915c = str3;
            }
            ArrayList arrayList4 = c0066p2.f893j;
            if (arrayList4 == null) {
                rVar = j2;
                arrayList = arrayList3;
                it = it3;
                tVar2 = tVar;
                arrayList2 = null;
            } else {
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    C0065o c0065o = (C0065o) it4.next();
                    String str4 = c0065o.f879b;
                    ArrayList arrayList6 = c0065o.f882e;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it5 = it3;
                    Iterator it6 = ((ArrayList) c0065o.f881d.f5783b).iterator();
                    while (it6.hasNext()) {
                        Iterator it7 = it6;
                        C0064n c0064n = (C0064n) it6.next();
                        Iterator it8 = it4;
                        String str5 = c0064n.f872a;
                        r rVar2 = j2;
                        Long valueOf2 = Long.valueOf(c0064n.f873b);
                        ArrayList arrayList8 = arrayList3;
                        Long valueOf3 = Long.valueOf(c0064n.f876e);
                        t tVar3 = tVar;
                        int i2 = c0064n.f877f;
                        G g6 = i2 != 1 ? i2 != 2 ? G.NON_RECURRING : G.FINITE_RECURRING : G.INFINITE_RECURRING;
                        w wVar = new w();
                        wVar.f1919a = valueOf3;
                        wVar.f1920b = g6;
                        wVar.f1921c = valueOf2;
                        String str6 = c0064n.f875d;
                        if (str6 == null) {
                            throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
                        }
                        wVar.f1922d = str6;
                        if (str5 == null) {
                            throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                        }
                        wVar.f1923e = str5;
                        String str7 = c0064n.f874c;
                        if (str7 == null) {
                            throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                        }
                        wVar.f1924f = str7;
                        arrayList7.add(wVar);
                        it4 = it8;
                        it6 = it7;
                        j2 = rVar2;
                        arrayList3 = arrayList8;
                        tVar = tVar3;
                    }
                    r rVar3 = j2;
                    ArrayList arrayList9 = arrayList3;
                    Iterator it9 = it4;
                    t tVar4 = tVar;
                    if (c0065o.f883f == null) {
                        sVar = null;
                    } else {
                        Long valueOf4 = Long.valueOf(r0.f631b);
                        Long valueOf5 = Long.valueOf(r0.f632c);
                        sVar = new s();
                        sVar.f1911a = valueOf4;
                        sVar.f1912b = valueOf5;
                    }
                    I i3 = new I();
                    String str8 = c0065o.f878a;
                    if (str8 == null) {
                        throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
                    }
                    i3.f1832a = str8;
                    i3.f1833b = str4;
                    String str9 = c0065o.f880c;
                    if (str9 == null) {
                        throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
                    }
                    i3.f1834c = str9;
                    if (arrayList6 == null) {
                        throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
                    }
                    i3.f1835d = arrayList6;
                    i3.f1836e = arrayList7;
                    i3.f1837f = sVar;
                    arrayList5.add(i3);
                    it3 = it5;
                    it4 = it9;
                    j2 = rVar3;
                    arrayList3 = arrayList9;
                    tVar = tVar4;
                }
                rVar = j2;
                arrayList = arrayList3;
                it = it3;
                tVar2 = tVar;
                arrayList2 = arrayList5;
            }
            x xVar = new x();
            String str10 = c0066p2.f890g;
            if (str10 == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            xVar.f1925a = str10;
            String str11 = c0066p2.f889f;
            if (str11 == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            xVar.f1926b = str11;
            String str12 = c0066p2.f886c;
            if (str12 == null) {
                throw new IllegalStateException("Nonnull field \"productId\" is null.");
            }
            xVar.f1927c = str12;
            xVar.f1928d = H5;
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"title\" is null.");
            }
            xVar.f1929e = str;
            xVar.f1930f = tVar2;
            xVar.f1931g = arrayList2;
            ArrayList arrayList10 = arrayList;
            arrayList10.add(xVar);
            it3 = it;
            arrayList3 = arrayList10;
            j2 = rVar;
        }
        y yVar = new y();
        yVar.f1932a = j2;
        yVar.f1933b = arrayList3;
        ((C0103g) this.f1856c).a(yVar);
    }
}
