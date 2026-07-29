package com.ironsource.a;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventData.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f6706a;

    /* renamed from: b, reason: collision with root package name */
    private long f6707b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f6708c;

    public b(int i, long j, JSONObject jSONObject) {
        this.f6706a = -1;
        this.f6707b = -1L;
        this.f6706a = i;
        this.f6707b = j;
        if (jSONObject == null) {
            this.f6708c = new JSONObject();
        } else {
            this.f6708c = jSONObject;
        }
    }

    public b(int i, JSONObject jSONObject) {
        this.f6706a = -1;
        this.f6707b = -1L;
        this.f6706a = i;
        this.f6707b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f6708c = new JSONObject();
        } else {
            this.f6708c = jSONObject;
        }
    }

    public int a() {
        return this.f6706a;
    }

    public long b() {
        return this.f6707b;
    }

    public String c() {
        return this.f6708c.toString();
    }

    public JSONObject d() {
        return this.f6708c;
    }

    public void a(String str, Object obj) {
        try {
            this.f6708c.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
