package r1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import l.Z;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3514a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3515b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3516c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3517e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3518f;

    public c(d dVar, String str) {
        d1.d.e(dVar, "taskRunner");
        d1.d.e(str, "name");
        this.f3514a = dVar;
        this.f3515b = str;
        this.f3517e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = p1.b.f3455a;
        synchronized (this.f3514a) {
            if (b()) {
                this.f3514a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3510b) {
            this.f3518f = true;
        }
        ArrayList arrayList = this.f3517e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3510b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    h1.d.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        d1.d.e(aVar, "task");
        synchronized (this.f3514a) {
            if (!this.f3516c) {
                if (d(aVar, j2, false)) {
                    this.f3514a.d(this);
                }
            } else if (aVar.f3510b) {
                if (d.i.isLoggable(Level.FINE)) {
                    h1.d.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    h1.d.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        d1.d.e(aVar, "task");
        c cVar = aVar.f3511c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3511c = this;
        }
        Z z3 = this.f3514a.f3519a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3517e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    h1.d.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            h1.d.a(aVar, this, z2 ? "run again after ".concat(h1.d.g(j3 - nanoTime)) : "scheduled after ".concat(h1.d.g(j3 - nanoTime)));
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
        byte[] bArr = p1.b.f3455a;
        synchronized (this.f3514a) {
            this.f3516c = true;
            if (b()) {
                this.f3514a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3515b;
    }
}
