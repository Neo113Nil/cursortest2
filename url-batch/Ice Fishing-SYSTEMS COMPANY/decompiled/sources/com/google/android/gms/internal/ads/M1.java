package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class M1 implements L1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26278a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26279b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26280c;

    /* renamed from: d, reason: collision with root package name */
    public final C3904sQ f26281d;

    public M1(long j9, long j10, boolean z8, C3904sQ c3904sQ) {
        boolean z9 = true;
        if (j9 != com.anythink.basead.exoplayer.b.f6539b && j10 != com.anythink.basead.exoplayer.b.f6539b && j9 > j10) {
            z9 = false;
        }
        PA.n(z9);
        this.f26278a = j9;
        this.f26279b = j10;
        this.f26280c = z8;
        this.f26281d = c3904sQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M1.class == obj.getClass()) {
            M1 m12 = (M1) obj;
            if (this.f26278a == m12.f26278a && this.f26279b == m12.f26279b && this.f26280c == m12.f26280c && Objects.equals(this.f26281d, m12.f26281d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f26279b) + ((Long.hashCode(this.f26278a) + 527) * 31);
        C3904sQ c3904sQ = this.f26281d;
        return (((hashCode * 31) + (this.f26280c ? 1 : 0)) * 31) + (c3904sQ != null ? c3904sQ.hashCode() : 0);
    }

    public final String toString() {
        String sb;
        long j9 = this.f26278a;
        Object valueOf = j9 == com.anythink.basead.exoplayer.b.f6539b ? "UNSET" : Long.valueOf(j9);
        long j10 = this.f26279b;
        String obj = valueOf.toString();
        if (j10 == com.anythink.basead.exoplayer.b.f6539b) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 12);
            sb2.append(", endTimeMs=");
            sb2.append(j10);
            sb = sb2.toString();
        }
        C3904sQ c3904sQ = this.f26281d;
        String concat = c3904sQ == null ? "" : ", title=".concat(c3904sQ.toString());
        String str = true == this.f26280c ? ", hidden" : "";
        StringBuilder sb3 = new StringBuilder(str.length() + sb.length() + obj.length() + 21 + concat.length());
        AbstractC5051n.j(sb3, "Chapter: startTimeMs=", obj, sb, str);
        sb3.append(concat);
        return sb3.toString();
    }
}
