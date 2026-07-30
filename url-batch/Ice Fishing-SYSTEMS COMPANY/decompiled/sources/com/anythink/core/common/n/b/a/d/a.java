package com.anythink.core.common.n.b.a.d;

import com.anythink.core.common.n.b.a.c.i;
import com.anythink.core.common.n.b.a.c.k;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.j;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.w;
import com.anythink.core.common.n.c.x;
import com.anythink.core.common.v.m;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements com.anythink.core.common.n.b.a.c.c {

    /* renamed from: b, reason: collision with root package name */
    private static final int f15234b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f15235c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f15236d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15237e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15238f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f15239g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15240h = 6;
    private static final int i = 262144;

    /* renamed from: j, reason: collision with root package name */
    private final z f15241j;

    /* renamed from: k, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.e f15242k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.core.common.n.c.e f15243l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.core.common.n.c.d f15244m;

    /* renamed from: n, reason: collision with root package name */
    private int f15245n = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f15246o = 262144;

    /* renamed from: p, reason: collision with root package name */
    private u f15247p;

    public final class b implements v {

        /* renamed from: b, reason: collision with root package name */
        private final j f15252b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15253c;

        public b() {
            this.f15252b = new j(a.this.f15244m.a());
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return this.f15252b;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f15253c) {
                return;
            }
            this.f15253c = true;
            a.this.f15244m.b("0\r\n\r\n");
            a.a(this.f15252b);
            a.this.f15245n = 3;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final synchronized void flush() {
            if (this.f15253c) {
                return;
            }
            a.this.f15244m.flush();
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j9) {
            if (this.f15253c) {
                throw new IllegalStateException("closed");
            }
            if (j9 == 0) {
                return;
            }
            a.this.f15244m.n(j9);
            a.this.f15244m.b("\r\n");
            a.this.f15244m.a(cVar, j9);
            a.this.f15244m.b("\r\n");
        }
    }

    public class c extends AbstractC0085a {

        /* renamed from: e, reason: collision with root package name */
        private static final long f15254e = -1;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.b.v f15256f;

        /* renamed from: g, reason: collision with root package name */
        private long f15257g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f15258h;

        public c(com.anythink.core.common.n.b.v vVar) {
            super(a.this, (byte) 0);
            this.f15257g = f15254e;
            this.f15258h = true;
            this.f15256f = vVar;
        }

        private void c() {
            if (this.f15257g != f15254e) {
                a.this.f15243l.w();
            }
            try {
                this.f15257g = a.this.f15243l.s();
                String trim = a.this.f15243l.w().trim();
                if (this.f15257g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15257g + trim + "\"");
                }
                if (this.f15257g == 0) {
                    this.f15258h = false;
                    a aVar = a.this;
                    aVar.f15247p = aVar.h();
                    com.anythink.core.common.n.b.a.c.e.a(a.this.f15241j.e(), this.f15256f, a.this.f15247p);
                    b();
                }
            } catch (NumberFormatException e6) {
                throw new ProtocolException(e6.getMessage());
            }
        }

        @Override // com.anythink.core.common.n.b.a.d.a.AbstractC0085a, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j9) {
            if (j9 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
            }
            if (this.f15249b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f15258h) {
                return f15254e;
            }
            long j10 = this.f15257g;
            if (j10 == 0 || j10 == f15254e) {
                if (j10 != f15254e) {
                    a.this.f15243l.w();
                }
                try {
                    this.f15257g = a.this.f15243l.s();
                    String trim = a.this.f15243l.w().trim();
                    if (this.f15257g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15257g + trim + "\"");
                    }
                    if (this.f15257g == 0) {
                        this.f15258h = false;
                        a aVar = a.this;
                        aVar.f15247p = aVar.h();
                        com.anythink.core.common.n.b.a.c.e.a(a.this.f15241j.e(), this.f15256f, a.this.f15247p);
                        b();
                    }
                    if (!this.f15258h) {
                        return f15254e;
                    }
                } catch (NumberFormatException e6) {
                    throw new ProtocolException(e6.getMessage());
                }
            }
            long a_ = super.a_(cVar, Math.min(j9, this.f15257g));
            if (a_ != f15254e) {
                this.f15257g -= a_;
                return a_;
            }
            a.this.f15242k.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15249b) {
                return;
            }
            if (this.f15258h && !com.anythink.core.common.n.b.a.c.a(this, TimeUnit.MILLISECONDS)) {
                a.this.f15242k.e();
                b();
            }
            this.f15249b = true;
        }
    }

    public class d extends AbstractC0085a {

        /* renamed from: e, reason: collision with root package name */
        private long f15260e;

        public d(long j9) {
            super(a.this, (byte) 0);
            this.f15260e = j9;
            if (j9 == 0) {
                b();
            }
        }

        @Override // com.anythink.core.common.n.b.a.d.a.AbstractC0085a, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j9) {
            if (j9 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
            }
            if (this.f15249b) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f15260e;
            if (j10 == 0) {
                return -1L;
            }
            long a_ = super.a_(cVar, Math.min(j10, j9));
            if (a_ == -1) {
                a.this.f15242k.e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j11 = this.f15260e - a_;
            this.f15260e = j11;
            if (j11 == 0) {
                b();
            }
            return a_;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15249b) {
                return;
            }
            if (this.f15260e != 0 && !com.anythink.core.common.n.b.a.c.a(this, TimeUnit.MILLISECONDS)) {
                a.this.f15242k.e();
                b();
            }
            this.f15249b = true;
        }
    }

    public final class e implements v {

        /* renamed from: b, reason: collision with root package name */
        private final j f15262b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15263c;

        private e() {
            this.f15262b = new j(a.this.f15244m.a());
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return this.f15262b;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15263c) {
                return;
            }
            this.f15263c = true;
            a.a(this.f15262b);
            a.this.f15245n = 3;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (this.f15263c) {
                return;
            }
            a.this.f15244m.flush();
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j9) {
            if (this.f15263c) {
                throw new IllegalStateException("closed");
            }
            com.anythink.core.common.n.b.a.c.a(cVar.b(), j9);
            a.this.f15244m.a(cVar, j9);
        }

        public /* synthetic */ e(a aVar, byte b9) {
            this();
        }
    }

    public class f extends AbstractC0085a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f15265e;

        private f() {
            super(a.this, (byte) 0);
        }

        @Override // com.anythink.core.common.n.b.a.d.a.AbstractC0085a, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j9) {
            if (j9 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
            }
            if (this.f15249b) {
                throw new IllegalStateException("closed");
            }
            if (this.f15265e) {
                return -1L;
            }
            long a_ = super.a_(cVar, j9);
            if (a_ != -1) {
                return a_;
            }
            this.f15265e = true;
            b();
            return -1L;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15249b) {
                return;
            }
            if (!this.f15265e) {
                b();
            }
            this.f15249b = true;
        }

        public /* synthetic */ f(a aVar, byte b9) {
            this();
        }
    }

    public a(z zVar, com.anythink.core.common.n.b.a.b.e eVar, com.anythink.core.common.n.c.e eVar2, com.anythink.core.common.n.c.d dVar) {
        this.f15241j = zVar;
        this.f15242k = eVar;
        this.f15243l = eVar2;
        this.f15244m = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u h() {
        u.a aVar = new u.a();
        while (true) {
            String g9 = g();
            if (g9.length() == 0) {
                return aVar.a();
            }
            com.anythink.core.common.n.b.a.a.f15027a.a(aVar, g9);
        }
    }

    private v i() {
        if (this.f15245n == 1) {
            this.f15245n = 2;
            return new b();
        }
        throw new IllegalStateException("state: " + this.f15245n);
    }

    private v j() {
        if (this.f15245n == 1) {
            this.f15245n = 2;
            return new e(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15245n);
    }

    private w k() {
        if (this.f15245n == 4) {
            this.f15245n = 5;
            this.f15242k.e();
            return new f(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15245n);
    }

    /* renamed from: com.anythink.core.common.n.b.a.d.a$a, reason: collision with other inner class name */
    public abstract class AbstractC0085a implements w {

        /* renamed from: a, reason: collision with root package name */
        protected final j f15248a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f15249b;

        private AbstractC0085a() {
            this.f15248a = new j(a.this.f15243l.a());
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return this.f15248a;
        }

        @Override // com.anythink.core.common.n.c.w
        public long a_(com.anythink.core.common.n.c.c cVar, long j9) {
            try {
                return a.this.f15243l.a_(cVar, j9);
            } catch (IOException e6) {
                a.this.f15242k.e();
                b();
                throw e6;
            }
        }

        public final void b() {
            if (a.this.f15245n == 6) {
                return;
            }
            if (a.this.f15245n == 5) {
                a.a(this.f15248a);
                a.this.f15245n = 6;
            } else {
                throw new IllegalStateException("state: " + a.this.f15245n);
            }
        }

        public /* synthetic */ AbstractC0085a(a aVar, byte b9) {
            this();
        }
    }

    private boolean f() {
        return this.f15245n == 6;
    }

    private String g() {
        String f6 = this.f15243l.f(this.f15246o);
        this.f15246o -= f6.length();
        return f6;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final w b(af afVar) {
        if (!com.anythink.core.common.n.b.a.c.e.d(afVar)) {
            return a(0L);
        }
        if ("chunked".equalsIgnoreCase(afVar.a("Transfer-Encoding"))) {
            com.anythink.core.common.n.b.v a9 = afVar.a().a();
            if (this.f15245n == 4) {
                this.f15245n = 5;
                return new c(a9);
            }
            throw new IllegalStateException("state: " + this.f15245n);
        }
        long a10 = com.anythink.core.common.n.b.a.c.e.a(afVar);
        if (a10 != -1) {
            return a(a10);
        }
        if (this.f15245n == 4) {
            this.f15245n = 5;
            this.f15242k.e();
            return new f(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15245n);
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void c() {
        this.f15244m.flush();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final u d() {
        if (this.f15245n != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        u uVar = this.f15247p;
        return uVar != null ? uVar : com.anythink.core.common.n.b.a.c.f15196c;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void e() {
        com.anythink.core.common.n.b.a.b.e eVar = this.f15242k;
        if (eVar != null) {
            eVar.f();
        }
    }

    public final void c(af afVar) {
        long a9 = com.anythink.core.common.n.b.a.c.e.a(afVar);
        if (a9 == -1) {
            return;
        }
        w a10 = a(a9);
        com.anythink.core.common.n.b.a.c.a(a10, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        a10.close();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final com.anythink.core.common.n.b.a.b.e a() {
        return this.f15242k;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final v a(ad adVar, long j9) {
        if (adVar.d() != null) {
            adVar.d();
        }
        if ("chunked".equalsIgnoreCase(adVar.a("Transfer-Encoding"))) {
            if (this.f15245n == 1) {
                this.f15245n = 2;
                return new b();
            }
            throw new IllegalStateException("state: " + this.f15245n);
        }
        if (j9 != -1) {
            if (this.f15245n == 1) {
                this.f15245n = 2;
                return new e(this, (byte) 0);
            }
            throw new IllegalStateException("state: " + this.f15245n);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void a(ad adVar) {
        Proxy.Type type = this.f15242k.a().b().type();
        StringBuilder sb = new StringBuilder();
        sb.append(adVar.b());
        sb.append(' ');
        if (!adVar.g() && type == Proxy.Type.HTTP) {
            sb.append(adVar.a());
        } else {
            sb.append(i.a(adVar.a()));
        }
        sb.append(" HTTP/1.1");
        a(adVar.c(), sb.toString());
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void b() {
        this.f15244m.flush();
    }

    private static void b(j jVar) {
        x a9 = jVar.a();
        jVar.a(x.f16083c);
        a9.f();
        a9.h_();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final long a(af afVar) {
        if (!com.anythink.core.common.n.b.a.c.e.d(afVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(afVar.a("Transfer-Encoding"))) {
            return -1L;
        }
        return com.anythink.core.common.n.b.a.c.e.a(afVar);
    }

    public final void a(u uVar, String str) {
        if (this.f15245n == 0) {
            this.f15244m.b(str).b("\r\n");
            int a9 = uVar.a();
            for (int i4 = 0; i4 < a9; i4++) {
                this.f15244m.b(uVar.a(i4)).b(": ").b(uVar.b(i4)).b("\r\n");
            }
            this.f15244m.b("\r\n");
            this.f15245n = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f15245n);
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final af.a a(boolean z8) {
        String str;
        int i4 = this.f15245n;
        if (i4 != 1 && i4 != 3) {
            throw new IllegalStateException("state: " + this.f15245n);
        }
        try {
            k a9 = k.a(g());
            af.a a10 = new af.a().a(a9.f15231d).a(a9.f15232e).a(a9.f15233f).a(h());
            if (z8 && a9.f15232e == 100) {
                return null;
            }
            if (a9.f15232e == 100) {
                this.f15245n = 3;
                return a10;
            }
            this.f15245n = 4;
            return a10;
        } catch (EOFException e6) {
            com.anythink.core.common.n.b.a.b.e eVar = this.f15242k;
            if (eVar != null) {
                str = eVar.a().a().a().l();
            } else {
                str = m.f16967e;
            }
            throw new IOException("unexpected end of stream on ".concat(String.valueOf(str)), e6);
        }
    }

    private w a(long j9) {
        if (this.f15245n == 4) {
            this.f15245n = 5;
            return new d(j9);
        }
        throw new IllegalStateException("state: " + this.f15245n);
    }

    private w a(com.anythink.core.common.n.b.v vVar) {
        if (this.f15245n == 4) {
            this.f15245n = 5;
            return new c(vVar);
        }
        throw new IllegalStateException("state: " + this.f15245n);
    }

    public static /* synthetic */ void a(j jVar) {
        x a9 = jVar.a();
        jVar.a(x.f16083c);
        a9.f();
        a9.h_();
    }
}
