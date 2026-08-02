package B0;

import E1.A;
import E1.AbstractC0033i;
import U1.C0084e;
import U1.C0087h;
import U1.x;
import U1.y;
import Y1.C0104a;
import Y1.C0107d;
import Y1.C0110g;
import Y1.C0112i;
import Y1.C0113j;
import Y1.C0117n;
import Y1.C0125w;
import Y1.r;
import a.AbstractC0129a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.LocationManager;
import android.util.Log;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.location.impl.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n0.C1147i;
import n0.InterfaceC1154p;
import n0.InterfaceC1155q;
import org.json.JSONException;
import org.json.JSONObject;
import y0.C1251a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements D0.b, FunctionWithThrowable, P1.c, InterfaceC1155q, InterfaceC1154p, P1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131b;

    public /* synthetic */ g(int i3, Object obj) {
        this.f130a = i3;
        this.f131b = obj;
    }

    @Override // P1.b
    public void a(Object obj, V0.e eVar) {
        List L;
        List L2;
        switch (this.f130a) {
            case 23:
                C0113j c0113j = (C0113j) this.f131b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0107d) c0113j.f1861a.f17b).a(((Long) obj2).longValue(), new r(c0113j));
                    L = AbstractC0129a.r(null);
                } catch (Throwable th) {
                    if (th instanceof C0104a) {
                        C0104a c0104a = th;
                        L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                    } else {
                        L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                    }
                }
                eVar.n(L);
                break;
            default:
                C0117n c0117n = (C0117n) this.f131b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj3 = list.get(0);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj3).longValue();
                Object obj4 = list.get(1);
                kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C0107d) c0117n.f1873a.f17b).a(longValue, new C0125w((String) obj4, c0117n));
                    L2 = AbstractC0129a.r(null);
                } catch (Throwable th2) {
                    if (th2 instanceof C0104a) {
                        C0104a c0104a2 = th2;
                        L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                    } else {
                        L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                    }
                }
                eVar.n(L2);
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        return u.a((u) this.f131b, (LocationManager) obj);
    }

    public void b(C1147i c1147i) {
        ((C0084e) this.f131b).a(S0.a.j(c1147i));
    }

    public void c(C1147i c1147i) {
        U1.n j3 = S0.a.j(c1147i);
        C0087h c0087h = new C0087h();
        c0087h.f1508a = j3;
        c0087h.f1509b = "";
        ((C0084e) this.f131b).a(c0087h);
    }

    public void d(C1147i c1147i) {
        U1.n j3 = S0.a.j(c1147i);
        U1.k kVar = new U1.k();
        kVar.f1514a = j3;
        kVar.f1515b = "";
        ((C0084e) this.f131b).a(kVar);
    }

    @Override // D0.b
    public Object execute() {
        SQLiteDatabase a3;
        int i3 = 0;
        Object obj = this.f131b;
        switch (this.f130a) {
            case 0:
                C0.k kVar = (C0.k) ((C0.c) obj);
                kVar.getClass();
                int i4 = C1251a.f10802e;
                p pVar = new p();
                pVar.f162a = null;
                pVar.f163b = new ArrayList();
                pVar.f164c = null;
                pVar.f165d = "";
                HashMap hashMap = new HashMap();
                a3 = kVar.a();
                a3.beginTransaction();
                try {
                    C1251a c1251a = (C1251a) C0.k.h(a3.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new A0.b(kVar, hashMap, pVar, 3));
                    a3.setTransactionSuccessful();
                    return c1251a;
                } finally {
                }
            case 1:
                C0.k kVar2 = (C0.k) ((C0.d) obj);
                long d3 = kVar2.f209b.d() - kVar2.f211d.f195d;
                a3 = kVar2.a();
                a3.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d3)};
                    Cursor rawQuery = a3.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = rawQuery;
                        while (cursor.moveToNext()) {
                            kVar2.e(cursor.getInt(0), y0.c.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        rawQuery.close();
                        int delete = a3.delete("events", "timestamp_ms < ?", strArr);
                        a3.setTransactionSuccessful();
                        a3.endTransaction();
                        return Integer.valueOf(delete);
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                } finally {
                }
            case 2:
                C0.k kVar3 = (C0.k) ((m) obj).f155i;
                a3 = kVar3.a();
                a3.beginTransaction();
                try {
                    a3.compileStatement("DELETE FROM log_event_dropped").execute();
                    a3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + kVar3.f209b.d()).execute();
                    a3.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                o oVar = (o) obj;
                Iterator it = ((Iterable) ((C0.k) oVar.f159b).c(new C0.f(i3))).iterator();
                while (it.hasNext()) {
                    oVar.f160c.a((v0.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // P1.c
    public void n(Object obj) {
        switch (this.f130a) {
            case 6:
                boolean z = false;
                if (obj != null) {
                    try {
                        z = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e3) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e3);
                    }
                }
                ((A) ((g) this.f131b).f131b).a(z);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 23:
            default:
                boolean z2 = obj instanceof List;
                Object obj2 = ((C0110g) this.f131b).f1855b;
                if (!z2) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", "", "PermissionRequest", obj2);
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj3 = list.get(0);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj3, (String) obj4, (String) list.get(2)), "PermissionRequest", obj2);
                        break;
                    }
                }
                break;
            case 16:
                boolean z3 = obj instanceof List;
                long j3 = ((C0112i) this.f131b).f1860a;
                if (!z3) {
                    android.support.v4.media.session.a.k(new C0104a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""));
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j3);
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj5 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        Object obj6 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        android.support.v4.media.session.a.k(new C0104a((String) obj5, (String) obj6, (String) list2.get(2)));
                        Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j3);
                        break;
                    }
                }
                break;
            case 17:
                boolean z4 = obj instanceof List;
                Object obj7 = ((C0110g) this.f131b).f1855b;
                if (!z4) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", "", "AndroidMessage", obj7);
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj8 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj8, (String) obj9, (String) list3.get(2)), "AndroidMessage", obj7);
                        break;
                    }
                }
                break;
            case 18:
                boolean z5 = obj instanceof List;
                Object obj10 = ((C0110g) this.f131b).f1855b;
                if (!z5) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", "", "Certificate", obj10);
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj11 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        Object obj12 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj11, (String) obj12, (String) list4.get(2)), "Certificate", obj10);
                        break;
                    }
                }
                break;
            case C0642l9.f7777C /* 19 */:
                boolean z6 = obj instanceof List;
                Object obj13 = ((C0110g) this.f131b).f1855b;
                if (!z6) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", "", "ClientCertRequest", obj13);
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj14 = list5.get(0);
                        kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list5.get(1);
                        kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj14, (String) obj15, (String) list5.get(2)), "ClientCertRequest", obj13);
                        break;
                    }
                }
                break;
            case C0642l9.f7778D /* 20 */:
                boolean z7 = obj instanceof List;
                Object obj16 = ((C0110g) this.f131b).f1855b;
                if (!z7) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", "", "ConsoleMessage", obj16);
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj17 = list6.get(0);
                        kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        Object obj18 = list6.get(1);
                        kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj17, (String) obj18, (String) list6.get(2)), "ConsoleMessage", obj16);
                        break;
                    }
                }
                break;
            case C0642l9.f7779E /* 21 */:
                boolean z8 = obj instanceof List;
                Object obj19 = ((C0110g) this.f131b).f1855b;
                if (!z8) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", "", "CookieManager", obj19);
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj20 = list7.get(0);
                        kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list7.get(1);
                        kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj20, (String) obj21, (String) list7.get(2)), "CookieManager", obj19);
                        break;
                    }
                }
                break;
            case 22:
                boolean z9 = obj instanceof List;
                Object obj22 = ((C0110g) this.f131b).f1855b;
                if (!z9) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", "", "CustomViewCallback", obj22);
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj23 = list8.get(0);
                        kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        Object obj24 = list8.get(1);
                        kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj23, (String) obj24, (String) list8.get(2)), "CustomViewCallback", obj22);
                        break;
                    }
                }
                break;
            case 24:
                boolean z10 = obj instanceof List;
                Object obj25 = ((C0110g) this.f131b).f1855b;
                if (!z10) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", "", "FileChooserParams", obj25);
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj26 = list9.get(0);
                        kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list9.get(1);
                        kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj26, (String) obj27, (String) list9.get(2)), "FileChooserParams", obj25);
                        break;
                    }
                }
                break;
            case C0642l9.f7780F /* 25 */:
                boolean z11 = obj instanceof List;
                Object obj28 = ((C0110g) this.f131b).f1855b;
                if (!z11) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", "", "FlutterAssetManager", obj28);
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj29 = list10.get(0);
                        kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        Object obj30 = list10.get(1);
                        kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj29, (String) obj30, (String) list10.get(2)), "FlutterAssetManager", obj28);
                        break;
                    }
                }
                break;
            case C0642l9.f7781G /* 26 */:
                boolean z12 = obj instanceof List;
                Object obj31 = ((C0110g) this.f131b).f1855b;
                if (!z12) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", "", "GeolocationPermissionsCallback", obj31);
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj32 = list11.get(0);
                        kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list11.get(1);
                        kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj32, (String) obj33, (String) list11.get(2)), "GeolocationPermissionsCallback", obj31);
                        break;
                    }
                }
                break;
            case C0642l9.f7782H /* 27 */:
                boolean z13 = obj instanceof List;
                Object obj34 = ((C0110g) this.f131b).f1855b;
                if (!z13) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", "", "HttpAuthHandler", obj34);
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj35 = list12.get(0);
                        kotlin.jvm.internal.j.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        Object obj36 = list12.get(1);
                        kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj35, (String) obj36, (String) list12.get(2)), "HttpAuthHandler", obj34);
                        break;
                    }
                }
                break;
        }
    }

    @Override // n0.InterfaceC1154p
    public void onPurchaseHistoryResponse(C1147i c1147i, List list) {
        List list2;
        U1.n j3 = S0.a.j(c1147i);
        if (list == null) {
            list2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                Long valueOf = Long.valueOf(purchaseHistoryRecord.f2653c.optLong("purchaseTime"));
                String b3 = purchaseHistoryRecord.b();
                ArrayList a3 = purchaseHistoryRecord.a();
                String optString = purchaseHistoryRecord.f2653c.optString("developerPayload");
                Long valueOf2 = Long.valueOf(r5.optInt("quantity", 1));
                x xVar = new x();
                xVar.f1575a = valueOf2;
                xVar.f1576b = valueOf;
                xVar.f1577c = optString;
                String str = purchaseHistoryRecord.f2651a;
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                xVar.f1578d = str;
                if (b3 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                xVar.f1579e = b3;
                String str2 = purchaseHistoryRecord.f2652b;
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                xVar.f = str2;
                xVar.f1580g = a3;
                arrayList.add(xVar);
            }
            list2 = arrayList;
        }
        y yVar = new y();
        yVar.f1581a = j3;
        if (list2 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        yVar.f1582b = list2;
        ((C0084e) this.f131b).a(yVar);
    }

    @Override // n0.InterfaceC1155q
    public void onQueryPurchasesResponse(C1147i c1147i, List list) {
        U1.n j3 = S0.a.j(c1147i);
        List k3 = S0.a.k(list);
        U1.A a3 = new U1.A();
        a3.f1464a = j3;
        if (k3 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        a3.f1465b = k3;
        ((C0084e) this.f131b).a(a3);
    }
}
