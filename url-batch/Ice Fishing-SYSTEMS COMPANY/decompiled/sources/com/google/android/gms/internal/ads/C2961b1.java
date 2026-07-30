package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2961b1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3070d1 f29379a;

    /* renamed from: b, reason: collision with root package name */
    public final C3070d1 f29380b;

    public C2961b1(C3070d1 c3070d1, C3070d1 c3070d12) {
        this.f29379a = c3070d1;
        this.f29380b = c3070d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2961b1.class == obj.getClass()) {
            C2961b1 c2961b1 = (C2961b1) obj;
            if (this.f29379a.equals(c2961b1.f29379a) && this.f29380b.equals(c2961b1.f29380b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29380b.hashCode() + (this.f29379a.hashCode() * 31);
    }

    public final String toString() {
        C3070d1 c3070d1 = this.f29379a;
        String c3070d12 = c3070d1.toString();
        C3070d1 c3070d13 = this.f29380b;
        String concat = c3070d1.equals(c3070d13) ? "" : ", ".concat(c3070d13.toString());
        return com.anythink.basead.b.c.i.q(new StringBuilder(AbstractC5051n.a(c3070d12.length() + 1, 1, concat)), "[", c3070d12, concat, "]");
    }
}
