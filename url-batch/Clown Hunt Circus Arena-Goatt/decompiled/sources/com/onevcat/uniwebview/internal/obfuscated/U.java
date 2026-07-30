package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class U {
    public final com.onevcat.uniwebview.g a;

    public U(com.onevcat.uniwebview.g downloader) {
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        this.a = downloader;
    }

    @JavascriptInterface
    public final void handleDataURI(String dataURI) {
        Intrinsics.checkNotNullParameter(dataURI, "dataURI");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Received blob fetching result. uri: ", dataURI, b, "message"));
        this.a.a(dataURI, null, null, true);
    }
}
