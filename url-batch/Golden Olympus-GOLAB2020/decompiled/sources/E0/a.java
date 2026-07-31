package E0;

import F0.c;
import H0.d;
import H0.g;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.framework.network.grs.IQueryUrlsCallBack;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f493e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f494a;

    /* renamed from: b, reason: collision with root package name */
    private F0.a f495b;

    /* renamed from: c, reason: collision with root package name */
    private g f496c;

    /* renamed from: d, reason: collision with root package name */
    private c f497d;

    /* renamed from: E0.a$a, reason: collision with other inner class name */
    private static class C0010a implements E0.b {

        /* renamed from: a, reason: collision with root package name */
        String f498a;

        /* renamed from: b, reason: collision with root package name */
        Map f499b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlsCallBack f500c;

        /* renamed from: d, reason: collision with root package name */
        Context f501d;

        /* renamed from: e, reason: collision with root package name */
        GrsBaseInfo f502e;

        /* renamed from: f, reason: collision with root package name */
        F0.a f503f;

        C0010a(String str, Map map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, F0.a aVar) {
            this.f498a = str;
            this.f499b = map;
            this.f500c = iQueryUrlsCallBack;
            this.f501d = context;
            this.f502e = grsBaseInfo;
            this.f503f = aVar;
        }

        @Override // E0.b
        public void a() {
            Map map = this.f499b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f498a, StringUtils.anonymizeMessage(new JSONObject(this.f499b).toString()));
                this.f500c.onCallBackSuccess(this.f499b);
                return;
            }
            if (this.f499b != null) {
                Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f498a);
                this.f500c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> d4 = G0.b.a(this.f501d.getPackageName()).d(this.f501d, this.f503f, this.f502e, this.f498a, true);
            if (d4 == null || d4.isEmpty()) {
                Logger.e(a.f493e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f498a);
            }
            if (d4 == null) {
                d4 = new ConcurrentHashMap<>();
            }
            Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f498a, StringUtils.anonymizeMessage(new JSONObject(d4).toString()));
            this.f500c.onCallBackSuccess(d4);
        }

        @Override // E0.b
        public void a(d dVar) {
            String y4 = dVar.y();
            Map<String, String> h4 = a.h(y4, this.f498a);
            if (!h4.isEmpty()) {
                Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.f498a, StringUtils.anonymizeMessage(new JSONObject(h4).toString()));
                this.f500c.onCallBackSuccess(h4);
                return;
            }
            Map map = this.f499b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.f498a, StringUtils.anonymizeMessage(new JSONObject(this.f499b).toString()));
                this.f500c.onCallBackSuccess(this.f499b);
                return;
            }
            if (this.f499b != null) {
                Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f498a);
                this.f500c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(y4)) {
                Logger.e(a.f493e, "The serviceName[%s] is not configured on the GRS server.", this.f498a);
            }
            Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> d4 = G0.b.a(this.f501d.getPackageName()).d(this.f501d, this.f503f, this.f502e, this.f498a, true);
            if (d4 == null || d4.isEmpty()) {
                Logger.e(a.f493e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f498a);
            }
            if (d4 == null) {
                d4 = new ConcurrentHashMap<>();
            }
            Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f498a, StringUtils.anonymizeMessage(new JSONObject(d4).toString()));
            this.f500c.onCallBackSuccess(d4);
        }
    }

    private static class b implements E0.b {

        /* renamed from: a, reason: collision with root package name */
        String f504a;

        /* renamed from: b, reason: collision with root package name */
        String f505b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlCallBack f506c;

        /* renamed from: d, reason: collision with root package name */
        String f507d;

        /* renamed from: e, reason: collision with root package name */
        Context f508e;

        /* renamed from: f, reason: collision with root package name */
        GrsBaseInfo f509f;

        /* renamed from: g, reason: collision with root package name */
        F0.a f510g;

        b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, F0.a aVar) {
            this.f504a = str;
            this.f505b = str2;
            this.f506c = iQueryUrlCallBack;
            this.f507d = str3;
            this.f508e = context;
            this.f509f = grsBaseInfo;
            this.f510g = aVar;
        }

        @Override // E0.b
        public void a() {
            if (!TextUtils.isEmpty(this.f507d)) {
                Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f504a, this.f505b, StringUtils.anonymizeMessage(this.f507d));
                this.f506c.onCallBackSuccess(this.f507d);
                return;
            }
            if (!TextUtils.isEmpty(this.f507d)) {
                Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f504a, this.f505b);
                this.f506c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String c4 = G0.b.a(this.f508e.getPackageName()).c(this.f508e, this.f510g, this.f509f, this.f504a, this.f505b, true);
            if (c4 == null || c4.isEmpty()) {
                Logger.e(a.f493e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f504a, this.f505b);
            }
            Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f504a, this.f505b, StringUtils.anonymizeMessage(c4));
            this.f506c.onCallBackSuccess(c4);
        }

        @Override // E0.b
        public void a(d dVar) {
            String y4 = dVar.y();
            Map h4 = a.h(y4, this.f504a);
            if (h4.containsKey(this.f505b)) {
                String str = a.f493e;
                String str2 = this.f504a;
                String str3 = this.f505b;
                Logger.i(str, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str2, str3, StringUtils.anonymizeMessage((String) h4.get(str3)));
                this.f506c.onCallBackSuccess((String) h4.get(this.f505b));
                return;
            }
            if (!TextUtils.isEmpty(this.f507d)) {
                String str4 = a.f493e;
                String str5 = this.f504a;
                String str6 = this.f505b;
                Logger.i(str4, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", str5, str6, StringUtils.anonymizeMessage((String) h4.get(str6)));
                this.f506c.onCallBackSuccess(this.f507d);
                return;
            }
            if (!TextUtils.isEmpty(this.f507d)) {
                Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f504a, this.f505b);
                this.f506c.onCallBackFail(-5);
                return;
            }
            if (!TextUtils.isEmpty(y4)) {
                Logger.e(a.f493e, "The serviceName[%s][%s] is not configured on the GRS server.", this.f504a, this.f505b);
            }
            Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String c4 = G0.b.a(this.f508e.getPackageName()).c(this.f508e, this.f510g, this.f509f, this.f504a, this.f505b, true);
            if (c4 == null || c4.isEmpty()) {
                Logger.e(a.f493e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f504a, this.f505b);
            }
            Logger.i(a.f493e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f504a, this.f505b, StringUtils.anonymizeMessage(c4));
            this.f506c.onCallBackSuccess(c4);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, F0.a aVar, g gVar, c cVar) {
        this.f494a = grsBaseInfo;
        this.f495b = aVar;
        this.f496c = gVar;
        this.f497d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z4) {
        return new CountryCodeBean(context, z4);
    }

    public static Map e(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(f493e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, i(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e4) {
            Logger.w(f493e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return concurrentHashMap;
        }
    }

    private Map f(String str, F0.b bVar, Context context) {
        Map b4 = this.f495b.b(this.f494a, str, bVar, context);
        if (b4 != null && !b4.isEmpty()) {
            Logger.i(f493e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return b4;
        }
        Map d4 = G0.b.a(context.getPackageName()).d(context, this.f495b, this.f494a, str, false);
        Logger.i(f493e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return d4 != null ? d4 : new HashMap();
    }

    public static Map h(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(f493e, "isSpExpire jsonValue from server is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(f493e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return hashMap;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next).toString());
            }
            return hashMap;
        } catch (JSONException e4) {
            Logger.w(f493e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return hashMap;
        }
    }

    public static Map i(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String obj = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(obj)) {
                    concurrentHashMap.put(next, obj);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e4) {
            Logger.w(f493e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return concurrentHashMap;
        }
    }

    public String c(Context context, String str, int i4) {
        d b4 = this.f496c.b(new J0.c(this.f494a, context), str, this.f497d, i4);
        return b4 == null ? "" : b4.B() ? this.f495b.a().a(this.f494a.getGrsParasKey(true, true, context), "") : b4.y();
    }

    public String d(String str, String str2, Context context, int i4) {
        String str3;
        String str4;
        F0.b bVar = new F0.b();
        String str5 = (String) f(str, bVar, context).get(str2);
        if (bVar.b() && !TextUtils.isEmpty(str5)) {
            Logger.i(f493e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str5));
            return str5;
        }
        String c4 = c(context, str, i4);
        String str6 = (String) h(c4, str).get(str2);
        if (!TextUtils.isEmpty(str6)) {
            Logger.i(f493e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str6));
            return str6;
        }
        if (TextUtils.isEmpty(str5)) {
            if (!TextUtils.isEmpty(c4)) {
                Logger.e(f493e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str7 = f493e;
            Logger.i(str7, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            str3 = str;
            str4 = str2;
            str5 = G0.b.a(context.getPackageName()).c(context, this.f495b, this.f494a, str3, str4, true);
            if (str5 == null || str5.isEmpty()) {
                Logger.e(str7, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str3, str4);
            }
        } else {
            str3 = str;
            str4 = str2;
        }
        Logger.i(f493e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str3, str4, StringUtils.anonymizeMessage(str5));
        return str5;
    }

    public Map g(String str, Context context, int i4) {
        String str2;
        F0.b bVar = new F0.b();
        Map f4 = f(str, bVar, context);
        if (bVar.b() && !f4.isEmpty()) {
            Logger.i(f493e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(f4).toString()));
            return f4;
        }
        String c4 = c(context, str, i4);
        Map h4 = h(c4, str);
        if (!h4.isEmpty()) {
            Logger.i(f493e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(h4).toString()));
            return h4;
        }
        if (f4.isEmpty()) {
            if (!TextUtils.isEmpty(c4)) {
                Logger.e(f493e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str3 = f493e;
            Logger.i(str3, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            str2 = str;
            f4 = G0.b.a(context.getPackageName()).d(context, this.f495b, this.f494a, str2, true);
            if (f4 == null || f4.isEmpty()) {
                Logger.e(str3, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str2);
            }
        } else {
            str2 = str;
        }
        Logger.i(f493e, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", str2, StringUtils.anonymizeMessage(f4 != null ? new JSONObject(f4).toString() : ""));
        return f4;
    }

    public void j(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i4) {
        F0.b bVar = new F0.b();
        Map<String, String> f4 = f(str, bVar, context);
        if (!bVar.b()) {
            this.f496c.g(new J0.c(this.f494a, context), new C0010a(str, f4, iQueryUrlsCallBack, context, this.f494a, this.f495b), str, this.f497d, i4);
        } else if (f4.isEmpty()) {
            Logger.i(f493e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = f493e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(f4).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(f4).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(f4);
        }
    }

    public void k(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i4) {
        F0.b bVar = new F0.b();
        String str3 = (String) f(str, bVar, context).get(str2);
        if (!bVar.b()) {
            this.f496c.g(new J0.c(this.f494a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f494a, this.f495b), str, this.f497d, i4);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(f493e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(f493e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
