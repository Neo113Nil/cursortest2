package b.a.e;

import android.support.v4.media.session.PlaybackStateCompat;
import c.q;
import c.r;
import c.s;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Http2Stream.java */
/* loaded from: classes.dex */
public final class i {
    static final /* synthetic */ boolean i = !i.class.desiredAssertionStatus();

    /* renamed from: b, reason: collision with root package name */
    long f1967b;

    /* renamed from: c, reason: collision with root package name */
    final int f1968c;

    /* renamed from: d, reason: collision with root package name */
    final g f1969d;
    final a e;
    private final List<b.a.e.c> j;
    private List<b.a.e.c> k;
    private boolean l;
    private final b m;

    /* renamed from: a, reason: collision with root package name */
    long f1966a = 0;
    final c f = new c();
    final c g = new c();
    b.a.e.b h = null;

    i(int i2, g gVar, boolean z, boolean z2, List<b.a.e.c> list) {
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.f1968c = i2;
        this.f1969d = gVar;
        this.f1967b = gVar.m.d();
        this.m = new b(gVar.l.d());
        this.e = new a();
        this.m.f1976b = z2;
        this.e.f1972b = z;
        this.j = list;
    }

    public int a() {
        return this.f1968c;
    }

    public synchronized boolean b() {
        if (this.h != null) {
            return false;
        }
        if ((this.m.f1976b || this.m.f1975a) && (this.e.f1972b || this.e.f1971a)) {
            if (this.l) {
                return false;
            }
        }
        return true;
    }

    public boolean c() {
        return this.f1969d.f1923b == ((this.f1968c & 1) == 1);
    }

    public synchronized List<b.a.e.c> d() throws IOException {
        List<b.a.e.c> list;
        if (!c()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.f.c();
        while (this.k == null && this.h == null) {
            try {
                l();
            } catch (Throwable th) {
                this.f.b();
                throw th;
            }
        }
        this.f.b();
        list = this.k;
        if (list != null) {
            this.k = null;
        } else {
            throw new o(this.h);
        }
        return list;
    }

    public s e() {
        return this.f;
    }

    public s f() {
        return this.g;
    }

    public r g() {
        return this.m;
    }

    public q h() {
        synchronized (this) {
            if (!this.l && !c()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.e;
    }

    public void a(b.a.e.b bVar) throws IOException {
        if (d(bVar)) {
            this.f1969d.b(this.f1968c, bVar);
        }
    }

    public void b(b.a.e.b bVar) {
        if (d(bVar)) {
            this.f1969d.a(this.f1968c, bVar);
        }
    }

    private boolean d(b.a.e.b bVar) {
        if (!i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.h != null) {
                return false;
            }
            if (this.m.f1976b && this.e.f1972b) {
                return false;
            }
            this.h = bVar;
            notifyAll();
            this.f1969d.b(this.f1968c);
            return true;
        }
    }

    void a(List<b.a.e.c> list) {
        boolean z;
        if (!i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            z = true;
            this.l = true;
            if (this.k == null) {
                this.k = list;
                z = b();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.k);
                arrayList.add(null);
                arrayList.addAll(list);
                this.k = arrayList;
            }
        }
        if (z) {
            return;
        }
        this.f1969d.b(this.f1968c);
    }

    void a(c.e eVar, int i2) throws IOException {
        if (!i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.m.a(eVar, i2);
    }

    void i() {
        boolean b2;
        if (!i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.m.f1976b = true;
            b2 = b();
            notifyAll();
        }
        if (b2) {
            return;
        }
        this.f1969d.b(this.f1968c);
    }

    synchronized void c(b.a.e.b bVar) {
        if (this.h == null) {
            this.h = bVar;
            notifyAll();
        }
    }

    /* compiled from: Http2Stream.java */
    private final class b implements r {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f1974c = !i.class.desiredAssertionStatus();

        /* renamed from: a, reason: collision with root package name */
        boolean f1975a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1976b;
        private final c.c e = new c.c();
        private final c.c f = new c.c();
        private final long g;

        b(long j) {
            this.g = j;
        }

        @Override // c.r
        public long a(c.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            synchronized (i.this) {
                b();
                c();
                if (this.f.b() == 0) {
                    return -1L;
                }
                long a2 = this.f.a(cVar, Math.min(j, this.f.b()));
                i.this.f1966a += a2;
                if (i.this.f1966a >= i.this.f1969d.l.d() / 2) {
                    i.this.f1969d.a(i.this.f1968c, i.this.f1966a);
                    i.this.f1966a = 0L;
                }
                synchronized (i.this.f1969d) {
                    i.this.f1969d.j += a2;
                    if (i.this.f1969d.j >= i.this.f1969d.l.d() / 2) {
                        i.this.f1969d.a(0, i.this.f1969d.j);
                        i.this.f1969d.j = 0L;
                    }
                }
                return a2;
            }
        }

        private void b() throws IOException {
            i.this.f.c();
            while (this.f.b() == 0 && !this.f1976b && !this.f1975a && i.this.h == null) {
                try {
                    i.this.l();
                } finally {
                    i.this.f.b();
                }
            }
        }

        void a(c.e eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            if (!f1974c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (i.this) {
                    z = this.f1976b;
                    z2 = this.f.b() + j > this.g;
                }
                if (z2) {
                    eVar.h(j);
                    i.this.b(b.a.e.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    eVar.h(j);
                    return;
                }
                long a2 = eVar.a(this.e, j);
                if (a2 == -1) {
                    throw new EOFException();
                }
                j -= a2;
                synchronized (i.this) {
                    boolean z3 = this.f.b() == 0;
                    this.f.a((r) this.e);
                    if (z3) {
                        i.this.notifyAll();
                    }
                }
            }
        }

        @Override // c.r
        public s a() {
            return i.this.f;
        }

        @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (i.this) {
                this.f1975a = true;
                this.f.s();
                i.this.notifyAll();
            }
            i.this.j();
        }

        private void c() throws IOException {
            if (this.f1975a) {
                throw new IOException("stream closed");
            }
            if (i.this.h != null) {
                throw new o(i.this.h);
            }
        }
    }

    void j() throws IOException {
        boolean z;
        boolean b2;
        if (!i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            z = !this.m.f1976b && this.m.f1975a && (this.e.f1972b || this.e.f1971a);
            b2 = b();
        }
        if (z) {
            a(b.a.e.b.CANCEL);
        } else {
            if (b2) {
                return;
            }
            this.f1969d.b(this.f1968c);
        }
    }

    /* compiled from: Http2Stream.java */
    final class a implements q {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f1970c = !i.class.desiredAssertionStatus();

        /* renamed from: a, reason: collision with root package name */
        boolean f1971a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1972b;
        private final c.c e = new c.c();

        a() {
        }

        @Override // c.q
        public void a_(c.c cVar, long j) throws IOException {
            if (!f1970c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.e.a_(cVar, j);
            while (this.e.b() >= PlaybackStateCompat.ACTION_PREPARE) {
                a(false);
            }
        }

        private void a(boolean z) throws IOException {
            long min;
            synchronized (i.this) {
                i.this.g.c();
                while (i.this.f1967b <= 0 && !this.f1972b && !this.f1971a && i.this.h == null) {
                    try {
                        i.this.l();
                    } finally {
                    }
                }
                i.this.g.b();
                i.this.k();
                min = Math.min(i.this.f1967b, this.e.b());
                i.this.f1967b -= min;
            }
            i.this.g.c();
            try {
                i.this.f1969d.a(i.this.f1968c, z && min == this.e.b(), this.e, min);
            } finally {
            }
        }

        @Override // c.q, java.io.Flushable
        public void flush() throws IOException {
            if (!f1970c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.k();
            }
            while (this.e.b() > 0) {
                a(false);
                i.this.f1969d.b();
            }
        }

        @Override // c.q
        public s a() {
            return i.this.g;
        }

        @Override // c.q, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f1970c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                if (this.f1971a) {
                    return;
                }
                if (!i.this.e.f1972b) {
                    if (this.e.b() > 0) {
                        while (this.e.b() > 0) {
                            a(true);
                        }
                    } else {
                        i.this.f1969d.a(i.this.f1968c, true, (c.c) null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f1971a = true;
                }
                i.this.f1969d.b();
                i.this.j();
            }
        }
    }

    void a(long j) {
        this.f1967b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    void k() throws IOException {
        if (this.e.f1971a) {
            throw new IOException("stream closed");
        }
        if (this.e.f1972b) {
            throw new IOException("stream finished");
        }
        if (this.h != null) {
            throw new o(this.h);
        }
    }

    void l() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* compiled from: Http2Stream.java */
    class c extends c.a {
        c() {
        }

        @Override // c.a
        protected void a() {
            i.this.b(b.a.e.b.CANCEL);
        }

        @Override // c.a
        protected IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void b() throws IOException {
            if (d_()) {
                throw a((IOException) null);
            }
        }
    }
}
