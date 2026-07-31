package O0;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o0 extends e0 {

    /* renamed from: f, reason: collision with root package name */
    String f1239f;

    /* renamed from: g, reason: collision with root package name */
    String f1240g;

    /* renamed from: h, reason: collision with root package name */
    private String f1241h;

    @Override // O0.U
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_rom_ver", this.f1241h);
        jSONObject.put("_emui_ver", this.f1204a);
        jSONObject.put("_model", Build.MODEL);
        jSONObject.put("_mcc", this.f1239f);
        jSONObject.put("_mnc", this.f1240g);
        jSONObject.put("_package_name", this.f1205b);
        jSONObject.put("_app_ver", this.f1206c);
        jSONObject.put("_lib_ver", "2.2.0.315");
        jSONObject.put("_channel", this.f1207d);
        jSONObject.put("_lib_name", "hianalytics");
        jSONObject.put("_oaid_tracking_flag", this.f1208e);
        return jSONObject;
    }

    public void f(String str) {
        this.f1239f = str;
    }

    public void g(String str) {
        this.f1240g = str;
    }

    public void h(String str) {
        this.f1241h = str;
    }
}
