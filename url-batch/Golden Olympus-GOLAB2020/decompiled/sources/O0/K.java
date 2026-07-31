package O0;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class K extends f0 {

    /* renamed from: b, reason: collision with root package name */
    private String f1126b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f1127c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f1128d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f1129e = "";

    /* renamed from: f, reason: collision with root package name */
    protected String f1130f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f1131g;

    @Override // O0.U
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f1215a);
        jSONObject.put(CommonUrlParts.HUAWEI_OAID, this.f1131g);
        jSONObject.put(CommonUrlParts.UUID, this.f1130f);
        jSONObject.put("upid", this.f1129e);
        jSONObject.put("imei", this.f1126b);
        jSONObject.put("sn", this.f1127c);
        jSONObject.put("udid", this.f1128d);
        return jSONObject;
    }

    public void b(String str) {
        this.f1126b = str;
    }

    public void c(String str) {
        this.f1131g = str;
    }

    public void d(String str) {
        this.f1127c = str;
    }

    public void e(String str) {
        this.f1128d = str;
    }

    public void f(String str) {
        this.f1129e = str;
    }

    public void g(String str) {
        this.f1130f = str;
    }
}
