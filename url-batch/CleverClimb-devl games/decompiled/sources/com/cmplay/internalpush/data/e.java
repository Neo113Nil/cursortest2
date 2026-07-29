package com.cmplay.internalpush.data;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InfoForShowInsertScreen.java */
/* loaded from: classes.dex */
public class e extends d {
    private String m;
    private String n;
    private double o;

    public e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4223a = jSONObject.optLong("pro_id");
            this.f4225c = jSONObject.optString("pkg_name");
            this.f4224b = jSONObject.optString("pro_name");
            this.m = jSONObject.optString("bg_image_path");
            this.n = jSONObject.optString("btn_image_path");
            this.e = jSONObject.optInt("jump_type");
            this.f4226d = jSONObject.optString("jump_url");
            this.o = jSONObject.optDouble("btn_layout_percentage");
            this.l = jSONObject.optString("default_jump_url");
            String optString = jSONObject.optString("appstore");
            if (!TextUtils.isEmpty(optString)) {
                JSONArray jSONArray = new JSONArray(optString);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    this.k.add(new com.cmplay.base.util.b(jSONObject2.optString("app_pkg_in_appstore"), jSONObject2.optString("market_pkg")));
                }
            }
            this.i = jSONObject.optInt("display_type");
            this.j = jSONObject.optInt("priority");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String n() {
        return this.m;
    }

    public String o() {
        return this.n;
    }

    public double p() {
        return this.o;
    }
}
