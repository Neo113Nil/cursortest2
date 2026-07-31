package okhttp3;

import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

@Metadata
/* loaded from: classes3.dex */
public final class Response implements Closeable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final Request f42543b;

    /* renamed from: c, reason: collision with root package name */
    private final Protocol f42544c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42545d;

    /* renamed from: e, reason: collision with root package name */
    private final int f42546e;

    /* renamed from: f, reason: collision with root package name */
    private final Handshake f42547f;

    /* renamed from: g, reason: collision with root package name */
    private final Headers f42548g;

    /* renamed from: h, reason: collision with root package name */
    private final ResponseBody f42549h;

    /* renamed from: i, reason: collision with root package name */
    private final Response f42550i;

    /* renamed from: j, reason: collision with root package name */
    private final Response f42551j;

    /* renamed from: k, reason: collision with root package name */
    private final Response f42552k;

    /* renamed from: l, reason: collision with root package name */
    private final long f42553l;

    /* renamed from: m, reason: collision with root package name */
    private final long f42554m;

    /* renamed from: n, reason: collision with root package name */
    private final Exchange f42555n;

    /* renamed from: o, reason: collision with root package name */
    private CacheControl f42556o;

    public Response(Request request, Protocol protocol, String message, int i4, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j4, long j5, Exchange exchange) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f42543b = request;
        this.f42544c = protocol;
        this.f42545d = message;
        this.f42546e = i4;
        this.f42547f = handshake;
        this.f42548g = headers;
        this.f42549h = responseBody;
        this.f42550i = response;
        this.f42551j = response2;
        this.f42552k = response3;
        this.f42553l = j4;
        this.f42554m = j5;
        this.f42555n = exchange;
    }

    public static /* synthetic */ String V(Response response, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return response.U(str, str2);
    }

    public final int J() {
        return this.f42546e;
    }

    public final Exchange N() {
        return this.f42555n;
    }

    public final Handshake Q() {
        return this.f42547f;
    }

    public final String U(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String b4 = this.f42548g.b(name);
        return b4 == null ? str : b4;
    }

    public final Headers W() {
        return this.f42548g;
    }

    public final boolean X() {
        int i4 = this.f42546e;
        return 200 <= i4 && i4 < 300;
    }

    public final String Y() {
        return this.f42545d;
    }

    public final Response Z() {
        return this.f42550i;
    }

    public final Builder a0() {
        return new Builder(this);
    }

    public final Response b0() {
        return this.f42552k;
    }

    public final Protocol c0() {
        return this.f42544c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.f42549h;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final long d0() {
        return this.f42554m;
    }

    public final Request e0() {
        return this.f42543b;
    }

    public final long f0() {
        return this.f42553l;
    }

    public final ResponseBody m() {
        return this.f42549h;
    }

    public final CacheControl n() {
        CacheControl cacheControl = this.f42556o;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl b4 = CacheControl.f42164n.b(this.f42548g);
        this.f42556o = b4;
        return b4;
    }

    public final Response o() {
        return this.f42551j;
    }

    public final List p() {
        String str;
        Headers headers = this.f42548g;
        int i4 = this.f42546e;
        if (i4 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i4 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.a(headers, str);
    }

    public String toString() {
        return "Response{protocol=" + this.f42544c + ", code=" + this.f42546e + ", message=" + this.f42545d + ", url=" + this.f42543b.j() + '}';
    }

    @Metadata
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Request f42557a;

        /* renamed from: b, reason: collision with root package name */
        private Protocol f42558b;

        /* renamed from: c, reason: collision with root package name */
        private int f42559c;

        /* renamed from: d, reason: collision with root package name */
        private String f42560d;

        /* renamed from: e, reason: collision with root package name */
        private Handshake f42561e;

        /* renamed from: f, reason: collision with root package name */
        private Headers.Builder f42562f;

        /* renamed from: g, reason: collision with root package name */
        private ResponseBody f42563g;

        /* renamed from: h, reason: collision with root package name */
        private Response f42564h;

        /* renamed from: i, reason: collision with root package name */
        private Response f42565i;

        /* renamed from: j, reason: collision with root package name */
        private Response f42566j;

        /* renamed from: k, reason: collision with root package name */
        private long f42567k;

        /* renamed from: l, reason: collision with root package name */
        private long f42568l;

        /* renamed from: m, reason: collision with root package name */
        private Exchange f42569m;

        public Builder() {
            this.f42559c = -1;
            this.f42562f = new Headers.Builder();
        }

        private final void e(Response response) {
            if (response != null && response.m() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, Response response) {
            if (response != null) {
                if (response.m() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (response.Z() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (response.o() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (response.b0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public Builder a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f42562f.a(name, value);
            return this;
        }

        public Builder b(ResponseBody responseBody) {
            this.f42563g = responseBody;
            return this;
        }

        public Response c() {
            int i4 = this.f42559c;
            if (i4 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f42559c).toString());
            }
            Request request = this.f42557a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f42558b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f42560d;
            if (str != null) {
                return new Response(request, protocol, str, i4, this.f42561e, this.f42562f.d(), this.f42563g, this.f42564h, this.f42565i, this.f42566j, this.f42567k, this.f42568l, this.f42569m);
            }
            throw new IllegalStateException("message == null");
        }

        public Builder d(Response response) {
            f("cacheResponse", response);
            this.f42565i = response;
            return this;
        }

        public Builder g(int i4) {
            this.f42559c = i4;
            return this;
        }

        public final int h() {
            return this.f42559c;
        }

        public Builder i(Handshake handshake) {
            this.f42561e = handshake;
            return this;
        }

        public Builder j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f42562f.h(name, value);
            return this;
        }

        public Builder k(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f42562f = headers.e();
            return this;
        }

        public final void l(Exchange deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f42569m = deferredTrailers;
        }

        public Builder m(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f42560d = message;
            return this;
        }

        public Builder n(Response response) {
            f("networkResponse", response);
            this.f42564h = response;
            return this;
        }

        public Builder o(Response response) {
            e(response);
            this.f42566j = response;
            return this;
        }

        public Builder p(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f42558b = protocol;
            return this;
        }

        public Builder q(long j4) {
            this.f42568l = j4;
            return this;
        }

        public Builder r(Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f42557a = request;
            return this;
        }

        public Builder s(long j4) {
            this.f42567k = j4;
            return this;
        }

        public Builder(Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f42559c = -1;
            this.f42557a = response.e0();
            this.f42558b = response.c0();
            this.f42559c = response.J();
            this.f42560d = response.Y();
            this.f42561e = response.Q();
            this.f42562f = response.W().e();
            this.f42563g = response.m();
            this.f42564h = response.Z();
            this.f42565i = response.o();
            this.f42566j = response.b0();
            this.f42567k = response.f0();
            this.f42568l = response.d0();
            this.f42569m = response.N();
        }
    }
}
