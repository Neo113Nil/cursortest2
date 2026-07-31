package G0;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected N0.a f688a;

    /* renamed from: b, reason: collision with root package name */
    protected List f689b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f690c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f691d = false;

    /* renamed from: e, reason: collision with root package name */
    protected Set f692e = new HashSet(16);

    private Map f(List list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N0.b bVar = (N0.b) it.next();
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.d());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.d());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.d());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.d());
            }
        }
        return concurrentHashMap;
    }

    private int j(String str, Context context) {
        if (t(K0.c.a(str, context)) != 0) {
            return -1;
        }
        Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    private int t(String str) {
        int m4;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.f691d && (m4 = m(str)) != 0) {
            return m4;
        }
        int i4 = i(str);
        return i4 != 0 ? i4 : s(str);
    }

    private int u(String str) {
        List list;
        int q4;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.f691d || !((list = this.f689b) == null || list.isEmpty()) || (q4 = q(str)) == 0) ? r(str) : q4;
    }

    int a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(GrsApp.getInstance().getBrand("/"));
        sb.append(str);
        return j(sb.toString(), context) != 0 ? -1 : 0;
    }

    public String b(Context context, F0.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z4) {
        Map e4 = e(context, aVar, grsBaseInfo, str, z4);
        if (e4 != null) {
            return (String) e4.get(str2);
        }
        Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    public String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List list = this.f689b;
        if (list != null && !list.isEmpty()) {
            for (N0.b bVar : this.f689b) {
                if (bVar.a().contains(str)) {
                    return bVar.d();
                }
            }
        }
        return null;
    }

    public List d(JSONArray jSONArray) {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            N0.b bVar = new N0.b();
            bVar.e(jSONObject.getString("id"));
            bVar.g(jSONObject.getString("name"));
            bVar.b(jSONObject.getString("description"));
            String str = "countriesOrAreas";
            if (!jSONObject.has("countriesOrAreas")) {
                str = "countries";
                if (!jSONObject.has("countries")) {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    jSONArray2 = null;
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null || jSONArray2.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                        hashSet.add((String) jSONArray2.get(i5));
                    }
                    bVar.c(hashSet);
                    arrayList.add(bVar);
                }
            }
            jSONArray2 = jSONObject.getJSONArray(str);
            HashSet hashSet2 = new HashSet(16);
            if (jSONArray2 != null) {
            }
            return new ArrayList();
        }
        return arrayList;
    }

    public Map e(Context context, F0.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z4) {
        N0.a aVar2 = this.f688a;
        if (aVar2 == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        N0.c a4 = aVar2.a(str);
        if (a4 == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String b4 = e.b(context, aVar, a4.e(), grsBaseInfo, z4);
        if (b4 == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", a4.e());
            return null;
        }
        List b5 = a4.b();
        N0.d a5 = a4.a((b5 == null || b5.size() == 0) ? c(b4) : (String) f(b5, grsBaseInfo, b4).get(b4));
        if (a5 == null) {
            return null;
        }
        return a5.a();
    }

    public JSONObject g() {
        JSONObject e4 = this.f688a.e();
        if (this.f689b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f689b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((N0.b) it.next()).f());
            }
            e4.put("countryGroups", jSONArray);
        }
        return e4;
    }

    public void h(Context context, List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
            if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
            } else {
                Object[] objArr = {str};
                if (u(K0.c.a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                    Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", objArr);
                } else {
                    Logger.w("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", objArr);
                }
            }
        }
    }

    public abstract int i(String str);

    public N0.a k() {
        return this.f688a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void l(JSONArray jSONArray) {
        List list;
        String str;
        Iterator<String> keys;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            N0.c cVar = new N0.c();
            String string = jSONObject.getString("name");
            cVar.f(string);
            if (!this.f692e.contains(string)) {
                this.f692e.add(string);
                if (this.f691d) {
                    cVar.h(jSONObject.getString("routeBy"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("servings");
                    for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray2.get(i5);
                        N0.d dVar = new N0.d();
                        String str2 = "countryOrAreaGroup";
                        if (!jSONObject2.has("countryOrAreaGroup")) {
                            str2 = "countryGroup";
                            if (!jSONObject2.has("countryGroup")) {
                                Logger.v("AbstractLocalManager", "maybe this service{%s} routeBy is unconditional.", string);
                                str = "no-country";
                                dVar.b(str);
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("addresses");
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                                keys = jSONObject3.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    String string2 = jSONObject3.getString(next);
                                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                                        concurrentHashMap.put(next, jSONObject3.getString(next));
                                    }
                                }
                                dVar.c(concurrentHashMap);
                                cVar.c(dVar.d(), dVar);
                            }
                        }
                        str = jSONObject2.getString(str2);
                        dVar.b(str);
                        JSONObject jSONObject32 = jSONObject2.getJSONObject("addresses");
                        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(16);
                        keys = jSONObject32.keys();
                        while (keys.hasNext()) {
                        }
                        dVar.c(concurrentHashMap2);
                        cVar.c(dVar.d(), dVar);
                    }
                    String str3 = "countryOrAreaGroups";
                    if (!jSONObject.has("countryOrAreaGroups")) {
                        str3 = "countryGroups";
                        if (!jSONObject.has("countryGroups")) {
                            Logger.i("AbstractLocalManager", "service use default countryOrAreaGroup");
                            list = null;
                            cVar.d(list);
                            if (this.f688a == null) {
                                this.f688a = new N0.a();
                            }
                            this.f688a.d(string, cVar);
                        }
                    }
                    list = d(jSONObject.getJSONArray(str3));
                    cVar.d(list);
                    if (this.f688a == null) {
                    }
                    this.f688a.d(string, cVar);
                }
            }
        }
    }

    public abstract int m(String str);

    public Set n() {
        return this.f692e;
    }

    public boolean o() {
        return this.f690c;
    }

    public boolean p(String str) {
        String str2;
        try {
            this.f688a = new N0.a();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("name")) {
                this.f688a.f(jSONObject.getString("name"));
            }
            if (jSONObject.has("cacheControl")) {
                this.f688a.c(jSONObject.getLong("cacheControl"));
            }
            if (jSONObject.has("services")) {
                l(jSONObject.getJSONArray("services"));
            }
            if (jSONObject.has("countryGroups")) {
                JSONArray jSONArray = jSONObject.getJSONArray("countryGroups");
                ArrayList arrayList = new ArrayList(16);
                this.f689b = arrayList;
                arrayList.addAll(d(jSONArray));
            }
            Logger.i("AbstractLocalManager", "parse from sp services size : %d, countryGroups size: %d:", Integer.valueOf(this.f692e.size()), Integer.valueOf(this.f689b.size()));
            return true;
        } catch (JSONException unused) {
            str2 = "Parse local config from sp failed, JSONException";
            Logger.w("AbstractLocalManager", str2);
            return false;
        } catch (Throwable th) {
            str2 = "Parse local config from sp failed, Throwable:" + StringUtils.anonymizeMessage(th.getMessage());
            Logger.w("AbstractLocalManager", str2);
            return false;
        }
    }

    public int q(String str) {
        JSONArray jSONArray;
        this.f689b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            this.f689b.addAll(d(jSONArray));
            return 0;
        } catch (JSONException e4) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return -1;
        }
    }

    public int r(String str) {
        try {
            l(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e4) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return -1;
        }
    }

    public abstract int s(String str);
}
