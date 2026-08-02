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
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class c implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkClient f8842a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f8843b;

    /* renamed from: c, reason: collision with root package name */
    public final d f8844c;

    public c(NetworkClient networkClient, Request request, d dVar) {
        this.f8842a = networkClient;
        this.f8843b = request;
        this.f8844c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) {
        Iterator<T> it = this.f8843b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f8842a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f8842a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f8842a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f8842a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f8843b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f8842a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:11|(9:12|13|(2:15|(3:17|18|19))|29|30|31|32|33|34)|35|36|37|38|39) */
    @Override // io.appmetrica.analytics.network.internal.Call
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response execute() {
        Map<String, List<String>> map;
        int i3;
        Throwable th;
        String str;
        boolean z;
        try {
            d dVar = this.f8844c;
            String url = this.f8843b.getUrl();
            dVar.getClass();
            URLConnection openConnection = new URL(url).openConnection();
            HttpsURLConnection httpsURLConnection = openConnection instanceof HttpsURLConnection ? (HttpsURLConnection) openConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f8843b.getUrl() + " does not represent https connection"));
            }
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[0];
            try {
                a(httpsURLConnection);
                if (j.a(this.f8843b.getMethod(), "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(this.f8843b.getBody());
                            outputStream.flush();
                            outputStream.close();
                        } finally {
                        }
                    }
                }
                i3 = httpsURLConnection.getResponseCode();
                try {
                    map = httpsURLConnection.getHeaderFields();
                    try {
                        bArr = e.a(this.f8842a.getMaxResponseSize(), new a(httpsURLConnection));
                        bArr2 = e.a(this.f8842a.getMaxResponseSize(), new b(httpsURLConnection));
                        str = httpsURLConnection.getURL().toString();
                        th = null;
                        z = true;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        str = null;
                        z = false;
                        byte[] bArr3 = bArr;
                        byte[] bArr4 = bArr2;
                        int i4 = i3;
                        Map<String, List<String>> map2 = map;
                        httpsURLConnection.disconnect();
                        return new Response(z, i4, bArr3, bArr4, map2, th, str);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    map = null;
                }
            } catch (Throwable th4) {
                th = th4;
                map = null;
                i3 = 0;
                th = th;
                str = null;
                z = false;
                byte[] bArr32 = bArr;
                byte[] bArr42 = bArr2;
                int i42 = i3;
                Map<String, List<String>> map22 = map;
                httpsURLConnection.disconnect();
                return new Response(z, i42, bArr32, bArr42, map22, th, str);
            }
            byte[] bArr322 = bArr;
            byte[] bArr422 = bArr2;
            int i422 = i3;
            Map<String, List<String>> map222 = map;
            httpsURLConnection.disconnect();
            return new Response(z, i422, bArr322, bArr422, map222, th, str);
        } catch (Throwable th5) {
            return new Response(th5);
        }
    }

    public c(NetworkClient networkClient, Request request) {
        this(networkClient, request, new d());
    }
}
