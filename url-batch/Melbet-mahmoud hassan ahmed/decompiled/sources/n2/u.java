package n2;

import android.net.Uri;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import n2.l;
import n2.u;

/* loaded from: classes.dex */
public class u extends g {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19575e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19576f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19577g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19578h;

    /* renamed from: i, reason: collision with root package name */
    private final d0 f19579i;

    /* renamed from: j, reason: collision with root package name */
    private final d0 f19580j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f19581k;

    /* renamed from: l, reason: collision with root package name */
    private l4.k<String> f19582l;

    /* renamed from: m, reason: collision with root package name */
    private p f19583m;

    /* renamed from: n, reason: collision with root package name */
    private HttpURLConnection f19584n;

    /* renamed from: o, reason: collision with root package name */
    private InputStream f19585o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19586p;

    /* renamed from: q, reason: collision with root package name */
    private int f19587q;

    /* renamed from: r, reason: collision with root package name */
    private long f19588r;

    /* renamed from: s, reason: collision with root package name */
    private long f19589s;

    public static final class b implements l.a {

        /* renamed from: b, reason: collision with root package name */
        private p0 f19591b;

        /* renamed from: c, reason: collision with root package name */
        private l4.k<String> f19592c;

        /* renamed from: d, reason: collision with root package name */
        private String f19593d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f19596g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f19597h;

        /* renamed from: a, reason: collision with root package name */
        private final d0 f19590a = new d0();

        /* renamed from: e, reason: collision with root package name */
        private int f19594e = 8000;

        /* renamed from: f, reason: collision with root package name */
        private int f19595f = 8000;

        @Override // n2.l.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a() {
            u uVar = new u(this.f19593d, this.f19594e, this.f19595f, this.f19596g, this.f19590a, this.f19592c, this.f19597h);
            p0 p0Var = this.f19591b;
            if (p0Var != null) {
                uVar.d(p0Var);
            }
            return uVar;
        }

        public b c(boolean z6) {
            this.f19596g = z6;
            return this;
        }

        public final b d(Map<String, String> map) {
            this.f19590a.a(map);
            return this;
        }

        public b e(String str) {
            this.f19593d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends m4.l<String, List<String>> {

        /* renamed from: f, reason: collision with root package name */
        private final Map<String, List<String>> f19598f;

        public c(Map<String, List<String>> map) {
            this.f19598f = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean j(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m4.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<String, List<String>> a() {
            return this.f19598f;
        }

        @Override // m4.l, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // m4.l, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return m4.p0.b(super.entrySet(), new l4.k() { // from class: n2.w
                @Override // l4.k
                public final boolean apply(Object obj) {
                    boolean i7;
                    i7 = u.c.i((Map.Entry) obj);
                    return i7;
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // m4.l, java.util.Map
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // m4.l, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // m4.l, java.util.Map
        public Set<String> keySet() {
            return m4.p0.b(super.keySet(), new l4.k() { // from class: n2.v
                @Override // l4.k
                public final boolean apply(Object obj) {
                    boolean j7;
                    j7 = u.c.j((String) obj);
                    return j7;
                }
            });
        }

        @Override // m4.l, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private u(String str, int i7, int i8, boolean z6, d0 d0Var, l4.k<String> kVar, boolean z7) {
        super(true);
        this.f19578h = str;
        this.f19576f = i7;
        this.f19577g = i8;
        this.f19575e = z6;
        this.f19579i = d0Var;
        this.f19582l = kVar;
        this.f19580j = new d0();
        this.f19581k = z7;
    }

    private int B(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f19588r;
        if (j7 != -1) {
            long j8 = j7 - this.f19589s;
            if (j8 == 0) {
                return -1;
            }
            i8 = (int) Math.min(i8, j8);
        }
        int read = ((InputStream) o2.m0.j(this.f19585o)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        this.f19589s += read;
        q(read);
        return read;
    }

    private void C(long j7, p pVar) {
        if (j7 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j7 > 0) {
            int read = ((InputStream) o2.m0.j(this.f19585o)).read(bArr, 0, (int) Math.min(j7, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new a0(new InterruptedIOException(), pVar, 2000, 1);
            }
            if (read == -1) {
                throw new a0(pVar, 2008, 1);
            }
            j7 -= read;
            q(read);
        }
    }

    private void u() {
        HttpURLConnection httpURLConnection = this.f19584n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                o2.r.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f19584n = null;
        }
    }

    private URL v(URL url, String str, p pVar) {
        if (str == null) {
            throw new a0("Null location redirect", pVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new a0("Unsupported protocol redirect: " + protocol, pVar, 2001, 1);
            }
            if (this.f19575e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new a0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", pVar, 2001, 1);
        } catch (MalformedURLException e7) {
            throw new a0(e7, pVar, 2001, 1);
        }
    }

    private static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection x(URL url, int i7, byte[] bArr, long j7, long j8, boolean z6, boolean z7, Map<String, String> map) {
        HttpURLConnection A = A(url);
        A.setConnectTimeout(this.f19576f);
        A.setReadTimeout(this.f19577g);
        HashMap hashMap = new HashMap();
        d0 d0Var = this.f19579i;
        if (d0Var != null) {
            hashMap.putAll(d0Var.b());
        }
        hashMap.putAll(this.f19580j.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a7 = e0.a(j7, j8);
        if (a7 != null) {
            A.setRequestProperty("Range", a7);
        }
        String str = this.f19578h;
        if (str != null) {
            A.setRequestProperty("User-Agent", str);
        }
        A.setRequestProperty("Accept-Encoding", z6 ? "gzip" : "identity");
        A.setInstanceFollowRedirects(z7);
        A.setDoOutput(bArr != null);
        A.setRequestMethod(p.c(i7));
        if (bArr != null) {
            A.setFixedLengthStreamingMode(bArr.length);
            A.connect();
            OutputStream outputStream = A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A.connect();
        }
        return A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HttpURLConnection y(p pVar) {
        URL url = new URL(pVar.f19496a.toString());
        int i7 = pVar.f19498c;
        byte[] bArr = pVar.f19499d;
        long j7 = pVar.f19502g;
        long j8 = pVar.f19503h;
        boolean d7 = pVar.d(1);
        if (!this.f19575e && !this.f19581k) {
            return x(url, i7, bArr, j7, j8, d7, true, pVar.f19500e);
        }
        URL url2 = url;
        int i8 = i7;
        byte[] bArr2 = bArr;
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (i9 > 20) {
                throw new a0(new NoRouteToHostException("Too many redirects: " + i10), pVar, 2001, 1);
            }
            int i11 = i8;
            long j9 = j7;
            URL url3 = url2;
            long j10 = j8;
            HttpURLConnection x6 = x(url2, i8, bArr2, j7, j8, d7, false, pVar.f19500e);
            int responseCode = x6.getResponseCode();
            String headerField = x6.getHeaderField("Location");
            if ((i11 == 1 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                x6.disconnect();
                url2 = v(url3, headerField, pVar);
                i8 = i11;
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                x6.disconnect();
                if (this.f19581k && responseCode == 302) {
                    i8 = i11;
                } else {
                    bArr2 = null;
                    i8 = 1;
                }
                url2 = v(url3, headerField, pVar);
            }
            i9 = i10;
            j7 = j9;
            j8 = j10;
        }
    }

    private static void z(HttpURLConnection httpURLConnection, long j7) {
        int i7;
        if (httpURLConnection == null || (i7 = o2.m0.f19752a) < 19 || i7 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j7 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j7 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) o2.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    HttpURLConnection A(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // n2.l
    public long b(p pVar) {
        byte[] bArr;
        this.f19583m = pVar;
        long j7 = 0;
        this.f19589s = 0L;
        this.f19588r = 0L;
        s(pVar);
        try {
            HttpURLConnection y6 = y(pVar);
            this.f19584n = y6;
            this.f19587q = y6.getResponseCode();
            String responseMessage = y6.getResponseMessage();
            int i7 = this.f19587q;
            if (i7 < 200 || i7 > 299) {
                Map<String, List<String>> headerFields = y6.getHeaderFields();
                if (this.f19587q == 416) {
                    if (pVar.f19502g == e0.c(y6.getHeaderField("Content-Range"))) {
                        this.f19586p = true;
                        t(pVar);
                        long j8 = pVar.f19503h;
                        if (j8 != -1) {
                            return j8;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = y6.getErrorStream();
                try {
                    bArr = errorStream != null ? o2.m0.U0(errorStream) : o2.m0.f19757f;
                } catch (IOException unused) {
                    bArr = o2.m0.f19757f;
                }
                byte[] bArr2 = bArr;
                u();
                throw new c0(this.f19587q, responseMessage, this.f19587q == 416 ? new m(2008) : null, headerFields, pVar, bArr2);
            }
            String contentType = y6.getContentType();
            l4.k<String> kVar = this.f19582l;
            if (kVar != null && !kVar.apply(contentType)) {
                u();
                throw new b0(contentType, pVar);
            }
            if (this.f19587q == 200) {
                long j9 = pVar.f19502g;
                if (j9 != 0) {
                    j7 = j9;
                }
            }
            boolean w6 = w(y6);
            if (w6) {
                this.f19588r = pVar.f19503h;
            } else {
                long j10 = pVar.f19503h;
                if (j10 != -1) {
                    this.f19588r = j10;
                } else {
                    long b7 = e0.b(y6.getHeaderField("Content-Length"), y6.getHeaderField("Content-Range"));
                    this.f19588r = b7 != -1 ? b7 - j7 : -1L;
                }
            }
            try {
                this.f19585o = y6.getInputStream();
                if (w6) {
                    this.f19585o = new GZIPInputStream(this.f19585o);
                }
                this.f19586p = true;
                t(pVar);
                try {
                    C(j7, pVar);
                    return this.f19588r;
                } catch (IOException e7) {
                    u();
                    if (e7 instanceof a0) {
                        throw ((a0) e7);
                    }
                    throw new a0(e7, pVar, 2000, 1);
                }
            } catch (IOException e8) {
                u();
                throw new a0(e8, pVar, 2000, 1);
            }
        } catch (IOException e9) {
            u();
            throw a0.c(e9, pVar, 1);
        }
    }

    @Override // n2.l
    public void close() {
        try {
            InputStream inputStream = this.f19585o;
            if (inputStream != null) {
                long j7 = this.f19588r;
                long j8 = -1;
                if (j7 != -1) {
                    j8 = j7 - this.f19589s;
                }
                z(this.f19584n, j8);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new a0(e7, (p) o2.m0.j(this.f19583m), 2000, 3);
                }
            }
        } finally {
            this.f19585o = null;
            u();
            if (this.f19586p) {
                this.f19586p = false;
                r();
            }
        }
    }

    @Override // n2.g, n2.l
    public Map<String, List<String>> g() {
        HttpURLConnection httpURLConnection = this.f19584n;
        return httpURLConnection == null ? m4.r.j() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // n2.l
    public Uri k() {
        HttpURLConnection httpURLConnection = this.f19584n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        try {
            return B(bArr, i7, i8);
        } catch (IOException e7) {
            throw a0.c(e7, (p) o2.m0.j(this.f19583m), 2);
        }
    }
}
