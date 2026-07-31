package O0;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: O0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0406f implements U {

    /* renamed from: a, reason: collision with root package name */
    private String f1209a;

    /* renamed from: b, reason: collision with root package name */
    private String f1210b;

    /* renamed from: c, reason: collision with root package name */
    private String f1211c;

    /* renamed from: d, reason: collision with root package name */
    private String f1212d;

    /* renamed from: e, reason: collision with root package name */
    private String f1213e;

    /* renamed from: f, reason: collision with root package name */
    private String f1214f;

    @Override // O0.U
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f1209a);
        jSONObject.put("eventtime", this.f1212d);
        jSONObject.put("event", this.f1210b);
        jSONObject.put("event_session_name", this.f1213e);
        jSONObject.put("first_session_event", this.f1214f);
        if (TextUtils.isEmpty(this.f1211c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f1211c));
        return jSONObject;
    }

    public void b(String str) {
        this.f1211c = str;
    }

    public void c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f1210b = jSONObject.optString("event");
        this.f1211c = Q.b(jSONObject.optString("properties"), T.g().a());
        this.f1209a = jSONObject.optString("type");
        this.f1212d = jSONObject.optString("eventtime");
        this.f1213e = jSONObject.optString("event_session_name");
        this.f1214f = jSONObject.optString("first_session_event");
    }

    public String d() {
        return this.f1212d;
    }

    public void e(String str) {
        this.f1210b = str;
    }

    public String f() {
        return this.f1209a;
    }

    public void g(String str) {
        this.f1212d = str;
    }

    public JSONObject h() {
        JSONObject a4 = a();
        a4.put("properties", Q.d(this.f1211c, T.g().a()));
        return a4;
    }

    public void i(String str) {
        this.f1209a = str;
    }

    public void j(String str) {
        this.f1214f = str;
    }

    public void k(String str) {
        this.f1213e = str;
    }
}
