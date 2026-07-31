package N0;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f1030a;

    /* renamed from: b, reason: collision with root package name */
    private String f1031b;

    /* renamed from: c, reason: collision with root package name */
    private Set f1032c;

    /* renamed from: d, reason: collision with root package name */
    private String f1033d;

    public Set a() {
        return this.f1032c;
    }

    public void b(String str) {
        this.f1033d = str;
    }

    public void c(Set set) {
        this.f1032c = set;
    }

    public String d() {
        return this.f1030a;
    }

    public void e(String str) {
        this.f1030a = str;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f1030a);
        jSONObject.put("name", this.f1031b);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f1032c.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put("countries", jSONArray);
        jSONObject.put("description", this.f1033d);
        return jSONObject;
    }

    public void g(String str) {
        this.f1031b = str;
    }
}
