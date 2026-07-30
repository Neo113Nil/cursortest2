package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.google.android.gms.internal.ads.Zg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2893Zg extends AbstractC3624nF implements KM {

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f29028M = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: N, reason: collision with root package name */
    public static final AtomicReference f29029N = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final String f29030A;

    /* renamed from: B, reason: collision with root package name */
    public final C4164xG f29031B;

    /* renamed from: C, reason: collision with root package name */
    public HttpURLConnection f29032C;

    /* renamed from: D, reason: collision with root package name */
    public InputStream f29033D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f29034E;

    /* renamed from: F, reason: collision with root package name */
    public int f29035F;

    /* renamed from: G, reason: collision with root package name */
    public long f29036G;

    /* renamed from: H, reason: collision with root package name */
    public long f29037H;

    /* renamed from: I, reason: collision with root package name */
    public long f29038I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public int f29039K;

    /* renamed from: L, reason: collision with root package name */
    public final HashSet f29040L;

    /* renamed from: x, reason: collision with root package name */
    public final C2876Yg f29041x;

    /* renamed from: y, reason: collision with root package name */
    public final int f29042y;

    /* renamed from: z, reason: collision with root package name */
    public final int f29043z;

    public C2893Zg(String str, C3267gh c3267gh, int i, int i4, int i9) {
        super(true);
        this.f29041x = new C2876Yg(this);
        this.f29040L = new HashSet();
        PA.n(true ^ TextUtils.isEmpty(str));
        this.f29030A = str;
        this.f29031B = new C4164xG(4);
        this.f29042y = i;
        this.f29043z = i4;
        this.f29039K = i9;
        if (c3267gh != null) {
            a(c3267gh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0265 A[Catch: IOException -> 0x0038, TryCatch #1 {IOException -> 0x0038, blocks: (B:3:0x000d, B:4:0x001b, B:6:0x0021, B:8:0x002f, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:20:0x008f, B:22:0x00b3, B:23:0x00d4, B:24:0x00d9, B:38:0x010f, B:95:0x0258, B:97:0x0265, B:99:0x0278, B:105:0x0281, B:106:0x028e, B:109:0x0295, B:110:0x029c, B:114:0x029d, B:115:0x02ba), top: B:2:0x000d }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long F(C3197fJ c3197fJ) {
        long j9;
        long j10;
        int responseCode;
        String headerField;
        int responseCode2;
        long parseLong;
        String headerField2;
        long j11 = 0;
        this.J = 0L;
        this.f29038I = 0L;
        try {
            URL url = new URL(c3197fJ.f30686a.toString());
            int i = 0;
            while (true) {
                int i4 = i + 1;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i4);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f29041x);
                }
                httpURLConnection.setConnectTimeout(this.f29042y);
                httpURLConnection.setReadTimeout(this.f29043z);
                for (Map.Entry entry : this.f29031B.K().entrySet()) {
                    long j12 = j11;
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    j11 = j12;
                }
                long j13 = j11;
                long j14 = c3197fJ.f30688c;
                URL url2 = url;
                long j15 = c3197fJ.f30689d;
                if (j14 != j13) {
                    j9 = j14;
                } else if (j15 != -1) {
                    j9 = j13;
                } else {
                    j10 = -1;
                    httpURLConnection.setRequestProperty("User-Agent", this.f29030A);
                    httpURLConnection.setRequestProperty("Accept-Encoding", Q5.c.IDENTITY_NAME_SPACE);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f29032C = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.f29035F = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.f29032C.getHeaderFields();
                                f();
                                int i9 = this.f29035F;
                                String str = AbstractC3548lu.f32613a;
                                C3309hM c3309hM = new C3309hM(i9, null);
                                if (this.f29035F == 416) {
                                    throw c3309hM;
                                }
                                c3309hM.initCause(new NH());
                                throw c3309hM;
                            }
                            if (responseCode2 != 200 || j14 == j13) {
                                j14 = j13;
                            }
                            this.f29036G = j14;
                            if (j15 != j10) {
                                this.f29037H = j15;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f29032C;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        String o9 = D.y.o(new StringBuilder(String.valueOf(headerField3).length() + 28), "Unexpected Content-Length [", headerField3, "]");
                                        int i10 = t2.C.f40822b;
                                        u2.i.c(o9);
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f29028M.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (parseLong < j13) {
                                                    parseLong = parseLong2;
                                                } else if (parseLong != parseLong2) {
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField2).length() + 1);
                                                    sb2.append("Inconsistent headers [");
                                                    sb2.append(headerField3);
                                                    sb2.append("] [");
                                                    sb2.append(headerField2);
                                                    sb2.append("]");
                                                    String sb3 = sb2.toString();
                                                    int i11 = t2.C.f40822b;
                                                    u2.i.f(sb3);
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                String o10 = D.y.o(new StringBuilder(String.valueOf(headerField2).length() + 27), "Unexpected Content-Range [", headerField2, "]");
                                                int i12 = t2.C.f40822b;
                                                u2.i.c(o10);
                                            }
                                        }
                                    }
                                    this.f29037H = parseLong == j10 ? parseLong - this.f29036G : j10;
                                }
                                parseLong = j10;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.f29037H = parseLong == j10 ? parseLong - this.f29036G : j10;
                            }
                            try {
                                this.f29033D = this.f29032C.getInputStream();
                                this.f29034E = true;
                                c(c3197fJ);
                                return this.f29037H;
                            } catch (IOException e6) {
                                f();
                                throw new AL(e6, 2000, 1);
                            }
                        } catch (IOException e9) {
                            f();
                            throw new AL("Unable to connect to ".concat(String.valueOf(c3197fJ.f30686a.toString())), e9, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    url = new URL(url2, headerField);
                    String protocol = url.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    i = i4;
                    j11 = j13;
                }
                j10 = -1;
                StringBuilder sb4 = new StringBuilder(String.valueOf(j9).length() + 7);
                sb4.append("bytes=");
                long j16 = j9;
                sb4.append(j16);
                sb4.append("-");
                String sb5 = sb4.toString();
                if (j15 != -1) {
                    long j17 = (j16 + j15) - 1;
                    StringBuilder sb6 = new StringBuilder(sb5.length() + String.valueOf(j17).length());
                    sb6.append(sb5);
                    sb6.append(j17);
                    sb5 = sb6.toString();
                }
                httpURLConnection.setRequestProperty("Range", sb5);
                httpURLConnection.setRequestProperty("User-Agent", this.f29030A);
                httpURLConnection.setRequestProperty("Accept-Encoding", Q5.c.IDENTITY_NAME_SPACE);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f29032C = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.f29035F = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.f29032C.getHeaderFields();
                    f();
                    int i92 = this.f29035F;
                    String str2 = AbstractC3548lu.f32613a;
                    C3309hM c3309hM2 = new C3309hM(i92, null);
                    if (this.f29035F == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e10) {
            throw new AL("Unable to connect to ".concat(String.valueOf(c3197fJ.f30686a.toString())), e10, 2000, 1);
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.f29032C;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                int i = t2.C.f40822b;
                u2.i.d("Unexpected error while disconnecting", e6);
            }
            this.f29032C = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH, com.google.android.gms.internal.ads.KM
    public final Map h() {
        HttpURLConnection httpURLConnection = this.f29032C;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f29032C;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void o() {
        HashSet hashSet = this.f29040L;
        try {
            InputStream inputStream = this.f29033D;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    throw new AL(e6, 2000, 3);
                }
            }
        } finally {
            this.f29033D = null;
            f();
            if (this.f29034E) {
                this.f29034E = false;
                e();
            }
            hashSet.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.JN
    public final int z(byte[] bArr, int i, int i4) {
        try {
            if (this.f29038I != this.f29036G) {
                AtomicReference atomicReference = f29029N;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j9 = this.f29038I;
                    long j10 = this.f29036G;
                    if (j9 == j10) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.f29033D.read(bArr2, 0, (int) Math.min(j10 - j9, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f29038I += read;
                    d(read);
                }
            }
            if (i4 == 0) {
                return 0;
            }
            long j11 = this.f29037H;
            if (j11 != -1) {
                long j12 = j11 - this.J;
                if (j12 == 0) {
                    return -1;
                }
                i4 = (int) Math.min(i4, j12);
            }
            int read2 = this.f29033D.read(bArr, i, i4);
            if (read2 == -1) {
                if (this.f29037H != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.J += read2;
            d(read2);
            return read2;
        } catch (IOException e6) {
            throw new AL(e6, 2000, 2);
        }
    }
}
