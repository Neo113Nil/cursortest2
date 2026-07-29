package com.cmplay.internalpush.video;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InnerPushModel.java */
/* loaded from: classes.dex */
public class b extends com.cmplay.internalpush.data.d {
    private String A;
    private int B;
    private String C;
    private int D;
    protected ArrayList<com.cmplay.base.util.b> m = new ArrayList<>();
    private long n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private int v;
    private int w;
    private int x;
    private String y;
    private long z;

    public b(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, String str8, long j2, String str9, int i4, ArrayList<com.cmplay.base.util.b> arrayList, String str10, int i5, long j3) {
        this.n = j;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = str5;
        this.t = str6;
        this.u = str7;
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = str8;
        this.z = j2;
        this.A = str9;
        this.B = i4;
        this.m.addAll(arrayList);
        this.C = str10;
        this.j = j3;
        this.D = i5;
    }

    public b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.n = jSONObject.optLong("pro_id");
            this.o = jSONObject.optString("pkg_name");
            this.p = jSONObject.optString(TJAdUnitConstants.String.TITLE);
            this.q = jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET);
            this.r = jSONObject.optString("icon_url");
            this.s = jSONObject.optString("video_url");
            this.t = jSONObject.optString("video_path");
            this.u = jSONObject.optString("bg_image_url");
            this.v = jSONObject.optInt("video_width");
            this.w = jSONObject.optInt("video_height");
            this.x = jSONObject.optInt("jump_type");
            this.y = jSONObject.optString("jump_url");
            this.z = jSONObject.optLong("comment_star");
            this.A = jSONObject.optString("downloads");
            this.B = jSONObject.optInt("display_type");
            String optString = jSONObject.optString("appstore");
            this.C = jSONObject.optString("default_jump_url");
            this.j = jSONObject.optInt("priority");
            if (!TextUtils.isEmpty(optString)) {
                JSONArray jSONArray = new JSONArray(optString);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    this.m.add(new com.cmplay.base.util.b(jSONObject2.optString("app_pkg_in_appstore"), jSONObject2.optString("market_pkg")));
                }
            }
            this.D = jSONObject.optInt("scene");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pro_id", this.n);
            jSONObject.put("pkg_name", this.o);
            jSONObject.put(TJAdUnitConstants.String.TITLE, this.p);
            jSONObject.put(FacebookAdapter.KEY_SUBTITLE_ASSET, this.q);
            jSONObject.put("icon_url", this.r);
            jSONObject.put("video_url", this.s);
            jSONObject.put("video_path", this.t);
            jSONObject.put("bg_image_url", this.u);
            jSONObject.put("video_width", this.v);
            jSONObject.put("video_height", this.w);
            jSONObject.put("jump_type", this.x);
            jSONObject.put("jump_url", this.y);
            jSONObject.put("comment_star", this.z);
            jSONObject.put("downloads", this.A);
            jSONObject.put("display_type", this.B);
            jSONObject.put("default_jump_url", this.C);
            jSONObject.put("priority", this.j);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.cmplay.base.util.b> it = this.m.iterator();
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
            jSONObject.put("scene", this.D);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.cmplay.internalpush.data.d
    public long c() {
        return this.n;
    }

    @Override // com.cmplay.internalpush.data.d
    public String e() {
        return this.o;
    }

    public String o() {
        return this.p;
    }

    public String p() {
        return this.q;
    }

    public String q() {
        return this.r;
    }

    public String r() {
        return this.t;
    }

    public String s() {
        return this.u;
    }

    public int t() {
        return this.v;
    }

    public int u() {
        return this.w;
    }

    @Override // com.cmplay.internalpush.data.d
    public int g() {
        return this.x;
    }

    @Override // com.cmplay.internalpush.data.d
    public String f() {
        return this.y;
    }

    public long v() {
        return this.z;
    }

    public String w() {
        return this.A;
    }

    @Override // com.cmplay.internalpush.data.d
    public int h() {
        return this.B;
    }

    @Override // com.cmplay.internalpush.data.d
    public ArrayList<com.cmplay.base.util.b> i() {
        return this.m;
    }

    @Override // com.cmplay.internalpush.data.d
    public String b() {
        return this.C;
    }

    public int x() {
        return this.D;
    }
}
