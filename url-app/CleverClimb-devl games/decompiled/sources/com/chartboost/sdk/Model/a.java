package com.chartboost.sdk.Model;

import com.applovin.mediation.AppLovinNativeAdapter;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f3610a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3611b;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final int o;
    public final String p;
    public final String q;
    public final b r;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, b> f3612c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, String> f3613d = new HashMap();
    public final Map<String, List<String>> n = new HashMap();
    public final HashSet<String> s = new HashSet<>();

    public a(int i, JSONObject jSONObject, boolean z) throws JSONException {
        this.f3611b = i;
        this.f3610a = jSONObject;
        this.f = jSONObject.getString(AppLovinNativeAdapter.KEY_EXTRA_AD_ID);
        this.g = jSONObject.getString("cgn");
        this.h = jSONObject.getString("creative");
        this.i = jSONObject.optString("deep-link");
        this.j = jSONObject.getString("link");
        this.m = jSONObject.getString(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_TO);
        this.o = jSONObject.optInt("animation");
        this.p = jSONObject.optString("media-type");
        this.q = jSONObject.optString("name");
        if (i == 1) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("webview");
            JSONArray jSONArray = jSONObject2.getJSONArray("elements");
            String str = "";
            int i2 = 0;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                String string = jSONObject3.getString("name");
                String optString = jSONObject3.optString("param");
                String string2 = jSONObject3.getString("type");
                String string3 = jSONObject3.getString("value");
                if (string2.equals("param")) {
                    this.f3613d.put(optString, string3);
                    if (string.equals("reward_amount")) {
                        i2 = Integer.valueOf(string3).intValue();
                    } else if (string.equals("reward_currency")) {
                        str = string3;
                    }
                } else {
                    if (string2.equals("html") && optString.isEmpty()) {
                        optString = "body";
                    } else if (optString.isEmpty()) {
                        optString = string;
                    }
                    this.f3612c.put(optString, new b(string2, string, string3));
                }
            }
            this.k = i2;
            this.l = str;
            this.r = this.f3612c.get("body");
            if (this.r == null) {
                throw new RuntimeException("WebView AdUnit does not have a template html body asset");
            }
            this.e = jSONObject2.getString("template");
            JSONObject optJSONObject = jSONObject.optJSONObject("events");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray2 = optJSONObject.getJSONArray(next);
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        arrayList.add(jSONArray2.getString(i4));
                    }
                    this.n.put(next, arrayList);
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("certification_providers");
            if (optJSONArray != null) {
                for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                    this.s.add(optJSONArray.getString(i5));
                }
                return;
            }
            return;
        }
        if (z) {
            String string4 = jSONObject.getJSONObject("icons").getString("lg");
            this.f3612c.put("lg", new b("inPlayIcons", string4.substring(string4.lastIndexOf("/") + 1), string4));
            this.k = 0;
            this.l = "";
        } else {
            JSONObject jSONObject4 = jSONObject.getJSONObject("assets");
            Iterator<String> keys2 = jSONObject4.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject5 = jSONObject4.getJSONObject(next2);
                String str2 = (next2.equals("video-portrait") || next2.equals("video-landscape")) ? "videos" : "images";
                String optString2 = jSONObject5.optString("id", null);
                if (optString2 == null) {
                    optString2 = jSONObject5.getString("checksum") + ".png";
                }
                this.f3612c.put(next2, new b(str2, optString2, jSONObject5.getString("url")));
            }
            this.k = jSONObject.optInt("reward");
            this.l = jSONObject.optString("currency-name");
        }
        this.r = null;
        this.e = "";
    }
}
