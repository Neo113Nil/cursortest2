package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077l extends AbstractC0085n {
    public final String a;
    public final byte[] b;

    public C0077l(String url, byte[] data) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = url;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0077l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.onevcat.uniwebview.DownloadTaskType.DataUrl");
        C0077l c0077l = (C0077l) obj;
        if (Intrinsics.areEqual(this.a, c0077l.a)) {
            return Arrays.equals(this.b, c0077l.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DataUrl(url=" + this.a + ", data=" + Arrays.toString(this.b) + ')';
    }
}
