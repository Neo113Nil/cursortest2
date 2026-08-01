package l1;

import X0.f;
import i1.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import l.C0274n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3518a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3519b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3520c;

    /* renamed from: d, reason: collision with root package name */
    public a f3521d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3522e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3523f;

    public c(d dVar, String str) {
        f.e(dVar, "taskRunner");
        f.e(str, "name");
        this.f3518a = dVar;
        this.f3519b = str;
        this.f3522e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = j1.b.f2967a;
        synchronized (this.f3518a) {
            if (b()) {
                this.f3518a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f3521d;
        if (aVar != null && aVar.f3513b) {
            this.f3523f = true;
        }
        ArrayList arrayList = this.f3522e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3513b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
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
        synchronized (this.f3518a) {
            if (!this.f3520c) {
                if (d(aVar, j2, false)) {
                    this.f3518a.d(this);
                }
            } else if (aVar.f3513b) {
                if (d.i.isLoggable(Level.FINE)) {
                    m.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    m.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        f.e(aVar, "task");
        c cVar = aVar.f3514c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3514c = this;
        }
        C0274n c0274n = this.f3518a.f3524a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3522e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f3515d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    m.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f3515d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            m.a(aVar, this, z2 ? "run again after ".concat(m.j(j3 - nanoTime)) : "scheduled after ".concat(m.j(j3 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).f3515d - nanoTime > j2) {
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
        byte[] bArr = j1.b.f2967a;
        synchronized (this.f3518a) {
            this.f3520c = true;
            if (b()) {
                this.f3518a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3519b;
    }
}
