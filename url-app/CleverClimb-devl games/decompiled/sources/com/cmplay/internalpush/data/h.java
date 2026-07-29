package com.cmplay.internalpush.data;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InfoForShowSmallVideo.java */
/* loaded from: classes.dex */
public class h extends d {
    protected ArrayList<com.cmplay.base.util.b> m = new ArrayList<>();
    private long n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private int t;
    private int u;
    private int v;
    private String w;
    private int x;
    private String y;
    private int z;

    public h(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4, ArrayList<com.cmplay.base.util.b> arrayList, String str7, int i5, long j2) {
        this.n = j;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = str5;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = str6;
        this.x = i4;
        this.m.addAll(arrayList);
        this.y = str7;
        this.j = j2;
        this.z = i5;
    }

    public h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.n = jSONObject.optLong("pro_id");
            this.o = jSONObject.optString("pkg_name");
            this.p = jSONObject.optString(TJAdUnitConstants.String.TITLE);
            this.q = jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET);
            this.r = jSONObject.optString("video_url");
            this.s = jSONObject.optString("video_path");
            this.t = jSONObject.optInt("video_width");
            this.u = jSONObject.optInt("video_height");
            this.v = jSONObject.optInt("jump_type");
            this.w = jSONObject.optString("jump_url");
            this.x = jSONObject.optInt("display_type");
            String optString = jSONObject.optString("appstore");
            this.y = jSONObject.optString("default_jump_url");
            this.j = jSONObject.optInt("priority");
            if (!TextUtils.isEmpty(optString)) {
                JSONArray jSONArray = new JSONArray(optString);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    this.m.add(new com.cmplay.base.util.b(jSONObject2.optString("app_pkg_in_appstore"), jSONObject2.optString("market_pkg")));
                }
            }
            this.z = jSONObject.optInt("scene");
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
            jSONObject.put("video_url", this.r);
            jSONObject.put("video_path", this.s);
            jSONObject.put("video_width", this.t);
            jSONObject.put("video_height", this.u);
            jSONObject.put("jump_type", this.v);
            jSONObject.put("jump_url", this.w);
            jSONObject.put("display_type", this.x);
            jSONObject.put("default_jump_url", this.y);
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
            jSONObject.put("scene", this.z);
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
        return this.q;
    }

    public String p() {
        return this.s;
    }

    @Override // com.cmplay.internalpush.data.d
    public int g() {
        return this.v;
    }

    @Override // com.cmplay.internalpush.data.d
    public String f() {
        return this.w;
    }

    @Override // com.cmplay.internalpush.data.d
    public int h() {
        return this.x;
    }

    @Override // com.cmplay.internalpush.data.d
    public ArrayList<com.cmplay.base.util.b> i() {
        return this.m;
    }

    @Override // com.cmplay.internalpush.data.d
    public String b() {
        return this.y;
    }
}
