package com.onevcat.uniwebview;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends l {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String url) {
        super(0);
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Normal(url=" + this.a + ')';
    }
}
