package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class AK extends AbstractC3624nF implements KM {

    /* renamed from: A, reason: collision with root package name */
    public final String f23851A;

    /* renamed from: B, reason: collision with root package name */
    public final C4164xG f23852B;

    /* renamed from: C, reason: collision with root package name */
    public final C4164xG f23853C;

    /* renamed from: D, reason: collision with root package name */
    public C3197fJ f23854D;

    /* renamed from: E, reason: collision with root package name */
    public HttpURLConnection f23855E;

    /* renamed from: F, reason: collision with root package name */
    public InputStream f23856F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f23857G;

    /* renamed from: H, reason: collision with root package name */
    public int f23858H;

    /* renamed from: I, reason: collision with root package name */
    public long f23859I;
    public long J;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f23860x;

    /* renamed from: y, reason: collision with root package name */
    public final int f23861y;

    /* renamed from: z, reason: collision with root package name */
    public final int f23862z;

    public /* synthetic */ AK(String str, int i, int i4, boolean z8, C4164xG c4164xG) {
        super(true);
        this.f23851A = str;
        this.f23861y = i;
        this.f23862z = i4;
        this.f23860x = z8;
        this.f23852B = c4164xG;
        this.f23853C = new C4164xG(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01df A[Catch: IOException -> 0x01ea, TRY_LEAVE, TryCatch #0 {IOException -> 0x01ea, blocks: (B:27:0x01d7, B:29:0x01df), top: B:26:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long F(C3197fJ c3197fJ) {
        URL url;
        long j9;
        long j10;
        boolean z8;
        AK ak;
        long j11;
        HttpURLConnection httpURLConnection;
        boolean z9;
        long parseLong;
        boolean z10;
        long j12;
        long parseLong2;
        String group;
        AK ak2 = this;
        C3197fJ c3197fJ2 = c3197fJ;
        ak2.f23854D = c3197fJ2;
        long j13 = 0;
        ak2.J = 0L;
        ak2.f23859I = 0L;
        b(c3197fJ);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            url = new URL(c3197fJ2.f30686a.toString());
            j9 = c3197fJ2.f30688c;
            j10 = c3197fJ2.f30689d;
            z8 = false;
        } catch (IOException e6) {
            e = e6;
        }
        try {
            if (ak2.f23860x) {
                int i = 0;
                while (true) {
                    int i4 = i + 1;
                    if (i > 20) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                        sb.append("Too many redirects: ");
                        sb.append(i4);
                        throw new AL(new NoRouteToHostException(sb.toString()), AdError.INTERNAL_ERROR_CODE, 1);
                    }
                    ak = this;
                    HttpURLConnection f6 = ak.f(url, j9, j10, z8, false, c3197fJ2.f30687b);
                    int responseCode = f6.getResponseCode();
                    String headerField = f6.getHeaderField("Location");
                    j11 = j13;
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        httpURLConnection = f6;
                        break;
                    }
                    f6.disconnect();
                    url = ak.g(url, headerField);
                    c3197fJ2 = c3197fJ;
                    i = i4;
                    j13 = j11;
                    z8 = false;
                }
            } else {
                httpURLConnection = ak2.f(url, j9, j10, false, true, c3197fJ2.f30687b);
                ak = this;
                j11 = 0;
            }
            ak.f23855E = httpURLConnection;
            ak.f23858H = httpURLConnection.getResponseCode();
            httpURLConnection.getResponseMessage();
            int i9 = ak.f23858H;
            long j14 = c3197fJ2.f30688c;
            long j15 = c3197fJ2.f30689d;
            if (i9 < 200 || i9 > 299) {
                httpURLConnection.getHeaderFields();
                if (ak.f23858H == 416) {
                    String headerField2 = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = WM.f28384a;
                    if (!TextUtils.isEmpty(headerField2)) {
                        Matcher matcher = WM.f28385b.matcher(headerField2);
                        if (matcher.matches()) {
                            z9 = true;
                            String group2 = matcher.group(1);
                            group2.getClass();
                            parseLong = Long.parseLong(group2);
                            if (j14 == parseLong) {
                                ak.f23857G = z9;
                                c(c3197fJ);
                                return j15 != -1 ? j15 : j11;
                            }
                        }
                    }
                    z9 = true;
                    parseLong = -1;
                    if (j14 == parseLong) {
                    }
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        JC.a(errorStream);
                    } else {
                        String str = AbstractC3548lu.f32613a;
                    }
                } catch (IOException unused) {
                    String str2 = AbstractC3548lu.f32613a;
                }
                ak.j();
                throw new C3309hM(ak.f23858H, ak.f23858H == 416 ? new NH() : null);
            }
            httpURLConnection.getContentType();
            if (ak.f23858H != 200 || j14 == j11) {
                j14 = j11;
            }
            boolean equalsIgnoreCase = com.anythink.expressad.foundation.g.f.g.b.f19499d.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                z10 = equalsIgnoreCase;
                ak.f23859I = j15;
            } else if (j15 != -1) {
                ak.f23859I = j15;
                z10 = equalsIgnoreCase;
            } else {
                String headerField3 = httpURLConnection.getHeaderField("Content-Length");
                String headerField4 = httpURLConnection.getHeaderField("Content-Range");
                Pattern pattern2 = WM.f28384a;
                if (TextUtils.isEmpty(headerField3)) {
                    j12 = -1;
                } else {
                    try {
                        j12 = -1;
                        parseLong2 = Long.parseLong(headerField3);
                    } catch (NumberFormatException unused2) {
                        j12 = -1;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                        sb2.append("Unexpected Content-Length [");
                        sb2.append(headerField3);
                        sb2.append("]");
                        AbstractC3217fl.T("HttpUtil", sb2.toString());
                    }
                    if (!TextUtils.isEmpty(headerField4)) {
                        Matcher matcher2 = WM.f28384a.matcher(headerField4);
                        if (matcher2.matches()) {
                            try {
                                group = matcher2.group(2);
                            } catch (NumberFormatException unused3) {
                                z10 = equalsIgnoreCase;
                            }
                            try {
                            } catch (NumberFormatException unused4) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                                sb3.append("Unexpected Content-Range [");
                                sb3.append(headerField4);
                                sb3.append("]");
                                AbstractC3217fl.T("HttpUtil", sb3.toString());
                                ak.f23859I = parseLong2 == j12 ? parseLong2 - j14 : j12;
                                ak.f23856F = httpURLConnection.getInputStream();
                                if (z10) {
                                }
                                ak.f23857G = true;
                                c(c3197fJ);
                                if (j14 != j11) {
                                }
                                return ak.f23859I;
                            }
                            if (group == null) {
                                throw null;
                            }
                            long parseLong3 = Long.parseLong(group);
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                            }
                            long parseLong4 = (parseLong3 - Long.parseLong(group3)) + 1;
                            if (parseLong2 < j11) {
                                z10 = equalsIgnoreCase;
                                parseLong2 = parseLong4;
                            } else if (parseLong2 != parseLong4) {
                                z10 = equalsIgnoreCase;
                                StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                sb4.append("Inconsistent headers [");
                                sb4.append(headerField3);
                                sb4.append("] [");
                                sb4.append(headerField4);
                                sb4.append("]");
                                AbstractC3217fl.I("HttpUtil", sb4.toString());
                                parseLong2 = Math.max(parseLong2, parseLong4);
                            }
                            ak.f23859I = parseLong2 == j12 ? parseLong2 - j14 : j12;
                        }
                    }
                    z10 = equalsIgnoreCase;
                    ak.f23859I = parseLong2 == j12 ? parseLong2 - j14 : j12;
                }
                parseLong2 = j12;
                if (!TextUtils.isEmpty(headerField4)) {
                }
                z10 = equalsIgnoreCase;
                ak.f23859I = parseLong2 == j12 ? parseLong2 - j14 : j12;
            }
            try {
                ak.f23856F = httpURLConnection.getInputStream();
                if (z10) {
                    ak.f23856F = new GZIPInputStream(ak.f23856F);
                }
                ak.f23857G = true;
                c(c3197fJ);
                if (j14 != j11) {
                    try {
                        byte[] bArr = new byte[4096];
                        while (j14 > j11) {
                            int min = (int) Math.min(j14, 4096L);
                            InputStream inputStream = ak.f23856F;
                            String str3 = AbstractC3548lu.f32613a;
                            int read = inputStream.read(bArr, 0, min);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new AL(new InterruptedIOException(), 2000, 1);
                            }
                            if (read == -1) {
                                throw new AL();
                            }
                            j14 -= read;
                            ak.d(read);
                        }
                    } catch (IOException e9) {
                        ak.j();
                        if (e9 instanceof AL) {
                            throw ((AL) e9);
                        }
                        throw new AL(e9, 2000, 1);
                    }
                }
                return ak.f23859I;
            } catch (IOException e10) {
                ak.j();
                throw new AL(e10, 2000, 1);
            }
        } catch (IOException e11) {
            e = e11;
            ak2 = this;
            ak2.j();
            throw AL.a(e, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection f(URL url, long j9, long j10, boolean z8, boolean z9, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f23861y);
        httpURLConnection.setReadTimeout(this.f23862z);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f23852B.K());
        hashMap.putAll(this.f23853C.K());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j9 == 0) {
            if (j10 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.f23851A;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z8 ? Q5.c.IDENTITY_NAME_SPACE : com.anythink.expressad.foundation.g.f.g.b.f19499d);
                httpURLConnection.setInstanceFollowRedirects(z9);
                httpURLConnection.setDoOutput(false);
                int i = C3197fJ.f30685f;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j9 = 0;
        }
        StringBuilder sb2 = new StringBuilder("bytes=");
        sb2.append(j9);
        sb2.append("-");
        if (j10 != -1) {
            sb2.append((j9 + j10) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.f23851A;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z8 ? Q5.c.IDENTITY_NAME_SPACE : com.anythink.expressad.foundation.g.f.g.b.f19499d);
        httpURLConnection.setInstanceFollowRedirects(z9);
        httpURLConnection.setDoOutput(false);
        int i4 = C3197fJ.f30685f;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL g(URL url, String str) {
        if (str == null) {
            throw new AL("Null location redirect", AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new AL("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f23860x || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(AbstractC5051n.a(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new AL(sb.toString(), AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e6) {
            throw new AL(e6, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH, com.google.android.gms.internal.ads.KM
    public final Map h() {
        HttpURLConnection httpURLConnection = this.f23855E;
        return httpURLConnection == null ? C3944tC.f34377z : new C3521lK(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final Uri i() {
        HttpURLConnection httpURLConnection = this.f23855E;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C3197fJ c3197fJ = this.f23854D;
        if (c3197fJ != null) {
            return c3197fJ.f30686a;
        }
        return null;
    }

    public final void j() {
        HttpURLConnection httpURLConnection = this.f23855E;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                AbstractC3217fl.X("DefaultHttpDataSource", "Unexpected error while disconnecting", e6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void o() {
        try {
            InputStream inputStream = this.f23856F;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    String str = AbstractC3548lu.f32613a;
                    throw new AL(e6, 2000, 3);
                }
            }
        } finally {
            this.f23856F = null;
            j();
            if (this.f23857G) {
                this.f23857G = false;
                e();
            }
            this.f23855E = null;
            this.f23854D = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // com.google.android.gms.internal.ads.JN
    public final int z(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        try {
            long j9 = this.f23859I;
            if (j9 != -1) {
                long j10 = j9 - this.J;
                if (j10 == 0) {
                    return -1;
                }
                i4 = (int) Math.min(i4, j10);
            }
            InputStream inputStream = this.f23856F;
            String str = AbstractC3548lu.f32613a;
            int read = inputStream.read(bArr, i, i4);
            if (read != -1) {
                this.J += read;
                d(read);
                return read;
            }
            return -1;
        } catch (IOException e6) {
            String str2 = AbstractC3548lu.f32613a;
            throw AL.a(e6, 2);
        }
    }
}
