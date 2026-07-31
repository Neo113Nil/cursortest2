package okhttp3.internal.cache;

import com.ironsource.cc;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.B;
import okio.C;
import okio.C3372e;
import okio.f;
import okio.g;
import okio.p;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f42600b = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Cache f42601a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers c(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                String d4 = headers.d(i4);
                String f4 = headers.f(i4);
                if ((!StringsKt.w("Warning", d4, true) || !StringsKt.K(f4, "1", false, 2, null)) && (d(d4) || !e(d4) || headers2.b(d4) == null)) {
                    builder.c(d4, f4);
                }
            }
            int size2 = headers2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String d5 = headers2.d(i5);
                if (!d(d5) && e(d5)) {
                    builder.c(d5, headers2.f(i5));
                }
            }
            return builder.d();
        }

        private final boolean d(String str) {
            return StringsKt.w("Content-Length", str, true) || StringsKt.w("Content-Encoding", str, true) || StringsKt.w(cc.f15718K, str, true);
        }

        private final boolean e(String str) {
            return (StringsKt.w("Connection", str, true) || StringsKt.w("Keep-Alive", str, true) || StringsKt.w("Proxy-Authenticate", str, true) || StringsKt.w("Proxy-Authorization", str, true) || StringsKt.w("TE", str, true) || StringsKt.w("Trailers", str, true) || StringsKt.w("Transfer-Encoding", str, true) || StringsKt.w("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response f(Response response) {
            return (response != null ? response.m() : null) != null ? response.a0().b(null).c() : response;
        }

        private Companion() {
        }
    }

    public CacheInterceptor(Cache cache) {
        this.f42601a = cache;
    }

    private final Response b(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        z b4 = cacheRequest.b();
        ResponseBody m4 = response.m();
        Intrinsics.checkNotNull(m4);
        final g J3 = m4.J();
        final f c4 = p.c(b4);
        B b5 = new B() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1

            /* renamed from: b, reason: collision with root package name */
            private boolean f42602b;

            @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.f42602b && !Util.r(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f42602b = true;
                    cacheRequest.a();
                }
                g.this.close();
            }

            @Override // okio.B
            public long read(C3372e sink, long j4) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    long read = g.this.read(sink, j4);
                    if (read != -1) {
                        sink.J(c4.q(), sink.l0() - read, read);
                        c4.y();
                        return read;
                    }
                    if (!this.f42602b) {
                        this.f42602b = true;
                        c4.close();
                    }
                    return -1L;
                } catch (IOException e4) {
                    if (this.f42602b) {
                        throw e4;
                    }
                    this.f42602b = true;
                    cacheRequest.a();
                    throw e4;
                }
            }

            @Override // okio.B
            public C timeout() {
                return g.this.timeout();
            }
        };
        return response.a0().b(new RealResponseBody(Response.V(response, cc.f15718K, null, 2, null), response.m().o(), p.d(b5))).c();
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        EventListener eventListener;
        ResponseBody m4;
        ResponseBody m5;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Call call = chain.call();
        Cache cache = this.f42601a;
        Response b4 = cache != null ? cache.b(chain.b()) : null;
        CacheStrategy b5 = new CacheStrategy.Factory(System.currentTimeMillis(), chain.b(), b4).b();
        Request b6 = b5.b();
        Response a4 = b5.a();
        Cache cache2 = this.f42601a;
        if (cache2 != null) {
            cache2.U(b5);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (eventListener = realCall.n()) == null) {
            eventListener = EventListener.f42371b;
        }
        if (b4 != null && a4 == null && (m5 = b4.m()) != null) {
            Util.l(m5);
        }
        if (b6 == null && a4 == null) {
            Response c4 = new Response.Builder().r(chain.b()).p(Protocol.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(Util.f42591c).s(-1L).q(System.currentTimeMillis()).c();
            eventListener.A(call, c4);
            return c4;
        }
        if (b6 == null) {
            Intrinsics.checkNotNull(a4);
            Response c5 = a4.a0().d(f42600b.f(a4)).c();
            eventListener.b(call, c5);
            return c5;
        }
        if (a4 != null) {
            eventListener.a(call, a4);
        } else if (this.f42601a != null) {
            eventListener.c(call);
        }
        try {
            Response a5 = chain.a(b6);
            if (a5 == null && b4 != null && m4 != null) {
            }
            if (a4 != null) {
                if (a5 != null && a5.J() == 304) {
                    Response.Builder a02 = a4.a0();
                    Companion companion = f42600b;
                    Response c6 = a02.k(companion.c(a4.W(), a5.W())).s(a5.f0()).q(a5.d0()).d(companion.f(a4)).n(companion.f(a5)).c();
                    ResponseBody m6 = a5.m();
                    Intrinsics.checkNotNull(m6);
                    m6.close();
                    Cache cache3 = this.f42601a;
                    Intrinsics.checkNotNull(cache3);
                    cache3.Q();
                    this.f42601a.V(a4, c6);
                    eventListener.b(call, c6);
                    return c6;
                }
                ResponseBody m7 = a4.m();
                if (m7 != null) {
                    Util.l(m7);
                }
            }
            Intrinsics.checkNotNull(a5);
            Response.Builder a03 = a5.a0();
            Companion companion2 = f42600b;
            Response c7 = a03.d(companion2.f(a4)).n(companion2.f(a5)).c();
            if (this.f42601a != null) {
                if (HttpHeaders.b(c7) && CacheStrategy.f42606c.a(c7, b6)) {
                    Response b7 = b(this.f42601a.o(c7), c7);
                    if (a4 != null) {
                        eventListener.c(call);
                    }
                    return b7;
                }
                if (HttpMethod.f42838a.a(b6.h())) {
                    try {
                        this.f42601a.p(b6);
                    } catch (IOException unused) {
                    }
                }
            }
            return c7;
        } finally {
            if (b4 != null && (m4 = b4.m()) != null) {
                Util.l(m4);
            }
        }
    }
}
