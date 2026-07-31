package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f11665a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11666b;

    public s5(String str, String str2) {
        this.f11665a = str;
        this.f11666b = str2;
    }

    public final String a() {
        return this.f11665a;
    }

    public final String b() {
        return this.f11666b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s5.class == obj.getClass()) {
            s5 s5Var = (s5) obj;
            if (TextUtils.equals(this.f11665a, s5Var.f11665a) && TextUtils.equals(this.f11666b, s5Var.f11666b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11665a.hashCode() * 31) + this.f11666b.hashCode();
    }

    public final String toString() {
        String str = this.f11665a;
        String str2 = this.f11666b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
