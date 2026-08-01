package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import k0.w;
import m1.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3428b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3429c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3430e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3431f;

    public c(d dVar, String str) {
        b1.d.e(dVar, "taskRunner");
        b1.d.e(str, "name");
        this.f3427a = dVar;
        this.f3428b = str;
        this.f3430e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = n1.b.f3319a;
        synchronized (this.f3427a) {
            if (b()) {
                this.f3427a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3423b) {
            this.f3431f = true;
        }
        ArrayList arrayList = this.f3430e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3423b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    w.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        b1.d.e(aVar, "task");
        synchronized (this.f3427a) {
            if (!this.f3429c) {
                if (d(aVar, j2, false)) {
                    this.f3427a.d(this);
                }
            } else if (aVar.f3423b) {
                if (d.i.isLoggable(Level.FINE)) {
                    w.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    w.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        b1.d.e(aVar, "task");
        c cVar = aVar.f3424c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3424c = this;
        }
        g gVar = this.f3427a.f3432a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3430e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    w.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            w.a(aVar, this, z2 ? "run again after ".concat(w.i(j3 - nanoTime)) : "scheduled after ".concat(w.i(j3 - nanoTime)));
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
        byte[] bArr = n1.b.f3319a;
        synchronized (this.f3427a) {
            this.f3429c = true;
            if (b()) {
                this.f3427a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3428b;
    }
}
