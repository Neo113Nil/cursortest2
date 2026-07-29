package com.facebook.ads.internal.adapters;

import android.graphics.Color;
import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4942a = Color.parseColor("#90949c");

    /* renamed from: b, reason: collision with root package name */
    public static final int f4943b = Color.parseColor("#4b4f56");

    /* renamed from: c, reason: collision with root package name */
    public static final int f4944c = Color.parseColor("#f6f7f9");

    /* renamed from: d, reason: collision with root package name */
    public static final int f4945d = Color.parseColor("#ff4080ff");
    public static final int e = Color.parseColor("#23272F");
    public static final int f = Color.parseColor("#ff4080ff");
    private static final long serialVersionUID = 8946536326456653736L;
    private int g = f4942a;
    private int h = f4943b;
    private int i = -16777216;
    private int j = f4944c;
    private int k = f4945d;
    private int l = -1;
    private int m = -16777216;

    public static j a(JSONObject jSONObject) {
        j jVar = new j();
        if (jSONObject != null) {
            String optString = jSONObject.optString("accent_color");
            String optString2 = jSONObject.optString("body_color");
            String optString3 = jSONObject.optString("subtitle_color");
            String optString4 = jSONObject.optString("bg_color");
            String optString5 = jSONObject.optString("cta_color");
            String optString6 = jSONObject.optString("cta_text_color");
            String optString7 = jSONObject.optString("title_color");
            if (!TextUtils.isEmpty(optString)) {
                jVar.g = Color.parseColor(optString);
            }
            if (!TextUtils.isEmpty(optString2)) {
                jVar.h = Color.parseColor(optString2);
            }
            if (!TextUtils.isEmpty(optString3)) {
                jVar.i = Color.parseColor(optString3);
            }
            if (!TextUtils.isEmpty(optString4)) {
                jVar.j = Color.parseColor(optString4);
            }
            if (!TextUtils.isEmpty(optString5)) {
                jVar.k = Color.parseColor(optString5);
            }
            if (!TextUtils.isEmpty(optString6)) {
                jVar.l = Color.parseColor(optString6);
            }
            if (!TextUtils.isEmpty(optString7)) {
                jVar.m = Color.parseColor(optString7);
            }
        }
        return jVar;
    }

    public int a(boolean z) {
        if (z) {
            return -1;
        }
        return this.g;
    }

    public int b(boolean z) {
        if (z) {
            return -1;
        }
        return this.h;
    }

    public int c(boolean z) {
        if (z) {
            return -1;
        }
        return this.i;
    }

    public int d(boolean z) {
        return z ? e : this.j;
    }

    public int e(boolean z) {
        if (z) {
            return -1;
        }
        return this.k;
    }

    public int f(boolean z) {
        return z ? f : this.l;
    }

    public int g(boolean z) {
        if (z) {
            return -1;
        }
        return this.m;
    }
}
