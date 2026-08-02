package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class R9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10880b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10881c;

    public R9(JSONObject jSONObject) {
        this.f10879a = jSONObject.getString("name");
        this.f10881c = jSONObject.getBoolean("required");
        this.f10880b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R9.class == obj.getClass()) {
            R9 r9 = (R9) obj;
            if (this.f10880b != r9.f10880b || this.f10881c != r9.f10881c) {
                return false;
            }
            String str = this.f10879a;
            String str2 = r9.f10879a;
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
        String str = this.f10879a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f10880b) * 31) + (this.f10881c ? 1 : 0);
    }

    public R9(String str, int i4, boolean z) {
        this.f10879a = str;
        this.f10880b = i4;
        this.f10881c = z;
    }
}
