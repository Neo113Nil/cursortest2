package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i22;
import com.yandex.mobile.ads.impl.oq1;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lg0 implements s50 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final td1 f28544a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final un1 f28545b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final okio.g f28546c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final okio.f f28547d;

    /* renamed from: e, reason: collision with root package name */
    private int f28548e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final gf0 f28549f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private ff0 f28550g;

    private abstract class a implements okio.B {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final okio.l f28551a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28552b;

        public a() {
            this.f28551a = new okio.l(lg0.this.f28546c.timeout());
        }

        protected final boolean a() {
            return this.f28552b;
        }

        public final void b() {
            if (lg0.this.f28548e == 6) {
                return;
            }
            if (lg0.this.f28548e == 5) {
                lg0.a(lg0.this, this.f28551a);
                lg0.this.f28548e = 6;
            } else {
                throw new IllegalStateException("state: " + lg0.this.f28548e);
            }
        }

        protected final void c() {
            this.f28552b = true;
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        @Override // okio.B
        public long read(@NotNull C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return lg0.this.f28546c.read(sink, j4);
            } catch (IOException e4) {
                lg0.this.c().j();
                b();
                throw e4;
            }
        }

        @Override // okio.B
        @NotNull
        public final okio.C timeout() {
            return this.f28551a;
        }
    }

    private final class b implements okio.z {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final okio.l f28554a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28555b;

        public b() {
            this.f28554a = new okio.l(lg0.this.f28547d.timeout());
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f28555b) {
                return;
            }
            this.f28555b = true;
            lg0.this.f28547d.C("0\r\n\r\n");
            lg0.a(lg0.this, this.f28554a);
            lg0.this.f28548e = 3;
        }

        @Override // okio.z, java.io.Flushable
        public final synchronized void flush() {
            if (this.f28555b) {
                return;
            }
            lg0.this.f28547d.flush();
        }

        @Override // okio.z
        @NotNull
        public final okio.C timeout() {
            return this.f28554a;
        }

        @Override // okio.z
        public final void write(@NotNull C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f28555b) {
                throw new IllegalStateException("closed");
            }
            if (j4 == 0) {
                return;
            }
            lg0.this.f28547d.G(j4);
            lg0.this.f28547d.C("\r\n");
            lg0.this.f28547d.write(source, j4);
            lg0.this.f28547d.C("\r\n");
        }
    }

    private final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final mh0 f28557d;

        /* renamed from: e, reason: collision with root package name */
        private long f28558e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f28559f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ lg0 f28560g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lg0 lg0Var, @NotNull mh0 url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f28560g = lg0Var;
            this.f28557d = url;
            this.f28558e = -1L;
            this.f28559f = true;
        }

        private final void d() {
            if (this.f28558e != -1) {
                this.f28560g.f28546c.I();
            }
            try {
                this.f28558e = this.f28560g.f28546c.R();
                String obj = StringsKt.W0(this.f28560g.f28546c.I()).toString();
                if (this.f28558e < 0 || (obj.length() > 0 && !StringsKt.K(obj, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f28558e + obj + "\"");
                }
                if (this.f28558e == 0) {
                    this.f28559f = false;
                    lg0 lg0Var = this.f28560g;
                    lg0Var.f28550g = lg0Var.f28549f.a();
                    td1 td1Var = this.f28560g.f28544a;
                    Intrinsics.checkNotNull(td1Var);
                    ds h4 = td1Var.h();
                    mh0 mh0Var = this.f28557d;
                    ff0 ff0Var = this.f28560g.f28550g;
                    Intrinsics.checkNotNull(ff0Var);
                    dh0.a(h4, mh0Var, ff0Var);
                    b();
                }
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            if (com.yandex.mobile.ads.impl.v82.a(r2, 100, r0) == false) goto L10;
         */
        @Override // com.yandex.mobile.ads.impl.lg0.a, okio.B, java.io.Closeable, java.lang.AutoCloseable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void close() {
            if (a()) {
                return;
            }
            if (this.f28559f) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                byte[] bArr = v82.f33550a;
                Intrinsics.checkNotNullParameter(this, "<this>");
                Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            }
            c();
            this.f28560g.c().j();
            b();
            c();
        }

        @Override // com.yandex.mobile.ads.impl.lg0.a, okio.B
        public final long read(@NotNull C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f28559f) {
                return -1L;
            }
            long j5 = this.f28558e;
            if (j5 == 0 || j5 == -1) {
                d();
                if (!this.f28559f) {
                    return -1L;
                }
            }
            long read = super.read(sink, Math.min(j4, this.f28558e));
            if (read != -1) {
                this.f28558e -= read;
                return read;
            }
            this.f28560g.c().j();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }

    private final class d extends a {

        /* renamed from: d, reason: collision with root package name */
        private long f28561d;

        public d(long j4) {
            super();
            this.f28561d = j4;
            if (j4 == 0) {
                b();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            if (com.yandex.mobile.ads.impl.v82.a(r4, 100, r0) == false) goto L10;
         */
        @Override // com.yandex.mobile.ads.impl.lg0.a, okio.B, java.io.Closeable, java.lang.AutoCloseable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void close() {
            if (a()) {
                return;
            }
            if (this.f28561d != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                byte[] bArr = v82.f33550a;
                Intrinsics.checkNotNullParameter(this, "<this>");
                Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            }
            c();
            lg0.this.c().j();
            b();
            c();
        }

        @Override // com.yandex.mobile.ads.impl.lg0.a, okio.B
        public final long read(@NotNull C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            long j5 = this.f28561d;
            if (j5 == 0) {
                return -1L;
            }
            long read = super.read(sink, Math.min(j5, j4));
            if (read == -1) {
                lg0.this.c().j();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j6 = this.f28561d - read;
            this.f28561d = j6;
            if (j6 == 0) {
                b();
            }
            return read;
        }
    }

    private final class e implements okio.z {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final okio.l f28563a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28564b;

        public e() {
            this.f28563a = new okio.l(lg0.this.f28547d.timeout());
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f28564b) {
                return;
            }
            this.f28564b = true;
            lg0.a(lg0.this, this.f28563a);
            lg0.this.f28548e = 3;
        }

        @Override // okio.z, java.io.Flushable
        public final void flush() {
            if (this.f28564b) {
                return;
            }
            lg0.this.f28547d.flush();
        }

        @Override // okio.z
        @NotNull
        public final okio.C timeout() {
            return this.f28563a;
        }

        @Override // okio.z
        public final void write(@NotNull C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f28564b) {
                throw new IllegalStateException("closed");
            }
            long l02 = source.l0();
            byte[] bArr = v82.f33550a;
            if (j4 < 0 || 0 > l02 || l02 < j4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            lg0.this.f28547d.write(source, j4);
        }
    }

    private final class f extends a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f28566d;

        public f(lg0 lg0Var) {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.lg0.a, okio.B, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (!this.f28566d) {
                b();
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.lg0.a, okio.B
        public final long read(@NotNull C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f28566d) {
                return -1L;
            }
            long read = super.read(sink, j4);
            if (read != -1) {
                return read;
            }
            this.f28566d = true;
            b();
            return -1L;
        }
    }

    public lg0(@Nullable td1 td1Var, @NotNull un1 connection, @NotNull okio.g source, @NotNull okio.f sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f28544a = td1Var;
        this.f28545b = connection;
        this.f28546c = source;
        this.f28547d = sink;
        this.f28549f = new gf0(source);
    }

    public static final void a(lg0 lg0Var, okio.l lVar) {
        lg0Var.getClass();
        okio.C b4 = lVar.b();
        lVar.c(okio.C.NONE);
        b4.clearDeadline();
        b4.clearTimeout();
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void cancel() {
        this.f28545b.a();
    }

    private final okio.z d() {
        int i4 = this.f28548e;
        if (i4 == 1) {
            this.f28548e = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + i4).toString());
    }

    private final okio.z e() {
        int i4 = this.f28548e;
        if (i4 == 1) {
            this.f28548e = 2;
            return new e();
        }
        throw new IllegalStateException(("state: " + i4).toString());
    }

    private final okio.B f() {
        int i4 = this.f28548e;
        if (i4 == 4) {
            this.f28548e = 5;
            this.f28545b.j();
            return new f(this);
        }
        throw new IllegalStateException(("state: " + i4).toString());
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void b() {
        this.f28547d.flush();
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @NotNull
    public final un1 c() {
        return this.f28545b;
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final long b(@NotNull oq1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!dh0.a(response)) {
            return 0L;
        }
        if (StringsKt.w("chunked", oq1.a(response, "Transfer-Encoding"), true)) {
            return -1L;
        }
        return v82.a(response);
    }

    public final void c(@NotNull oq1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long a4 = v82.a(response);
        if (a4 == -1) {
            return;
        }
        okio.B a5 = a(a4);
        v82.a(a5, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        ((d) a5).close();
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @NotNull
    public final okio.z a(@NotNull pp1 request, long j4) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.a() != null) {
            request.a().getClass();
        }
        if (StringsKt.w("chunked", request.a("Transfer-Encoding"), true)) {
            return d();
        }
        if (j4 != -1) {
            return e();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void a() {
        this.f28547d.flush();
    }

    private final okio.B a(mh0 mh0Var) {
        int i4 = this.f28548e;
        if (i4 == 4) {
            this.f28548e = 5;
            return new c(this, mh0Var);
        }
        throw new IllegalStateException(("state: " + i4).toString());
    }

    private final okio.B a(long j4) {
        int i4 = this.f28548e;
        if (i4 == 4) {
            this.f28548e = 5;
            return new d(j4);
        }
        throw new IllegalStateException(("state: " + i4).toString());
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @NotNull
    public final okio.B a(@NotNull oq1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!dh0.a(response)) {
            return a(0L);
        }
        if (StringsKt.w("chunked", oq1.a(response, "Transfer-Encoding"), true)) {
            return a(response.o().g());
        }
        long a4 = v82.a(response);
        if (a4 != -1) {
            return a(a4);
        }
        return f();
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @Nullable
    public final oq1.a a(boolean z4) {
        int i4 = this.f28548e;
        if (i4 != 1 && i4 != 3) {
            throw new IllegalStateException(("state: " + i4).toString());
        }
        try {
            i22 a4 = i22.a.a(this.f28549f.b());
            oq1.a a5 = new oq1.a().a(a4.f27073a).a(a4.f27074b).a(a4.f27075c).a(this.f28549f.a());
            if (z4 && a4.f27074b == 100) {
                return null;
            }
            if (a4.f27074b == 100) {
                this.f28548e = 3;
                return a5;
            }
            this.f28548e = 4;
            return a5;
        } catch (EOFException e4) {
            throw new IOException("unexpected end of stream on " + this.f28545b.k().a().k().j(), e4);
        }
    }

    public final void a(@NotNull ff0 headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        int i4 = this.f28548e;
        if (i4 == 0) {
            this.f28547d.C(requestLine).C("\r\n");
            int size = headers.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f28547d.C(headers.a(i5)).C(": ").C(headers.b(i5)).C("\r\n");
            }
            this.f28547d.C("\r\n");
            this.f28548e = 1;
            return;
        }
        throw new IllegalStateException(("state: " + i4).toString());
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void a(@NotNull pp1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f28545b.k().b().type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "type(...)");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f());
        sb.append(' ');
        if (!request.e() && proxyType == Proxy.Type.HTTP) {
            sb.append(request.g());
        } else {
            sb.append(wp1.a(request.g()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        a(request.d(), sb2);
    }
}
