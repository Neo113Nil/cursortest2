package com.android.volley.toolbox;

import com.mopub.common.Constants;
import com.mopub.volley.toolbox.HttpClientStack;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.a.aa;
import org.apache.a.r;

/* compiled from: HurlStack.java */
/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final a f2343a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f2344b;

    /* compiled from: HurlStack.java */
    public interface a {
        String a(String str);
    }

    private static boolean a(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    public g() {
        this(null);
    }

    public g(a aVar) {
        this(aVar, null);
    }

    public g(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f2343a = aVar;
        this.f2344b = sSLSocketFactory;
    }

    @Override // com.android.volley.toolbox.f
    public r a(com.android.volley.l<?> lVar, Map<String, String> map) throws IOException, com.android.volley.a {
        String str;
        String c2 = lVar.c();
        HashMap hashMap = new HashMap();
        hashMap.putAll(lVar.h());
        hashMap.putAll(map);
        if (this.f2343a != null) {
            str = this.f2343a.a(c2);
            if (str == null) {
                String valueOf = String.valueOf(c2);
                throw new IOException(valueOf.length() != 0 ? "URL blocked by rewriter: ".concat(valueOf) : new String("URL blocked by rewriter: "));
            }
        } else {
            str = c2;
        }
        HttpURLConnection a2 = a(new URL(str), lVar);
        for (String str2 : hashMap.keySet()) {
            a2.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        a(a2, lVar);
        aa aaVar = new aa("HTTP", 1, 1);
        if (a2.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        org.apache.a.h.n nVar = new org.apache.a.h.n(aaVar, a2.getResponseCode(), a2.getResponseMessage());
        org.apache.a.h.h hVar = new org.apache.a.h.h(nVar);
        if (a(lVar.a(), nVar.b())) {
            hVar.a(a(a2));
        }
        for (Map.Entry<String, List<String>> entry : a2.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                hVar.addHeader(new org.apache.a.h.b(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return hVar;
    }

    private static org.apache.a.j a(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        org.apache.a.e.b bVar = new org.apache.a.e.b();
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        bVar.a(errorStream);
        bVar.a(httpURLConnection.getContentLength());
        bVar.b(httpURLConnection.getContentEncoding());
        bVar.a(httpURLConnection.getContentType());
        return bVar;
    }

    protected HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    private HttpURLConnection a(URL url, com.android.volley.l<?> lVar) throws IOException {
        HttpURLConnection a2 = a(url);
        int s = lVar.s();
        a2.setConnectTimeout(s);
        a2.setReadTimeout(s);
        a2.setUseCaches(false);
        a2.setDoInput(true);
        if (Constants.HTTPS.equals(url.getProtocol()) && this.f2344b != null) {
            ((HttpsURLConnection) a2).setSSLSocketFactory(this.f2344b);
        }
        return a2;
    }

    static void a(HttpURLConnection httpURLConnection, com.android.volley.l<?> lVar) throws IOException, com.android.volley.a {
        switch (lVar.a()) {
            case -1:
                byte[] l = lVar.l();
                if (l != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty(com.aiming.mdt.utils.Constants.KEY_CONTENT_TYPE, lVar.k());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(l);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, lVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                b(httpURLConnection, lVar);
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
                httpURLConnection.setRequestMethod(HttpClientStack.HttpPatch.METHOD_NAME);
                b(httpURLConnection, lVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static void b(HttpURLConnection httpURLConnection, com.android.volley.l<?> lVar) throws IOException, com.android.volley.a {
        byte[] p = lVar.p();
        if (p != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty(com.aiming.mdt.utils.Constants.KEY_CONTENT_TYPE, lVar.o());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(p);
            dataOutputStream.close();
        }
    }
}
