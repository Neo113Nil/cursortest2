package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class ol1 extends eb1 implements tr1 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9703e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9704f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9705g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9706h;

    /* renamed from: i, reason: collision with root package name */
    private final sq1 f9707i;

    /* renamed from: j, reason: collision with root package name */
    private final sq1 f9708j;

    /* renamed from: k, reason: collision with root package name */
    private li1 f9709k;

    /* renamed from: l, reason: collision with root package name */
    private HttpURLConnection f9710l;

    /* renamed from: m, reason: collision with root package name */
    private InputStream f9711m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9712n;

    /* renamed from: o, reason: collision with root package name */
    private int f9713o;

    /* renamed from: p, reason: collision with root package name */
    private long f9714p;

    /* renamed from: q, reason: collision with root package name */
    private long f9715q;

    private ol1(String str, int i7, int i8, boolean z6, sq1 sq1Var, r43<String> r43Var, boolean z7) {
        super(true);
        this.f9706h = str;
        this.f9704f = i7;
        this.f9705g = i8;
        this.f9703e = z6;
        this.f9707i = sq1Var;
        this.f9708j = new sq1();
    }

    private final HttpURLConnection s(URL url, int i7, byte[] bArr, long j7, long j8, boolean z6, boolean z7, Map<String, String> map) {
        String sb;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f9704f);
        httpURLConnection.setReadTimeout(this.f9705g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f9707i.a());
        hashMap.putAll(this.f9708j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j7 == 0 && j8 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j7);
            sb2.append("-");
            if (j8 != -1) {
                sb2.append((j7 + j8) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str = this.f9706h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z6 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z7);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(li1.a(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL t(URL url, String str, li1 li1Var) {
        if (str == null) {
            throw new qo1("Null location redirect", li1Var, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                String valueOf = String.valueOf(protocol);
                throw new qo1(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), li1Var, 2001, 1);
            }
            if (this.f9703e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new qo1(sb.toString(), li1Var, 2001, 1);
        } catch (MalformedURLException e7) {
            throw new qo1(e7, li1Var, 2001, 1);
        }
    }

    private final void u() {
        HttpURLConnection httpURLConnection = this.f9710l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                oc2.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f9710l = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j7 = this.f9714p;
            if (j7 != -1) {
                long j8 = j7 - this.f9715q;
                if (j8 == 0) {
                    return -1;
                }
                i8 = (int) Math.min(i8, j8);
            }
            InputStream inputStream = this.f9711m;
            int i9 = n13.f8865a;
            int read = inputStream.read(bArr, i7, i8);
            if (read == -1) {
                return -1;
            }
            this.f9715q += read;
            o(read);
            return read;
        } catch (IOException e7) {
            li1 li1Var = this.f9709k;
            int i10 = n13.f8865a;
            throw qo1.a(e7, li1Var, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.f9710l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        try {
            InputStream inputStream = this.f9711m;
            if (inputStream != null) {
                long j7 = this.f9714p;
                long j8 = j7 == -1 ? -1L : j7 - this.f9715q;
                HttpURLConnection httpURLConnection = this.f9710l;
                if (httpURLConnection != null) {
                    int i7 = n13.f8865a;
                    if (i7 >= 19 && i7 <= 20) {
                        try {
                            InputStream inputStream2 = httpURLConnection.getInputStream();
                            if (j8 == -1) {
                                if (inputStream2.read() != -1) {
                                }
                            } else if (j8 <= 2048) {
                            }
                            String name = inputStream2.getClass().getName();
                            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                Objects.requireNonNull(superclass);
                                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(inputStream2, new Object[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    li1 li1Var = this.f9709k;
                    int i8 = n13.f8865a;
                    throw new qo1(e7, li1Var, 2000, 3);
                }
            }
        } finally {
            this.f9711m = null;
            u();
            if (this.f9712n) {
                this.f9712n = false;
                p();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b0, code lost:
    
        if (r8 != 0) goto L35;
     */
    @Override // com.google.android.gms.internal.ads.he1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(li1 li1Var) {
        int i7;
        URL url;
        long j7;
        long j8;
        boolean b7;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j9;
        this.f9709k = li1Var;
        this.f9715q = 0L;
        this.f9714p = 0L;
        q(li1Var);
        try {
            url = new URL(li1Var.f7985a.toString());
            j7 = li1Var.f7990f;
            j8 = li1Var.f7991g;
            b7 = li1Var.b(1);
        } catch (IOException e7) {
            e = e7;
            i7 = 1;
        }
        if (this.f9703e) {
            URL url2 = url;
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 > 20) {
                    i7 = 1;
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Too many redirects: ");
                    sb.append(i9);
                    throw new qo1(new NoRouteToHostException(sb.toString()), li1Var, 2001, 1);
                }
                long j10 = j8;
                long j11 = j7;
                URL url3 = url2;
                HttpURLConnection s7 = s(url2, 1, null, j7, j8, b7, false, li1Var.f7988d);
                int responseCode = s7.getResponseCode();
                String headerField = s7.getHeaderField("Location");
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = s7;
                    break;
                }
                i7 = 1;
                try {
                    s7.disconnect();
                    url2 = t(url3, headerField, li1Var);
                    i8 = i9;
                    j8 = j10;
                    j7 = j11;
                } catch (IOException e8) {
                    e = e8;
                }
                e = e8;
                u();
                throw qo1.a(e, li1Var, i7);
            }
        }
        httpURLConnection = s(url, 1, null, j7, j8, b7, true, li1Var.f7988d);
        this.f9710l = httpURLConnection;
        this.f9713o = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        int i10 = this.f9713o;
        if (i10 < 200 || i10 > 299) {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (this.f9713o == 416) {
                str = responseMessage;
                if (li1Var.f7990f == us1.b(httpURLConnection.getHeaderField("Content-Range"))) {
                    this.f9712n = true;
                    r(li1Var);
                    long j12 = li1Var.f7991g;
                    if (j12 != -1) {
                        return j12;
                    }
                    return 0L;
                }
            } else {
                str = responseMessage;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bArr = errorStream != null ? n13.x(errorStream) : n13.f8870f;
            } catch (IOException unused) {
                bArr = n13.f8870f;
            }
            byte[] bArr2 = bArr;
            u();
            throw new rp1(this.f9713o, str, this.f9713o == 416 ? new if1(2008) : null, headerFields, li1Var, bArr2);
        }
        httpURLConnection.getContentType();
        if (this.f9713o == 200) {
            j9 = li1Var.f7990f;
        }
        j9 = 0;
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
        if (equalsIgnoreCase) {
            this.f9714p = li1Var.f7991g;
        } else {
            long j13 = li1Var.f7991g;
            if (j13 != -1) {
                this.f9714p = j13;
            } else {
                long a7 = us1.a(httpURLConnection.getHeaderField("Content-Length"), httpURLConnection.getHeaderField("Content-Range"));
                this.f9714p = a7 != -1 ? a7 - j9 : -1L;
            }
        }
        try {
            this.f9711m = httpURLConnection.getInputStream();
            if (equalsIgnoreCase) {
                this.f9711m = new GZIPInputStream(this.f9711m);
            }
            this.f9712n = true;
            r(li1Var);
            if (j9 != 0) {
                try {
                    byte[] bArr3 = new byte[4096];
                    while (j9 > 0) {
                        int min = (int) Math.min(j9, 4096L);
                        InputStream inputStream = this.f9711m;
                        int i11 = n13.f8865a;
                        int read = inputStream.read(bArr3, 0, min);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new qo1(new InterruptedIOException(), li1Var, 2000, 1);
                        }
                        if (read == -1) {
                            throw new qo1(li1Var, 2008, 1);
                        }
                        j9 -= read;
                        o(read);
                    }
                } catch (IOException e9) {
                    u();
                    if (e9 instanceof qo1) {
                        throw ((qo1) e9);
                    }
                    throw new qo1(e9, li1Var, 2000, 1);
                }
            }
            return this.f9714p;
        } catch (IOException e10) {
            u();
            throw new qo1(e10, li1Var, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.eb1, com.google.android.gms.internal.ads.he1
    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f9710l;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }
}
