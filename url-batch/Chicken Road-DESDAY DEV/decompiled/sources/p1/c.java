package p1;

import j0.AbstractC0143a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import l.C0207a0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3395b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3396c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3397e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3398f;

    public c(d dVar, String str) {
        b1.d.e(dVar, "taskRunner");
        b1.d.e(str, "name");
        this.f3394a = dVar;
        this.f3395b = str;
        this.f3397e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = n1.b.f3286a;
        synchronized (this.f3394a) {
            if (b()) {
                this.f3394a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3390b) {
            this.f3398f = true;
        }
        ArrayList arrayList = this.f3397e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3390b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0143a.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        b1.d.e(aVar, "task");
        synchronized (this.f3394a) {
            if (!this.f3396c) {
                if (d(aVar, j2, false)) {
                    this.f3394a.d(this);
                }
            } else if (aVar.f3390b) {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0143a.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0143a.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        b1.d.e(aVar, "task");
        c cVar = aVar.f3391c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3391c = this;
        }
        C0207a0 c0207a0 = this.f3394a.f3399a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3397e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0143a.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            AbstractC0143a.a(aVar, this, z2 ? "run again after ".concat(AbstractC0143a.j(j3 - nanoTime)) : "scheduled after ".concat(AbstractC0143a.j(j3 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).d - nanoTime > j2) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, aVar);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = n1.b.f3286a;
        synchronized (this.f3394a) {
            this.f3396c = true;
            if (b()) {
                this.f3394a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3395b;
    }
}
