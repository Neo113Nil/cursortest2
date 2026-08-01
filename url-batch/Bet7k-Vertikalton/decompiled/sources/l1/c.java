package l1;

import i1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import l.C0242k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3177b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3178c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3179e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3180f;

    public c(d dVar, String str) {
        X0.d.e(dVar, "taskRunner");
        X0.d.e(str, "name");
        this.f3176a = dVar;
        this.f3177b = str;
        this.f3179e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = j1.b.f2603a;
        synchronized (this.f3176a) {
            if (b()) {
                this.f3176a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3172b) {
            this.f3180f = true;
        }
        ArrayList arrayList = this.f3179e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3172b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    s.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        X0.d.e(aVar, "task");
        synchronized (this.f3176a) {
            if (!this.f3178c) {
                if (d(aVar, j2, false)) {
                    this.f3176a.d(this);
                }
            } else if (aVar.f3172b) {
                if (d.i.isLoggable(Level.FINE)) {
                    s.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    s.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        X0.d.e(aVar, "task");
        c cVar = aVar.f3173c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3173c = this;
        }
        C0242k c0242k = this.f3176a.f3181a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3179e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    s.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            s.a(aVar, this, z2 ? "run again after ".concat(s.g(j3 - nanoTime)) : "scheduled after ".concat(s.g(j3 - nanoTime)));
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
        byte[] bArr = j1.b.f2603a;
        synchronized (this.f3176a) {
            this.f3178c = true;
            if (b()) {
                this.f3176a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3177b;
    }
}
