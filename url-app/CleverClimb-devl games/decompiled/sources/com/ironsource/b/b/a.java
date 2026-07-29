package com.ironsource.b.b;

import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AbstractEventsFormatter.java */
/* loaded from: classes2.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f6724a;

    /* renamed from: b, reason: collision with root package name */
    int f6725b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6726c = "eventId";

    /* renamed from: d, reason: collision with root package name */
    private final String f6727d = TapjoyConstants.TJC_TIMESTAMP;
    private final String e = "adUnit";
    private final String f = "InterstitialEvents";
    private final String g = "events";
    private final String h = "events";
    private String i;

    private String a(int i) {
        switch (i) {
        }
        return "events";
    }

    public abstract String a(ArrayList<com.ironsource.a.b> arrayList, JSONObject jSONObject);

    protected abstract String b();

    public abstract String c();

    a() {
    }

    JSONObject a(com.ironsource.a.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject(bVar.c());
            jSONObject.put("eventId", bVar.a());
            jSONObject.put(TapjoyConstants.TJC_TIMESTAMP, bVar.b());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    String a(JSONArray jSONArray) {
        try {
            if (this.f6724a == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f6724a.toString());
            jSONObject.put(TapjoyConstants.TJC_TIMESTAMP, com.ironsource.b.h.g.e());
            jSONObject.put("adUnit", this.f6725b);
            jSONObject.put(a(this.f6725b), jSONArray);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    String a() {
        return TextUtils.isEmpty(this.i) ? b() : this.i;
    }

    void a(String str) {
        this.i = str;
    }
}
