package com.anythink.core.common.n.b.a.k;

import D.RunnableC0281a;
import D.y;
import com.anythink.core.common.n.b.a.k.c;
import com.anythink.core.common.n.b.a.k.d;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.aj;
import com.anythink.core.common.n.b.ak;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.f;
import com.anythink.core.common.n.c.n;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class a implements c.a, aj {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f15536b = true;

    /* renamed from: c, reason: collision with root package name */
    private static final List<ab> f15537c = Collections.singletonList(ab.HTTP_1_1);

    /* renamed from: d, reason: collision with root package name */
    private static final long f15538d = 16777216;

    /* renamed from: e, reason: collision with root package name */
    private static final long f15539e = 60000;

    /* renamed from: A, reason: collision with root package name */
    private boolean f15540A;

    /* renamed from: a, reason: collision with root package name */
    final ak f15541a;

    /* renamed from: f, reason: collision with root package name */
    private final ad f15542f;

    /* renamed from: g, reason: collision with root package name */
    private final Random f15543g;

    /* renamed from: h, reason: collision with root package name */
    private final long f15544h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.core.common.n.b.e f15545j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f15546k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.k.c f15547l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.k.d f15548m;

    /* renamed from: n, reason: collision with root package name */
    private ScheduledExecutorService f15549n;

    /* renamed from: o, reason: collision with root package name */
    private e f15550o;

    /* renamed from: r, reason: collision with root package name */
    private long f15553r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15554s;

    /* renamed from: t, reason: collision with root package name */
    private ScheduledFuture<?> f15555t;

    /* renamed from: v, reason: collision with root package name */
    private String f15557v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15558w;

    /* renamed from: x, reason: collision with root package name */
    private int f15559x;

    /* renamed from: y, reason: collision with root package name */
    private int f15560y;

    /* renamed from: z, reason: collision with root package name */
    private int f15561z;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayDeque<f> f15551p = new ArrayDeque<>();

    /* renamed from: q, reason: collision with root package name */
    private final ArrayDeque<Object> f15552q = new ArrayDeque<>();

    /* renamed from: u, reason: collision with root package name */
    private int f15556u = -1;

    /* renamed from: com.anythink.core.common.n.b.a.k.a$a, reason: collision with other inner class name */
    public final class RunnableC0087a implements Runnable {
        public RunnableC0087a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.c();
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        final f f15566b;

        /* renamed from: a, reason: collision with root package name */
        final int f15565a = 1001;

        /* renamed from: c, reason: collision with root package name */
        final long f15567c = a.f15539e;

        public b(f fVar) {
            this.f15566b = fVar;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f15568a;

        /* renamed from: b, reason: collision with root package name */
        final f f15569b;

        public c(int i, f fVar) {
            this.f15568a = i;
            this.f15569b = fVar;
        }
    }

    public final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.h();
        }
    }

    public static abstract class e implements Closeable {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f15571c = true;

        /* renamed from: d, reason: collision with root package name */
        public final com.anythink.core.common.n.c.e f15572d;

        /* renamed from: e, reason: collision with root package name */
        public final com.anythink.core.common.n.c.d f15573e;

        public e(com.anythink.core.common.n.c.e eVar, com.anythink.core.common.n.c.d dVar) {
            this.f15572d = eVar;
            this.f15573e = dVar;
        }
    }

    public a(ad adVar, ak akVar, Random random, long j9) {
        if (!"GET".equals(adVar.b())) {
            throw new IllegalArgumentException("Request must be GET: " + adVar.b());
        }
        this.f15542f = adVar;
        this.f15541a = akVar;
        this.f15543g = random;
        this.f15544h = j9;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.i = f.a(bArr).b();
        this.f15546k = new RunnableC0281a(15, this);
    }

    private boolean j() {
        try {
            this.f15547l.a();
            return this.f15556u == -1;
        } catch (Exception unused) {
            i();
            return false;
        }
    }

    private void k() {
        ScheduledFuture<?> scheduledFuture = this.f15555t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f15549n.shutdown();
        this.f15549n.awaitTermination(10L, TimeUnit.SECONDS);
    }

    private synchronized int l() {
        return this.f15559x;
    }

    private synchronized int m() {
        return this.f15560y;
    }

    private synchronized int n() {
        return this.f15561z;
    }

    private void o() {
        if (!f15536b && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ScheduledExecutorService scheduledExecutorService = this.f15549n;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f15546k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    private boolean p() {
        e eVar;
        synchronized (this) {
            try {
                if (this.f15558w) {
                    return false;
                }
                com.anythink.core.common.n.b.a.k.d dVar = this.f15548m;
                f poll = this.f15551p.poll();
                c cVar = 0;
                if (poll == null) {
                    Object poll2 = this.f15552q.poll();
                    if (poll2 instanceof b) {
                        if (this.f15556u != -1) {
                            eVar = this.f15550o;
                            this.f15550o = null;
                            this.f15549n.shutdown();
                            cVar = poll2;
                        } else {
                            this.f15555t = this.f15549n.schedule(new RunnableC0087a(), ((b) poll2).f15567c, TimeUnit.MILLISECONDS);
                        }
                    } else if (poll2 == null) {
                        return false;
                    }
                    eVar = null;
                    cVar = poll2;
                } else {
                    eVar = null;
                }
                try {
                    if (poll != null) {
                        dVar.b(poll);
                    } else if (cVar instanceof c) {
                        f fVar = cVar.f15569b;
                        int i = cVar.f15568a;
                        long j9 = fVar.j();
                        if (dVar.f15613h) {
                            throw new IllegalStateException("Another message writer is active. Did you call close()?");
                        }
                        dVar.f15613h = true;
                        d.a aVar = dVar.f15612g;
                        aVar.f15615a = i;
                        aVar.f15616b = j9;
                        aVar.f15617c = true;
                        aVar.f15618d = false;
                        com.anythink.core.common.n.c.d a9 = n.a(aVar);
                        a9.d(fVar);
                        a9.close();
                        synchronized (this) {
                            this.f15553r -= fVar.j();
                        }
                    } else {
                        if (!(cVar instanceof b)) {
                            throw new AssertionError();
                        }
                        b bVar = (b) cVar;
                        dVar.a(bVar.f15565a, bVar.f15566b);
                    }
                    com.anythink.core.common.n.b.a.c.a(eVar);
                    return true;
                } catch (Throwable th) {
                    com.anythink.core.common.n.b.a.c.a(eVar);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        do {
            try {
            } catch (IOException unused) {
                i();
                return;
            }
        } while (p());
    }

    @Override // com.anythink.core.common.n.b.aj
    public final synchronized long b() {
        return this.f15553r;
    }

    @Override // com.anythink.core.common.n.b.aj
    public final void c() {
        this.f15545j.c();
    }

    public final void d() {
        while (this.f15556u == -1) {
            this.f15547l.a();
        }
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final void e() {
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final void f() {
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final synchronized void g() {
        this.f15561z++;
        this.f15540A = false;
    }

    public final void h() {
        synchronized (this) {
            try {
                if (this.f15558w) {
                    return;
                }
                com.anythink.core.common.n.b.a.k.d dVar = this.f15548m;
                int i = this.f15540A ? this.f15559x : -1;
                this.f15559x++;
                this.f15540A = true;
                if (i == -1) {
                    try {
                        dVar.a(f.f16016b);
                    } catch (IOException unused) {
                        i();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.f15544h);
                    sb.append("ms (after ");
                    new SocketTimeoutException(AbstractC5051n.e(i - 1, " successful ping/pongs)", sb));
                    i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this) {
            try {
                if (this.f15558w) {
                    return;
                }
                this.f15558w = true;
                e eVar = this.f15550o;
                this.f15550o = null;
                ScheduledFuture<?> scheduledFuture = this.f15555t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f15549n;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                com.anythink.core.common.n.b.a.c.a(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized boolean c(f fVar) {
        try {
            if (!this.f15558w && (!this.f15554s || !this.f15552q.isEmpty())) {
                this.f15551p.add(fVar);
                o();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // com.anythink.core.common.n.b.aj
    public final ad a() {
        return this.f15542f;
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final synchronized void b(f fVar) {
        try {
            if (!this.f15558w && (!this.f15554s || !this.f15552q.isEmpty())) {
                this.f15551p.add(fVar);
                o();
                this.f15560y++;
            }
        } finally {
        }
    }

    public final void a(z zVar) {
        z a9 = zVar.t().a(r.f15867a).a(f15537c).a();
        final ad b9 = this.f15542f.e().a("Upgrade", "websocket").a("Connection", "Upgrade").a("Sec-WebSocket-Key", this.i).a("Sec-WebSocket-Version", "13").b();
        com.anythink.core.common.n.b.e a10 = com.anythink.core.common.n.b.a.a.f15027a.a(a9, b9);
        this.f15545j = a10;
        a10.a(new com.anythink.core.common.n.b.f() { // from class: com.anythink.core.common.n.b.a.k.a.1
            @Override // com.anythink.core.common.n.b.f
            public final void a(af afVar) {
                com.anythink.core.common.n.b.a.b.c a11 = com.anythink.core.common.n.b.a.a.f15027a.a(afVar);
                try {
                    a.this.a(afVar, a11);
                    try {
                        a.this.a(aa.f15620a + " webSocket " + b9.a().l(), a11.f());
                        a.this.d();
                    } catch (Exception unused) {
                        a.this.i();
                    }
                } catch (IOException unused2) {
                    if (a11 != null) {
                        a11.g();
                    }
                    a.this.i();
                    com.anythink.core.common.n.b.a.c.a(afVar);
                }
            }

            @Override // com.anythink.core.common.n.b.f
            public final void a(IOException iOException) {
                a.this.i();
            }
        });
    }

    private synchronized boolean c(String str) {
        f fVar;
        try {
            com.anythink.core.common.n.b.a.k.b.b(1001);
            if (str != null) {
                fVar = f.a(str);
                if (fVar.j() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                fVar = null;
            }
            if (!this.f15558w && !this.f15554s) {
                this.f15554s = true;
                this.f15552q.add(new b(fVar));
                o();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // com.anythink.core.common.n.b.aj
    public final boolean b(String str) {
        return c(str);
    }

    public final void a(af afVar, com.anythink.core.common.n.b.a.b.c cVar) {
        if (afVar.c() == 101) {
            String a9 = afVar.a("Connection");
            if ("Upgrade".equalsIgnoreCase(a9)) {
                String a10 = afVar.a("Upgrade");
                if ("websocket".equalsIgnoreCase(a10)) {
                    String a11 = afVar.a("Sec-WebSocket-Accept");
                    String b9 = f.a(this.i + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").d().b();
                    if (!b9.equals(a11)) {
                        throw new ProtocolException(y.l("Expected 'Sec-WebSocket-Accept' header value '", b9, "' but was '", a11, "'"));
                    }
                    if (cVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    return;
                }
                throw new ProtocolException(y.k("Expected 'Upgrade' header value 'websocket' but was '", a10, "'"));
            }
            throw new ProtocolException(y.k("Expected 'Connection' header value 'Upgrade' but was '", a9, "'"));
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + afVar.c() + " " + afVar.d() + "'");
    }

    public final void a(String str, e eVar) {
        synchronized (this) {
            try {
                this.f15550o = eVar;
                this.f15548m = new com.anythink.core.common.n.b.a.k.d(eVar.f15571c, eVar.f15573e, this.f15543g);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.anythink.core.common.n.b.a.c.a(str, false));
                this.f15549n = scheduledThreadPoolExecutor;
                if (this.f15544h != 0) {
                    d dVar = new d();
                    long j9 = this.f15544h;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j9, j9, TimeUnit.MILLISECONDS);
                }
                if (!this.f15552q.isEmpty()) {
                    o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15547l = new com.anythink.core.common.n.b.a.k.c(eVar.f15571c, eVar.f15572d, this);
    }

    private void a(int i, TimeUnit timeUnit) {
        this.f15549n.awaitTermination(i, timeUnit);
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final void a(int i, String str) {
        e eVar;
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.f15556u == -1) {
                        this.f15556u = i;
                        this.f15557v = str;
                        eVar = null;
                        if (this.f15554s && this.f15552q.isEmpty()) {
                            e eVar2 = this.f15550o;
                            this.f15550o = null;
                            ScheduledFuture<?> scheduledFuture = this.f15555t;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.f15549n.shutdown();
                            eVar = eVar2;
                        }
                    } else {
                        throw new IllegalStateException("already closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.anythink.core.common.n.b.a.c.a(eVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.anythink.core.common.n.b.aj
    public final boolean a(String str) {
        if (str != null) {
            return a(f.a(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    @Override // com.anythink.core.common.n.b.aj
    public final boolean a(f fVar) {
        if (fVar != null) {
            return a(fVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    private synchronized boolean a(f fVar, int i) {
        if (!this.f15558w && !this.f15554s) {
            if (this.f15553r + fVar.j() > f15538d) {
                c((String) null);
                return false;
            }
            this.f15553r += fVar.j();
            this.f15552q.add(new c(i, fVar));
            o();
            return true;
        }
        return false;
    }
}
