package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.B;
import okio.C;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* renamed from: g, reason: collision with root package name */
    public static final Companion f43016g = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final List f43017h = Util.v("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    private static final List f43018i = Util.v("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    private final RealConnection f43019a;

    /* renamed from: b, reason: collision with root package name */
    private final RealInterceptorChain f43020b;

    /* renamed from: c, reason: collision with root package name */
    private final Http2Connection f43021c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Http2Stream f43022d;

    /* renamed from: e, reason: collision with root package name */
    private final Protocol f43023e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f43024f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Headers f4 = request.f();
            ArrayList arrayList = new ArrayList(f4.size() + 4);
            arrayList.add(new Header(Header.f42906g, request.h()));
            arrayList.add(new Header(Header.f42907h, RequestLine.f42851a.c(request.j())));
            String d4 = request.d("Host");
            if (d4 != null) {
                arrayList.add(new Header(Header.f42909j, d4));
            }
            arrayList.add(new Header(Header.f42908i, request.j().p()));
            int size = f4.size();
            for (int i4 = 0; i4 < size; i4++) {
                String d5 = f4.d(i4);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = d5.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.f43017h.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(f4.f(i4), "trailers"))) {
                    arrayList.add(new Header(lowerCase, f4.f(i4)));
                }
            }
            return arrayList;
        }

        public final Response.Builder b(Headers headerBlock, Protocol protocol) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headerBlock.size();
            StatusLine statusLine = null;
            for (int i4 = 0; i4 < size; i4++) {
                String d4 = headerBlock.d(i4);
                String f4 = headerBlock.f(i4);
                if (Intrinsics.areEqual(d4, ":status")) {
                    statusLine = StatusLine.f42854d.a("HTTP/1.1 " + f4);
                } else if (!Http2ExchangeCodec.f43018i.contains(d4)) {
                    builder.c(d4, f4);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().p(protocol).g(statusLine.f42856b).m(statusLine.f42857c).k(builder.d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain chain, Http2Connection http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f43019a = connection;
        this.f43020b = chain;
        this.f43021c = http2Connection;
        List A4 = client.A();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f43023e = A4.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void a() {
        Http2Stream http2Stream = this.f43022d;
        Intrinsics.checkNotNull(http2Stream);
        http2Stream.n().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void b(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f43022d != null) {
            return;
        }
        this.f43022d = this.f43021c.r0(f43016g.a(request), request.a() != null);
        if (this.f43024f) {
            Http2Stream http2Stream = this.f43022d;
            Intrinsics.checkNotNull(http2Stream);
            http2Stream.f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.f43022d;
        Intrinsics.checkNotNull(http2Stream2);
        C v4 = http2Stream2.v();
        long h4 = this.f43020b.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v4.timeout(h4, timeUnit);
        Http2Stream http2Stream3 = this.f43022d;
        Intrinsics.checkNotNull(http2Stream3);
        http2Stream3.E().timeout(this.f43020b.j(), timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public B c(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Http2Stream http2Stream = this.f43022d;
        Intrinsics.checkNotNull(http2Stream);
        return http2Stream.p();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.f43024f = true;
        Http2Stream http2Stream = this.f43022d;
        if (http2Stream != null) {
            http2Stream.f(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder d(boolean z4) {
        Http2Stream http2Stream = this.f43022d;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder b4 = f43016g.b(http2Stream.C(), this.f43023e);
        if (z4 && b4.h() == 100) {
            return null;
        }
        return b4;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection e() {
        return this.f43019a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void f() {
        this.f43021c.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long g(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (HttpHeaders.b(response)) {
            return Util.u(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public z h(Request request, long j4) {
        Intrinsics.checkNotNullParameter(request, "request");
        Http2Stream http2Stream = this.f43022d;
        Intrinsics.checkNotNull(http2Stream);
        return http2Stream.n();
    }
}
