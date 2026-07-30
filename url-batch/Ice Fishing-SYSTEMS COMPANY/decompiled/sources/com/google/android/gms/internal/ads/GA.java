package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class GA {

    /* renamed from: a, reason: collision with root package name */
    public final String f25106a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25107b;

    public GA(String str, String str2) {
        this.f25106a = str;
        this.f25107b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GA) {
            GA ga = (GA) obj;
            String str = this.f25106a;
            if (str != null ? str.equals(ga.f25106a) : ga.f25106a == null) {
                String str2 = this.f25107b;
                if (str2 != null ? str2.equals(ga.f25107b) : ga.f25107b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25106a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f25107b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f25106a;
        int length = String.valueOf(str).length();
        String str2 = this.f25107b;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        AbstractC5051n.j(sb, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
