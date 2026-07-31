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
final class et0 extends eb1 implements tr1 {

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f4741u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicReference<byte[]> f4742v = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    private final SSLSocketFactory f4743e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4744f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4745g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4746h;

    /* renamed from: i, reason: collision with root package name */
    private final sq1 f4747i;

    /* renamed from: j, reason: collision with root package name */
    private li1 f4748j;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f4749k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f4750l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4751m;

    /* renamed from: n, reason: collision with root package name */
    private int f4752n;

    /* renamed from: o, reason: collision with root package name */
    private long f4753o;

    /* renamed from: p, reason: collision with root package name */
    private long f4754p;

    /* renamed from: q, reason: collision with root package name */
    private long f4755q;

    /* renamed from: r, reason: collision with root package name */
    private long f4756r;

    /* renamed from: s, reason: collision with root package name */
    private int f4757s;

    /* renamed from: t, reason: collision with root package name */
    private final Set<Socket> f4758t;

    et0(String str, vt1 vt1Var, int i7, int i8, int i9) {
        super(true);
        this.f4743e = new dt0(this);
        this.f4758t = new HashSet();
        wu1.c(str);
        this.f4746h = str;
        this.f4747i = new sq1();
        this.f4744f = i7;
        this.f4745g = i8;
        this.f4757s = i9;
        if (vt1Var != null) {
            j(vt1Var);
        }
    }

    private final void v() {
        HttpURLConnection httpURLConnection = this.f4749k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                io0.e("Unexpected error while disconnecting", e7);
            }
            this.f4749k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        try {
            if (this.f4755q != this.f4753o) {
                byte[] andSet = f4742v.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j7 = this.f4755q;
                    long j8 = this.f4753o;
                    if (j7 == j8) {
                        f4742v.set(andSet);
                        break;
                    }
                    int read = this.f4750l.read(andSet, 0, (int) Math.min(j8 - j7, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f4755q += read;
                    o(read);
                }
            }
            if (i8 == 0) {
                return 0;
            }
            long j9 = this.f4754p;
            if (j9 != -1) {
                long j10 = j9 - this.f4756r;
                if (j10 != 0) {
                    i8 = (int) Math.min(i8, j10);
                }
                return -1;
            }
            int read2 = this.f4750l.read(bArr, i7, i8);
            if (read2 == -1) {
                if (this.f4754p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f4756r += read2;
            o(read2);
            return read2;
        } catch (IOException e7) {
            throw new qo1(e7, this.f4748j, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.f4749k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        try {
            if (this.f4750l != null) {
                HttpURLConnection httpURLConnection = this.f4749k;
                long j7 = this.f4754p;
                if (j7 != -1) {
                    j7 -= this.f4756r;
                }
                int i7 = n13.f8865a;
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
                    this.f4750l.close();
                } catch (IOException e7) {
                    throw new qo1(e7, this.f4748j, 2000, 3);
                }
            }
        } finally {
            this.f4750l = null;
            v();
            if (this.f4751m) {
                this.f4751m = false;
                p();
            }
            this.f4758t.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
    
        if (r2 != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f1  */
    @Override // com.google.android.gms.internal.ads.he1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(li1 li1Var) {
        long j7;
        long parseLong;
        String headerField;
        this.f4748j = li1Var;
        long j8 = 0;
        this.f4756r = 0L;
        this.f4755q = 0L;
        try {
            URL url = new URL(li1Var.f7985a.toString());
            long j9 = li1Var.f7990f;
            long j10 = li1Var.f7991g;
            boolean b7 = li1Var.b(1);
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
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f4743e);
                }
                httpURLConnection.setConnectTimeout(this.f4744f);
                httpURLConnection.setReadTimeout(this.f4745g);
                for (Map.Entry<String, String> entry : this.f4747i.a().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                if (j9 != j8 || j10 != -1) {
                    StringBuilder sb2 = new StringBuilder(27);
                    sb2.append("bytes=");
                    sb2.append(j9);
                    sb2.append("-");
                    String sb3 = sb2.toString();
                    if (j10 != -1) {
                        StringBuilder sb4 = new StringBuilder(sb3.length() + 20);
                        sb4.append(sb3);
                        sb4.append((j9 + j10) - 1);
                        sb3 = sb4.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", sb3);
                }
                httpURLConnection.setRequestProperty("User-Agent", this.f4746h);
                if (!b7) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    this.f4749k = httpURLConnection;
                    try {
                        int responseCode2 = httpURLConnection.getResponseCode();
                        this.f4752n = responseCode2;
                        if (responseCode2 < 200 || responseCode2 > 299) {
                            Map<String, List<String>> headerFields = this.f4749k.getHeaderFields();
                            v();
                            rp1 rp1Var = new rp1(this.f4752n, null, null, headerFields, li1Var, n13.f8870f);
                            if (this.f4752n != 416) {
                                throw rp1Var;
                            }
                            rp1Var.initCause(new if1(2008));
                            throw rp1Var;
                        }
                        if (responseCode2 == 200) {
                            j7 = li1Var.f7990f;
                        }
                        j7 = 0;
                        this.f4753o = j7;
                        boolean b8 = li1Var.b(1);
                        long j11 = li1Var.f7991g;
                        if (!b8 && j11 == -1) {
                            HttpURLConnection httpURLConnection2 = this.f4749k;
                            String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                            if (!TextUtils.isEmpty(headerField2)) {
                                try {
                                    parseLong = Long.parseLong(headerField2);
                                } catch (NumberFormatException unused) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(headerField2).length() + 28);
                                    sb5.append("Unexpected Content-Length [");
                                    sb5.append(headerField2);
                                    sb5.append("]");
                                    io0.d(sb5.toString());
                                }
                                headerField = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField)) {
                                    Matcher matcher = f4741u.matcher(headerField);
                                    if (matcher.find()) {
                                        try {
                                            long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (parseLong < 0) {
                                                parseLong = parseLong2;
                                            } else if (parseLong != parseLong2) {
                                                StringBuilder sb6 = new StringBuilder(String.valueOf(headerField2).length() + 26 + String.valueOf(headerField).length());
                                                sb6.append("Inconsistent headers [");
                                                sb6.append(headerField2);
                                                sb6.append("] [");
                                                sb6.append(headerField);
                                                sb6.append("]");
                                                io0.g(sb6.toString());
                                                parseLong = Math.max(parseLong, parseLong2);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(headerField).length() + 27);
                                            sb7.append("Unexpected Content-Range [");
                                            sb7.append(headerField);
                                            sb7.append("]");
                                            io0.d(sb7.toString());
                                        }
                                    }
                                }
                                j11 = parseLong != -1 ? parseLong - this.f4753o : -1L;
                            }
                            parseLong = -1;
                            headerField = httpURLConnection2.getHeaderField("Content-Range");
                            if (!TextUtils.isEmpty(headerField)) {
                            }
                            j11 = parseLong != -1 ? parseLong - this.f4753o : -1L;
                        }
                        this.f4754p = j11;
                        try {
                            this.f4750l = this.f4749k.getInputStream();
                            this.f4751m = true;
                            r(li1Var);
                            return this.f4754p;
                        } catch (IOException e7) {
                            v();
                            throw new qo1(e7, li1Var, 2000, 1);
                        }
                    } catch (IOException e8) {
                        v();
                        String valueOf = String.valueOf(li1Var.f7985a.toString());
                        throw new qo1(valueOf.length() != 0 ? "Unable to connect to ".concat(valueOf) : new String("Unable to connect to "), e8, li1Var, 1);
                    }
                }
                String headerField3 = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField3 == null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url2 = new URL(url, headerField3);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf2 = String.valueOf(protocol);
                    throw new ProtocolException(valueOf2.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf2) : new String("Unsupported protocol redirect: "));
                }
                url = url2;
                i7 = i8;
                j8 = 0;
            }
        } catch (IOException e9) {
            String valueOf3 = String.valueOf(li1Var.f7985a.toString());
            throw new qo1(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e9, li1Var, 1);
        }
    }

    final void u(int i7) {
        this.f4757s = i7;
        for (Socket socket : this.f4758t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f4757s);
                } catch (SocketException e7) {
                    io0.h("Failed to update receive buffer size.", e7);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.eb1, com.google.android.gms.internal.ads.he1
    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f4749k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
