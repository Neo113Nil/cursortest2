package N0;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f1034a;

    /* renamed from: b, reason: collision with root package name */
    private String f1035b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f1036c = new ConcurrentHashMap(16);

    /* renamed from: d, reason: collision with root package name */
    private List f1037d = new ArrayList(16);

    public d a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (d) this.f1036c.get(str);
        }
        Logger.w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    public List b() {
        return this.f1037d;
    }

    public void c(String str, d dVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        this.f1036c.put(str, dVar);
    }

    public void d(List list) {
        this.f1037d = list;
    }

    public String e() {
        return this.f1035b;
    }

    public void f(String str) {
        this.f1034a = str;
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.f1034a);
        jSONObject.put("routeBy", this.f1035b);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f1036c.keySet().iterator();
        while (it.hasNext()) {
            d dVar = (d) this.f1036c.get((String) it.next());
            if (dVar != null) {
                jSONArray.put(dVar.e());
            }
        }
        jSONObject.put("servings", jSONArray);
        if (this.f1037d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f1037d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((b) it2.next()).f());
            }
            jSONObject.put("countryGroups", jSONArray2);
        }
        return jSONObject;
    }

    public void h(String str) {
        this.f1035b = str;
    }
}
