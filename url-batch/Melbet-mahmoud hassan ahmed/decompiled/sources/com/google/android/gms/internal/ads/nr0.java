package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class nr0 implements cm {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f9228q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r, reason: collision with root package name */
    private static final AtomicReference<byte[]> f9229r = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final int f9231b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9232c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9233d;

    /* renamed from: e, reason: collision with root package name */
    private final bm f9234e;

    /* renamed from: f, reason: collision with root package name */
    private final im<? super nr0> f9235f;

    /* renamed from: g, reason: collision with root package name */
    private vl f9236g;

    /* renamed from: h, reason: collision with root package name */
    private HttpURLConnection f9237h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f9238i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9239j;

    /* renamed from: k, reason: collision with root package name */
    private long f9240k;

    /* renamed from: l, reason: collision with root package name */
    private long f9241l;

    /* renamed from: m, reason: collision with root package name */
    private long f9242m;

    /* renamed from: n, reason: collision with root package name */
    private long f9243n;

    /* renamed from: o, reason: collision with root package name */
    private int f9244o;

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f9230a = new lr0(this);

    /* renamed from: p, reason: collision with root package name */
    private final Set<Socket> f9245p = new HashSet();

    nr0(String str, im<? super nr0> imVar, int i7, int i8, int i9) {
        jm.b(str);
        this.f9233d = str;
        this.f9235f = imVar;
        this.f9234e = new bm();
        this.f9231b = i7;
        this.f9232c = i8;
        this.f9244o = i9;
    }

    private final void i() {
        HttpURLConnection httpURLConnection = this.f9237h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                io0.e("Unexpected error while disconnecting", e7);
            }
            this.f9237h = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.cm
    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f9237h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.f9237h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final int d(byte[] bArr, int i7, int i8) {
        try {
            if (this.f9242m != this.f9240k) {
                byte[] andSet = f9229r.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j7 = this.f9242m;
                    long j8 = this.f9240k;
                    if (j7 == j8) {
                        f9229r.set(andSet);
                        break;
                    }
                    int read = this.f9238i.read(andSet, 0, (int) Math.min(j8 - j7, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f9242m += read;
                    im<? super nr0> imVar = this.f9235f;
                    if (imVar != null) {
                        ((as0) imVar).i0(this, read);
                    }
                }
            }
            if (i8 == 0) {
                return 0;
            }
            long j9 = this.f9241l;
            if (j9 != -1) {
                long j10 = j9 - this.f9243n;
                if (j10 != 0) {
                    i8 = (int) Math.min(i8, j10);
                }
                return -1;
            }
            int read2 = this.f9238i.read(bArr, i7, i8);
            if (read2 == -1) {
                if (this.f9241l == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f9243n += read2;
            im<? super nr0> imVar2 = this.f9235f;
            if (imVar2 == null) {
                return read2;
            }
            ((as0) imVar2).i0(this, read2);
            return read2;
        } catch (IOException e7) {
            throw new zl(e7, this.f9236g, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        if (r6 != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025b A[Catch: IOException -> 0x02b7, TryCatch #0 {IOException -> 0x02b7, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:20:0x00b8, B:34:0x00ee, B:100:0x0250, B:102:0x025b, B:104:0x026c, B:107:0x0274, B:109:0x0282, B:110:0x028c, B:111:0x028f, B:112:0x0287, B:117:0x0296, B:118:0x029d, B:119:0x007c, B:121:0x0096, B:122:0x00b3, B:125:0x029e, B:126:0x02b6), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(vl vlVar) {
        long j7;
        int responseCode;
        String headerField;
        int responseCode2;
        long j8;
        long parseLong;
        String headerField2;
        this.f9236g = vlVar;
        this.f9243n = 0L;
        this.f9242m = 0L;
        try {
            URL url = new URL(vlVar.f13430a.toString());
            long j9 = vlVar.f13432c;
            long j10 = vlVar.f13433d;
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (i7 > 20) {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Too many redirects: ");
                    sb.append(i8);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f9230a);
                }
                httpURLConnection.setConnectTimeout(this.f9231b);
                httpURLConnection.setReadTimeout(this.f9232c);
                for (Map.Entry<String, String> entry : this.f9234e.a().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                if (j9 == 0 && j10 == -1) {
                    j7 = j9;
                    httpURLConnection.setRequestProperty("User-Agent", this.f9233d);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f9237h = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.f9237h.getHeaderFields();
                                i();
                                am amVar = new am(responseCode2, headerFields, vlVar);
                                if (responseCode2 == 416) {
                                    throw amVar;
                                }
                                amVar.initCause(new ul(0));
                                throw amVar;
                            }
                            if (responseCode2 == 200) {
                                j8 = vlVar.f13432c;
                            }
                            j8 = 0;
                            this.f9240k = j8;
                            long j11 = vlVar.f13433d;
                            if (j11 != -1) {
                                this.f9241l = j11;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f9237h;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                                        sb2.append("Unexpected Content-Length [");
                                        sb2.append(headerField3);
                                        sb2.append("]");
                                        io0.d(sb2.toString());
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f9228q.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (parseLong < 0) {
                                                    parseLong = parseLong2;
                                                } else if (parseLong != parseLong2) {
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(headerField3).length() + 26 + String.valueOf(headerField2).length());
                                                    sb3.append("Inconsistent headers [");
                                                    sb3.append(headerField3);
                                                    sb3.append("] [");
                                                    sb3.append(headerField2);
                                                    sb3.append("]");
                                                    io0.g(sb3.toString());
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(headerField2).length() + 27);
                                                sb4.append("Unexpected Content-Range [");
                                                sb4.append(headerField2);
                                                sb4.append("]");
                                                io0.d(sb4.toString());
                                            }
                                        }
                                    }
                                    this.f9241l = parseLong != -1 ? parseLong - this.f9240k : -1L;
                                }
                                parseLong = -1;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.f9241l = parseLong != -1 ? parseLong - this.f9240k : -1L;
                            }
                            try {
                                this.f9238i = this.f9237h.getInputStream();
                                this.f9239j = true;
                                im<? super nr0> imVar = this.f9235f;
                                if (imVar != null) {
                                    ((as0) imVar).k(this, vlVar);
                                }
                                return this.f9241l;
                            } catch (IOException e7) {
                                i();
                                throw new zl(e7, vlVar, 1);
                            }
                        } catch (IOException e8) {
                            i();
                            String valueOf = String.valueOf(vlVar.f13430a.toString());
                            throw new zl(valueOf.length() != 0 ? "Unable to connect to ".concat(valueOf) : new String("Unable to connect to "), e8, vlVar, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        String valueOf2 = String.valueOf(protocol);
                        throw new ProtocolException(valueOf2.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf2) : new String("Unsupported protocol redirect: "));
                    }
                    url = url2;
                    i7 = i8;
                    j9 = j7;
                }
                StringBuilder sb5 = new StringBuilder(27);
                sb5.append("bytes=");
                sb5.append(j9);
                sb5.append("-");
                String sb6 = sb5.toString();
                if (j10 != -1) {
                    j7 = j9;
                    StringBuilder sb7 = new StringBuilder(sb6.length() + 20);
                    sb7.append(sb6);
                    sb7.append((j9 + j10) - 1);
                    sb6 = sb7.toString();
                } else {
                    j7 = j9;
                }
                httpURLConnection.setRequestProperty("Range", sb6);
                httpURLConnection.setRequestProperty("User-Agent", this.f9233d);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f9237h = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.f9237h.getHeaderFields();
                    i();
                    am amVar2 = new am(responseCode2, headerFields2, vlVar);
                    if (responseCode2 == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e9) {
            String valueOf3 = String.valueOf(vlVar.f13430a.toString());
            throw new zl(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e9, vlVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final void g() {
        try {
            if (this.f9238i != null) {
                HttpURLConnection httpURLConnection = this.f9237h;
                long j7 = this.f9241l;
                if (j7 != -1) {
                    j7 -= this.f9243n;
                }
                int i7 = zm.f15186a;
                if (i7 == 19 || i7 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j7 == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j7 <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.f9238i.close();
                } catch (IOException e7) {
                    throw new zl(e7, this.f9236g, 3);
                }
            }
        } finally {
            this.f9238i = null;
            i();
            if (this.f9239j) {
                this.f9239j = false;
            }
            this.f9245p.clear();
        }
    }

    final void h(int i7) {
        this.f9244o = i7;
        for (Socket socket : this.f9245p) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f9244o);
                } catch (SocketException e7) {
                    io0.h("Failed to update receive buffer size.", e7);
                }
            }
        }
    }
}
