package com.onevcat.uniwebview;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0051i extends AbstractC0054j {
    public final String a;

    public C0051i(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0051i) && Intrinsics.areEqual(this.a, ((C0051i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Normal(url=" + this.a + ')';
    }
}
