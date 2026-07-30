package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081m extends AbstractC0085n {
    public final String a;

    public C0081m(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0081m) && Intrinsics.areEqual(this.a, ((C0081m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Normal(url=" + this.a + ')';
    }
}
