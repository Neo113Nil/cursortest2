package C1;

import j1.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f f138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f140c;

    /* renamed from: d, reason: collision with root package name */
    public a f141d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f142f;

    public c(f fVar, String str) {
        h.e(fVar, "taskRunner");
        h.e(str, "name");
        this.f138a = fVar;
        this.f139b = str;
        this.e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = A1.c.f19a;
        synchronized (this.f138a) {
            if (b()) {
                this.f138a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f141d;
        if (aVar != null && aVar.f134b) {
            this.f142f = true;
        }
        ArrayList arrayList = this.e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f134b) {
                a aVar2 = (a) arrayList.get(size);
                if (f.i.isLoggable(Level.FINE)) {
                    H1.d.h(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j) {
        h.e(aVar, "task");
        synchronized (this.f138a) {
            if (!this.f140c) {
                if (d(aVar, j, false)) {
                    this.f138a.d(this);
                }
            } else if (aVar.f134b) {
                if (f.i.isLoggable(Level.FINE)) {
                    H1.d.h(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (f.i.isLoggable(Level.FINE)) {
                    H1.d.h(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j, boolean z2) {
        h.e(aVar, "task");
        c cVar = aVar.f135c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f135c = this;
        }
        d dVar = this.f138a.f149a;
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f136d <= j2) {
                if (f.i.isLoggable(Level.FINE)) {
                    H1.d.h(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f136d = j2;
        if (f.i.isLoggable(Level.FINE)) {
            H1.d.h(aVar, this, z2 ? "run again after ".concat(H1.d.A(j2 - nanoTime)) : "scheduled after ".concat(H1.d.A(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).f136d - nanoTime > j) {
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
        byte[] bArr = A1.c.f19a;
        synchronized (this.f138a) {
            this.f140c = true;
            if (b()) {
                this.f138a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f139b;
    }
}
