package defpackage;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hx {
    public static final hx a = new hx();
    public static final ej b = mo.b();
    public static final ej c = mo.b();
    public static volatile Map d;
    public static volatile Map e;
    public static volatile boolean f;
    public static volatile Context g;
    public static volatile String h;

    static {
        ov ovVar = ov.d;
        ovVar.getClass();
        d = ovVar;
        e = ovVar;
        h = "";
    }

    public static void b(xj0 xj0Var, String str, String str2) {
        if (str2 == null || StringsKt.n(str2.toString())) {
            return;
        }
        xj0Var.put(str, str2);
    }

    public static Map c(JSONObject jSONObject) {
        if (jSONObject == null) {
            ov ovVar = ov.d;
            ovVar.getClass();
            return ovVar;
        }
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        lm b2 = j91.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object opt = jSONObject.opt((String) next);
            if (Intrinsics.a(opt, JSONObject.NULL)) {
                opt = null;
            }
            linkedHashMap.put(next, opt);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fn fnVar) {
        dx dxVar;
        int i;
        wc1 wc1Var;
        Map map;
        Map map2;
        Map map3;
        if (fnVar instanceof dx) {
            dxVar = (dx) fnVar;
            int i2 = dxVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dxVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dxVar.j;
                Object obj2 = tn.d;
                i = dxVar.l;
                int i3 = 1;
                dn dnVar = null;
                int i4 = 2;
                if (i != 0) {
                    ca0.v(obj);
                    ex exVar = new ex(i4, dnVar, 0);
                    dxVar.l = 1;
                    obj = y90.J(20000L, exVar, dxVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map3 = dxVar.i;
                            ca0.v(obj);
                            return new wc1((Map) obj, map3);
                        }
                        map2 = dxVar.h;
                        ca0.v(obj);
                        Map map4 = (Map) obj;
                        if (map4 == null) {
                            map4 = e;
                        }
                        dxVar.h = null;
                        dxVar.i = map4;
                        dxVar.l = 3;
                        Object d2 = d(map2, dxVar);
                        if (d2 != obj2) {
                            Map map5 = map4;
                            obj = d2;
                            map3 = map5;
                            return new wc1((Map) obj, map3);
                        }
                        return obj2;
                    }
                    ca0.v(obj);
                }
                wc1Var = (wc1) obj;
                if (wc1Var != null || (map = wc1Var.a) == null) {
                    map = d;
                    if (map.isEmpty()) {
                        map = ik0.c(new Pair("af_status", "Organic"), new Pair("af_message", "AppsFlyer conversion data timeout"));
                    }
                }
                map2 = map;
                ex exVar2 = new ex(i4, dnVar, i3);
                dxVar.h = map2;
                dxVar.l = 2;
                obj = y90.J(5000L, exVar2, dxVar);
            }
        }
        dxVar = new dx(this, fnVar);
        Object obj3 = dxVar.j;
        Object obj22 = tn.d;
        i = dxVar.l;
        int i32 = 1;
        dn dnVar2 = null;
        int i42 = 2;
        if (i != 0) {
        }
        wc1Var = (wc1) obj3;
        if (wc1Var != null) {
        }
        map = d;
        if (map.isEmpty()) {
        }
        map2 = map;
        ex exVar22 = new ex(i42, dnVar2, i32);
        dxVar.h = map2;
        dxVar.l = 2;
        obj3 = y90.J(5000L, exVar22, dxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r11 != r13) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Map map, fn fnVar) {
        gx gxVar;
        int i;
        Context context;
        String str;
        Context context2;
        String str2;
        if (fnVar instanceof gx) {
            gxVar = (gx) fnVar;
            int i2 = gxVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gxVar.n = i2 - Integer.MIN_VALUE;
                Object obj = gxVar.l;
                tn tnVar = tn.d;
                i = gxVar.n;
                dn dnVar = null;
                if (i != 0) {
                    ca0.v(obj);
                    Object obj2 = map.get("af_status");
                    String obj3 = obj2 != null ? obj2.toString() : null;
                    if ((obj3 == null ? false : obj3.equalsIgnoreCase("Organic")) && (context = g) != null) {
                        str = h;
                        if (StringsKt.n(str)) {
                            str = null;
                        }
                        if (str != null) {
                            String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
                            if (appsFlyerUID == null) {
                                appsFlyerUID = "";
                            }
                            if (!StringsKt.n(appsFlyerUID)) {
                                gxVar.h = map;
                                gxVar.i = context;
                                gxVar.j = str;
                                gxVar.k = appsFlyerUID;
                                gxVar.n = 1;
                                if (mo.l(5000L, gxVar) != tnVar) {
                                    context2 = context;
                                    str2 = appsFlyerUID;
                                }
                                return tnVar;
                            }
                        }
                    }
                    return map;
                }
                if (i != 1) {
                    if (i != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = gxVar.h;
                    ca0.v(obj);
                    Map map2 = (Map) obj;
                    if (map2 == null) {
                        return map;
                    }
                    d = map2;
                    Object obj4 = map2.get("af_status");
                    Object obj5 = map2.get("media_source");
                    Object obj6 = map2.get("campaign");
                    Objects.toString(obj4);
                    Objects.toString(obj5);
                    Objects.toString(obj6);
                    return map2;
                }
                String str3 = gxVar.k;
                str = gxVar.j;
                context2 = gxVar.i;
                Map map3 = gxVar.h;
                ca0.v(obj);
                str2 = str3;
                map = map3;
                String str4 = str;
                String packageName = context2.getPackageName();
                packageName.getClass();
                gxVar.h = map;
                gxVar.i = null;
                gxVar.j = null;
                gxVar.k = null;
                gxVar.n = 2;
                nq nqVar = ls.a;
                obj = uq1.V(fq.g, new fx(packageName, str4, str2, dnVar, 0), gxVar);
            }
        }
        gxVar = new gx(this, fnVar);
        Object obj7 = gxVar.l;
        tn tnVar2 = tn.d;
        i = gxVar.n;
        dn dnVar2 = null;
        if (i != 0) {
        }
        String str42 = str;
        String packageName2 = context2.getPackageName();
        packageName2.getClass();
        gxVar.h = map;
        gxVar.i = null;
        gxVar.j = null;
        gxVar.k = null;
        gxVar.n = 2;
        nq nqVar2 = ls.a;
        obj7 = uq1.V(fq.g, new fx(packageName2, str42, str2, dnVar2, 0), gxVar);
    }
}
