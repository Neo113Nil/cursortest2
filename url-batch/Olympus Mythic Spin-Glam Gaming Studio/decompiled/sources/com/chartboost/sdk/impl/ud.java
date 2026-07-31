package com.chartboost.sdk.impl;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class ud {
    public HttpsURLConnection a(e3 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        URLConnection openConnection = new URL(request.e()).openConnection();
        HttpsURLConnection httpsURLConnection = openConnection instanceof HttpsURLConnection ? (HttpsURLConnection) openConnection : null;
        if (httpsURLConnection != null) {
            return httpsURLConnection;
        }
        throw new IOException("Invalid URL");
    }
}
