package b.a.e;

import b.a.e.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Http2Connection.java */
/* loaded from: classes.dex */
public final class g implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    final boolean f1923b;

    /* renamed from: c, reason: collision with root package name */
    final b f1924c;
    final String e;
    int f;
    int g;
    boolean h;
    final m i;
    long k;
    final Socket o;
    final j p;
    final c q;
    private final ExecutorService t;
    private Map<Integer, l> u;
    private int v;
    static final /* synthetic */ boolean s = !g.class.desiredAssertionStatus();

    /* renamed from: a, reason: collision with root package name */
    static final ExecutorService f1922a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), b.a.c.a("OkHttp Http2Connection", true));

    /* renamed from: d, reason: collision with root package name */
    final Map<Integer, i> f1925d = new LinkedHashMap();
    long j = 0;
    n l = new n();
    final n m = new n();
    boolean n = false;
    final Set<Integer> r = new LinkedHashSet();

    /* compiled from: Http2Connection.java */
    public static abstract class b {
        public static final b f = new b() { // from class: b.a.e.g.b.1
            @Override // b.a.e.g.b
            public void a(i iVar) throws IOException {
                iVar.a(b.a.e.b.REFUSED_STREAM);
            }
        };

        public void a(g gVar) {
        }

        public abstract void a(i iVar) throws IOException;
    }

    boolean d(int i) {
        return i != 0 && (i & 1) == 0;
    }

    g(a aVar) {
        this.i = aVar.f;
        this.f1923b = aVar.g;
        this.f1924c = aVar.e;
        this.g = aVar.g ? 1 : 2;
        if (aVar.g) {
            this.g += 2;
        }
        this.v = aVar.g ? 1 : 2;
        if (aVar.g) {
            this.l.a(7, 16777216);
        }
        this.e = aVar.f1948b;
        this.t = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), b.a.c.a(b.a.c.a("OkHttp %s Push Observer", this.e), true));
        this.m.a(7, 65535);
        this.m.a(5, 16384);
        this.k = this.m.d();
        this.o = aVar.f1947a;
        this.p = new j(aVar.f1950d, this.f1923b);
        this.q = new c(new h(aVar.f1949c, this.f1923b));
    }

    synchronized i a(int i) {
        return this.f1925d.get(Integer.valueOf(i));
    }

    synchronized i b(int i) {
        i remove;
        remove = this.f1925d.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public synchronized int a() {
        return this.m.c(Integer.MAX_VALUE);
    }

    public i a(List<b.a.e.c> list, boolean z) throws IOException {
        return b(0, list, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x001f, B:12:0x0027, B:16:0x0031, B:18:0x0037, B:19:0x0040, B:33:0x0063, B:34:0x0068), top: B:5:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private i b(int i, List<b.a.e.c> list, boolean z) throws IOException {
        int i2;
        i iVar;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.p) {
            synchronized (this) {
                if (this.h) {
                    throw new b.a.e.a();
                }
                i2 = this.g;
                this.g += 2;
                iVar = new i(i2, this, z3, false, list);
                if (z && this.k != 0 && iVar.f1967b != 0) {
                    z2 = false;
                    if (iVar.b()) {
                        this.f1925d.put(Integer.valueOf(i2), iVar);
                    }
                }
                z2 = true;
                if (iVar.b()) {
                }
            }
            if (i == 0) {
                this.p.a(z3, i2, i, list);
            } else {
                if (this.f1923b) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.p.a(i, i2, list);
            }
        }
        if (z2) {
            this.p.b();
        }
        return iVar;
    }

    public void a(int i, boolean z, c.c cVar, long j) throws IOException {
        int min;
        long j2;
        if (j == 0) {
            this.p.a(z, i, cVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.k <= 0) {
                    try {
                        if (!this.f1925d.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.k), this.p.c());
                j2 = min;
                this.k -= j2;
            }
            j -= j2;
            this.p.a(z && j == 0, i, cVar, min);
        }
    }

    void a(long j) {
        this.k += j;
        if (j > 0) {
            notifyAll();
        }
    }

    void a(final int i, final b.a.e.b bVar) {
        f1922a.execute(new b.a.b("OkHttp %s stream %d", new Object[]{this.e, Integer.valueOf(i)}) { // from class: b.a.e.g.1
            @Override // b.a.b
            public void b() {
                try {
                    g.this.b(i, bVar);
                } catch (IOException unused) {
                }
            }
        });
    }

    void b(int i, b.a.e.b bVar) throws IOException {
        this.p.a(i, bVar);
    }

    void a(final int i, final long j) {
        f1922a.execute(new b.a.b("OkHttp Window Update %s stream %d", new Object[]{this.e, Integer.valueOf(i)}) { // from class: b.a.e.g.2
            @Override // b.a.b
            public void b() {
                try {
                    g.this.p.a(i, j);
                } catch (IOException unused) {
                }
            }
        });
    }

    void a(final boolean z, final int i, final int i2, final l lVar) {
        f1922a.execute(new b.a.b("OkHttp %s ping %08x%08x", new Object[]{this.e, Integer.valueOf(i), Integer.valueOf(i2)}) { // from class: b.a.e.g.3
            @Override // b.a.b
            public void b() {
                try {
                    g.this.b(z, i, i2, lVar);
                } catch (IOException unused) {
                }
            }
        });
    }

    void b(boolean z, int i, int i2, l lVar) throws IOException {
        synchronized (this.p) {
            if (lVar != null) {
                try {
                    lVar.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.p.a(z, i, i2);
        }
    }

    synchronized l c(int i) {
        return this.u != null ? this.u.remove(Integer.valueOf(i)) : null;
    }

    public void b() throws IOException {
        this.p.b();
    }

    public void a(b.a.e.b bVar) throws IOException {
        synchronized (this.p) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                this.p.a(this.f, bVar, b.a.c.f1853a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(b.a.e.b.NO_ERROR, b.a.e.b.CANCEL);
    }

    void a(b.a.e.b bVar, b.a.e.b bVar2) throws IOException {
        i[] iVarArr;
        if (!s && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        l[] lVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (this.f1925d.isEmpty()) {
                iVarArr = null;
            } else {
                iVarArr = (i[]) this.f1925d.values().toArray(new i[this.f1925d.size()]);
                this.f1925d.clear();
            }
            if (this.u != null) {
                l[] lVarArr2 = (l[]) this.u.values().toArray(new l[this.u.size()]);
                this.u = null;
                lVarArr = lVarArr2;
            }
        }
        if (iVarArr != null) {
            IOException iOException = e;
            for (i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e2) {
                    if (iOException != null) {
                        iOException = e2;
                    }
                }
            }
            e = iOException;
        }
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                lVar.c();
            }
        }
        try {
            this.p.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.o.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    public void c() throws IOException {
        a(true);
    }

    void a(boolean z) throws IOException {
        if (z) {
            this.p.a();
            this.p.b(this.l);
            if (this.l.d() != 65535) {
                this.p.a(0, r6 - 65535);
            }
        }
        new Thread(this.q).start();
    }

    public synchronized boolean d() {
        return this.h;
    }

    /* compiled from: Http2Connection.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Socket f1947a;

        /* renamed from: b, reason: collision with root package name */
        String f1948b;

        /* renamed from: c, reason: collision with root package name */
        c.e f1949c;

        /* renamed from: d, reason: collision with root package name */
        c.d f1950d;
        b e = b.f;
        m f = m.f1993a;
        boolean g;

        public a(boolean z) {
            this.g = z;
        }

        public a a(Socket socket, String str, c.e eVar, c.d dVar) {
            this.f1947a = socket;
            this.f1948b = str;
            this.f1949c = eVar;
            this.f1950d = dVar;
            return this;
        }

        public a a(b bVar) {
            this.e = bVar;
            return this;
        }

        public g a() throws IOException {
            return new g(this);
        }
    }

    /* compiled from: Http2Connection.java */
    class c extends b.a.b implements h.b {

        /* renamed from: a, reason: collision with root package name */
        final h f1951a;

        @Override // b.a.e.h.b
        public void a() {
        }

        @Override // b.a.e.h.b
        public void a(int i, int i2, int i3, boolean z) {
        }

        c(h hVar) {
            super("OkHttp %s", g.this.e);
            this.f1951a = hVar;
        }

        @Override // b.a.b
        protected void b() {
            b.a.e.b bVar;
            b.a.e.b bVar2;
            g gVar;
            b.a.e.b bVar3 = b.a.e.b.INTERNAL_ERROR;
            b.a.e.b bVar4 = b.a.e.b.INTERNAL_ERROR;
            try {
                try {
                    try {
                        this.f1951a.a(this);
                        while (this.f1951a.a(false, (h.b) this)) {
                        }
                        bVar = b.a.e.b.NO_ERROR;
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        g.this.a(bVar3, bVar4);
                    } catch (IOException unused2) {
                    }
                    b.a.c.a(this.f1951a);
                    throw th;
                }
                try {
                    try {
                        bVar2 = b.a.e.b.CANCEL;
                        gVar = g.this;
                    } catch (IOException unused3) {
                        bVar3 = bVar;
                        bVar = b.a.e.b.PROTOCOL_ERROR;
                        bVar2 = b.a.e.b.PROTOCOL_ERROR;
                        gVar = g.this;
                        gVar.a(bVar, bVar2);
                        b.a.c.a(this.f1951a);
                    }
                } catch (Throwable th2) {
                    b.a.e.b bVar5 = bVar;
                    th = th2;
                    bVar3 = bVar5;
                    g.this.a(bVar3, bVar4);
                    b.a.c.a(this.f1951a);
                    throw th;
                }
            } catch (IOException unused4) {
            }
            gVar.a(bVar, bVar2);
            b.a.c.a(this.f1951a);
        }

        @Override // b.a.e.h.b
        public void a(boolean z, int i, c.e eVar, int i2) throws IOException {
            if (g.this.d(i)) {
                g.this.a(i, eVar, i2, z);
                return;
            }
            i a2 = g.this.a(i);
            if (a2 == null) {
                g.this.a(i, b.a.e.b.PROTOCOL_ERROR);
                eVar.h(i2);
            } else {
                a2.a(eVar, i2);
                if (z) {
                    a2.i();
                }
            }
        }

        @Override // b.a.e.h.b
        public void a(boolean z, int i, int i2, List<b.a.e.c> list) {
            if (g.this.d(i)) {
                g.this.a(i, list, z);
                return;
            }
            synchronized (g.this) {
                if (g.this.h) {
                    return;
                }
                i a2 = g.this.a(i);
                if (a2 == null) {
                    if (i <= g.this.f) {
                        return;
                    }
                    if (i % 2 == g.this.g % 2) {
                        return;
                    }
                    final i iVar = new i(i, g.this, false, z, list);
                    g.this.f = i;
                    g.this.f1925d.put(Integer.valueOf(i), iVar);
                    g.f1922a.execute(new b.a.b("OkHttp %s stream %d", new Object[]{g.this.e, Integer.valueOf(i)}) { // from class: b.a.e.g.c.1
                        @Override // b.a.b
                        public void b() {
                            try {
                                g.this.f1924c.a(iVar);
                            } catch (IOException e) {
                                b.a.g.e.b().a(4, "Http2Connection.Listener failure for " + g.this.e, e);
                                try {
                                    iVar.a(b.a.e.b.PROTOCOL_ERROR);
                                } catch (IOException unused) {
                                }
                            }
                        }
                    });
                    return;
                }
                a2.a(list);
                if (z) {
                    a2.i();
                }
            }
        }

        @Override // b.a.e.h.b
        public void a(int i, b.a.e.b bVar) {
            if (g.this.d(i)) {
                g.this.c(i, bVar);
                return;
            }
            i b2 = g.this.b(i);
            if (b2 != null) {
                b2.c(bVar);
            }
        }

        @Override // b.a.e.h.b
        public void a(boolean z, n nVar) {
            i[] iVarArr;
            long j;
            int i;
            synchronized (g.this) {
                int d2 = g.this.m.d();
                if (z) {
                    g.this.m.a();
                }
                g.this.m.a(nVar);
                a(nVar);
                int d3 = g.this.m.d();
                iVarArr = null;
                if (d3 == -1 || d3 == d2) {
                    j = 0;
                } else {
                    j = d3 - d2;
                    if (!g.this.n) {
                        g.this.a(j);
                        g.this.n = true;
                    }
                    if (!g.this.f1925d.isEmpty()) {
                        iVarArr = (i[]) g.this.f1925d.values().toArray(new i[g.this.f1925d.size()]);
                    }
                }
                g.f1922a.execute(new b.a.b("OkHttp %s settings", g.this.e) { // from class: b.a.e.g.c.2
                    @Override // b.a.b
                    public void b() {
                        g.this.f1924c.a(g.this);
                    }
                });
            }
            if (iVarArr == null || j == 0) {
                return;
            }
            for (i iVar : iVarArr) {
                synchronized (iVar) {
                    iVar.a(j);
                }
            }
        }

        private void a(final n nVar) {
            g.f1922a.execute(new b.a.b("OkHttp %s ACK Settings", new Object[]{g.this.e}) { // from class: b.a.e.g.c.3
                @Override // b.a.b
                public void b() {
                    try {
                        g.this.p.a(nVar);
                    } catch (IOException unused) {
                    }
                }
            });
        }

        @Override // b.a.e.h.b
        public void a(boolean z, int i, int i2) {
            if (z) {
                l c2 = g.this.c(i);
                if (c2 != null) {
                    c2.b();
                    return;
                }
                return;
            }
            g.this.a(true, i, i2, (l) null);
        }

        @Override // b.a.e.h.b
        public void a(int i, b.a.e.b bVar, c.f fVar) {
            i[] iVarArr;
            fVar.g();
            synchronized (g.this) {
                iVarArr = (i[]) g.this.f1925d.values().toArray(new i[g.this.f1925d.size()]);
                g.this.h = true;
            }
            for (i iVar : iVarArr) {
                if (iVar.a() > i && iVar.c()) {
                    iVar.c(b.a.e.b.REFUSED_STREAM);
                    g.this.b(iVar.a());
                }
            }
        }

        @Override // b.a.e.h.b
        public void a(int i, long j) {
            if (i == 0) {
                synchronized (g.this) {
                    g.this.k += j;
                    g.this.notifyAll();
                }
                return;
            }
            i a2 = g.this.a(i);
            if (a2 != null) {
                synchronized (a2) {
                    a2.a(j);
                }
            }
        }

        @Override // b.a.e.h.b
        public void a(int i, int i2, List<b.a.e.c> list) {
            g.this.a(i2, list);
        }
    }

    void a(final int i, final List<b.a.e.c> list) {
        synchronized (this) {
            if (this.r.contains(Integer.valueOf(i))) {
                a(i, b.a.e.b.PROTOCOL_ERROR);
            } else {
                this.r.add(Integer.valueOf(i));
                this.t.execute(new b.a.b("OkHttp %s Push Request[%s]", new Object[]{this.e, Integer.valueOf(i)}) { // from class: b.a.e.g.4
                    @Override // b.a.b
                    public void b() {
                        if (g.this.i.a(i, list)) {
                            try {
                                g.this.p.a(i, b.a.e.b.CANCEL);
                                synchronized (g.this) {
                                    g.this.r.remove(Integer.valueOf(i));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    void a(final int i, final List<b.a.e.c> list, final boolean z) {
        this.t.execute(new b.a.b("OkHttp %s Push Headers[%s]", new Object[]{this.e, Integer.valueOf(i)}) { // from class: b.a.e.g.5
            @Override // b.a.b
            public void b() {
                boolean a2 = g.this.i.a(i, list, z);
                if (a2) {
                    try {
                        g.this.p.a(i, b.a.e.b.CANCEL);
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (a2 || z) {
                    synchronized (g.this) {
                        g.this.r.remove(Integer.valueOf(i));
                    }
                }
            }
        });
    }

    void a(final int i, c.e eVar, final int i2, final boolean z) throws IOException {
        final c.c cVar = new c.c();
        long j = i2;
        eVar.a(j);
        eVar.a(cVar, j);
        if (cVar.b() != j) {
            throw new IOException(cVar.b() + " != " + i2);
        }
        this.t.execute(new b.a.b("OkHttp %s Push Data[%s]", new Object[]{this.e, Integer.valueOf(i)}) { // from class: b.a.e.g.6
            @Override // b.a.b
            public void b() {
                try {
                    boolean a2 = g.this.i.a(i, cVar, i2, z);
                    if (a2) {
                        g.this.p.a(i, b.a.e.b.CANCEL);
                    }
                    if (a2 || z) {
                        synchronized (g.this) {
                            g.this.r.remove(Integer.valueOf(i));
                        }
                    }
                } catch (IOException unused) {
                }
            }
        });
    }

    void c(final int i, final b.a.e.b bVar) {
        this.t.execute(new b.a.b("OkHttp %s Push Reset[%s]", new Object[]{this.e, Integer.valueOf(i)}) { // from class: b.a.e.g.7
            @Override // b.a.b
            public void b() {
                g.this.i.a(i, bVar);
                synchronized (g.this) {
                    g.this.r.remove(Integer.valueOf(i));
                }
            }
        });
    }
}
