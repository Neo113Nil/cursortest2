package Y;

import E.AbstractC0005f;
import W.AbstractC0108a;
import W.J;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import v2.f0;

/* loaded from: classes.dex */
public final class p extends AbstractC0123c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3727e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3728f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3729g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3730h;

    /* renamed from: i, reason: collision with root package name */
    public final l2.e f3731i;

    /* renamed from: j, reason: collision with root package name */
    public final l2.e f3732j;

    /* renamed from: k, reason: collision with root package name */
    public k f3733k;

    /* renamed from: l, reason: collision with root package name */
    public HttpURLConnection f3734l;

    /* renamed from: m, reason: collision with root package name */
    public InputStream f3735m;
    public boolean n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public long f3736p;

    /* renamed from: q, reason: collision with root package name */
    public long f3737q;

    public p(String str, int i4, int i5, boolean z, l2.e eVar) {
        super(true);
        this.f3730h = str;
        this.f3728f = i4;
        this.f3729g = i5;
        this.f3727e = z;
        this.f3731i = eVar;
        this.f3732j = new l2.e(21);
    }

    @Override // Y.h
    public final Uri B() {
        HttpURLConnection httpURLConnection = this.f3734l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k kVar = this.f3733k;
        if (kVar != null) {
            return kVar.f3701a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x012b A[Catch: IOException -> 0x0136, TRY_LEAVE, TryCatch #1 {IOException -> 0x0136, blocks: (B:19:0x0123, B:21:0x012b), top: B:18:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    @Override // Y.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(k kVar) {
        boolean z;
        long j4;
        HttpURLConnection httpURLConnection;
        long j5;
        this.f3733k = kVar;
        this.f3737q = 0L;
        this.f3736p = 0L;
        g();
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            HttpURLConnection r4 = r(kVar);
            long j6 = kVar.f3705e;
            long j7 = kVar.f3706f;
            this.f3734l = r4;
            this.o = r4.getResponseCode();
            r4.getResponseMessage();
            int i4 = this.o;
            long j8 = -1;
            if (i4 < 200 || i4 > 299) {
                Map<String, List<String>> headerFields = r4.getHeaderFields();
                if (this.o == 416) {
                    String headerField = r4.getHeaderField("Content-Range");
                    Pattern pattern = w.f3744a;
                    if (TextUtils.isEmpty(headerField)) {
                        j4 = -1;
                        z = true;
                    } else {
                        Matcher matcher = w.f3745b.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            j4 = Long.parseLong(group);
                        } else {
                            j4 = -1;
                        }
                    }
                    if (j6 == j4) {
                        this.n = z;
                        h(kVar);
                        if (j7 != -1) {
                            return j7;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = r4.getErrorStream();
                try {
                    if (errorStream != null) {
                        w2.g.b(errorStream);
                    } else {
                        String str = J.f3263a;
                    }
                } catch (IOException unused) {
                    String str2 = J.f3263a;
                }
                i();
                throw new v(this.o, this.o == 416 ? new i(2008) : null, headerFields);
            }
            r4.getContentType();
            if (this.o != 200 || j6 == 0) {
                j6 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(r4.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection = r4;
                this.f3736p = j7;
            } else if (j7 != -1) {
                this.f3736p = j7;
                httpURLConnection = r4;
            } else {
                String headerField2 = r4.getHeaderField("Content-Length");
                String headerField3 = r4.getHeaderField("Content-Range");
                Pattern pattern2 = w.f3744a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j5 = -1;
                        j8 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        AbstractC0108a.e("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = w.f3744a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                httpURLConnection = r4;
                                long parseLong2 = (parseLong - Long.parseLong(group3)) + 1;
                                if (j8 < 0) {
                                    j8 = parseLong2;
                                } else if (j8 != parseLong2) {
                                    try {
                                        AbstractC0108a.s("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j8 = Math.max(j8, parseLong2);
                                    } catch (NumberFormatException unused3) {
                                        AbstractC0108a.e("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.f3736p = j8 == j5 ? j8 - j6 : j5;
                                        this.f3735m = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.n = true;
                                        h(kVar);
                                        x(j6);
                                        return this.f3736p;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = r4;
                            }
                            this.f3736p = j8 == j5 ? j8 - j6 : j5;
                        }
                    }
                    httpURLConnection = r4;
                    this.f3736p = j8 == j5 ? j8 - j6 : j5;
                }
                j5 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection = r4;
                this.f3736p = j8 == j5 ? j8 - j6 : j5;
            }
            try {
                this.f3735m = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.f3735m = new GZIPInputStream(this.f3735m);
                }
                this.n = true;
                h(kVar);
                try {
                    x(j6);
                    return this.f3736p;
                } catch (IOException e4) {
                    i();
                    if (e4 instanceof t) {
                        throw ((t) e4);
                    }
                    throw new t(e4, 2000, 1);
                }
            } catch (IOException e5) {
                i();
                throw new t(e5, 2000, 1);
            }
        } catch (IOException e6) {
            i();
            throw t.a(e6, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y.h
    public final void close() {
        try {
            InputStream inputStream = this.f3735m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    String str = J.f3263a;
                    throw new t(e4, 2000, 3);
                }
            }
        } finally {
            this.f3735m = null;
            i();
            if (this.n) {
                this.n = false;
                f();
            }
            this.f3734l = null;
            this.f3733k = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.f3734l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                AbstractC0108a.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
        }
    }

    public final URL p(URL url, String str) {
        if (str == null) {
            throw new t("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new t(AbstractC0005f.n("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f3727e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new t("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e4) {
            throw new t(e4, 2001, 1);
        }
    }

    public final HttpURLConnection r(k kVar) {
        HttpURLConnection w4;
        URL url = new URL(kVar.f3701a.toString());
        int i4 = kVar.f3702b;
        byte[] bArr = kVar.f3703c;
        long j4 = kVar.f3705e;
        long j5 = kVar.f3706f;
        int i5 = 1;
        int i6 = 0;
        boolean z = (kVar.f3708h & 1) == 1;
        if (!this.f3727e) {
            return w(url, i4, bArr, j4, j5, z, true, kVar.f3704d);
        }
        while (true) {
            int i7 = i6 + 1;
            if (i6 > 20) {
                throw new t(new NoRouteToHostException(AbstractC0005f.j(i7, "Too many redirects: ")), 2001, 1);
            }
            w4 = w(url, i4, bArr, j4, j5, z, false, kVar.f3704d);
            int responseCode = w4.getResponseCode();
            String headerField = w4.getHeaderField("Location");
            if ((i4 == i5 || i4 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                w4.disconnect();
                url = p(url, headerField);
            } else {
                if (i4 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                w4.disconnect();
                url = p(url, headerField);
                bArr = null;
                i4 = 1;
            }
            i6 = i7;
            i5 = 1;
        }
        return w4;
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        try {
            long j4 = this.f3736p;
            if (j4 != -1) {
                long j5 = j4 - this.f3737q;
                if (j5 == 0) {
                    return -1;
                }
                i5 = (int) Math.min(i5, j5);
            }
            InputStream inputStream = this.f3735m;
            String str = J.f3263a;
            int read = inputStream.read(bArr, i4, i5);
            if (read != -1) {
                this.f3737q += read;
                a(read);
                return read;
            }
            return -1;
        } catch (IOException e4) {
            String str2 = J.f3263a;
            throw t.a(e4, 2);
        }
    }

    @Override // Y.h
    public final Map t() {
        HttpURLConnection httpURLConnection = this.f3734l;
        return httpURLConnection == null ? f0.f15629g : new o(httpURLConnection.getHeaderFields());
    }

    public final HttpURLConnection w(URL url, int i4, byte[] bArr, long j4, long j5, boolean z, boolean z4, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f3728f);
        httpURLConnection.setReadTimeout(this.f3729g);
        HashMap hashMap = new HashMap();
        l2.e eVar = this.f3731i;
        if (eVar != null) {
            hashMap.putAll(eVar.r());
        }
        hashMap.putAll(this.f3732j.r());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = w.f3744a;
        if (j4 == 0 && j5 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j4);
            sb2.append(TokenBuilder.TOKEN_DELIMITER);
            if (j5 != -1) {
                sb2.append((j4 + j5) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str2 = this.f3730h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z4);
        httpURLConnection.setDoOutput(bArr != null);
        int i5 = k.f3700i;
        if (i4 == 1) {
            str = "GET";
        } else if (i4 == 2) {
            str = "POST";
        } else {
            if (i4 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void x(long j4) {
        if (j4 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j4 > 0) {
            int min = (int) Math.min(j4, 4096);
            InputStream inputStream = this.f3735m;
            String str = J.f3263a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new t(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new t();
            }
            j4 -= read;
            a(read);
        }
    }
}
