package O0;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: O0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0423x implements U {

    /* renamed from: a, reason: collision with root package name */
    private List f1276a;

    /* renamed from: b, reason: collision with root package name */
    private G f1277b;

    /* renamed from: c, reason: collision with root package name */
    private e0 f1278c;

    /* renamed from: d, reason: collision with root package name */
    private U f1279d;

    /* renamed from: e, reason: collision with root package name */
    private String f1280e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f1281f;

    public C0423x(String str) {
        this.f1281f = str;
    }

    @Override // O0.U
    public JSONObject a() {
        String str;
        List list = this.f1276a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f1277b == null || this.f1278c == null || this.f1279d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f1277b.a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject a4 = this.f1279d.a();
            a4.put("properties", this.f1278c.a());
            try {
                a4.put("events_global_properties", new JSONObject(this.f1280e));
            } catch (JSONException unused) {
                a4.put("events_global_properties", this.f1280e);
            }
            jSONObject2.put("events_common", a4);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f1276a.iterator();
            while (it.hasNext()) {
                JSONObject a5 = ((C0406f) it.next()).a();
                if (a5 != null) {
                    jSONArray.put(a5);
                } else {
                    j0.l("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put("events", jSONArray);
            try {
                String c4 = Q.c(H.g(jSONObject2.toString().getBytes("UTF-8")), this.f1281f);
                if (TextUtils.isEmpty(c4)) {
                    j0.l("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put("event", c4);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        j0.l("hmsSdk", str);
        return null;
    }

    public void b(G g4) {
        this.f1277b = g4;
    }

    public void c(K k4) {
        this.f1279d = k4;
    }

    public void d(e0 e0Var) {
        this.f1278c = e0Var;
    }

    public void e(String str) {
        if (str != null) {
            this.f1280e = str;
        }
    }

    public void f(List list) {
        this.f1276a = list;
    }
}
