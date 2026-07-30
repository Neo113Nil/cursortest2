package com.onevcat.uniwebview.internal.obfuscated;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109t0 {
    public final List a;
    public final float b;

    public C0109t0(List rects, float f) {
        Intrinsics.checkNotNullParameter(rects, "rects");
        this.a = rects;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0109t0)) {
            return false;
        }
        C0109t0 c0109t0 = (C0109t0) obj;
        return Intrinsics.areEqual(this.a, c0109t0.a) && Float.compare(this.b, c0109t0.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransparencyMask(rects=" + this.a + ", scale=" + this.b + ')';
    }
}
