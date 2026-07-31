package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class ph0 extends AbstractC2303vj {

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f30443a;

    static class a extends FilterInputStream implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f30444a;

        a(HttpURLConnection httpURLConnection) {
            super(ph0.a(httpURLConnection));
            this.f30444a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            super.close();
            this.f30444a.disconnect();
        }
    }

    public ph0(SSLSocketFactory sSLSocketFactory) {
        this.f30443a = sSLSocketFactory;
    }

    private static void a(HttpURLConnection httpURLConnection, op1 op1Var, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey(com.ironsource.cc.f15718K)) {
            httpURLConnection.setRequestProperty(com.ironsource.cc.f15718K, "application/x-www-form-urlencoded; charset=UTF-8");
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    static ArrayList a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ze0((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2303vj
    public final hh0 a(op1<?> op1Var, Map<String, String> map) {
        SSLSocketFactory sSLSocketFactory;
        String l4 = op1Var.l();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(op1Var.e());
        URL url = new URL(l4);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int j4 = op1Var.j();
        httpURLConnection.setConnectTimeout(j4);
        httpURLConnection.setReadTimeout(j4);
        boolean z4 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f30443a) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            a(op1Var, httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (op1Var.f() != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) {
                    try {
                        return new hh0(responseCode, a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new a(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z4 = true;
                        if (!z4) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                hh0 hh0Var = new hh0(responseCode, a(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return hh0Var;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    static void a(op1 op1Var, HttpURLConnection httpURLConnection) {
        switch (op1Var.f()) {
            case -1:
                return;
            case 0:
                httpURLConnection.setRequestMethod(com.ironsource.jn.f16864a);
                return;
            case 1:
                httpURLConnection.setRequestMethod(com.ironsource.jn.f16865b);
                byte[] b4 = op1Var.b();
                if (b4 != null) {
                    a(httpURLConnection, op1Var, b4);
                    return;
                }
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] b5 = op1Var.b();
                if (b5 != null) {
                    a(httpURLConnection, op1Var, b5);
                    return;
                }
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] b6 = op1Var.b();
                if (b6 != null) {
                    a(httpURLConnection, op1Var, b6);
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
