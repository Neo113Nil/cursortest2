package com.yanzhenjie.kalle.urlconnect;

import com.yanzhenjie.kalle.RequestMethod;
import com.yanzhenjie.kalle.i;
import com.yanzhenjie.kalle.o;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class b implements com.yanzhenjie.kalle.connect.a {

    /* renamed from: com.yanzhenjie.kalle.urlconnect.b$b, reason: collision with other inner class name */
    public static class C0350b {
        public b build() {
            return new b(this);
        }

        private C0350b() {
        }
    }

    private boolean isAllowBody(RequestMethod requestMethod) {
        return requestMethod.allowBody();
    }

    public static C0350b newBuilder() {
        return new C0350b();
    }

    @Override // com.yanzhenjie.kalle.connect.a
    public com.yanzhenjie.kalle.connect.b connect(o oVar) {
        URL url = new URL(oVar.url().toString(true));
        Proxy proxy = oVar.proxy();
        HttpURLConnection httpURLConnection = proxy == null ? (HttpURLConnection) url.openConnection() : (HttpURLConnection) url.openConnection(proxy);
        httpURLConnection.setConnectTimeout(oVar.connectTimeout());
        httpURLConnection.setReadTimeout(oVar.readTimeout());
        httpURLConnection.setInstanceFollowRedirects(false);
        if (httpURLConnection instanceof HttpsURLConnection) {
            SSLSocketFactory sslSocketFactory = oVar.sslSocketFactory();
            if (sslSocketFactory != null) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
            }
            HostnameVerifier hostnameVerifier = oVar.hostnameVerifier();
            if (hostnameVerifier != null) {
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(hostnameVerifier);
            }
        }
        RequestMethod method = oVar.method();
        httpURLConnection.setRequestMethod(method.toString());
        httpURLConnection.setDoInput(true);
        boolean isAllowBody = isAllowBody(method);
        httpURLConnection.setDoOutput(isAllowBody);
        i headers = oVar.headers();
        if (isAllowBody) {
            long contentLength = headers.getContentLength();
            if (contentLength <= 2147483647L) {
                httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
            } else {
                httpURLConnection.setFixedLengthStreamingMode(contentLength);
            }
        }
        headers.set("Connection", headers.get("Connection").get(0));
        for (Map.Entry<String, String> entry : i.getRequestHeaders(headers).entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnection.connect();
        return new com.yanzhenjie.kalle.urlconnect.a(httpURLConnection);
    }

    private b(C0350b c0350b) {
    }
}
