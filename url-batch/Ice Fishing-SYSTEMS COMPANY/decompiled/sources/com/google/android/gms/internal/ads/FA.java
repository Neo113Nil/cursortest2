package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class FA {

    /* renamed from: a, reason: collision with root package name */
    public final int f24923a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24924b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24925c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f24926d;

    public FA(int i, String str, int i4, Boolean bool) {
        this.f24923a = i;
        this.f24924b = str;
        this.f24925c = i4;
        this.f24926d = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FA) {
            FA fa = (FA) obj;
            if (this.f24923a == fa.f24923a) {
                String str = fa.f24924b;
                String str2 = this.f24924b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f24925c == fa.f24925c) {
                        Boolean bool = fa.f24926d;
                        Boolean bool2 = this.f24926d;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24924b;
        int hashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.f24926d;
        return (bool != null ? bool.hashCode() : 0) ^ ((((hashCode ^ ((this.f24923a ^ 1000003) * 1000003)) * 1000003) ^ this.f24925c) * 1000003);
    }

    public final String toString() {
        int i = this.f24923a;
        int length = String.valueOf(i).length();
        String str = this.f24924b;
        int length2 = String.valueOf(str).length();
        int i4 = this.f24925c;
        int length3 = String.valueOf(i4).length();
        Boolean bool = this.f24926d;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i4);
        sb.append(", userInteracted=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
