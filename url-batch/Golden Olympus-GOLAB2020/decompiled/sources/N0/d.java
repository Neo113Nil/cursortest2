package N0;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f1038a;

    /* renamed from: b, reason: collision with root package name */
    private Map f1039b;

    public Map a() {
        return this.f1039b;
    }

    public void b(String str) {
        this.f1038a = str;
    }

    public void c(Map map) {
        this.f1039b = map;
    }

    public String d() {
        return this.f1038a;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("countryGroup", this.f1038a);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f1039b.keySet()) {
            jSONObject2.put(str, (String) this.f1039b.get(str));
        }
        jSONObject.put("addresses", jSONObject2);
        return jSONObject;
    }
}
