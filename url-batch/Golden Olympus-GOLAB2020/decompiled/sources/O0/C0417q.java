package O0;

import com.ironsource.da;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* renamed from: O0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0417q extends G {

    /* renamed from: g, reason: collision with root package name */
    private String f1247g = "";

    @Override // O0.U
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonUrlParts.PROTOCOL_VERSION, "3");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.f1114d);
        jSONObject.put("appid", this.f1111a);
        jSONObject.put("hmac", this.f1247g);
        jSONObject.put("chifer", this.f1116f);
        jSONObject.put(da.a.f15878d, this.f1112b);
        jSONObject.put("servicetag", this.f1113c);
        jSONObject.put("requestid", this.f1115e);
        return jSONObject;
    }

    public void g(String str) {
        this.f1247g = str;
    }
}
