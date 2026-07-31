package com.ironsource;

import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class tk {

    /* renamed from: a, reason: collision with root package name */
    private String f19799a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f19800b;

    /* renamed from: c, reason: collision with root package name */
    private String f19801c;

    /* renamed from: d, reason: collision with root package name */
    private String f19802d;

    public tk(JSONObject jSONObject) {
        this.f19799a = jSONObject.optString(b9.f.f15367b);
        this.f19800b = jSONObject.optJSONObject(b9.f.f15368c);
        this.f19801c = jSONObject.optString("success");
        this.f19802d = jSONObject.optString(b9.f.f15370e);
    }

    public String a() {
        return this.f19802d;
    }

    public String b() {
        return this.f19799a;
    }

    public JSONObject c() {
        return this.f19800b;
    }

    public String d() {
        return this.f19801c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b9.f.f15367b, this.f19799a);
            jSONObject.put(b9.f.f15368c, this.f19800b);
            jSONObject.put("success", this.f19801c);
            jSONObject.put(b9.f.f15370e, this.f19802d);
            return jSONObject;
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return jSONObject;
        }
    }
}
