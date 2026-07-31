package okhttp3.internal.connection;

import com.ironsource.cc;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import okio.B;
import okio.C3372e;
import okio.j;
import okio.k;
import okio.p;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class Exchange {

    /* renamed from: a, reason: collision with root package name */
    private final RealCall f42734a;

    /* renamed from: b, reason: collision with root package name */
    private final EventListener f42735b;

    /* renamed from: c, reason: collision with root package name */
    private final ExchangeFinder f42736c;

    /* renamed from: d, reason: collision with root package name */
    private final ExchangeCodec f42737d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42738e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42739f;

    /* renamed from: g, reason: collision with root package name */
    private final RealConnection f42740g;

    @Metadata
    private final class RequestBodySink extends j {

        /* renamed from: f, reason: collision with root package name */
        private final long f42741f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f42742g;

        /* renamed from: h, reason: collision with root package name */
        private long f42743h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f42744i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Exchange f42745j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, z delegate, long j4) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f42745j = exchange;
            this.f42741f = j4;
        }

        private final IOException a(IOException iOException) {
            if (this.f42742g) {
                return iOException;
            }
            this.f42742g = true;
            return this.f42745j.a(this.f42743h, false, true, iOException);
        }

        @Override // okio.j, okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42744i) {
                return;
            }
            this.f42744i = true;
            long j4 = this.f42741f;
            if (j4 != -1 && this.f42743h != j4) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        @Override // okio.j, okio.z, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        @Override // okio.j, okio.z
        public void write(C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f42744i) {
                throw new IllegalStateException("closed");
            }
            long j5 = this.f42741f;
            if (j5 == -1 || this.f42743h + j4 <= j5) {
                try {
                    super.write(source, j4);
                    this.f42743h += j4;
                    return;
                } catch (IOException e4) {
                    throw a(e4);
                }
            }
            throw new ProtocolException("expected " + this.f42741f + " bytes but received " + (this.f42743h + j4));
        }
    }

    @Metadata
    public final class ResponseBodySource extends k {

        /* renamed from: g, reason: collision with root package name */
        private final long f42746g;

        /* renamed from: h, reason: collision with root package name */
        private long f42747h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f42748i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f42749j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f42750k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Exchange f42751l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, B delegate, long j4) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f42751l = exchange;
            this.f42746g = j4;
            this.f42748i = true;
            if (j4 == 0) {
                b(null);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.f42749j) {
                return iOException;
            }
            this.f42749j = true;
            if (iOException == null && this.f42748i) {
                this.f42748i = false;
                this.f42751l.i().w(this.f42751l.g());
            }
            return this.f42751l.a(this.f42747h, true, false, iOException);
        }

        @Override // okio.k, okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42750k) {
                return;
            }
            this.f42750k = true;
            try {
                super.close();
                b(null);
            } catch (IOException e4) {
                throw b(e4);
            }
        }

        @Override // okio.k, okio.B
        public long read(C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f42750k) {
                throw new IllegalStateException("closed");
            }
            try {
                long read = delegate().read(sink, j4);
                if (this.f42748i) {
                    this.f42748i = false;
                    this.f42751l.i().w(this.f42751l.g());
                }
                if (read == -1) {
                    b(null);
                    return -1L;
                }
                long j5 = this.f42747h + read;
                long j6 = this.f42746g;
                if (j6 != -1 && j5 > j6) {
                    throw new ProtocolException("expected " + this.f42746g + " bytes but received " + j5);
                }
                this.f42747h = j5;
                if (j5 == j6) {
                    b(null);
                }
                return read;
            } catch (IOException e4) {
                throw b(e4);
            }
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f42734a = call;
        this.f42735b = eventListener;
        this.f42736c = finder;
        this.f42737d = codec;
        this.f42740g = codec.e();
    }

    private final void u(IOException iOException) {
        this.f42739f = true;
        this.f42736c.h(iOException);
        this.f42737d.e().H(this.f42734a, iOException);
    }

    public final IOException a(long j4, boolean z4, boolean z5, IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z5) {
            if (iOException != null) {
                this.f42735b.s(this.f42734a, iOException);
            } else {
                this.f42735b.q(this.f42734a, j4);
            }
        }
        if (z4) {
            if (iOException != null) {
                this.f42735b.x(this.f42734a, iOException);
            } else {
                this.f42735b.v(this.f42734a, j4);
            }
        }
        return this.f42734a.s(this, z5, z4, iOException);
    }

    public final void b() {
        this.f42737d.cancel();
    }

    public final z c(Request request, boolean z4) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f42738e = z4;
        RequestBody a4 = request.a();
        Intrinsics.checkNotNull(a4);
        long a5 = a4.a();
        this.f42735b.r(this.f42734a);
        return new RequestBodySink(this, this.f42737d.h(request, a5), a5);
    }

    public final void d() {
        this.f42737d.cancel();
        this.f42734a.s(this, true, true, null);
    }

    public final void e() {
        try {
            this.f42737d.a();
        } catch (IOException e4) {
            this.f42735b.s(this.f42734a, e4);
            u(e4);
            throw e4;
        }
    }

    public final void f() {
        try {
            this.f42737d.f();
        } catch (IOException e4) {
            this.f42735b.s(this.f42734a, e4);
            u(e4);
            throw e4;
        }
    }

    public final RealCall g() {
        return this.f42734a;
    }

    public final RealConnection h() {
        return this.f42740g;
    }

    public final EventListener i() {
        return this.f42735b;
    }

    public final ExchangeFinder j() {
        return this.f42736c;
    }

    public final boolean k() {
        return this.f42739f;
    }

    public final boolean l() {
        return !Intrinsics.areEqual(this.f42736c.d().l().h(), this.f42740g.A().a().l().h());
    }

    public final boolean m() {
        return this.f42738e;
    }

    public final RealWebSocket.Streams n() {
        this.f42734a.y();
        return this.f42737d.e().x(this);
    }

    public final void o() {
        this.f42737d.e().z();
    }

    public final void p() {
        this.f42734a.s(this, true, false, null);
    }

    public final ResponseBody q(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String V3 = Response.V(response, cc.f15718K, null, 2, null);
            long g4 = this.f42737d.g(response);
            return new RealResponseBody(V3, g4, p.d(new ResponseBodySource(this, this.f42737d.c(response), g4)));
        } catch (IOException e4) {
            this.f42735b.x(this.f42734a, e4);
            u(e4);
            throw e4;
        }
    }

    public final Response.Builder r(boolean z4) {
        try {
            Response.Builder d4 = this.f42737d.d(z4);
            if (d4 == null) {
                return d4;
            }
            d4.l(this);
            return d4;
        } catch (IOException e4) {
            this.f42735b.x(this.f42734a, e4);
            u(e4);
            throw e4;
        }
    }

    public final void s(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f42735b.y(this.f42734a, response);
    }

    public final void t() {
        this.f42735b.z(this.f42734a);
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.f42735b.u(this.f42734a);
            this.f42737d.b(request);
            this.f42735b.t(this.f42734a, request);
        } catch (IOException e4) {
            this.f42735b.s(this.f42734a, e4);
            u(e4);
            throw e4;
        }
    }
}
