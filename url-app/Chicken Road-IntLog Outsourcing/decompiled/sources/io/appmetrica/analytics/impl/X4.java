package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* loaded from: classes.dex */
public class X4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7698b;

    public X4(String str, String str2) {
        this.f7697a = str;
        this.f7698b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f7698b);
    }

    public final String b() {
        return this.f7698b;
    }

    public final String c() {
        return this.f7697a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f7697a + "_" + ApiKeyUtils.createPartialApiKey(this.f7698b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        X4 x42 = (X4) obj;
        String str = this.f7697a;
        if (str == null ? x42.f7697a != null : !str.equals(x42.f7697a)) {
            return false;
        }
        String str2 = this.f7698b;
        String str3 = x42.f7698b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.f7697a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7698b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f7697a + "_" + this.f7698b;
    }
}
