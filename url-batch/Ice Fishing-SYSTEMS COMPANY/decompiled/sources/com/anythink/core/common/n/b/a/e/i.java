package com.anythink.core.common.n.b.a.e;

import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.w;
import com.anythink.core.common.n.c.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f15442j = true;

    /* renamed from: a, reason: collision with root package name */
    long f15443a = 0;

    /* renamed from: b, reason: collision with root package name */
    long f15444b;

    /* renamed from: c, reason: collision with root package name */
    final int f15445c;

    /* renamed from: d, reason: collision with root package name */
    final f f15446d;

    /* renamed from: e, reason: collision with root package name */
    final a f15447e;

    /* renamed from: f, reason: collision with root package name */
    final c f15448f;

    /* renamed from: g, reason: collision with root package name */
    final c f15449g;

    /* renamed from: h, reason: collision with root package name */
    com.anythink.core.common.n.b.a.e.b f15450h;
    IOException i;

    /* renamed from: k, reason: collision with root package name */
    private final Deque<u> f15451k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15452l;

    /* renamed from: m, reason: collision with root package name */
    private final b f15453m;

    public final class a implements v {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f15454c = true;

        /* renamed from: e, reason: collision with root package name */
        private static final long f15455e = 16384;

        /* renamed from: a, reason: collision with root package name */
        boolean f15456a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15457b;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f15459f = new com.anythink.core.common.n.c.c();

        /* renamed from: g, reason: collision with root package name */
        private u f15460g;

        public a() {
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!f15454c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                if (this.f15456a) {
                    return;
                }
                if (!i.this.f15447e.f15457b) {
                    boolean z8 = this.f15459f.b() > 0;
                    if (this.f15460g != null) {
                        while (this.f15459f.b() > 0) {
                            a(false);
                        }
                        i iVar = i.this;
                        iVar.f15446d.a(iVar.f15445c, true, com.anythink.core.common.n.b.a.c.a(this.f15460g));
                    } else if (z8) {
                        while (this.f15459f.b() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar2 = i.this;
                        iVar2.f15446d.a(iVar2.f15445c, true, (com.anythink.core.common.n.c.c) null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f15456a = true;
                }
                i.this.f15446d.f15365r.b();
                i.this.g();
            }
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (!f15454c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.h();
            }
            while (this.f15459f.b() > 0) {
                a(false);
                i.this.f15446d.f15365r.b();
            }
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j9) {
            if (!f15454c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f15459f.a(cVar, j9);
            while (this.f15459f.b() >= f15455e) {
                a(false);
            }
        }

        private void a(boolean z8) {
            i iVar;
            long min;
            i iVar2;
            boolean z9;
            synchronized (i.this) {
                i.this.f15449g.c();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f15444b > 0 || this.f15457b || this.f15456a || iVar.f15450h != null) {
                            break;
                        } else {
                            iVar.i();
                        }
                    } finally {
                        i.this.f15449g.b();
                    }
                }
                iVar.f15449g.b();
                i.this.h();
                min = Math.min(i.this.f15444b, this.f15459f.b());
                iVar2 = i.this;
                iVar2.f15444b -= min;
            }
            iVar2.f15449g.c();
            if (z8) {
                try {
                    if (min == this.f15459f.b()) {
                        z9 = true;
                        boolean z10 = z9;
                        i iVar3 = i.this;
                        iVar3.f15446d.a(iVar3.f15445c, z10, this.f15459f, min);
                        i.this.f15449g.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z9 = false;
            boolean z102 = z9;
            i iVar32 = i.this;
            iVar32.f15446d.a(iVar32.f15445c, z102, this.f15459f, min);
            i.this.f15449g.b();
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return i.this.f15449g;
        }
    }

    public final class b implements w {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f15461c = true;

        /* renamed from: a, reason: collision with root package name */
        boolean f15462a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15463b;

        /* renamed from: e, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f15465e = new com.anythink.core.common.n.c.c();

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.c f15466f = new com.anythink.core.common.n.c.c();

        /* renamed from: g, reason: collision with root package name */
        private final long f15467g;

        /* renamed from: h, reason: collision with root package name */
        private u f15468h;

        public b(long j9) {
            this.f15467g = j9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            r12 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
        @Override // com.anythink.core.common.n.c.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long a_(com.anythink.core.common.n.c.c cVar, long j9) {
            Throwable th;
            long a_;
            if (j9 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
            }
            while (true) {
                synchronized (i.this) {
                    try {
                        i.this.f15448f.c();
                        try {
                            i iVar = i.this;
                            if (iVar.f15450h != null) {
                                th = iVar.i;
                                if (th == null) {
                                    th = new n(i.this.f15450h);
                                }
                            } else {
                                th = null;
                            }
                            if (this.f15462a) {
                                throw new IOException("stream closed");
                            }
                            if (this.f15466f.b() > 0) {
                                com.anythink.core.common.n.c.c cVar2 = this.f15466f;
                                a_ = cVar2.a_(cVar, Math.min(j9, cVar2.b()));
                                i iVar2 = i.this;
                                long j10 = iVar2.f15443a + a_;
                                iVar2.f15443a = j10;
                                if (th == null && j10 >= iVar2.f15446d.f15362o.e() / 2) {
                                    i iVar3 = i.this;
                                    iVar3.f15446d.a(iVar3.f15445c, iVar3.f15443a);
                                    i.this.f15443a = 0L;
                                }
                            } else {
                                if (this.f15463b || th != null) {
                                    break;
                                }
                                i.this.i();
                                i.this.f15448f.b();
                            }
                        } finally {
                            i.this.f15448f.b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (a_ == -1) {
                    a(a_);
                    return a_;
                }
                if (th == null) {
                    return -1L;
                }
                throw th;
            }
            i.this.f15448f.b();
            if (a_ == -1) {
            }
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long b9;
            synchronized (i.this) {
                this.f15462a = true;
                b9 = this.f15466f.b();
                this.f15466f.z();
                i.this.notifyAll();
            }
            if (b9 > 0) {
                a(b9);
            }
            i.this.g();
        }

        private void a(long j9) {
            if (!f15461c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f15446d.a(j9);
        }

        public final void a(com.anythink.core.common.n.c.e eVar, long j9) {
            boolean z8;
            boolean z9;
            long j10;
            if (!f15461c && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j9 > 0) {
                synchronized (i.this) {
                    z8 = this.f15463b;
                    z9 = this.f15466f.b() + j9 > this.f15467g;
                }
                if (z9) {
                    eVar.i(j9);
                    i.this.a(com.anythink.core.common.n.b.a.e.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z8) {
                    eVar.i(j9);
                    return;
                }
                long a_ = eVar.a_(this.f15465e, j9);
                if (a_ != -1) {
                    j9 -= a_;
                    synchronized (i.this) {
                        try {
                            if (this.f15462a) {
                                j10 = this.f15465e.b();
                                this.f15465e.z();
                            } else {
                                boolean z10 = this.f15466f.b() == 0;
                                this.f15466f.a((w) this.f15465e);
                                if (z10) {
                                    i.this.notifyAll();
                                }
                                j10 = 0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (j10 > 0) {
                        a(j10);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return i.this.f15448f;
        }
    }

    public i(int i, f fVar, boolean z8, boolean z9, u uVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f15451k = arrayDeque;
        this.f15448f = new c();
        this.f15449g = new c();
        if (fVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f15445c = i;
        this.f15446d = fVar;
        this.f15444b = fVar.f15363p.e();
        b bVar = new b(fVar.f15362o.e());
        this.f15453m = bVar;
        a aVar = new a();
        this.f15447e = aVar;
        bVar.f15463b = z9;
        aVar.f15457b = z8;
        if (uVar != null) {
            arrayDeque.add(uVar);
        }
        if (b() && uVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!b() && uVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private int j() {
        return this.f15445c;
    }

    private f k() {
        return this.f15446d;
    }

    private synchronized com.anythink.core.common.n.b.a.e.b l() {
        return this.f15450h;
    }

    private x m() {
        return this.f15448f;
    }

    private x n() {
        return this.f15449g;
    }

    public final synchronized boolean a() {
        try {
            if (this.f15450h != null) {
                return false;
            }
            b bVar = this.f15453m;
            if (!bVar.f15463b) {
                if (bVar.f15462a) {
                }
                return true;
            }
            a aVar = this.f15447e;
            if (aVar.f15457b || aVar.f15456a) {
                if (this.f15452l) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b() {
        return this.f15446d.f15354f == ((this.f15445c & 1) == 1);
    }

    public final synchronized u c() {
        this.f15448f.c();
        while (this.f15451k.isEmpty() && this.f15450h == null) {
            try {
                i();
            } catch (Throwable th) {
                this.f15448f.b();
                throw th;
            }
        }
        this.f15448f.b();
        if (this.f15451k.isEmpty()) {
            IOException iOException = this.i;
            if (iOException != null) {
                throw iOException;
            }
            throw new n(this.f15450h);
        }
        return this.f15451k.removeFirst();
    }

    public final synchronized u d() {
        try {
            if (this.f15450h != null) {
                IOException iOException = this.i;
                if (iOException != null) {
                    throw iOException;
                }
                throw new n(this.f15450h);
            }
            b bVar = this.f15453m;
            if (!bVar.f15463b || !bVar.f15465e.g() || !this.f15453m.f15466f.g()) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            if (this.f15453m.f15468h != null) {
                return this.f15453m.f15468h;
            }
            return com.anythink.core.common.n.b.a.c.f15196c;
        } finally {
        }
    }

    public final w e() {
        return this.f15453m;
    }

    public final v f() {
        synchronized (this) {
            try {
                if (!this.f15452l && !b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15447e;
    }

    public final void g() {
        boolean z8;
        boolean a9;
        if (!f15442j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                b bVar = this.f15453m;
                if (!bVar.f15463b && bVar.f15462a) {
                    a aVar = this.f15447e;
                    if (!aVar.f15457b) {
                        if (aVar.f15456a) {
                        }
                    }
                    z8 = true;
                    a9 = a();
                }
                z8 = false;
                a9 = a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            a(com.anythink.core.common.n.b.a.e.b.CANCEL, (IOException) null);
        } else {
            if (a9) {
                return;
            }
            this.f15446d.b(this.f15445c);
        }
    }

    public final void h() {
        a aVar = this.f15447e;
        if (aVar.f15456a) {
            throw new IOException("stream closed");
        }
        if (aVar.f15457b) {
            throw new IOException("stream finished");
        }
        if (this.f15450h != null) {
            IOException iOException = this.i;
            if (iOException == null) {
                throw new n(this.f15450h);
            }
        }
    }

    public final void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public class c extends com.anythink.core.common.n.c.a {
        public c() {
        }

        @Override // com.anythink.core.common.n.c.a
        public final void a() {
            i.this.a(com.anythink.core.common.n.b.a.e.b.CANCEL);
            i.this.f15446d.c();
        }

        public final void b() {
            if (d()) {
                throw a((IOException) null);
            }
        }

        @Override // com.anythink.core.common.n.c.a
        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    private boolean b(com.anythink.core.common.n.b.a.e.b bVar, IOException iOException) {
        if (!f15442j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f15450h != null) {
                    return false;
                }
                if (this.f15453m.f15463b && this.f15447e.f15457b) {
                    return false;
                }
                this.f15450h = bVar;
                this.i = iOException;
                notifyAll();
                this.f15446d.b(this.f15445c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(List<com.anythink.core.common.n.b.a.e.c> list, boolean z8, boolean z9) {
        boolean z10;
        if (!f15442j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (list != null) {
            synchronized (this) {
                z10 = true;
                try {
                    this.f15452l = true;
                    if (z8) {
                        this.f15447e.f15457b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z9) {
                synchronized (this.f15446d) {
                    if (this.f15446d.f15361n != 0) {
                        z10 = false;
                    }
                }
                z9 = z10;
            }
            this.f15446d.a(this.f15445c, z8, list);
            if (z9) {
                this.f15446d.f15365r.b();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public final synchronized void b(com.anythink.core.common.n.b.a.e.b bVar) {
        if (this.f15450h == null) {
            this.f15450h = bVar;
            notifyAll();
        }
    }

    private void a(u uVar) {
        synchronized (this) {
            try {
                if (!this.f15447e.f15457b) {
                    if (uVar.a() != 0) {
                        this.f15447e.f15460g = uVar;
                    } else {
                        throw new IllegalArgumentException("trailers.size() == 0");
                    }
                } else {
                    throw new IllegalStateException("already finished");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(com.anythink.core.common.n.b.a.e.b bVar, IOException iOException) {
        if (b(bVar, iOException)) {
            this.f15446d.b(this.f15445c, bVar);
        }
    }

    public final void a(com.anythink.core.common.n.b.a.e.b bVar) {
        if (b(bVar, null)) {
            this.f15446d.a(this.f15445c, bVar);
        }
    }

    public final void a(com.anythink.core.common.n.c.e eVar, int i) {
        if (!f15442j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f15453m.a(eVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:10:0x0012, B:14:0x001a, B:16:0x002b, B:17:0x002f, B:18:0x0036, B:24:0x0022), top: B:9:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u uVar, boolean z8) {
        boolean a9;
        if (!f15442j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f15452l && z8) {
                    this.f15453m.f15468h = uVar;
                    if (z8) {
                        this.f15453m.f15463b = true;
                    }
                    a9 = a();
                    notifyAll();
                }
                this.f15452l = true;
                this.f15451k.add(uVar);
                if (z8) {
                }
                a9 = a();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a9) {
            return;
        }
        this.f15446d.b(this.f15445c);
    }

    public final void a(long j9) {
        this.f15444b += j9;
        if (j9 > 0) {
            notifyAll();
        }
    }
}
