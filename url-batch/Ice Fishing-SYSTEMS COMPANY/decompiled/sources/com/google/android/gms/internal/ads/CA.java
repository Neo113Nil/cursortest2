package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class CA {

    /* renamed from: a, reason: collision with root package name */
    public final String f24145a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24146b;

    public CA(String str, String str2) {
        this.f24145a = str;
        this.f24146b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CA) {
            CA ca = (CA) obj;
            String str = this.f24145a;
            if (str != null ? str.equals(ca.f24145a) : ca.f24145a == null) {
                String str2 = this.f24146b;
                if (str2 != null ? str2.equals(ca.f24146b) : ca.f24146b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24145a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f24146b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f24145a;
        int length = String.valueOf(str).length();
        String str2 = this.f24146b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        AbstractC5051n.j(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
