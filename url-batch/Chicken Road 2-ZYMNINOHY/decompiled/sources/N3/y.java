package N3;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f1931a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1932b;

    /* renamed from: c, reason: collision with root package name */
    public long f1933c;

    /* renamed from: d, reason: collision with root package name */
    public long f1934d;

    /* renamed from: e, reason: collision with root package name */
    public long f1935e;

    /* renamed from: f, reason: collision with root package name */
    public long f1936f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1937g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1938h;

    /* renamed from: i, reason: collision with root package name */
    public final w f1939i;

    /* renamed from: j, reason: collision with root package name */
    public final v f1940j;

    /* renamed from: k, reason: collision with root package name */
    public final x f1941k;

    /* renamed from: l, reason: collision with root package name */
    public final x f1942l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0078b f1943m;
    public IOException n;

    public y(int i4, q connection, boolean z, boolean z4, G3.n nVar) {
        kotlin.jvm.internal.i.e(connection, "connection");
        this.f1931a = i4;
        this.f1932b = connection;
        this.f1936f = connection.f1894q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1937g = arrayDeque;
        this.f1939i = new w(this, connection.f1893p.a(), z4);
        this.f1940j = new v(this, z);
        this.f1941k = new x(this);
        this.f1942l = new x(this);
        if (nVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(nVar);
        }
    }

    public final void a() {
        boolean z;
        boolean i4;
        byte[] bArr = H3.b.f1103a;
        synchronized (this) {
            try {
                w wVar = this.f1939i;
                if (!wVar.f1925b && wVar.f1928e) {
                    v vVar = this.f1940j;
                    if (!vVar.f1920a) {
                        if (vVar.f1922c) {
                        }
                    }
                    z = true;
                    i4 = i();
                }
                z = false;
                i4 = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(EnumC0078b.CANCEL, null);
        } else {
            if (i4) {
                return;
            }
            this.f1932b.f(this.f1931a);
        }
    }

    public final void b() {
        v vVar = this.f1940j;
        if (vVar.f1922c) {
            throw new IOException("stream closed");
        }
        if (vVar.f1920a) {
            throw new IOException("stream finished");
        }
        if (this.f1943m != null) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0078b enumC0078b = this.f1943m;
            kotlin.jvm.internal.i.b(enumC0078b);
            throw new E(enumC0078b);
        }
    }

    public final void c(EnumC0078b enumC0078b, IOException iOException) {
        if (d(enumC0078b, iOException)) {
            this.f1932b.f1899w.s(this.f1931a, enumC0078b);
        }
    }

    public final boolean d(EnumC0078b enumC0078b, IOException iOException) {
        byte[] bArr = H3.b.f1103a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f1939i.f1925b && this.f1940j.f1920a) {
                return false;
            }
            this.f1943m = enumC0078b;
            this.n = iOException;
            notifyAll();
            this.f1932b.f(this.f1931a);
            return true;
        }
    }

    public final void e(EnumC0078b enumC0078b) {
        if (d(enumC0078b, null)) {
            this.f1932b.t(this.f1931a, enumC0078b);
        }
    }

    public final synchronized EnumC0078b f() {
        return this.f1943m;
    }

    public final v g() {
        synchronized (this) {
            if (!this.f1938h && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f1940j;
    }

    public final boolean h() {
        boolean z = (this.f1931a & 1) == 1;
        this.f1932b.getClass();
        return true == z;
    }

    public final synchronized boolean i() {
        try {
            if (this.f1943m != null) {
                return false;
            }
            w wVar = this.f1939i;
            if (!wVar.f1925b) {
                if (wVar.f1928e) {
                }
                return true;
            }
            v vVar = this.f1940j;
            if (vVar.f1920a || vVar.f1922c) {
                if (this.f1938h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(G3.n headers, boolean z) {
        boolean i4;
        kotlin.jvm.internal.i.e(headers, "headers");
        byte[] bArr = H3.b.f1103a;
        synchronized (this) {
            try {
                if (this.f1938h && z) {
                    this.f1939i.getClass();
                    if (z) {
                        this.f1939i.f1925b = true;
                    }
                    i4 = i();
                    notifyAll();
                }
                this.f1938h = true;
                this.f1937g.add(headers);
                if (z) {
                }
                i4 = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i4) {
            return;
        }
        this.f1932b.f(this.f1931a);
    }

    public final synchronized void k(EnumC0078b enumC0078b) {
        if (this.f1943m == null) {
            this.f1943m = enumC0078b;
            notifyAll();
        }
    }
}
