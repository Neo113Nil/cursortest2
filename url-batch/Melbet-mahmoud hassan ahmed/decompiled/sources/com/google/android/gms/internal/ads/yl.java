package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class yl implements cm {

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f14722n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicReference<byte[]> f14723o = new AtomicReference<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f14724a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14725b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14726c;

    /* renamed from: d, reason: collision with root package name */
    private final bm f14727d;

    /* renamed from: e, reason: collision with root package name */
    private final im<? super yl> f14728e;

    /* renamed from: f, reason: collision with root package name */
    private vl f14729f;

    /* renamed from: g, reason: collision with root package name */
    private HttpURLConnection f14730g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f14731h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14732i;

    /* renamed from: j, reason: collision with root package name */
    private long f14733j;

    /* renamed from: k, reason: collision with root package name */
    private long f14734k;

    /* renamed from: l, reason: collision with root package name */
    private long f14735l;

    /* renamed from: m, reason: collision with root package name */
    private long f14736m;

    public yl(String str, tm<String> tmVar, im<? super yl> imVar, int i7, int i8, boolean z6, bm bmVar) {
        jm.b(str);
        this.f14726c = str;
        this.f14728e = imVar;
        this.f14727d = new bm();
        this.f14724a = i7;
        this.f14725b = i8;
    }

    private final void a() {
        HttpURLConnection httpURLConnection = this.f14730g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f14730g = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.cm
    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f14730g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.f14730g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final int d(byte[] bArr, int i7, int i8) {
        try {
            if (this.f14735l != this.f14733j) {
                byte[] andSet = f14723o.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j7 = this.f14735l;
                    long j8 = this.f14733j;
                    if (j7 == j8) {
                        f14723o.set(andSet);
                        break;
                    }
                    int read = this.f14731h.read(andSet, 0, (int) Math.min(j8 - j7, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f14735l += read;
                    im<? super yl> imVar = this.f14728e;
                    if (imVar != null) {
                        imVar.p(this, read);
                    }
                }
            }
            if (i8 == 0) {
                return 0;
            }
            long j9 = this.f14734k;
            if (j9 != -1) {
                long j10 = j9 - this.f14736m;
                if (j10 != 0) {
                    i8 = (int) Math.min(i8, j10);
                }
                return -1;
            }
            int read2 = this.f14731h.read(bArr, i7, i8);
            if (read2 == -1) {
                if (this.f14734k == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f14736m += read2;
            im<? super yl> imVar2 = this.f14728e;
            if (imVar2 == null) {
                return read2;
            }
            imVar2.p(this, read2);
            return read2;
        } catch (IOException e7) {
            throw new zl(e7, this.f14729f, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        if (r3 != 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    @Override // com.google.android.gms.internal.ads.tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(vl vlVar) {
        long j7;
        long parseLong;
        String headerField;
        this.f14729f = vlVar;
        long j8 = 0;
        this.f14736m = 0L;
        this.f14735l = 0L;
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
                httpURLConnection.setConnectTimeout(this.f14724a);
                httpURLConnection.setReadTimeout(this.f14725b);
                for (Map.Entry<String, String> entry : this.f14727d.a().entrySet()) {
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
                httpURLConnection.setRequestProperty("User-Agent", this.f14726c);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    this.f14730g = httpURLConnection;
                    try {
                        int responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 < 200 || responseCode2 > 299) {
                            Map<String, List<String>> headerFields = this.f14730g.getHeaderFields();
                            a();
                            am amVar = new am(responseCode2, headerFields, vlVar);
                            if (responseCode2 != 416) {
                                throw amVar;
                            }
                            amVar.initCause(new ul(0));
                            throw amVar;
                        }
                        this.f14730g.getContentType();
                        if (responseCode2 == 200) {
                            j7 = vlVar.f13432c;
                        }
                        j7 = 0;
                        this.f14733j = j7;
                        long j11 = vlVar.f13433d;
                        if (j11 == -1) {
                            HttpURLConnection httpURLConnection2 = this.f14730g;
                            String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                            if (!TextUtils.isEmpty(headerField2)) {
                                try {
                                    parseLong = Long.parseLong(headerField2);
                                } catch (NumberFormatException unused) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(headerField2).length() + 28);
                                    sb5.append("Unexpected Content-Length [");
                                    sb5.append(headerField2);
                                    sb5.append("]");
                                    Log.e("DefaultHttpDataSource", sb5.toString());
                                }
                                headerField = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField)) {
                                    Matcher matcher = f14722n.matcher(headerField);
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
                                                Log.w("DefaultHttpDataSource", sb6.toString());
                                                parseLong = Math.max(parseLong, parseLong2);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(headerField).length() + 27);
                                            sb7.append("Unexpected Content-Range [");
                                            sb7.append(headerField);
                                            sb7.append("]");
                                            Log.e("DefaultHttpDataSource", sb7.toString());
                                        }
                                    }
                                }
                                j11 = parseLong != -1 ? parseLong - this.f14733j : -1L;
                            }
                            parseLong = -1;
                            headerField = httpURLConnection2.getHeaderField("Content-Range");
                            if (!TextUtils.isEmpty(headerField)) {
                            }
                            j11 = parseLong != -1 ? parseLong - this.f14733j : -1L;
                        }
                        this.f14734k = j11;
                        try {
                            this.f14731h = this.f14730g.getInputStream();
                            this.f14732i = true;
                            im<? super yl> imVar = this.f14728e;
                            if (imVar != null) {
                                imVar.k(this, vlVar);
                            }
                            return this.f14734k;
                        } catch (IOException e7) {
                            a();
                            throw new zl(e7, vlVar, 1);
                        }
                    } catch (IOException e8) {
                        a();
                        String valueOf = String.valueOf(vlVar.f13430a.toString());
                        throw new zl(valueOf.length() != 0 ? "Unable to connect to ".concat(valueOf) : new String("Unable to connect to "), e8, vlVar, 1);
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
            String valueOf3 = String.valueOf(vlVar.f13430a.toString());
            throw new zl(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e9, vlVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final void g() {
        try {
            if (this.f14731h != null) {
                HttpURLConnection httpURLConnection = this.f14730g;
                long j7 = this.f14734k;
                if (j7 != -1) {
                    j7 -= this.f14736m;
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
                    this.f14731h.close();
                } catch (IOException e7) {
                    throw new zl(e7, this.f14729f, 3);
                }
            }
        } finally {
            this.f14731h = null;
            a();
            if (this.f14732i) {
                this.f14732i = false;
            }
        }
    }
}
