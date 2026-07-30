package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3125e2 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f30277b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30278c;

    public C3125e2(String str, String str2, String str3) {
        super(str);
        this.f30277b = str2;
        this.f30278c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3125e2.class == obj.getClass()) {
            C3125e2 c3125e2 = (C3125e2) obj;
            if (this.f28771a.equals(c3125e2.f28771a) && Objects.equals(this.f30277b, c3125e2.f30277b) && Objects.equals(this.f30278c, c3125e2.f30278c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f28771a.hashCode() + 527;
        String str = this.f30277b;
        return this.f30278c.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.Y1
    public final String toString() {
        String str = this.f28771a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.f30278c;
        return D.y.o(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
