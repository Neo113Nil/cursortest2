package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116yo {

    /* renamed from: a, reason: collision with root package name */
    public final Bo f13087a;

    /* renamed from: b, reason: collision with root package name */
    public final Bo f13088b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1142zo f13089c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f13090d;

    public C1116yo(Bo bo, Bo bo2, InterfaceC1142zo interfaceC1142zo) {
        this.f13087a = bo;
        this.f13088b = bo2;
        this.f13089c = interfaceC1142zo;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f13090d == null) {
                JSONObject a3 = this.f13089c.a(a(this.f13087a), a(this.f13088b));
                this.f13090d = a3;
                a(a3);
            }
            jSONObject = this.f13090d;
            if (jSONObject == null) {
                kotlin.jvm.internal.i.i("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(Bo bo) {
        try {
            String a3 = bo.a();
            return a3 != null ? new JSONObject(a3) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f13087a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f13088b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
