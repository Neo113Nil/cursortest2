package G0;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends a {
    public c(Context context, boolean z4) {
        this.f691d = z4;
        if (a("grs_sdk_global_route_config.json", context) == 0) {
            this.f690c = true;
        }
    }

    private List w(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                N0.b bVar = new N0.b();
                bVar.e(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.g(jSONObject2.getString("name"));
                bVar.b(jSONObject2.getString("description"));
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        hashSet.add((String) jSONArray.get(i4));
                    }
                    bVar.c(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e4) {
            Logger.w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return new ArrayList();
        }
    }

    @Override // G0.a
    public int i(String str) {
        this.f688a = new N0.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            long j4 = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f688a.f(string);
            this.f688a.c(j4);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e4) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return -1;
        }
    }

    @Override // G0.a
    public int m(String str) {
        JSONObject jSONObject;
        this.f689b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() == 0) {
                return 0;
            }
            this.f689b.addAll(w(jSONObject));
            return 0;
        } catch (JSONException e4) {
            Logger.w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010d A[Catch: JSONException -> 0x0072, TryCatch #0 {JSONException -> 0x0072, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0024, B:9:0x003a, B:12:0x0043, B:13:0x0056, B:15:0x005c, B:17:0x006d, B:18:0x0087, B:19:0x009d, B:21:0x00a3, B:23:0x00b7, B:30:0x00bd, B:34:0x00ce, B:35:0x0075, B:37:0x007b, B:38:0x0080, B:41:0x00e2, B:43:0x00ed, B:44:0x00fc, B:45:0x0106, B:47:0x010d, B:48:0x0114, B:52:0x00f2, B:54:0x00f8, B:55:0x0101), top: B:2:0x000c }] */
    @Override // G0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int s(String str) {
        JSONObject jSONObject;
        String str2;
        String str3 = "countryGroup";
        String str4 = "countryOrAreaGroup";
        try {
            JSONObject jSONObject2 = new JSONObject(str).getJSONObject("services");
            Iterator<String> keys = jSONObject2.keys();
            while (true) {
                int i4 = 0;
                if (!keys.hasNext()) {
                    return 0;
                }
                String next = keys.next();
                N0.c cVar = new N0.c();
                cVar.f(next);
                if (!this.f692e.contains(next)) {
                    this.f692e.add(next);
                    if (this.f691d) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        cVar.h(jSONObject3.getString("routeBy"));
                        JSONArray jSONArray = jSONObject3.getJSONArray("servings");
                        while (i4 < jSONArray.length()) {
                            JSONObject jSONObject4 = (JSONObject) jSONArray.get(i4);
                            N0.d dVar = new N0.d();
                            if (jSONObject4.has(str4)) {
                                str2 = jSONObject4.getString(str4);
                            } else if (jSONObject4.has(str3)) {
                                str2 = jSONObject4.getString(str3);
                            } else {
                                Logger.v("LocalManagerV1", "maybe this service routeBy is unconditional.");
                                str2 = "no-country";
                            }
                            dVar.b(str2);
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("addresses");
                            String str5 = str3;
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                            Iterator<String> keys2 = jSONObject5.keys();
                            while (keys2.hasNext()) {
                                Iterator<String> it = keys2;
                                String next2 = keys2.next();
                                String string = jSONObject5.getString(next2);
                                if (TextUtils.isEmpty(next2) || TextUtils.isEmpty(string)) {
                                    keys2 = it;
                                } else {
                                    concurrentHashMap.put(next2, jSONObject5.getString(next2));
                                    keys2 = it;
                                    str4 = str4;
                                }
                            }
                            dVar.c(concurrentHashMap);
                            cVar.c(dVar.d(), dVar);
                            i4++;
                            str3 = str5;
                            str4 = str4;
                        }
                        String str6 = str3;
                        String str7 = str4;
                        List list = null;
                        if (jSONObject3.has("countryOrAreaGroups")) {
                            jSONObject = jSONObject3.getJSONObject("countryOrAreaGroups");
                        } else if (jSONObject3.has("countryGroups")) {
                            jSONObject = jSONObject3.getJSONObject("countryGroups");
                        } else {
                            Logger.v("LocalManagerV1", "service use default countryOrAreaGroup");
                            cVar.d(list);
                            if (this.f688a == null) {
                                this.f688a = new N0.a();
                            }
                            this.f688a.d(next, cVar);
                            str3 = str6;
                            str4 = str7;
                        }
                        list = v(null, jSONObject);
                        cVar.d(list);
                        if (this.f688a == null) {
                        }
                        this.f688a.d(next, cVar);
                        str3 = str6;
                        str4 = str7;
                    }
                }
            }
        } catch (JSONException e4) {
            Logger.w("LocalManagerV1", "parse 1.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e4.getMessage()));
            return -1;
        }
    }

    public List v(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : w(jSONObject);
    }
}
