package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108t {
    public final C0093p a;

    public C0108t(C0093p c0093p) {
        this.a = c0093p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0108t) && Intrinsics.areEqual(this.a, ((C0108t) obj).a);
    }

    public final int hashCode() {
        C0093p c0093p = this.a;
        if (c0093p == null) {
            return 0;
        }
        return c0093p.hashCode();
    }

    public final String toString() {
        return "ItemStyle(textColor=" + this.a + ')';
    }
}
