package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oq1;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r50 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tn1 f31032a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m50 f31033b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final t50 f31034c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final s50 f31035d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31036e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final un1 f31037f;

    private final class a extends okio.j {

        /* renamed from: a, reason: collision with root package name */
        private final long f31038a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31039b;

        /* renamed from: c, reason: collision with root package name */
        private long f31040c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f31041d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r50 f31042e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r50 r50Var, @NotNull okio.z delegate, long j4) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f31042e = r50Var;
            this.f31038a = j4;
        }

        @Override // okio.j, okio.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f31041d) {
                return;
            }
            this.f31041d = true;
            long j4 = this.f31038a;
            if (j4 != -1 && this.f31040c != j4) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                if (this.f31039b) {
                    return;
                }
                this.f31039b = true;
                this.f31042e.a(false, true, null);
            } catch (IOException e4) {
                if (this.f31039b) {
                    throw e4;
                }
                this.f31039b = true;
                throw this.f31042e.a(false, true, e4);
            }
        }

        @Override // okio.j, okio.z, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e4) {
                if (this.f31039b) {
                    throw e4;
                }
                this.f31039b = true;
                throw this.f31042e.a(false, true, e4);
            }
        }

        @Override // okio.j, okio.z
        public final void write(@NotNull C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f31041d) {
                throw new IllegalStateException("closed");
            }
            long j5 = this.f31038a;
            if (j5 == -1 || this.f31040c + j4 <= j5) {
                try {
                    super.write(source, j4);
                    this.f31040c += j4;
                    return;
                } catch (IOException e4) {
                    if (this.f31039b) {
                        throw e4;
                    }
                    this.f31039b = true;
                    throw this.f31042e.a(false, true, e4);
                }
            }
            throw new ProtocolException("expected " + this.f31038a + " bytes but received " + (this.f31040c + j4));
        }
    }

    public final class b extends okio.k {

        /* renamed from: a, reason: collision with root package name */
        private final long f31043a;

        /* renamed from: b, reason: collision with root package name */
        private long f31044b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f31045c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f31046d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f31047e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ r50 f31048f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r50 r50Var, @NotNull okio.B delegate, long j4) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f31048f = r50Var;
            this.f31043a = j4;
            this.f31045c = true;
            if (j4 == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e4) {
            if (this.f31046d) {
                return e4;
            }
            this.f31046d = true;
            if (e4 == null && this.f31045c) {
                this.f31045c = false;
                m50 g4 = this.f31048f.g();
                tn1 call = this.f31048f.e();
                g4.getClass();
                Intrinsics.checkNotNullParameter(call, "call");
            }
            return (E) this.f31048f.a(true, false, e4);
        }

        @Override // okio.k, okio.B, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f31047e) {
                return;
            }
            this.f31047e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        @Override // okio.k, okio.B
        public final long read(@NotNull C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f31047e) {
                throw new IllegalStateException("closed");
            }
            try {
                long read = delegate().read(sink, j4);
                if (this.f31045c) {
                    this.f31045c = false;
                    m50 g4 = this.f31048f.g();
                    tn1 e4 = this.f31048f.e();
                    g4.getClass();
                    m50.a(e4);
                }
                if (read == -1) {
                    a(null);
                    return -1L;
                }
                long j5 = this.f31044b + read;
                long j6 = this.f31043a;
                if (j6 != -1 && j5 > j6) {
                    throw new ProtocolException("expected " + this.f31043a + " bytes but received " + j5);
                }
                this.f31044b = j5;
                if (j5 == j6) {
                    a(null);
                }
                return read;
            } catch (IOException e5) {
                throw a(e5);
            }
        }
    }

    public r50(@NotNull tn1 call, @NotNull m50 eventListener, @NotNull t50 finder, @NotNull s50 codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f31032a = call;
        this.f31033b = eventListener;
        this.f31034c = finder;
        this.f31035d = codec;
        this.f31037f = codec.c();
    }

    public final IOException a(boolean z4, boolean z5, IOException ioe) {
        if (ioe != null) {
            this.f31034c.a(ioe);
            this.f31035d.c().a(this.f31032a, ioe);
        }
        if (z5) {
            if (ioe != null) {
                m50 m50Var = this.f31033b;
                tn1 call = this.f31032a;
                m50Var.getClass();
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                m50 m50Var2 = this.f31033b;
                tn1 call2 = this.f31032a;
                m50Var2.getClass();
                Intrinsics.checkNotNullParameter(call2, "call");
            }
        }
        if (z4) {
            if (ioe != null) {
                m50 m50Var3 = this.f31033b;
                tn1 call3 = this.f31032a;
                m50Var3.getClass();
                Intrinsics.checkNotNullParameter(call3, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                m50 m50Var4 = this.f31033b;
                tn1 call4 = this.f31032a;
                m50Var4.getClass();
                Intrinsics.checkNotNullParameter(call4, "call");
            }
        }
        return this.f31032a.a(this, z5, z4, ioe);
    }

    public final void b() {
        this.f31035d.cancel();
        this.f31032a.a(this, true, true, null);
    }

    public final void c() {
        try {
            this.f31035d.a();
        } catch (IOException ioe) {
            m50 m50Var = this.f31033b;
            tn1 call = this.f31032a;
            m50Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            this.f31034c.a(ioe);
            this.f31035d.c().a(this.f31032a, ioe);
            throw ioe;
        }
    }

    public final void d() {
        try {
            this.f31035d.b();
        } catch (IOException ioe) {
            m50 m50Var = this.f31033b;
            tn1 call = this.f31032a;
            m50Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            this.f31034c.a(ioe);
            this.f31035d.c().a(this.f31032a, ioe);
            throw ioe;
        }
    }

    @NotNull
    public final tn1 e() {
        return this.f31032a;
    }

    @NotNull
    public final un1 f() {
        return this.f31037f;
    }

    @NotNull
    public final m50 g() {
        return this.f31033b;
    }

    @NotNull
    public final t50 h() {
        return this.f31034c;
    }

    public final boolean i() {
        return !Intrinsics.areEqual(this.f31034c.a().k().g(), this.f31037f.k().a().k().g());
    }

    public final boolean j() {
        return this.f31036e;
    }

    public final void k() {
        this.f31035d.c().j();
    }

    public final void l() {
        this.f31032a.a(this, true, false, null);
    }

    public final void m() {
        m50 m50Var = this.f31033b;
        tn1 call = this.f31032a;
        m50Var.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public final void b(@NotNull oq1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        m50 m50Var = this.f31033b;
        tn1 call = this.f31032a;
        m50Var.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public final void b(@NotNull pp1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            m50 m50Var = this.f31033b;
            tn1 call = this.f31032a;
            m50Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            this.f31035d.a(request);
            m50 m50Var2 = this.f31033b;
            tn1 call2 = this.f31032a;
            m50Var2.getClass();
            Intrinsics.checkNotNullParameter(call2, "call");
            Intrinsics.checkNotNullParameter(request, "request");
        } catch (IOException ioe) {
            m50 m50Var3 = this.f31033b;
            tn1 call3 = this.f31032a;
            m50Var3.getClass();
            Intrinsics.checkNotNullParameter(call3, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            this.f31034c.a(ioe);
            this.f31035d.c().a(this.f31032a, ioe);
            throw ioe;
        }
    }

    public final void a() {
        this.f31035d.cancel();
    }

    @NotNull
    public final okio.z a(@NotNull pp1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f31036e = false;
        sp1 a4 = request.a();
        Intrinsics.checkNotNull(a4);
        long a5 = a4.a();
        m50 m50Var = this.f31033b;
        tn1 call = this.f31032a;
        m50Var.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        return new a(this, this.f31035d.a(request, a5), a5);
    }

    @NotNull
    public final yn1 a(@NotNull oq1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String a4 = oq1.a(response, com.ironsource.cc.f15718K);
            long b4 = this.f31035d.b(response);
            return new yn1(a4, b4, okio.p.d(new b(this, this.f31035d.a(response), b4)));
        } catch (IOException ioe) {
            m50 m50Var = this.f31033b;
            tn1 call = this.f31032a;
            m50Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            this.f31034c.a(ioe);
            this.f31035d.c().a(this.f31032a, ioe);
            throw ioe;
        }
    }

    @Nullable
    public final oq1.a a(boolean z4) {
        try {
            oq1.a a4 = this.f31035d.a(z4);
            if (a4 == null) {
                return a4;
            }
            a4.a(this);
            return a4;
        } catch (IOException ioe) {
            m50 m50Var = this.f31033b;
            tn1 call = this.f31032a;
            m50Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            this.f31034c.a(ioe);
            this.f31035d.c().a(this.f31032a, ioe);
            throw ioe;
        }
    }
}
