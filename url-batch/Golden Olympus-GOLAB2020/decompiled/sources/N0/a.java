package N0;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f1027a;

    /* renamed from: b, reason: collision with root package name */
    private long f1028b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f1029c = new ConcurrentHashMap(16);

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (c) this.f1029c.get(str);
        }
        Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    public String b() {
        return this.f1027a;
    }

    public void c(long j4) {
        this.f1028b = j4;
    }

    public void d(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f1029c.put(str, cVar);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", TextUtils.isEmpty(this.f1027a) ? "" : this.f1027a);
        jSONObject.put("cacheControl", this.f1028b);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f1029c.keySet().iterator();
        while (it.hasNext()) {
            c cVar = (c) this.f1029c.get((String) it.next());
            if (cVar != null) {
                jSONArray.put(cVar.g());
            }
        }
        Logger.i("ApplicationBean", "local config save to sp, services count:" + jSONArray.length());
        jSONObject.put("services", jSONArray);
        return jSONObject;
    }

    public void f(String str) {
        this.f1027a = str;
    }
}
