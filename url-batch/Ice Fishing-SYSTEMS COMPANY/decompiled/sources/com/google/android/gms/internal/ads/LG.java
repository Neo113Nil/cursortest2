package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class LG extends UG {

    /* renamed from: a, reason: collision with root package name */
    public final int f26132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26133b;

    /* renamed from: c, reason: collision with root package name */
    public final C3731pE f26134c;

    public LG(int i, int i4, C3731pE c3731pE) {
        this.f26132a = i;
        this.f26133b = i4;
        this.f26134c = c3731pE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f26134c != C3731pE.f33362K;
    }

    public final int b() {
        C3731pE c3731pE = C3731pE.f33362K;
        int i = this.f26133b;
        C3731pE c3731pE2 = this.f26134c;
        if (c3731pE2 == c3731pE) {
            return i;
        }
        if (c3731pE2 == C3731pE.f33360H || c3731pE2 == C3731pE.f33361I || c3731pE2 == C3731pE.J) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LG)) {
            return false;
        }
        LG lg = (LG) obj;
        return lg.f26132a == this.f26132a && lg.b() == b() && lg.f26134c == this.f26134c;
    }

    public final int hashCode() {
        return Objects.hash(LG.class, Integer.valueOf(this.f26132a), Integer.valueOf(this.f26133b), this.f26134c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26134c);
        int length = valueOf.length();
        int i = this.f26133b;
        int length2 = String.valueOf(i).length();
        int i4 = this.f26132a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i4).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        return AbstractC5051n.d(i4, "-byte tags, and ", "-byte key)", sb);
    }
}
