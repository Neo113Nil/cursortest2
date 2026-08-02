package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* loaded from: classes.dex */
public class Q4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10836a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10837b;

    public Q4(String str, String str2) {
        this.f10836a = str;
        this.f10837b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f10837b);
    }

    public final String b() {
        return this.f10837b;
    }

    public final String c() {
        return this.f10836a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f10836a + "_" + ApiKeyUtils.createPartialApiKey(this.f10837b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Q4 q4 = (Q4) obj;
            String str = this.f10836a;
            if (str == null ? q4.f10836a != null : !str.equals(q4.f10836a)) {
                return false;
            }
            String str2 = this.f10837b;
            String str3 = q4.f10837b;
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
        String str = this.f10836a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10837b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f10836a + "_" + this.f10837b;
    }
}
