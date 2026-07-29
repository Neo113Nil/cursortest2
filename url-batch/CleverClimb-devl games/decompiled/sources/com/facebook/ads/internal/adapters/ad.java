package com.facebook.ads.internal.adapters;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.tapjoy.TJAdUnitConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ad implements Serializable {
    private static final long serialVersionUID = -5352540727250859603L;

    /* renamed from: a, reason: collision with root package name */
    private final String f4894a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4895b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f4896c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4897d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final int k;
    private final int l;
    private final j m;
    private final j n;
    private final double o;
    private final int p;
    private final List<String> q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private String v;
    private String w;

    private ad(String str, String str2, byte[] bArr, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, j jVar, j jVar2, double d2, int i3, List<String> list, String str10, String str11, String str12, String str13) {
        this.f4894a = str;
        this.f4895b = str2;
        this.f4896c = bArr;
        this.f4897d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = i;
        this.l = i2;
        this.m = jVar;
        this.n = jVar2;
        this.o = d2;
        this.p = i3;
        this.q = list;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = str13;
    }

    public static ad a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("layout");
        return new ad(jSONObject.optString("video_url"), jSONObject.optString("ct"), com.facebook.ads.internal.j.c.a(jSONObject.optString("end_card_markup")), jSONObject.optString("activation_command"), jSONObject.optString("advertiser_name"), jSONObject.optString(TJAdUnitConstants.String.TITLE), jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET), jSONObject.optString("body"), jSONObject.optJSONObject("icon") != null ? jSONObject.optJSONObject("icon").optString("url") : "", jSONObject.optJSONObject("image") != null ? jSONObject.optJSONObject("image").optString("url") : "", jSONObject.optInt("skippable_seconds"), jSONObject.optInt("video_duration_sec"), optJSONObject != null ? j.a(optJSONObject.optJSONObject(TJAdUnitConstants.String.PORTRAIT)) : new j(), optJSONObject != null ? j.a(optJSONObject.optJSONObject(TJAdUnitConstants.String.LANDSCAPE)) : new j(), jSONObject.optDouble("rating_value", 0.0d), jSONObject.optInt("rating_count", 0), a(jSONObject.optJSONArray("end_card_images")), jSONObject.optString("fbad_command"), jSONObject.optString("call_to_action"), jSONObject.optString("ad_choices_link_url"), b(jSONObject));
    }

    private static List<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }

    private static String b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("generic_text");
        return optJSONObject == null ? "Sponsored" : optJSONObject.optString("sponsored", "Sponsored");
    }

    public String a() {
        return this.f4894a;
    }

    void a(String str) {
        this.v = str;
    }

    public String b() {
        return this.f4895b;
    }

    void b(String str) {
        this.w = str;
    }

    public byte[] c() {
        return this.f4896c;
    }

    public String d() {
        return this.f4897d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public String i() {
        return this.i;
    }

    public String j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public String l() {
        return this.v;
    }

    int m() {
        return this.l;
    }

    public j n() {
        return this.m;
    }

    public List<String> o() {
        return Collections.unmodifiableList(this.q);
    }

    public String p() {
        return this.r;
    }

    public String q() {
        return this.s;
    }

    public String r() {
        return this.t;
    }

    public String s() {
        return this.w;
    }

    public String t() {
        return this.u;
    }
}
