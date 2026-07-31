package J0;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f795a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f796b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f797c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f795a = grsBaseInfo;
        this.f796b = context;
    }

    private String f() {
        Set h4 = G0.b.a(this.f796b.getPackageName()).h();
        if (h4.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = h4.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.d("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String g() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f797c.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.f796b;
    }

    public void b(String str) {
        this.f797c.add(str);
    }

    public GrsBaseInfo c() {
        return this.f795a;
    }

    public String d() {
        return this.f797c.size() == 0 ? f() : g();
    }

    public Set e() {
        return this.f797c;
    }
}
