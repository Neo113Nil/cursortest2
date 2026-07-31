package com.onevcat.uniwebview;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends l {
    public final String a;
    public final byte[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String url, byte[] data) {
        super(0);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = url;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.onevcat.uniwebview.DownloadTaskType.DataUrl");
        }
        j jVar = (j) obj;
        if (Intrinsics.areEqual(this.a, jVar.a)) {
            return Arrays.equals(this.b, jVar.b);
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
