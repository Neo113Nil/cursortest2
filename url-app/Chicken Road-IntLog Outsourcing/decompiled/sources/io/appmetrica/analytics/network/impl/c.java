package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.i;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class c implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkClient f9812a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f9813b;

    /* renamed from: c, reason: collision with root package name */
    public final d f9814c;

    public c(NetworkClient networkClient, Request request, d dVar) {
        this.f9812a = networkClient;
        this.f9813b = request;
        this.f9814c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) {
        Iterator<T> it = this.f9813b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f9812a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f9812a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f9812a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f9812a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f9813b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f9812a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:11|(9:12|13|(2:15|(3:17|18|19))|30|31|32|33|34|35)|36|37|38|39|40) */
    @Override // io.appmetrica.analytics.network.internal.Call
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response execute() {
        Map<String, List<String>> map;
        int i2;
        Throwable th;
        String str;
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        try {
            d dVar = this.f9814c;
            String url = this.f9813b.getUrl();
            dVar.getClass();
            URLConnection openConnection = new URL(url).openConnection();
            HttpsURLConnection httpsURLConnection = openConnection instanceof HttpsURLConnection ? (HttpsURLConnection) openConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f9813b.getUrl() + " does not represent https connection"));
            }
            byte[] bArr3 = new byte[0];
            byte[] bArr4 = new byte[0];
            try {
                a(httpsURLConnection);
                if (i.a(this.f9813b.getMethod(), "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(this.f9813b.getBody());
                            outputStream.flush();
                            AbstractC1477a.e(outputStream, null);
                        } finally {
                        }
                    }
                }
                i2 = httpsURLConnection.getResponseCode();
                try {
                    map = httpsURLConnection.getHeaderFields();
                    try {
                        bArr3 = e.a(this.f9812a.getMaxResponseSize(), new a(httpsURLConnection));
                        bArr4 = e.a(this.f9812a.getMaxResponseSize(), new b(httpsURLConnection));
                        str = httpsURLConnection.getURL().toString();
                        th = null;
                        bArr = bArr3;
                        bArr2 = bArr4;
                        z = true;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        str = null;
                        z = false;
                        bArr = bArr3;
                        bArr2 = bArr4;
                        int i3 = i2;
                        Map<String, List<String>> map2 = map;
                        httpsURLConnection.disconnect();
                        return new Response(z, i3, bArr, bArr2, map2, th, str);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    map = null;
                }
            } catch (Throwable th4) {
                th = th4;
                map = null;
                i2 = 0;
                th = th;
                str = null;
                z = false;
                bArr = bArr3;
                bArr2 = bArr4;
                int i32 = i2;
                Map<String, List<String>> map22 = map;
                httpsURLConnection.disconnect();
                return new Response(z, i32, bArr, bArr2, map22, th, str);
            }
            int i322 = i2;
            Map<String, List<String>> map222 = map;
            httpsURLConnection.disconnect();
            return new Response(z, i322, bArr, bArr2, map222, th, str);
        } catch (Throwable th5) {
            return new Response(th5);
        }
    }

    public c(NetworkClient networkClient, Request request) {
        this(networkClient, request, new d());
    }
}
