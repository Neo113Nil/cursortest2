package org.apache.a.f.c.a;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.a.c.o;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: ConnPoolByRoute.java */
/* loaded from: classes2.dex */
public class d extends a {
    protected final org.apache.a.c.d e;
    protected final org.apache.a.c.a.b f;
    protected final Set<b> g;
    protected final Queue<b> h;
    protected final Queue<h> i;
    protected final Map<org.apache.a.c.b.b, f> j;
    protected volatile boolean k;
    protected volatile int l;
    protected volatile int m;
    private final Log n;
    private final Lock o;
    private final long p;
    private final TimeUnit q;

    public d(org.apache.a.c.d dVar, org.apache.a.c.a.b bVar, int i) {
        this(dVar, bVar, i, -1L, TimeUnit.MILLISECONDS);
    }

    public d(org.apache.a.c.d dVar, org.apache.a.c.a.b bVar, int i, long j, TimeUnit timeUnit) {
        this.n = LogFactory.getLog(getClass());
        if (dVar == null) {
            throw new IllegalArgumentException("Connection operator may not be null");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("Connections per route may not be null");
        }
        this.o = this.f9798a;
        this.g = this.f9799b;
        this.e = dVar;
        this.f = bVar;
        this.l = i;
        this.h = b();
        this.i = c();
        this.j = d();
        this.p = j;
        this.q = timeUnit;
    }

    @Deprecated
    public d(org.apache.a.c.d dVar, org.apache.a.i.d dVar2) {
        this(dVar, org.apache.a.c.a.a.b(dVar2), org.apache.a.c.a.a.c(dVar2));
    }

    protected Queue<b> b() {
        return new LinkedList();
    }

    protected Queue<h> c() {
        return new LinkedList();
    }

    protected Map<org.apache.a.c.b.b, f> d() {
        return new HashMap();
    }

    protected f a(org.apache.a.c.b.b bVar) {
        return new f(bVar, this.f);
    }

    protected h a(Condition condition, f fVar) {
        return new h(condition, fVar);
    }

    private void b(b bVar) {
        o c2 = bVar.c();
        if (c2 != null) {
            try {
                c2.c();
            } catch (IOException e) {
                this.n.debug("I/O error closing connection", e);
            }
        }
    }

    protected f a(org.apache.a.c.b.b bVar, boolean z) {
        this.o.lock();
        try {
            f fVar = this.j.get(bVar);
            if (fVar == null && z) {
                fVar = a(bVar);
                this.j.put(bVar, fVar);
            }
            return fVar;
        } finally {
            this.o.unlock();
        }
    }

    public e a(final org.apache.a.c.b.b bVar, final Object obj) {
        final i iVar = new i();
        return new e() { // from class: org.apache.a.f.c.a.d.1
            @Override // org.apache.a.f.c.a.e
            public void a() {
                d.this.o.lock();
                try {
                    iVar.a();
                } finally {
                    d.this.o.unlock();
                }
            }

            @Override // org.apache.a.f.c.a.e
            public b a(long j, TimeUnit timeUnit) throws InterruptedException, org.apache.a.c.h {
                return d.this.a(bVar, obj, j, timeUnit, iVar);
            }
        };
    }

    protected b a(org.apache.a.c.b.b bVar, Object obj, long j, TimeUnit timeUnit, i iVar) throws org.apache.a.c.h, InterruptedException {
        b bVar2 = null;
        Date date = j > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j)) : null;
        this.o.lock();
        try {
            f a2 = a(bVar, true);
            h hVar = null;
            while (bVar2 == null) {
                if (this.k) {
                    throw new IllegalStateException("Connection pool shut down");
                }
                if (this.n.isDebugEnabled()) {
                    this.n.debug("[" + bVar + "] total kept alive: " + this.h.size() + ", total issued: " + this.g.size() + ", total allocated: " + this.m + " out of " + this.l);
                }
                bVar2 = a(a2, obj);
                if (bVar2 != null) {
                    break;
                }
                boolean z = a2.d() > 0;
                if (this.n.isDebugEnabled()) {
                    this.n.debug("Available capacity: " + a2.d() + " out of " + a2.b() + " [" + bVar + "][" + obj + "]");
                }
                if (z && this.m < this.l) {
                    bVar2 = a(a2, this.e);
                } else if (z && !this.h.isEmpty()) {
                    e();
                    a2 = a(bVar, true);
                    bVar2 = a(a2, this.e);
                } else {
                    if (this.n.isDebugEnabled()) {
                        this.n.debug("Need to wait for connection [" + bVar + "][" + obj + "]");
                    }
                    if (hVar == null) {
                        hVar = a(this.o.newCondition(), a2);
                        iVar.a(hVar);
                    }
                    try {
                        a2.a(hVar);
                        this.i.add(hVar);
                        if (!hVar.a(date) && date != null && date.getTime() <= System.currentTimeMillis()) {
                            throw new org.apache.a.c.h("Timeout waiting for connection");
                        }
                    } finally {
                        a2.b(hVar);
                        this.i.remove(hVar);
                    }
                }
            }
            return bVar2;
        } finally {
            this.o.unlock();
        }
    }

    public void a(b bVar, boolean z, long j, TimeUnit timeUnit) {
        String str;
        org.apache.a.c.b.b d2 = bVar.d();
        if (this.n.isDebugEnabled()) {
            this.n.debug("Releasing connection [" + d2 + "][" + bVar.a() + "]");
        }
        this.o.lock();
        try {
            if (this.k) {
                b(bVar);
                return;
            }
            this.g.remove(bVar);
            f a2 = a(d2, true);
            if (z) {
                if (this.n.isDebugEnabled()) {
                    if (j > 0) {
                        str = "for " + j + " " + timeUnit;
                    } else {
                        str = "indefinitely";
                    }
                    this.n.debug("Pooling connection [" + d2 + "][" + bVar.a() + "]; keep alive " + str);
                }
                a2.a(bVar);
                bVar.a(j, timeUnit);
                this.h.add(bVar);
            } else {
                a2.e();
                this.m--;
            }
            a(a2);
        } finally {
            this.o.unlock();
        }
    }

    protected b a(f fVar, Object obj) {
        this.o.lock();
        boolean z = false;
        b bVar = null;
        while (!z) {
            try {
                bVar = fVar.a(obj);
                if (bVar != null) {
                    if (this.n.isDebugEnabled()) {
                        this.n.debug("Getting free connection [" + fVar.a() + "][" + obj + "]");
                    }
                    this.h.remove(bVar);
                    if (bVar.a(System.currentTimeMillis())) {
                        if (this.n.isDebugEnabled()) {
                            this.n.debug("Closing expired free connection [" + fVar.a() + "][" + obj + "]");
                        }
                        b(bVar);
                        fVar.e();
                        this.m--;
                    } else {
                        this.g.add(bVar);
                    }
                } else if (this.n.isDebugEnabled()) {
                    this.n.debug("No free connections [" + fVar.a() + "][" + obj + "]");
                }
                z = true;
            } finally {
                this.o.unlock();
            }
        }
        return bVar;
    }

    protected b a(f fVar, org.apache.a.c.d dVar) {
        if (this.n.isDebugEnabled()) {
            this.n.debug("Creating new connection [" + fVar.a() + "]");
        }
        b bVar = new b(dVar, fVar.a(), this.p, this.q);
        this.o.lock();
        try {
            fVar.b(bVar);
            this.m++;
            this.g.add(bVar);
            return bVar;
        } finally {
            this.o.unlock();
        }
    }

    protected void a(b bVar) {
        org.apache.a.c.b.b d2 = bVar.d();
        if (this.n.isDebugEnabled()) {
            this.n.debug("Deleting connection [" + d2 + "][" + bVar.a() + "]");
        }
        this.o.lock();
        try {
            b(bVar);
            f a2 = a(d2, true);
            a2.c(bVar);
            this.m--;
            if (a2.c()) {
                this.j.remove(d2);
            }
        } finally {
            this.o.unlock();
        }
    }

    protected void e() {
        this.o.lock();
        try {
            b remove = this.h.remove();
            if (remove != null) {
                a(remove);
            } else if (this.n.isDebugEnabled()) {
                this.n.debug("No free connection to delete");
            }
        } finally {
            this.o.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:24:0x0007, B:26:0x000d, B:28:0x0015, B:29:0x0034, B:10:0x006d, B:3:0x003b, B:5:0x0043, B:7:0x004b, B:8:0x0052, B:19:0x005b, B:21:0x0063), top: B:23:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void a(f fVar) {
        h g;
        this.o.lock();
        if (fVar != null) {
            try {
                if (fVar.f()) {
                    if (this.n.isDebugEnabled()) {
                        this.n.debug("Notifying thread waiting on pool [" + fVar.a() + "]");
                    }
                    g = fVar.g();
                    if (g != null) {
                        g.a();
                    }
                    this.o.unlock();
                }
            } catch (Throwable th) {
                this.o.unlock();
                throw th;
            }
        }
        if (!this.i.isEmpty()) {
            if (this.n.isDebugEnabled()) {
                this.n.debug("Notifying thread waiting on any pool");
            }
            g = this.i.remove();
        } else {
            if (this.n.isDebugEnabled()) {
                this.n.debug("Notifying no-one, there are no waiting threads");
            }
            g = null;
        }
        if (g != null) {
        }
        this.o.unlock();
    }

    @Override // org.apache.a.f.c.a.a
    public void a() {
        this.o.lock();
        try {
            if (this.k) {
                return;
            }
            this.k = true;
            Iterator<b> it = this.g.iterator();
            while (it.hasNext()) {
                b next = it.next();
                it.remove();
                b(next);
            }
            Iterator<b> it2 = this.h.iterator();
            while (it2.hasNext()) {
                b next2 = it2.next();
                it2.remove();
                if (this.n.isDebugEnabled()) {
                    this.n.debug("Closing connection [" + next2.d() + "][" + next2.a() + "]");
                }
                b(next2);
            }
            Iterator<h> it3 = this.i.iterator();
            while (it3.hasNext()) {
                h next3 = it3.next();
                it3.remove();
                next3.a();
            }
            this.j.clear();
        } finally {
            this.o.unlock();
        }
    }
}
