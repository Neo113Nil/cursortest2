package com.onevcat.uniwebview;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0048h extends AbstractC0054j {
    public final String a;
    public final byte[] b;

    public C0048h(String url, byte[] data) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = url;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0048h.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.onevcat.uniwebview.DownloadTaskType.DataUrl");
        }
        C0048h c0048h = (C0048h) obj;
        if (Intrinsics.areEqual(this.a, c0048h.a)) {
            return Arrays.equals(this.b, c0048h.b);
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
