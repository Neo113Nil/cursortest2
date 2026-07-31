package com.onevcat.uniwebview;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {
    public final String a;
    public final byte[] b;

    public p(String str, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = str;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.a, pVar.a) && Intrinsics.areEqual(this.b, pVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return Arrays.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ParsedDataUrl(mediaType=" + this.a + ", data=" + Arrays.toString(this.b) + ')';
    }
}
