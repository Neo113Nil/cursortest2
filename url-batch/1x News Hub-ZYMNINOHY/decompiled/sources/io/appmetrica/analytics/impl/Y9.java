package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6899b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6900c;

    public Y9(JSONObject jSONObject) {
        this.f6898a = jSONObject.getString("name");
        this.f6900c = jSONObject.getBoolean("required");
        this.f6899b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y9.class == obj.getClass()) {
            Y9 y9 = (Y9) obj;
            if (this.f6899b != y9.f6899b || this.f6900c != y9.f6900c) {
                return false;
            }
            String str = this.f6898a;
            String str2 = y9.f6898a;
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
        String str = this.f6898a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f6899b) * 31) + (this.f6900c ? 1 : 0);
    }

    public Y9(String str, int i3, boolean z) {
        this.f6898a = str;
        this.f6899b = i3;
        this.f6900c = z;
    }
}
