package s1;

import j0.AbstractC0142a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p1.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3672b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3673c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3674e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3675f;

    public c(d dVar, String str) {
        e1.d.e(dVar, "taskRunner");
        e1.d.e(str, "name");
        this.f3671a = dVar;
        this.f3672b = str;
        this.f3674e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = q1.b.f3491a;
        synchronized (this.f3671a) {
            if (b()) {
                this.f3671a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3667b) {
            this.f3675f = true;
        }
        ArrayList arrayList = this.f3674e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3667b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0142a.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        e1.d.e(aVar, "task");
        synchronized (this.f3671a) {
            if (!this.f3673c) {
                if (d(aVar, j2, false)) {
                    this.f3671a.d(this);
                }
            } else if (aVar.f3667b) {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0142a.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0142a.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        e1.d.e(aVar, "task");
        c cVar = aVar.f3668c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3668c = this;
        }
        g gVar = this.f3671a.f3676a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3674e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0142a.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            AbstractC0142a.a(aVar, this, z2 ? "run again after ".concat(AbstractC0142a.h(j3 - nanoTime)) : "scheduled after ".concat(AbstractC0142a.h(j3 - nanoTime)));
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
        byte[] bArr = q1.b.f3491a;
        synchronized (this.f3671a) {
            this.f3673c = true;
            if (b()) {
                this.f3671a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3672b;
    }
}
