package com.facebook.ads.internal.p.b;

import android.text.TextUtils;
import android.util.Log;
import com.aiming.mdt.utils.Constants;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f5347a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f5348b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f5349c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f5350d;
    private volatile String e;

    public h(h hVar) {
        this.f5350d = Integer.MIN_VALUE;
        this.f5347a = hVar.f5347a;
        this.e = hVar.e;
        this.f5350d = hVar.f5350d;
    }

    public h(String str) {
        this(str, m.a(str));
    }

    public h(String str, String str2) {
        this.f5350d = Integer.MIN_VALUE;
        this.f5347a = (String) j.a(str);
        this.e = str2;
    }

    private int a(HttpURLConnection httpURLConnection, int i, int i2) {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.f5350d;
    }

    private HttpURLConnection a(int i, int i2) {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z;
        String str2 = this.f5347a;
        int i3 = 0;
        do {
            StringBuilder sb = new StringBuilder();
            sb.append("Open connection ");
            if (i > 0) {
                str = " with offset " + i;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(str2);
            Log.d("ProxyCache", sb.toString());
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + i + "-");
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                str2 = httpURLConnection.getHeaderField(Constants.KEY_LOCATION);
                i3++;
                httpURLConnection.disconnect();
            }
            if (i3 > 5) {
                throw new l("Too many redirects: " + i3);
            }
        } while (z);
        return httpURLConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0094, code lost:
    
        r0.disconnect();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d() {
        Throwable th;
        InputStream inputStream;
        IOException e;
        InputStream inputStream2;
        Log.d("ProxyCache", "Read content info from " + this.f5347a);
        HttpURLConnection httpURLConnection = null;
        ?? r1 = 10000;
        try {
            try {
                httpURLConnection = a(0, 10000);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f5350d = httpURLConnection.getContentLength();
                this.e = httpURLConnection.getContentType();
                inputStream = httpURLConnection.getInputStream();
                try {
                    Log.i("ProxyCache", "Content info for `" + this.f5347a + "`: mime: " + this.e + ", content-length: " + this.f5350d);
                    m.a(inputStream);
                    inputStream2 = inputStream;
                    r1 = inputStream;
                } catch (IOException e2) {
                    e = e2;
                    Log.e("ProxyCache", "Error fetching info from " + this.f5347a, e);
                    m.a(inputStream);
                    inputStream2 = inputStream;
                    r1 = inputStream;
                }
            } catch (IOException e3) {
                e = e3;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                r1 = 0;
                m.a((Closeable) r1);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e4) {
            inputStream = null;
            e = e4;
            httpURLConnection = null;
        } catch (Throwable th4) {
            r1 = 0;
            th = th4;
            httpURLConnection = null;
        }
    }

    @Override // com.facebook.ads.internal.p.b.n
    public synchronized int a() {
        if (this.f5350d == Integer.MIN_VALUE) {
            d();
        }
        return this.f5350d;
    }

    @Override // com.facebook.ads.internal.p.b.n
    public int a(byte[] bArr) {
        if (this.f5349c == null) {
            throw new l("Error reading data from " + this.f5347a + ": connection is absent!");
        }
        try {
            return this.f5349c.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            throw new i("Reading source " + this.f5347a + " is interrupted", e);
        } catch (IOException e2) {
            throw new l("Error reading data from " + this.f5347a, e2);
        }
    }

    @Override // com.facebook.ads.internal.p.b.n
    public void a(int i) {
        try {
            this.f5348b = a(i, -1);
            this.e = this.f5348b.getContentType();
            this.f5349c = new BufferedInputStream(this.f5348b.getInputStream(), 8192);
            this.f5350d = a(this.f5348b, i, this.f5348b.getResponseCode());
        } catch (IOException e) {
            throw new l("Error opening connection for " + this.f5347a + " with offset " + i, e);
        }
    }

    @Override // com.facebook.ads.internal.p.b.n
    public void b() {
        if (this.f5348b != null) {
            try {
                this.f5348b.disconnect();
            } catch (NullPointerException e) {
                throw new l("Error disconnecting HttpUrlConnection", e);
            }
        }
    }

    public synchronized String c() {
        if (TextUtils.isEmpty(this.e)) {
            d();
        }
        return this.e;
    }

    public String toString() {
        return "HttpUrlSource{url='" + this.f5347a + "}";
    }
}
