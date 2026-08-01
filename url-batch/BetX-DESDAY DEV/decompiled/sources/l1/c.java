package l1;

import X0.f;
import i1.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f3521a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3522b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3523c;

    /* renamed from: d, reason: collision with root package name */
    public a f3524d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3525e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3526f;

    public c(e eVar, String str) {
        f.e(eVar, "taskRunner");
        f.e(str, "name");
        this.f3521a = eVar;
        this.f3522b = str;
        this.f3525e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = j1.b.f2971a;
        synchronized (this.f3521a) {
            if (b()) {
                this.f3521a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f3524d;
        if (aVar != null && aVar.f3516b) {
            this.f3526f = true;
        }
        ArrayList arrayList = this.f3525e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3516b) {
                a aVar2 = (a) arrayList.get(size);
                if (e.i.isLoggable(Level.FINE)) {
                    m.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        f.e(aVar, "task");
        synchronized (this.f3521a) {
            if (!this.f3523c) {
                if (d(aVar, j2, false)) {
                    this.f3521a.d(this);
                }
            } else if (aVar.f3516b) {
                if (e.i.isLoggable(Level.FINE)) {
                    m.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.i.isLoggable(Level.FINE)) {
                    m.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        f.e(aVar, "task");
        c cVar = aVar.f3517c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3517c = this;
        }
        d dVar = this.f3521a.f3528a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3525e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f3518d <= j3) {
                if (e.i.isLoggable(Level.FINE)) {
                    m.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f3518d = j3;
        if (e.i.isLoggable(Level.FINE)) {
            m.a(aVar, this, z2 ? "run again after ".concat(m.j(j3 - nanoTime)) : "scheduled after ".concat(m.j(j3 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).f3518d - nanoTime > j2) {
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
        byte[] bArr = j1.b.f2971a;
        synchronized (this.f3521a) {
            this.f3523c = true;
            if (b()) {
                this.f3521a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3522b;
    }
}
