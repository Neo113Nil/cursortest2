package com.cmplay.internalpush.data;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InfoForShowOpenScreen.java */
/* loaded from: classes.dex */
public class f extends d {
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private double s;
    private boolean t;
    private String u;
    private int v;
    private int w;

    public f(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, double d2, ArrayList<com.cmplay.base.util.b> arrayList, int i2, String str10, boolean z, String str11, int i3, int i4, int i5, String str12, boolean z2, long j2) {
        this.t = false;
        this.f4223a = j;
        this.f4225c = str;
        this.f4224b = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = str8;
        this.e = i;
        this.f4226d = str9;
        this.s = d2;
        this.k.addAll(arrayList);
        this.i = i2;
        this.l = str10;
        this.t = z;
        this.u = str11;
        this.v = i3;
        this.w = i4;
        this.h = i5;
        this.g = str12;
        this.f = z2;
        this.j = j2;
    }

    public f(String str) {
        this.t = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4223a = jSONObject.optLong("pro_id");
            this.f4225c = jSONObject.optString("pkg_name");
            this.f4224b = jSONObject.optString("pro_name");
            this.m = jSONObject.optString("icon_image_path");
            this.n = jSONObject.optString(TJAdUnitConstants.String.TITLE);
            this.o = jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET);
            this.p = jSONObject.optString("bg_image_path");
            this.q = jSONObject.optString("btn_image_path");
            this.r = jSONObject.optString("btn_image_path2");
            this.e = jSONObject.optInt("jump_type");
            this.f4226d = jSONObject.optString("jump_url");
            this.s = jSONObject.optDouble("btn_layout_percentage");
            this.l = jSONObject.optString("default_jump_url");
            this.h = jSONObject.optInt("show_type");
            this.g = jSONObject.optString("playable_url");
            this.f = jSONObject.optBoolean("button_moving");
            String optString = jSONObject.optString("appstore");
            if (!TextUtils.isEmpty(optString)) {
                JSONArray jSONArray = new JSONArray(optString);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    this.k.add(new com.cmplay.base.util.b(jSONObject2.optString("app_pkg_in_appstore"), jSONObject2.optString("market_pkg")));
                }
            }
            this.i = jSONObject.optInt("display_type");
            this.t = jSONObject.optBoolean("ad_tag_show");
            this.u = jSONObject.optString("video_path");
            this.v = jSONObject.optInt("video_width");
            this.w = jSONObject.optInt("video_height");
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
            jSONObject.put("bg_image_path", this.p);
            jSONObject.put("btn_image_path", this.q);
            jSONObject.put("btn_image_path2", this.r);
            jSONObject.put("jump_type", this.e);
            jSONObject.put("jump_url", this.f4226d);
            jSONObject.put("btn_layout_percentage", this.s);
            jSONObject.put("default_jump_url", this.l);
            jSONObject.put("button_moving", this.f);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.cmplay.base.util.b> it = this.k.iterator();
            while (it.hasNext()) {
                com.cmplay.base.util.b next = it.next();
                if (next != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_pkg_in_appstore", next.f3963b);
                    jSONObject2.put("market_pkg", next.f3962a);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("appstore", jSONArray);
            jSONObject.put("display_type", this.i);
            jSONObject.put("ad_tag_show", this.t);
            jSONObject.put("video_path", this.u);
            jSONObject.put("video_width", this.v);
            jSONObject.put("video_height", this.w);
            jSONObject.put("show_type", this.h);
            jSONObject.put("playable_url", this.g);
            jSONObject.put("priority", this.j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String o() {
        return this.m;
    }

    public String p() {
        return this.n;
    }

    public String q() {
        return this.p;
    }

    public String r() {
        return this.q;
    }

    public String s() {
        return this.r;
    }

    public double t() {
        return this.s;
    }

    public boolean u() {
        return this.t;
    }

    public String v() {
        return this.u;
    }
}
