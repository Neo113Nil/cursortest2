package b.a.b;

import b.a.e.o;
import b.ae;
import b.j;
import b.x;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;

/* compiled from: StreamAllocation.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f1848b = !g.class.desiredAssertionStatus();

    /* renamed from: a, reason: collision with root package name */
    public final b.a f1849a;

    /* renamed from: c, reason: collision with root package name */
    private ae f1850c;

    /* renamed from: d, reason: collision with root package name */
    private final j f1851d;
    private final Object e;
    private final f f;
    private int g;
    private c h;
    private boolean i;
    private boolean j;
    private b.a.c.c k;

    public g(j jVar, b.a aVar, Object obj) {
        this.f1851d = jVar;
        this.f1849a = aVar;
        this.f = new f(aVar, g());
        this.e = obj;
    }

    public b.a.c.c a(x xVar, boolean z) {
        try {
            b.a.c.c a2 = a(xVar.a(), xVar.b(), xVar.c(), xVar.r(), z).a(xVar, this);
            synchronized (this.f1851d) {
                this.k = a2;
            }
            return a2;
        } catch (IOException e) {
            throw new e(e);
        }
    }

    private c a(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        while (true) {
            c a2 = a(i, i2, i3, z);
            synchronized (this.f1851d) {
                if (a2.f1838b == 0) {
                    return a2;
                }
                if (a2.a(z2)) {
                    return a2;
                }
                d();
            }
        }
    }

    private c a(int i, int i2, int i3, boolean z) throws IOException {
        synchronized (this.f1851d) {
            if (this.i) {
                throw new IllegalStateException("released");
            }
            if (this.k != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.j) {
                throw new IOException("Canceled");
            }
            c cVar = this.h;
            if (cVar != null && !cVar.f1837a) {
                return cVar;
            }
            Socket socket = null;
            b.a.a.f1807a.a(this.f1851d, this.f1849a, this, null);
            if (this.h != null) {
                return this.h;
            }
            ae aeVar = this.f1850c;
            if (aeVar == null) {
                aeVar = this.f.b();
            }
            synchronized (this.f1851d) {
                if (this.j) {
                    throw new IOException("Canceled");
                }
                b.a.a.f1807a.a(this.f1851d, this.f1849a, this, aeVar);
                if (this.h != null) {
                    return this.h;
                }
                this.f1850c = aeVar;
                this.g = 0;
                c cVar2 = new c(this.f1851d, aeVar);
                a(cVar2);
                cVar2.a(i, i2, i3, z);
                g().b(cVar2.a());
                synchronized (this.f1851d) {
                    b.a.a.f1807a.b(this.f1851d, cVar2);
                    if (cVar2.e()) {
                        socket = b.a.a.f1807a.a(this.f1851d, this.f1849a, this);
                        cVar2 = this.h;
                    }
                }
                b.a.c.a(socket);
                return cVar2;
            }
        }
    }

    public void a(boolean z, b.a.c.c cVar) {
        Socket a2;
        synchronized (this.f1851d) {
            if (cVar != null) {
                if (cVar == this.k) {
                    if (!z) {
                        this.h.f1838b++;
                    }
                    a2 = a(z, false, true);
                }
            }
            throw new IllegalStateException("expected " + this.k + " but was " + cVar);
        }
        b.a.c.a(a2);
    }

    public b.a.c.c a() {
        b.a.c.c cVar;
        synchronized (this.f1851d) {
            cVar = this.k;
        }
        return cVar;
    }

    private d g() {
        return b.a.a.f1807a.a(this.f1851d);
    }

    public synchronized c b() {
        return this.h;
    }

    public void c() {
        Socket a2;
        synchronized (this.f1851d) {
            a2 = a(false, true, false);
        }
        b.a.c.a(a2);
    }

    public void d() {
        Socket a2;
        synchronized (this.f1851d) {
            a2 = a(true, false, false);
        }
        b.a.c.a(a2);
    }

    private Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (!f1848b && !Thread.holdsLock(this.f1851d)) {
            throw new AssertionError();
        }
        if (z3) {
            this.k = null;
        }
        if (z2) {
            this.i = true;
        }
        if (this.h != null) {
            if (z) {
                this.h.f1837a = true;
            }
            if (this.k == null && (this.i || this.h.f1837a)) {
                c(this.h);
                if (this.h.f1840d.isEmpty()) {
                    this.h.e = System.nanoTime();
                    if (b.a.a.f1807a.a(this.f1851d, this.h)) {
                        socket = this.h.c();
                        this.h = null;
                        return socket;
                    }
                }
                socket = null;
                this.h = null;
                return socket;
            }
        }
        return null;
    }

    public void e() {
        b.a.c.c cVar;
        c cVar2;
        synchronized (this.f1851d) {
            this.j = true;
            cVar = this.k;
            cVar2 = this.h;
        }
        if (cVar != null) {
            cVar.c();
        } else if (cVar2 != null) {
            cVar2.b();
        }
    }

    public void a(IOException iOException) {
        boolean z;
        Socket a2;
        synchronized (this.f1851d) {
            if (iOException instanceof o) {
                o oVar = (o) iOException;
                if (oVar.f1996a == b.a.e.b.REFUSED_STREAM) {
                    this.g++;
                }
                if (oVar.f1996a != b.a.e.b.REFUSED_STREAM || this.g > 1) {
                    this.f1850c = null;
                    z = true;
                }
                z = false;
            } else {
                if (this.h != null && (!this.h.e() || (iOException instanceof b.a.e.a))) {
                    if (this.h.f1838b == 0) {
                        if (this.f1850c != null && iOException != null) {
                            this.f.a(this.f1850c, iOException);
                        }
                        this.f1850c = null;
                    }
                    z = true;
                }
                z = false;
            }
            a2 = a(z, false, true);
        }
        b.a.c.a(a2);
    }

    public void a(c cVar) {
        if (!f1848b && !Thread.holdsLock(this.f1851d)) {
            throw new AssertionError();
        }
        if (this.h != null) {
            throw new IllegalStateException();
        }
        this.h = cVar;
        cVar.f1840d.add(new a(this, this.e));
    }

    private void c(c cVar) {
        int size = cVar.f1840d.size();
        for (int i = 0; i < size; i++) {
            if (cVar.f1840d.get(i).get() == this) {
                cVar.f1840d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public Socket b(c cVar) {
        if (!f1848b && !Thread.holdsLock(this.f1851d)) {
            throw new AssertionError();
        }
        if (this.k != null || this.h.f1840d.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<g> reference = this.h.f1840d.get(0);
        Socket a2 = a(true, false, false);
        this.h = cVar;
        cVar.f1840d.add(reference);
        return a2;
    }

    public boolean f() {
        return this.f1850c != null || this.f.a();
    }

    public String toString() {
        c b2 = b();
        return b2 != null ? b2.toString() : this.f1849a.toString();
    }

    /* compiled from: StreamAllocation.java */
    public static final class a extends WeakReference<g> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f1852a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f1852a = obj;
        }
    }
}
