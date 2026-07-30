package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.sQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3904sQ {

    /* renamed from: a, reason: collision with root package name */
    public final String f34244a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34245b;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C3904sQ(String str, String str2) {
        this.f34244a = AbstractC3548lu.q(str);
        this.f34245b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3904sQ.class == obj.getClass()) {
            C3904sQ c3904sQ = (C3904sQ) obj;
            if (Objects.equals(this.f34244a, c3904sQ.f34244a) && Objects.equals(this.f34245b, c3904sQ.f34245b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f34245b.hashCode() * 31;
        String str = this.f34244a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f34244a;
        int length = String.valueOf(str).length();
        String str2 = this.f34245b;
        StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        AbstractC5051n.j(sb, "{ lang=", str, ", '", str2);
        sb.append("' }");
        return sb.toString();
    }
}
