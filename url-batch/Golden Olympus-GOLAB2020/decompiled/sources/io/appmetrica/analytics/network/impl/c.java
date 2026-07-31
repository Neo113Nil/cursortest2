package io.appmetrica.analytics.network.impl;

import com.ironsource.jn;
import f2.AbstractC2420c;
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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkClient f40545a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f40546b;

    /* renamed from: c, reason: collision with root package name */
    public final d f40547c;

    public c(@NotNull NetworkClient networkClient, @NotNull Request request, @NotNull d dVar) {
        this.f40545a = networkClient;
        this.f40546b = request;
        this.f40547c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) {
        Iterator<T> it = this.f40546b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f40545a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f40545a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f40545a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f40545a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f40546b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f40545a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Throwable] */
    @Override // io.appmetrica.analytics.network.internal.Call
    @NotNull
    public final Response execute() {
        int i4;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        boolean z4;
        try {
            d dVar = this.f40547c;
            String url = this.f40546b.getUrl();
            dVar.getClass();
            URLConnection openConnection = new URL(url).openConnection();
            Map<String, List<String>> map3 = null;
            HttpsURLConnection httpsURLConnection = openConnection instanceof HttpsURLConnection ? (HttpsURLConnection) openConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f40546b.getUrl() + " does not represent https connection"));
            }
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[0];
            try {
                a(httpsURLConnection);
                if (Intrinsics.areEqual(this.f40546b.getMethod(), jn.f16865b)) {
                    try {
                        httpsURLConnection.setDoOutput(true);
                        OutputStream outputStream = httpsURLConnection.getOutputStream();
                        if (outputStream != null) {
                            try {
                                outputStream.write(this.f40546b.getBody());
                                outputStream.flush();
                                Unit unit = Unit.f41027a;
                                AbstractC2420c.a(outputStream, null);
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
                        map3 = th;
                        map = null;
                        i4 = 0;
                        map2 = map;
                        z4 = false;
                        ?? r15 = map3;
                        byte[] bArr3 = bArr;
                        byte[] bArr4 = bArr2;
                        int i5 = i4;
                        httpsURLConnection.disconnect();
                        return new Response(z4, i5, bArr3, bArr4, map2, r15);
                    }
                }
                i4 = httpsURLConnection.getResponseCode();
                try {
                    Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
                    try {
                        bArr = e.a(this.f40545a.getMaxResponseSize(), new a(httpsURLConnection));
                        bArr2 = e.a(this.f40545a.getMaxResponseSize(), new b(httpsURLConnection));
                        z4 = true;
                        map2 = headerFields;
                    } catch (Throwable th2) {
                        th = th2;
                        map3 = headerFields;
                        Map<String, List<String>> map4 = map3;
                        map3 = th;
                        map = map4;
                        map2 = map;
                        z4 = false;
                        ?? r152 = map3;
                        byte[] bArr32 = bArr;
                        byte[] bArr42 = bArr2;
                        int i52 = i4;
                        httpsURLConnection.disconnect();
                        return new Response(z4, i52, bArr32, bArr42, map2, r152);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                i4 = 0;
            }
            ?? r1522 = map3;
            byte[] bArr322 = bArr;
            byte[] bArr422 = bArr2;
            int i522 = i4;
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            return new Response(z4, i522, bArr322, bArr422, map2, r1522);
        } catch (Throwable th5) {
            return new Response(th5);
        }
    }

    public c(@NotNull NetworkClient networkClient, @NotNull Request request) {
        this(networkClient, request, new d());
    }
}
