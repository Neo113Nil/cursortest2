package v1;

import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import m.C0202a0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3962a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3963b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3964c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3965e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3966f;

    public c(d dVar, String str) {
        h1.d.e(dVar, "taskRunner");
        h1.d.e(str, "name");
        this.f3962a = dVar;
        this.f3963b = str;
        this.f3965e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = t1.b.f3898a;
        synchronized (this.f3962a) {
            if (b()) {
                this.f3962a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3958b) {
            this.f3966f = true;
        }
        ArrayList arrayList = this.f3965e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3958b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0112a.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        h1.d.e(aVar, "task");
        synchronized (this.f3962a) {
            if (!this.f3964c) {
                if (d(aVar, j2, false)) {
                    this.f3962a.d(this);
                }
            } else if (aVar.f3958b) {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0112a.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0112a.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        h1.d.e(aVar, "task");
        c cVar = aVar.f3959c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3959c = this;
        }
        C0202a0 c0202a0 = this.f3962a.f3968a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3965e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    AbstractC0112a.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            AbstractC0112a.a(aVar, this, z2 ? "run again after ".concat(AbstractC0112a.j(j3 - nanoTime)) : "scheduled after ".concat(AbstractC0112a.j(j3 - nanoTime)));
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
        byte[] bArr = t1.b.f3898a;
        synchronized (this.f3962a) {
            this.f3964c = true;
            if (b()) {
                this.f3962a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3963b;
    }
}
