package C1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import k1.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f114b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f115c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f116e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f117f;

    public c(d dVar, String str) {
        e.e(dVar, "taskRunner");
        e.e(str, "name");
        this.f113a = dVar;
        this.f114b = str;
        this.f116e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = A1.c.f13a;
        synchronized (this.f113a) {
            if (b()) {
                this.f113a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f109b) {
            this.f117f = true;
        }
        ArrayList arrayList = this.f116e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f109b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    H1.d.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        e.e(aVar, "task");
        synchronized (this.f113a) {
            if (!this.f115c) {
                if (d(aVar, j2, false)) {
                    this.f113a.d(this);
                }
            } else if (aVar.f109b) {
                if (d.i.isLoggable(Level.FINE)) {
                    H1.d.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    H1.d.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        e.e(aVar, "task");
        c cVar = aVar.f110c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f110c = this;
        }
        A0.c cVar2 = this.f113a.f118a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f116e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    H1.d.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            H1.d.a(aVar, this, z2 ? "run again after ".concat(H1.d.y(j3 - nanoTime)) : "scheduled after ".concat(H1.d.y(j3 - nanoTime)));
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
        byte[] bArr = A1.c.f13a;
        synchronized (this.f113a) {
            this.f115c = true;
            if (b()) {
                this.f113a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f114b;
    }
}
