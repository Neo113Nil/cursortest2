package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* loaded from: classes.dex */
public class X4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6861b;

    public X4(String str, String str2) {
        this.f6860a = str;
        this.f6861b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f6861b);
    }

    public final String b() {
        return this.f6861b;
    }

    public final String c() {
        return this.f6860a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f6860a + "_" + ApiKeyUtils.createPartialApiKey(this.f6861b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            X4 x4 = (X4) obj;
            String str = this.f6860a;
            if (str == null ? x4.f6860a != null : !str.equals(x4.f6860a)) {
                return false;
            }
            String str2 = this.f6861b;
            String str3 = x4.f6861b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6860a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6861b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f6860a + "_" + this.f6861b;
    }
}
