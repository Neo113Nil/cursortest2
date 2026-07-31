package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.ironsource.b9;

/* loaded from: classes3.dex */
public final class ze0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35575a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35576b;

    public ze0(String str, String str2) {
        this.f35575a = str;
        this.f35576b = str2;
    }

    public final String a() {
        return this.f35575a;
    }

    public final String b() {
        return this.f35576b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ze0.class == obj.getClass()) {
            ze0 ze0Var = (ze0) obj;
            if (TextUtils.equals(this.f35575a, ze0Var.f35575a) && TextUtils.equals(this.f35576b, ze0Var.f35576b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35576b.hashCode() + (this.f35575a.hashCode() * 31);
    }

    public final String toString() {
        return "Header[name=" + this.f35575a + ",value=" + this.f35576b + b9.i.f15552e;
    }
}
