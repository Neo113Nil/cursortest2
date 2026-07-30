package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D {
    public final String a;
    public final byte[] b;

    public D(String str, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = str;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return Intrinsics.areEqual(this.a, d.a) && Intrinsics.areEqual(this.b, d.b);
    }

    public final int hashCode() {
        String str = this.a;
        return Arrays.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ParsedDataUrl(mediaType=" + this.a + ", data=" + Arrays.toString(this.b) + ')';
    }
}
