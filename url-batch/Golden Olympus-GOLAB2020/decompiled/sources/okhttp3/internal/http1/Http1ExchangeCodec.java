package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.B;
import okio.C;
import okio.C3372e;
import okio.f;
import okio.g;
import okio.l;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f42861h = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final OkHttpClient f42862a;

    /* renamed from: b, reason: collision with root package name */
    private final RealConnection f42863b;

    /* renamed from: c, reason: collision with root package name */
    private final g f42864c;

    /* renamed from: d, reason: collision with root package name */
    private final f f42865d;

    /* renamed from: e, reason: collision with root package name */
    private int f42866e;

    /* renamed from: f, reason: collision with root package name */
    private final HeadersReader f42867f;

    /* renamed from: g, reason: collision with root package name */
    private Headers f42868g;

    @Metadata
    private abstract class AbstractSource implements B {

        /* renamed from: b, reason: collision with root package name */
        private final l f42869b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f42870c;

        public AbstractSource() {
            this.f42869b = new l(Http1ExchangeCodec.this.f42864c.timeout());
        }

        protected final boolean m() {
            return this.f42870c;
        }

        public final void n() {
            if (Http1ExchangeCodec.this.f42866e == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.f42866e == 5) {
                Http1ExchangeCodec.this.r(this.f42869b);
                Http1ExchangeCodec.this.f42866e = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.f42866e);
            }
        }

        protected final void o(boolean z4) {
            this.f42870c = z4;
        }

        @Override // okio.B
        public long read(C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return Http1ExchangeCodec.this.f42864c.read(sink, j4);
            } catch (IOException e4) {
                Http1ExchangeCodec.this.e().z();
                n();
                throw e4;
            }
        }

        @Override // okio.B
        public C timeout() {
            return this.f42869b;
        }
    }

    @Metadata
    private final class ChunkedSink implements z {

        /* renamed from: b, reason: collision with root package name */
        private final l f42872b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f42873c;

        public ChunkedSink() {
            this.f42872b = new l(Http1ExchangeCodec.this.f42865d.timeout());
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f42873c) {
                return;
            }
            this.f42873c = true;
            Http1ExchangeCodec.this.f42865d.C("0\r\n\r\n");
            Http1ExchangeCodec.this.r(this.f42872b);
            Http1ExchangeCodec.this.f42866e = 3;
        }

        @Override // okio.z, java.io.Flushable
        public synchronized void flush() {
            if (this.f42873c) {
                return;
            }
            Http1ExchangeCodec.this.f42865d.flush();
        }

        @Override // okio.z
        public C timeout() {
            return this.f42872b;
        }

        @Override // okio.z
        public void write(C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f42873c) {
                throw new IllegalStateException("closed");
            }
            if (j4 == 0) {
                return;
            }
            Http1ExchangeCodec.this.f42865d.G(j4);
            Http1ExchangeCodec.this.f42865d.C("\r\n");
            Http1ExchangeCodec.this.f42865d.write(source, j4);
            Http1ExchangeCodec.this.f42865d.C("\r\n");
        }
    }

    @Metadata
    private final class ChunkedSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        private final HttpUrl f42875e;

        /* renamed from: f, reason: collision with root package name */
        private long f42876f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f42877g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Http1ExchangeCodec f42878h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f42878h = http1ExchangeCodec;
            this.f42875e = url;
            this.f42876f = -1L;
            this.f42877g = true;
        }

        private final void p() {
            if (this.f42876f != -1) {
                this.f42878h.f42864c.I();
            }
            try {
                this.f42876f = this.f42878h.f42864c.R();
                String obj = StringsKt.W0(this.f42878h.f42864c.I()).toString();
                if (this.f42876f < 0 || (obj.length() > 0 && !StringsKt.K(obj, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f42876f + obj + '\"');
                }
                if (this.f42876f == 0) {
                    this.f42877g = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.f42878h;
                    http1ExchangeCodec.f42868g = http1ExchangeCodec.f42867f.a();
                    OkHttpClient okHttpClient = this.f42878h.f42862a;
                    Intrinsics.checkNotNull(okHttpClient);
                    CookieJar p4 = okHttpClient.p();
                    HttpUrl httpUrl = this.f42875e;
                    Headers headers = this.f42878h.f42868g;
                    Intrinsics.checkNotNull(headers);
                    HttpHeaders.f(p4, httpUrl, headers);
                    n();
                }
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m()) {
                return;
            }
            if (this.f42877g && !Util.r(this, 100, TimeUnit.MILLISECONDS)) {
                this.f42878h.e().z();
                n();
            }
            o(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.B
        public long read(C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (m()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f42877g) {
                return -1L;
            }
            long j5 = this.f42876f;
            if (j5 == 0 || j5 == -1) {
                p();
                if (!this.f42877g) {
                    return -1L;
                }
            }
            long read = super.read(sink, Math.min(j4, this.f42876f));
            if (read != -1) {
                this.f42876f -= read;
                return read;
            }
            this.f42878h.e().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            n();
            throw protocolException;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    private final class FixedLengthSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        private long f42879e;

        public FixedLengthSource(long j4) {
            super();
            this.f42879e = j4;
            if (j4 == 0) {
                n();
            }
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m()) {
                return;
            }
            if (this.f42879e != 0 && !Util.r(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.e().z();
                n();
            }
            o(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.B
        public long read(C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (m()) {
                throw new IllegalStateException("closed");
            }
            long j5 = this.f42879e;
            if (j5 == 0) {
                return -1L;
            }
            long read = super.read(sink, Math.min(j5, j4));
            if (read == -1) {
                Http1ExchangeCodec.this.e().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                n();
                throw protocolException;
            }
            long j6 = this.f42879e - read;
            this.f42879e = j6;
            if (j6 == 0) {
                n();
            }
            return read;
        }
    }

    @Metadata
    private final class KnownLengthSink implements z {

        /* renamed from: b, reason: collision with root package name */
        private final l f42881b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f42882c;

        public KnownLengthSink() {
            this.f42881b = new l(Http1ExchangeCodec.this.f42865d.timeout());
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42882c) {
                return;
            }
            this.f42882c = true;
            Http1ExchangeCodec.this.r(this.f42881b);
            Http1ExchangeCodec.this.f42866e = 3;
        }

        @Override // okio.z, java.io.Flushable
        public void flush() {
            if (this.f42882c) {
                return;
            }
            Http1ExchangeCodec.this.f42865d.flush();
        }

        @Override // okio.z
        public C timeout() {
            return this.f42881b;
        }

        @Override // okio.z
        public void write(C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f42882c) {
                throw new IllegalStateException("closed");
            }
            Util.k(source.l0(), 0L, j4);
            Http1ExchangeCodec.this.f42865d.write(source, j4);
        }
    }

    @Metadata
    private final class UnknownLengthSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        private boolean f42884e;

        public UnknownLengthSource() {
            super();
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (m()) {
                return;
            }
            if (!this.f42884e) {
                n();
            }
            o(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.B
        public long read(C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (m()) {
                throw new IllegalStateException("closed");
            }
            if (this.f42884e) {
                return -1L;
            }
            long read = super.read(sink, j4);
            if (read != -1) {
                return read;
            }
            this.f42884e = true;
            n();
            return -1L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, g source, f sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f42862a = okHttpClient;
        this.f42863b = connection;
        this.f42864c = source;
        this.f42865d = sink;
        this.f42867f = new HeadersReader(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(l lVar) {
        C b4 = lVar.b();
        lVar.c(C.NONE);
        b4.clearDeadline();
        b4.clearTimeout();
    }

    private final boolean s(Request request) {
        return StringsKt.w("chunked", request.d("Transfer-Encoding"), true);
    }

    private final boolean t(Response response) {
        return StringsKt.w("chunked", Response.V(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final z u() {
        if (this.f42866e == 1) {
            this.f42866e = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.f42866e).toString());
    }

    private final B v(HttpUrl httpUrl) {
        if (this.f42866e == 4) {
            this.f42866e = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.f42866e).toString());
    }

    private final B w(long j4) {
        if (this.f42866e == 4) {
            this.f42866e = 5;
            return new FixedLengthSource(j4);
        }
        throw new IllegalStateException(("state: " + this.f42866e).toString());
    }

    private final z x() {
        if (this.f42866e == 1) {
            this.f42866e = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.f42866e).toString());
    }

    private final B y() {
        if (this.f42866e == 4) {
            this.f42866e = 5;
            e().z();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.f42866e).toString());
    }

    public final void A(Headers headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f42866e != 0) {
            throw new IllegalStateException(("state: " + this.f42866e).toString());
        }
        this.f42865d.C(requestLine).C("\r\n");
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f42865d.C(headers.d(i4)).C(": ").C(headers.f(i4)).C("\r\n");
        }
        this.f42865d.C("\r\n");
        this.f42866e = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void a() {
        this.f42865d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void b(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestLine requestLine = RequestLine.f42851a;
        Proxy.Type type = e().A().b().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        A(request.f(), requestLine.a(request, type));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public B c(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!HttpHeaders.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.e0().j());
        }
        long u4 = Util.u(response);
        return u4 != -1 ? w(u4) : y();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        e().d();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder d(boolean z4) {
        int i4 = this.f42866e;
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            throw new IllegalStateException(("state: " + this.f42866e).toString());
        }
        try {
            StatusLine a4 = StatusLine.f42854d.a(this.f42867f.b());
            Response.Builder k4 = new Response.Builder().p(a4.f42855a).g(a4.f42856b).m(a4.f42857c).k(this.f42867f.a());
            if (z4 && a4.f42856b == 100) {
                return null;
            }
            int i5 = a4.f42856b;
            if (i5 == 100) {
                this.f42866e = 3;
                return k4;
            }
            if (102 > i5 || i5 >= 200) {
                this.f42866e = 4;
                return k4;
            }
            this.f42866e = 3;
            return k4;
        } catch (EOFException e4) {
            throw new IOException("unexpected end of stream on " + e().A().a().l().n(), e4);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection e() {
        return this.f42863b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void f() {
        this.f42865d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long g(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!HttpHeaders.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return Util.u(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public z h(Request request, long j4) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.a() != null && request.a().d()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (j4 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void z(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long u4 = Util.u(response);
        if (u4 == -1) {
            return;
        }
        B w4 = w(u4);
        Util.L(w4, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        w4.close();
    }
}
