package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcd implements bbu {
    private final bfv a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public bcd(bfv bfvVar, int i) {
        this.a = bfvVar;
        this.b = i;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private final InputStream e(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new bay("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new bay("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int b = b(this.c);
                int i3 = b / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new blx(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new bay("Failed to obtain InputStream", b(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (b == -1) {
                        throw new bay("Http request failed", -1, null);
                    }
                    try {
                        throw new bay(this.c.getResponseMessage(), b, null);
                    } catch (IOException e2) {
                        throw new bay("Failed to get a response message", b, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new bay("Received empty or null redirect url", b, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    d();
                    return e(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new bay("Bad redirect url: ".concat(String.valueOf(headerField)), b, e3);
                }
            } catch (IOException e4) {
                throw new bay("Failed to connect or obtain data", b(this.c), e4);
            }
        } catch (IOException e5) {
            throw new bay("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.bbu
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.bbu
    public final void bo() {
        this.e = true;
    }

    @Override // defpackage.bbu
    public final void d() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.bbu
    public final void f(azw azwVar, bbt bbtVar) {
        double d = bmd.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            bfv bfvVar = this.a;
            if (bfvVar.f == null) {
                if (TextUtils.isEmpty(bfvVar.e)) {
                    String str = bfvVar.d;
                    if (TextUtils.isEmpty(str)) {
                        URL url = bfvVar.c;
                        a.v(url, "Argument must not be null");
                        str = url.toString();
                    }
                    bfvVar.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$[]");
                }
                bfvVar.f = new URL(bfvVar.e);
            }
            URL url2 = bfvVar.f;
            bfw bfwVar = bfvVar.b;
            if (((bfz) bfwVar).c == null) {
                synchronized (bfwVar) {
                    if (((bfz) bfwVar).c == null) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((bfz) bfwVar).b.entrySet()) {
                            List list = (List) entry.getValue();
                            StringBuilder sb = new StringBuilder();
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                String str2 = ((bfy) list.get(i)).a;
                                if (!TextUtils.isEmpty(str2)) {
                                    sb.append(str2);
                                    if (i != list.size() - 1) {
                                        sb.append(',');
                                    }
                                }
                            }
                            String sb2 = sb.toString();
                            if (!TextUtils.isEmpty(sb2)) {
                                hashMap.put((String) entry.getKey(), sb2);
                            }
                        }
                        ((bfz) bfwVar).c = DesugarCollections.unmodifiableMap(hashMap);
                    }
                }
            }
            bbtVar.b(e(url2, 0, null, ((bfz) bfwVar).c));
        } catch (IOException e) {
            bbtVar.e(e);
        }
    }

    @Override // defpackage.bbu
    public final int g() {
        return 2;
    }
}
