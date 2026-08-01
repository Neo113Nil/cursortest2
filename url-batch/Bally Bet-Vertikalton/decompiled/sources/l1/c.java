package l1;

import i1.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import l.C0249n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3161b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3162c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3163e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3164f;

    public c(d dVar, String str) {
        X0.d.e(dVar, "taskRunner");
        X0.d.e(str, "name");
        this.f3160a = dVar;
        this.f3161b = str;
        this.f3163e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = j1.b.f2587a;
        synchronized (this.f3160a) {
            if (b()) {
                this.f3160a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3156b) {
            this.f3164f = true;
        }
        ArrayList arrayList = this.f3163e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3156b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    r.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        X0.d.e(aVar, "task");
        synchronized (this.f3160a) {
            if (!this.f3162c) {
                if (d(aVar, j2, false)) {
                    this.f3160a.d(this);
                }
            } else if (aVar.f3156b) {
                if (d.i.isLoggable(Level.FINE)) {
                    r.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    r.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        X0.d.e(aVar, "task");
        c cVar = aVar.f3157c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3157c = this;
        }
        C0249n c0249n = this.f3160a.f3165a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3163e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    r.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            r.a(aVar, this, z2 ? "run again after ".concat(r.g(j3 - nanoTime)) : "scheduled after ".concat(r.g(j3 - nanoTime)));
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
        byte[] bArr = j1.b.f2587a;
        synchronized (this.f3160a) {
            this.f3162c = true;
            if (b()) {
                this.f3160a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3161b;
    }
}
