package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120w {
    public final EnumC0128y a;
    public final EnumC0124x b;
    public final String c;

    public C0120w(EnumC0128y onTap, EnumC0124x onLongPress, String str) {
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        this.a = onTap;
        this.b = onLongPress;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0120w)) {
            return false;
        }
        C0120w c0120w = (C0120w) obj;
        return this.a == c0120w.a && this.b == c0120w.b && Intrinsics.areEqual(this.c, c0120w.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TitleInteraction(onTap=" + this.a + ", onLongPress=" + this.b + ", copyToastText=" + this.c + ')';
    }
}
