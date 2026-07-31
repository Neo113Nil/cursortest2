package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.nz;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public class nz extends AbstractC2211rj {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f29793e;

    /* renamed from: f, reason: collision with root package name */
    private final int f29794f;

    /* renamed from: g, reason: collision with root package name */
    private final int f29795g;

    /* renamed from: h, reason: collision with root package name */
    private final String f29796h;

    /* renamed from: i, reason: collision with root package name */
    private final ah0 f29797i;

    /* renamed from: j, reason: collision with root package name */
    private final ah0 f29798j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f29799k;

    /* renamed from: l, reason: collision with root package name */
    private oj1<String> f29800l;

    /* renamed from: m, reason: collision with root package name */
    private HttpURLConnection f29801m;

    /* renamed from: n, reason: collision with root package name */
    private InputStream f29802n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f29803o;

    /* renamed from: p, reason: collision with root package name */
    private int f29804p;

    /* renamed from: q, reason: collision with root package name */
    private long f29805q;

    /* renamed from: r, reason: collision with root package name */
    private long f29806r;

    public static final class a implements iv.a {

        /* renamed from: b, reason: collision with root package name */
        private String f29808b;

        /* renamed from: a, reason: collision with root package name */
        private final ah0 f29807a = new ah0();

        /* renamed from: c, reason: collision with root package name */
        private int f29809c = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        /* renamed from: d, reason: collision with root package name */
        private int f29810d = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        @Override // com.yandex.mobile.ads.impl.iv.a
        public final iv a() {
            return new nz(this.f29808b, this.f29809c, this.f29810d, this.f29807a);
        }

        public final a b() {
            this.f29808b = null;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends bc0<String, List<String>> {

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, List<String>> f29811b;

        public b(Map<String, List<String>> map) {
            this.f29811b = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(String str) {
            return str != null;
        }

        @Override // com.yandex.mobile.ads.impl.bc0
        protected final Map<String, List<String>> b() {
            return this.f29811b;
        }

        @Override // com.yandex.mobile.ads.impl.bc0, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            Iterator it = (Iterator) nj1.a(entrySet().iterator());
            if (obj == null) {
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.bc0, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return lx1.a(super.entrySet(), new oj1() { // from class: com.yandex.mobile.ads.impl.Ab
                @Override // com.yandex.mobile.ads.impl.oj1
                public final boolean apply(Object obj) {
                    boolean a4;
                    a4 = nz.b.a((Map.Entry) obj);
                    return a4;
                }
            });
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && a(obj);
        }

        @Override // com.yandex.mobile.ads.impl.bc0, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return c();
        }

        @Override // com.yandex.mobile.ads.impl.bc0, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.yandex.mobile.ads.impl.bc0, java.util.Map
        public final Set<String> keySet() {
            return lx1.a(super.keySet(), new oj1() { // from class: com.yandex.mobile.ads.impl.Za
                @Override // com.yandex.mobile.ads.impl.oj1
                public final boolean apply(Object obj) {
                    boolean a4;
                    a4 = nz.b.a((String) obj);
                    return a4;
                }
            });
        }

        @Override // com.yandex.mobile.ads.impl.bc0, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        protected final Map a() {
            return this.f29811b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(Map.Entry entry) {
            return entry.getKey() != null;
        }
    }

    public nz(String str, int i4, int i5, ah0 ah0Var) {
        super(true);
        this.f29796h = str;
        this.f29794f = i4;
        this.f29795g = i5;
        this.f29793e = false;
        this.f29797i = ah0Var;
        this.f29800l = null;
        this.f29798j = new ah0();
        this.f29799k = false;
    }

    private URL a(URL url, String str) {
        if (str == null) {
            throw new xg0("Null location redirect", IronSourceConstants.IS_LOAD_CALLED);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new xg0("Unsupported protocol redirect: " + protocol, IronSourceConstants.IS_LOAD_CALLED);
            }
            if (this.f29793e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new xg0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", IronSourceConstants.IS_LOAD_CALLED);
        } catch (MalformedURLException e4) {
            throw new xg0(e4, IronSourceConstants.IS_LOAD_CALLED, 1);
        }
    }

    private HttpURLConnection d(mv mvVar) {
        HttpURLConnection a4;
        URL url = new URL(mvVar.f29239a.toString());
        int i4 = mvVar.f29241c;
        byte[] bArr = mvVar.f29242d;
        long j4 = mvVar.f29244f;
        long j5 = mvVar.f29245g;
        int i5 = 1;
        int i6 = 0;
        boolean z4 = (mvVar.f29247i & 1) == 1;
        if (!this.f29793e && !this.f29799k) {
            return a(url, i4, bArr, j4, j5, z4, true, mvVar.f29243e);
        }
        while (true) {
            int i7 = i6 + 1;
            if (i6 > 20) {
                throw new xg0(new NoRouteToHostException(C1877de.a("Too many redirects: ", i7)), IronSourceConstants.IS_LOAD_CALLED, 1);
            }
            a4 = a(url, i4, bArr, j4, j5, z4, false, mvVar.f29243e);
            int responseCode = a4.getResponseCode();
            String headerField = a4.getHeaderField("Location");
            if ((i4 == i5 || i4 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                a4.disconnect();
                url = a(url, headerField);
            } else {
                if (i4 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                a4.disconnect();
                if (!this.f29799k || responseCode != 302) {
                    bArr = null;
                    i4 = 1;
                }
                url = a(url, headerField);
            }
            i6 = i7;
            i5 = 1;
        }
        return a4;
    }

    private void f() {
        HttpURLConnection httpURLConnection = this.f29801m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                ms0.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.f29801m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        try {
            InputStream inputStream = this.f29802n;
            if (inputStream != null) {
                long j4 = this.f29805q;
                long j5 = -1;
                if (j4 != -1) {
                    j5 = j4 - this.f29806r;
                }
                a(this.f29801m, j5);
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    int i4 = u82.f32873a;
                    throw new xg0(e4, 2000, 3);
                }
            }
        } finally {
            this.f29802n = null;
            f();
            if (this.f29803o) {
                this.f29803o = false;
                e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f29801m;
        return httpURLConnection == null ? tj0.g() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f29801m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        try {
            long j4 = this.f29805q;
            if (j4 != -1) {
                long j5 = j4 - this.f29806r;
                if (j5 == 0) {
                    return -1;
                }
                i5 = (int) Math.min(i5, j5);
            }
            InputStream inputStream = this.f29802n;
            int i6 = u82.f32873a;
            int read = inputStream.read(bArr, i4, i5);
            if (read != -1) {
                this.f29806r += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e4) {
            int i7 = u82.f32873a;
            throw xg0.a(e4, 2);
        }
    }

    private HttpURLConnection a(URL url, int i4, byte[] bArr, long j4, long j5, boolean z4, boolean z5, Map<String, String> map) {
        String sb;
        HttpURLConnection a4 = a(url);
        a4.setConnectTimeout(this.f29794f);
        a4.setReadTimeout(this.f29795g);
        HashMap hashMap = new HashMap();
        ah0 ah0Var = this.f29797i;
        if (ah0Var != null) {
            hashMap.putAll(ah0Var.a());
        }
        hashMap.putAll(this.f29798j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a4.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i5 = nh0.f29643c;
        if (j4 == 0 && j5 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j4);
            sb2.append("-");
            if (j5 != -1) {
                sb2.append((j4 + j5) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            a4.setRequestProperty("Range", sb);
        }
        String str = this.f29796h;
        if (str != null) {
            a4.setRequestProperty("User-Agent", str);
        }
        a4.setRequestProperty("Accept-Encoding", z4 ? "gzip" : "identity");
        a4.setInstanceFollowRedirects(z5);
        a4.setDoOutput(bArr != null);
        a4.setRequestMethod(mv.a(i4));
        if (bArr != null) {
            a4.setFixedLengthStreamingMode(bArr.length);
            a4.connect();
            OutputStream outputStream = a4.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return a4;
        }
        a4.connect();
        return a4;
    }

    private static void a(HttpURLConnection httpURLConnection, long j4) {
        int i4;
        if (httpURLConnection == null || (i4 = u82.f32873a) < 19 || i4 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j4 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j4 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        long j4 = 0;
        this.f29806r = 0L;
        this.f29805q = 0L;
        b(mvVar);
        try {
            HttpURLConnection d4 = d(mvVar);
            this.f29801m = d4;
            this.f29804p = d4.getResponseCode();
            d4.getResponseMessage();
            int i4 = this.f29804p;
            if (i4 >= 200 && i4 <= 299) {
                String contentType = d4.getContentType();
                oj1<String> oj1Var = this.f29800l;
                if (oj1Var != null && !oj1Var.apply(contentType)) {
                    f();
                    throw new yg0(contentType);
                }
                if (this.f29804p == 200) {
                    long j5 = mvVar.f29244f;
                    if (j5 != 0) {
                        j4 = j5;
                    }
                }
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(d4.getHeaderField("Content-Encoding"));
                if (!equalsIgnoreCase) {
                    long j6 = mvVar.f29245g;
                    if (j6 != -1) {
                        this.f29805q = j6;
                    } else {
                        long a4 = nh0.a(d4.getHeaderField("Content-Length"), d4.getHeaderField("Content-Range"));
                        this.f29805q = a4 != -1 ? a4 - j4 : -1L;
                    }
                } else {
                    this.f29805q = mvVar.f29245g;
                }
                try {
                    this.f29802n = d4.getInputStream();
                    if (equalsIgnoreCase) {
                        this.f29802n = new GZIPInputStream(this.f29802n);
                    }
                    this.f29803o = true;
                    c(mvVar);
                    try {
                        a(j4);
                        return this.f29805q;
                    } catch (IOException e4) {
                        f();
                        if (e4 instanceof xg0) {
                            throw ((xg0) e4);
                        }
                        throw new xg0(e4, 2000, 1);
                    }
                } catch (IOException e5) {
                    f();
                    throw new xg0(e5, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = d4.getHeaderFields();
            if (this.f29804p == 416) {
                if (mvVar.f29244f == nh0.a(d4.getHeaderField("Content-Range"))) {
                    this.f29803o = true;
                    c(mvVar);
                    long j7 = mvVar.f29245g;
                    if (j7 != -1) {
                        return j7;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = d4.getErrorStream();
            try {
                if (errorStream != null) {
                    int i5 = u82.f32873a;
                    byte[] bArr = new byte[Base64Utils.IO_BUFFER_SIZE];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = errorStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i6 = u82.f32873a;
                }
            } catch (IOException unused) {
                int i7 = u82.f32873a;
            }
            f();
            throw new zg0(this.f29804p, this.f29804p == 416 ? new jv(2008) : null, headerFields);
        } catch (IOException e6) {
            f();
            throw xg0.a(e6, 1);
        }
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    private void a(long j4) {
        if (j4 == 0) {
            return;
        }
        byte[] bArr = new byte[Base64Utils.IO_BUFFER_SIZE];
        while (j4 > 0) {
            int min = (int) Math.min(j4, Base64Utils.IO_BUFFER_SIZE);
            InputStream inputStream = this.f29802n;
            int i4 = u82.f32873a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new xg0(new InterruptedIOException(), 2000, 1);
            }
            if (read != -1) {
                j4 -= read;
                c(read);
            } else {
                throw new xg0(2008);
            }
        }
    }
}
