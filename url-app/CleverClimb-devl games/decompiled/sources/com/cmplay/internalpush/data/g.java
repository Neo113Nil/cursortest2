package com.cmplay.internalpush.data;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InfoForShowResultPg.java */
/* loaded from: classes.dex */
public class g extends d {
    private String m;
    private String n;
    private String o;
    private int p;
    private int q;

    public g(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, long j2) {
        this.f4223a = j;
        this.f4225c = str;
        this.f4224b = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = i;
        this.q = i2;
        this.e = i3;
        this.f4226d = str6;
        this.l = str7;
        this.j = j2;
    }

    public g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("pro_id")) {
                this.f4223a = jSONObject.getLong("pro_id");
            }
            if (!jSONObject.isNull("pkg_name")) {
                this.f4225c = jSONObject.getString("pkg_name");
            }
            if (!jSONObject.isNull("pro_name")) {
                this.f4224b = jSONObject.getString("pro_name");
            }
            if (!jSONObject.isNull("icon_image_path")) {
                this.m = jSONObject.getString("icon_image_path");
            }
            if (!jSONObject.isNull(TJAdUnitConstants.String.TITLE)) {
                this.n = jSONObject.getString(TJAdUnitConstants.String.TITLE);
            }
            if (!jSONObject.isNull(FacebookAdapter.KEY_SUBTITLE_ASSET)) {
                this.o = jSONObject.getString(FacebookAdapter.KEY_SUBTITLE_ASSET);
            }
            if (!jSONObject.isNull("pro_type")) {
                this.p = jSONObject.getInt("pro_type");
            }
            if (!jSONObject.isNull("reward_counts")) {
                this.q = jSONObject.getInt("reward_counts");
            }
            if (!jSONObject.isNull("jump_type")) {
                this.e = jSONObject.getInt("jump_type");
            }
            if (!jSONObject.isNull("jump_url")) {
                this.f4226d = jSONObject.getString("jump_url");
            }
            if (!jSONObject.isNull("default_jump_url")) {
                this.l = jSONObject.getString("default_jump_url");
            }
            this.j = jSONObject.optInt("priority");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pro_id", this.f4223a);
            jSONObject.put("pkg_name", this.f4225c);
            jSONObject.put("pro_name", this.f4224b);
            jSONObject.put("icon_image_path", this.m);
            jSONObject.put(TJAdUnitConstants.String.TITLE, this.n);
            jSONObject.put(FacebookAdapter.KEY_SUBTITLE_ASSET, this.o);
            jSONObject.put("pro_type", this.p);
            jSONObject.put("reward_counts", this.q);
            jSONObject.put("jump_type", this.e);
            jSONObject.put("jump_url", this.f4226d);
            jSONObject.put("default_jump_url", this.l);
            jSONObject.put("priority", this.j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
