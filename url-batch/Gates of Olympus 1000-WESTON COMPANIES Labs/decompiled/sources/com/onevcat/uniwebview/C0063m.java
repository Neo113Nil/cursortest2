package com.onevcat.uniwebview;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0063m {
    public final String a;
    public final byte[] b;

    public C0063m(String str, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = str;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0063m)) {
            return false;
        }
        C0063m c0063m = (C0063m) obj;
        return Intrinsics.areEqual(this.a, c0063m.a) && Intrinsics.areEqual(this.b, c0063m.b);
    }

    public final int hashCode() {
        String str = this.a;
        return Arrays.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ParsedDataUrl(mediaType=" + this.a + ", data=" + Arrays.toString(this.b) + ')';
    }
}
