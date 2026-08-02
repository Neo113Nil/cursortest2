package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ao {

    /* renamed from: a, reason: collision with root package name */
    public final Do f5793a;

    /* renamed from: b, reason: collision with root package name */
    public final Do f5794b;

    /* renamed from: c, reason: collision with root package name */
    public final Bo f5795c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f5796d;

    public Ao(Do r12, Do r22, Bo bo) {
        this.f5793a = r12;
        this.f5794b = r22;
        this.f5795c = bo;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f5796d == null) {
                JSONObject a3 = this.f5795c.a(a(this.f5793a), a(this.f5794b));
                this.f5796d = a3;
                a(a3);
            }
            jSONObject = this.f5796d;
            if (jSONObject == null) {
                kotlin.jvm.internal.j.g("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(Do r12) {
        try {
            String a3 = r12.a();
            return a3 != null ? new JSONObject(a3) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f5793a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f5794b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
