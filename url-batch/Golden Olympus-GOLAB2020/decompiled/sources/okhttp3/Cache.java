package okhttp3;

import com.ironsource.cc;
import com.ironsource.jn;
import f2.AbstractC2420c;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.T;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.B;
import okio.C3372e;
import okio.f;
import okio.g;
import okio.h;
import okio.j;
import okio.k;
import okio.p;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable, AutoCloseable {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f42129h = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private final DiskLruCache f42130b;

    /* renamed from: c, reason: collision with root package name */
    private int f42131c;

    /* renamed from: d, reason: collision with root package name */
    private int f42132d;

    /* renamed from: e, reason: collision with root package name */
    private int f42133e;

    /* renamed from: f, reason: collision with root package name */
    private int f42134f;

    /* renamed from: g, reason: collision with root package name */
    private int f42135g;

    @Metadata
    private static final class CacheResponseBody extends ResponseBody {

        /* renamed from: c, reason: collision with root package name */
        private final DiskLruCache.Snapshot f42136c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42137d;

        /* renamed from: e, reason: collision with root package name */
        private final String f42138e;

        /* renamed from: f, reason: collision with root package name */
        private final g f42139f;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.f42136c = snapshot;
            this.f42137d = str;
            this.f42138e = str2;
            this.f42139f = p.d(new k(snapshot.n(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.k, okio.B, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.Q().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public g J() {
            return this.f42139f;
        }

        public final DiskLruCache.Snapshot Q() {
            return this.f42136c;
        }

        @Override // okhttp3.ResponseBody
        public long o() {
            String str = this.f42138e;
            if (str != null) {
                return Util.W(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType p() {
            String str = this.f42137d;
            if (str != null) {
                return MediaType.f42413e.b(str);
            }
            return null;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set d(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i4 = 0; i4 < size; i4++) {
                if (StringsKt.w("Vary", headers.d(i4), true)) {
                    String f4 = headers.f(i4);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.y(L.f41137a));
                    }
                    Iterator it = StringsKt.D0(f4, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.W0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? T.e() : treeSet;
        }

        private final Headers e(Headers headers, Headers headers2) {
            Set d4 = d(headers2);
            if (d4.isEmpty()) {
                return Util.f42590b;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                String d5 = headers.d(i4);
                if (d4.contains(d5)) {
                    builder.a(d5, headers.f(i4));
                }
            }
            return builder.d();
        }

        public final boolean a(Response response) {
            Intrinsics.checkNotNullParameter(response, "<this>");
            return d(response.W()).contains("*");
        }

        public final String b(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return h.f43270e.d(url.toString()).o().l();
        }

        public final int c(g source) {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long z4 = source.z();
                String I3 = source.I();
                if (z4 >= 0 && z4 <= 2147483647L && I3.length() <= 0) {
                    return (int) z4;
                }
                throw new IOException("expected an int but was \"" + z4 + I3 + '\"');
            } catch (NumberFormatException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public final Headers f(Response response) {
            Intrinsics.checkNotNullParameter(response, "<this>");
            Response Z3 = response.Z();
            Intrinsics.checkNotNull(Z3);
            return e(Z3.e0().f(), response.W());
        }

        public final boolean g(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> d4 = d(cachedResponse.W());
            if ((d4 instanceof Collection) && d4.isEmpty()) {
                return true;
            }
            for (String str : d4) {
                if (!Intrinsics.areEqual(cachedRequest.g(str), newRequest.e(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }
    }

    @Metadata
    private final class RealCacheRequest implements CacheRequest {

        /* renamed from: a, reason: collision with root package name */
        private final DiskLruCache.Editor f42154a;

        /* renamed from: b, reason: collision with root package name */
        private final z f42155b;

        /* renamed from: c, reason: collision with root package name */
        private final z f42156c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f42157d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Cache f42158e;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f42158e = cache;
            this.f42154a = editor;
            z f4 = editor.f(1);
            this.f42155b = f4;
            this.f42156c = new j(f4) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.j, okio.z, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.d()) {
                            return;
                        }
                        realCacheRequest.e(true);
                        cache2.N(cache2.n() + 1);
                        super.close();
                        this.f42154a.b();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void a() {
            Cache cache = this.f42158e;
            synchronized (cache) {
                if (this.f42157d) {
                    return;
                }
                this.f42157d = true;
                cache.J(cache.m() + 1);
                Util.l(this.f42155b);
                try {
                    this.f42154a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public z b() {
            return this.f42156c;
        }

        public final boolean d() {
            return this.f42157d;
        }

        public final void e(boolean z4) {
            this.f42157d = z4;
        }
    }

    public Cache(File directory, long j4, FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f42130b = new DiskLruCache(fileSystem, directory, 201105, 2, j4, TaskRunner.f42718i);
    }

    private final void a(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.a();
            } catch (IOException unused) {
            }
        }
    }

    public final void J(int i4) {
        this.f42132d = i4;
    }

    public final void N(int i4) {
        this.f42131c = i4;
    }

    public final synchronized void Q() {
        this.f42134f++;
    }

    public final synchronized void U(CacheStrategy cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.f42135g++;
            if (cacheStrategy.b() != null) {
                this.f42133e++;
            } else if (cacheStrategy.a() != null) {
                this.f42134f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void V(Response cached, Response network) {
        DiskLruCache.Editor editor;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        Entry entry = new Entry(network);
        ResponseBody m4 = cached.m();
        Intrinsics.checkNotNull(m4, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editor = ((CacheResponseBody) m4).Q().m();
            if (editor == null) {
                return;
            }
            try {
                entry.f(editor);
                editor.b();
            } catch (IOException unused) {
                a(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public final Response b(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            DiskLruCache.Snapshot N3 = this.f42130b.N(f42129h.b(request.j()));
            if (N3 == null) {
                return null;
            }
            try {
                Entry entry = new Entry(N3.n(0));
                Response d4 = entry.d(N3);
                if (entry.b(request, d4)) {
                    return d4;
                }
                ResponseBody m4 = d4.m();
                if (m4 != null) {
                    Util.l(m4);
                }
                return null;
            } catch (IOException unused) {
                Util.l(N3);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42130b.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f42130b.flush();
    }

    public final int m() {
        return this.f42132d;
    }

    public final int n() {
        return this.f42131c;
    }

    public final CacheRequest o(Response response) {
        DiskLruCache.Editor editor;
        Intrinsics.checkNotNullParameter(response, "response");
        String h4 = response.e0().h();
        if (HttpMethod.f42838a.a(response.e0().h())) {
            try {
                p(response.e0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(h4, jn.f16864a)) {
            return null;
        }
        Companion companion = f42129h;
        if (companion.a(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.J(this.f42130b, companion.b(response.e0().j()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.f(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                a(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final void p(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f42130b.e0(f42129h.b(request.j()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File directory, long j4) {
        this(directory, j4, FileSystem.f43088b);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    @Metadata
    private static final class Entry {

        /* renamed from: k, reason: collision with root package name */
        public static final Companion f42141k = new Companion(null);

        /* renamed from: l, reason: collision with root package name */
        private static final String f42142l;

        /* renamed from: m, reason: collision with root package name */
        private static final String f42143m;

        /* renamed from: a, reason: collision with root package name */
        private final HttpUrl f42144a;

        /* renamed from: b, reason: collision with root package name */
        private final Headers f42145b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42146c;

        /* renamed from: d, reason: collision with root package name */
        private final Protocol f42147d;

        /* renamed from: e, reason: collision with root package name */
        private final int f42148e;

        /* renamed from: f, reason: collision with root package name */
        private final String f42149f;

        /* renamed from: g, reason: collision with root package name */
        private final Headers f42150g;

        /* renamed from: h, reason: collision with root package name */
        private final Handshake f42151h;

        /* renamed from: i, reason: collision with root package name */
        private final long f42152i;

        /* renamed from: j, reason: collision with root package name */
        private final long f42153j;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.f43120a;
            sb.append(companion.g().g());
            sb.append("-Sent-Millis");
            f42142l = sb.toString();
            f42143m = companion.g().g() + "-Received-Millis";
        }

        public Entry(B rawSource) {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                g d4 = p.d(rawSource);
                String I3 = d4.I();
                HttpUrl f4 = HttpUrl.f42390k.f(I3);
                if (f4 == null) {
                    IOException iOException = new IOException("Cache corruption for " + I3);
                    Platform.f43120a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f42144a = f4;
                this.f42146c = d4.I();
                Headers.Builder builder = new Headers.Builder();
                int c4 = Cache.f42129h.c(d4);
                for (int i4 = 0; i4 < c4; i4++) {
                    builder.b(d4.I());
                }
                this.f42145b = builder.d();
                StatusLine a4 = StatusLine.f42854d.a(d4.I());
                this.f42147d = a4.f42855a;
                this.f42148e = a4.f42856b;
                this.f42149f = a4.f42857c;
                Headers.Builder builder2 = new Headers.Builder();
                int c5 = Cache.f42129h.c(d4);
                for (int i5 = 0; i5 < c5; i5++) {
                    builder2.b(d4.I());
                }
                String str = f42142l;
                String e4 = builder2.e(str);
                String str2 = f42143m;
                String e5 = builder2.e(str2);
                builder2.g(str);
                builder2.g(str2);
                this.f42152i = e4 != null ? Long.parseLong(e4) : 0L;
                this.f42153j = e5 != null ? Long.parseLong(e5) : 0L;
                this.f42150g = builder2.d();
                if (a()) {
                    String I4 = d4.I();
                    if (I4.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + I4 + '\"');
                    }
                    this.f42151h = Handshake.f42379e.b(!d4.v() ? TlsVersion.f42581c.a(d4.I()) : TlsVersion.SSL_3_0, CipherSuite.f42255b.b(d4.I()), c(d4), c(d4));
                } else {
                    this.f42151h = null;
                }
                Unit unit = Unit.f41027a;
                AbstractC2420c.a(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2420c.a(rawSource, th);
                    throw th2;
                }
            }
        }

        private final boolean a() {
            return Intrinsics.areEqual(this.f42144a.p(), "https");
        }

        private final List c(g gVar) {
            int c4 = Cache.f42129h.c(gVar);
            if (c4 == -1) {
                return CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c4);
                for (int i4 = 0; i4 < c4; i4++) {
                    String I3 = gVar.I();
                    C3372e c3372e = new C3372e();
                    h a4 = h.f43270e.a(I3);
                    if (a4 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c3372e.M(a4);
                    arrayList.add(certificateFactory.generateCertificate(c3372e.S()));
                }
                return arrayList;
            } catch (CertificateException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        private final void e(f fVar, List list) {
            try {
                fVar.P(list.size()).w(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    h.a aVar = h.f43270e;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    fVar.C(h.a.f(aVar, bytes, 0, 0, 3, null).c()).w(10);
                }
            } catch (CertificateEncodingException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public final boolean b(Request request, Response response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.areEqual(this.f42144a, request.j()) && Intrinsics.areEqual(this.f42146c, request.h()) && Cache.f42129h.g(response, this.f42145b, request);
        }

        public final Response d(DiskLruCache.Snapshot snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String b4 = this.f42150g.b(cc.f15718K);
            String b5 = this.f42150g.b("Content-Length");
            return new Response.Builder().r(new Request.Builder().j(this.f42144a).f(this.f42146c, null).e(this.f42145b).a()).p(this.f42147d).g(this.f42148e).m(this.f42149f).k(this.f42150g).b(new CacheResponseBody(snapshot, b4, b5)).i(this.f42151h).s(this.f42152i).q(this.f42153j).c();
        }

        public final void f(DiskLruCache.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            f c4 = p.c(editor.f(0));
            try {
                c4.C(this.f42144a.toString()).w(10);
                c4.C(this.f42146c).w(10);
                c4.P(this.f42145b.size()).w(10);
                int size = this.f42145b.size();
                for (int i4 = 0; i4 < size; i4++) {
                    c4.C(this.f42145b.d(i4)).C(": ").C(this.f42145b.f(i4)).w(10);
                }
                c4.C(new StatusLine(this.f42147d, this.f42148e, this.f42149f).toString()).w(10);
                c4.P(this.f42150g.size() + 2).w(10);
                int size2 = this.f42150g.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    c4.C(this.f42150g.d(i5)).C(": ").C(this.f42150g.f(i5)).w(10);
                }
                c4.C(f42142l).C(": ").P(this.f42152i).w(10);
                c4.C(f42143m).C(": ").P(this.f42153j).w(10);
                if (a()) {
                    c4.w(10);
                    Handshake handshake = this.f42151h;
                    Intrinsics.checkNotNull(handshake);
                    c4.C(handshake.a().c()).w(10);
                    e(c4, this.f42151h.d());
                    e(c4, this.f42151h.c());
                    c4.C(this.f42151h.e().d()).w(10);
                }
                Unit unit = Unit.f41027a;
                AbstractC2420c.a(c4, null);
            } finally {
            }
        }

        public Entry(Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f42144a = response.e0().j();
            this.f42145b = Cache.f42129h.f(response);
            this.f42146c = response.e0().h();
            this.f42147d = response.c0();
            this.f42148e = response.J();
            this.f42149f = response.Y();
            this.f42150g = response.W();
            this.f42151h = response.Q();
            this.f42152i = response.f0();
            this.f42153j = response.d0();
        }
    }
}
