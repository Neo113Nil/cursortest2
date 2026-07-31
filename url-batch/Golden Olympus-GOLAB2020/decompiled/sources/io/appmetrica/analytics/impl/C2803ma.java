package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2803ma {

    /* renamed from: a, reason: collision with root package name */
    public final String f39442a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39443b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39444c;

    public C2803ma(JSONObject jSONObject) {
        this.f39442a = jSONObject.getString("name");
        this.f39444c = jSONObject.getBoolean("required");
        this.f39443b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2803ma.class == obj.getClass()) {
            C2803ma c2803ma = (C2803ma) obj;
            if (this.f39443b != c2803ma.f39443b || this.f39444c != c2803ma.f39444c) {
                return false;
            }
            String str = this.f39442a;
            String str2 = c2803ma.f39442a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39442a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f39443b) * 31) + (this.f39444c ? 1 : 0);
    }

    public C2803ma(String str, int i4, boolean z4) {
        this.f39442a = str;
        this.f39443b = i4;
        this.f39444c = z4;
    }
}
