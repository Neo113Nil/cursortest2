package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y6 {
    public final Download a;

    public y6(Download download) {
        Intrinsics.checkNotNullParameter(download, "download");
        this.a = download;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6) && Intrinsics.areEqual(this.a, ((y6) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "DownloadWrapper(download=" + this.a + ")";
    }

    public final Download a() {
        return this.a;
    }

    public final String f() {
        String uri = this.a.request.uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    public final String b() {
        String id = this.a.request.id;
        Intrinsics.checkNotNullExpressionValue(id, "id");
        return id;
    }

    public final int d() {
        return this.a.state;
    }

    public final long e() {
        return this.a.updateTimeMs;
    }

    public final float c() {
        return this.a.getPercentDownloaded();
    }
}
