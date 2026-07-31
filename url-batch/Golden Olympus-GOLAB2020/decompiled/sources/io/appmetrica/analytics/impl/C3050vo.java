package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3050vo {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3128yo f39989a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3128yo f39990b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3076wo f39991c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f39992d;

    public C3050vo(InterfaceC3128yo interfaceC3128yo, InterfaceC3128yo interfaceC3128yo2, InterfaceC3076wo interfaceC3076wo) {
        this.f39989a = interfaceC3128yo;
        this.f39990b = interfaceC3128yo2;
        this.f39991c = interfaceC3076wo;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f39992d == null) {
                JSONObject a4 = this.f39991c.a(a(this.f39989a), a(this.f39990b));
                this.f39992d = a4;
                a(a4);
            }
            jSONObject = this.f39992d;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileContents");
                jSONObject = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(InterfaceC3128yo interfaceC3128yo) {
        try {
            String a4 = interfaceC3128yo.a();
            return a4 != null ? new JSONObject(a4) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f39989a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f39990b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
