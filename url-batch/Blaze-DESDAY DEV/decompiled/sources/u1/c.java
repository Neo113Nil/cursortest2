package u1;

import i0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3781a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3782b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3783c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3784e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3785f;

    public c(d dVar, String str) {
        g1.d.e(dVar, "taskRunner");
        g1.d.e(str, "name");
        this.f3781a = dVar;
        this.f3782b = str;
        this.f3784e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = s1.b.f3721a;
        synchronized (this.f3781a) {
            if (b()) {
                this.f3781a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3777b) {
            this.f3785f = true;
        }
        ArrayList arrayList = this.f3784e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3777b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    g.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        g1.d.e(aVar, "task");
        synchronized (this.f3781a) {
            if (!this.f3783c) {
                if (d(aVar, j2, false)) {
                    this.f3781a.d(this);
                }
            } else if (aVar.f3777b) {
                if (d.i.isLoggable(Level.FINE)) {
                    g.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    g.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        g1.d.e(aVar, "task");
        c cVar = aVar.f3778c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3778c = this;
        }
        r1.g gVar = this.f3781a.f3786a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3784e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    g.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            g.a(aVar, this, z2 ? "run again after ".concat(g.j(j3 - nanoTime)) : "scheduled after ".concat(g.j(j3 - nanoTime)));
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
        byte[] bArr = s1.b.f3721a;
        synchronized (this.f3781a) {
            this.f3783c = true;
            if (b()) {
                this.f3781a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3782b;
    }
}
