package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import com.ironsource.jn;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class a {
    public static Response a(String str, String str2, SSLSocketFactory sSLSocketFactory) {
        Request.Builder withMethod = new Request.Builder(str2).withMethod(jn.f16864a);
        if (!TextUtils.isEmpty(str)) {
            withMethod.addHeader("If-None-Match", str);
        }
        NetworkClient.Builder withSslSocketFactory = new NetworkClient.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int i4 = b.f40574a;
        return withSslSocketFactory.withConnectTimeout(i4).withReadTimeout(i4).build().newCall(withMethod.build()).execute();
    }
}
