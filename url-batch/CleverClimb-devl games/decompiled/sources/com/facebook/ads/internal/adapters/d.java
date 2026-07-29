package com.facebook.ads.internal.adapters;

import com.google.ads.mediation.facebook.FacebookAdapter;
import com.tapjoy.TJAdUnitConstants;
import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements Serializable {
    private static final long serialVersionUID = 85021702336014823L;

    /* renamed from: a, reason: collision with root package name */
    private final String f4910a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4911b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4912c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4913d;
    private final String e;
    private final String f;
    private final int g;
    private final int h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final int l;

    private d(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, boolean z, boolean z2, int i3) {
        this.f4910a = str;
        this.f4911b = str2;
        this.f4912c = str3;
        this.f4913d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = i2;
        this.i = str7;
        this.j = z;
        this.k = z2;
        this.l = i3;
    }

    static d a(JSONObject jSONObject) {
        int i;
        int i2;
        String optString = jSONObject.optString(TJAdUnitConstants.String.TITLE);
        String optString2 = jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET);
        String optString3 = jSONObject.optString("body");
        String optString4 = jSONObject.optString("call_to_action");
        if ("null".equalsIgnoreCase(optString4)) {
            optString4 = "";
        }
        String str = optString4;
        String optString5 = jSONObject.optString("fbad_command");
        if ("null".equalsIgnoreCase(optString5)) {
            optString5 = "";
        }
        String str2 = optString5;
        String str3 = "";
        JSONObject optJSONObject = jSONObject.optJSONObject("image");
        if (optJSONObject != null) {
            str3 = optJSONObject.optString("url");
            i = Integer.parseInt(optJSONObject.optString("width"));
            i2 = Integer.parseInt(optJSONObject.optString("height"));
        } else {
            i = 0;
            i2 = 0;
        }
        String optString6 = jSONObject.optString("video_url");
        boolean optBoolean = jSONObject.optBoolean("video_autoplay_enabled");
        return new d(optString, optString2, optString3, str, str2, str3, i, i2, optString6, optBoolean, jSONObject.optBoolean("video_autoplay_with_sound"), optBoolean ? jSONObject.optInt("unskippable_seconds", 0) : 0);
    }

    public String a() {
        return this.f4910a;
    }

    public String b() {
        return this.f4911b;
    }

    public String c() {
        return this.f4912c;
    }

    public String d() {
        return this.f4913d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public String i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    public int l() {
        return this.l;
    }
}
