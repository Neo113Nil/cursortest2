package n1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import k0.y;
import l.C0229n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3286a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3287b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3288c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3289e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3290f;

    public c(d dVar, String str) {
        Z0.d.e(dVar, "taskRunner");
        Z0.d.e(str, "name");
        this.f3286a = dVar;
        this.f3287b = str;
        this.f3289e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = l1.b.f3252a;
        synchronized (this.f3286a) {
            if (b()) {
                this.f3286a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3282b) {
            this.f3290f = true;
        }
        ArrayList arrayList = this.f3289e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3282b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    y.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        Z0.d.e(aVar, "task");
        synchronized (this.f3286a) {
            if (!this.f3288c) {
                if (d(aVar, j2, false)) {
                    this.f3286a.d(this);
                }
            } else if (aVar.f3282b) {
                if (d.i.isLoggable(Level.FINE)) {
                    y.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    y.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        Z0.d.e(aVar, "task");
        c cVar = aVar.f3283c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3283c = this;
        }
        C0229n c0229n = this.f3286a.f3291a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3289e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    y.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            y.a(aVar, this, z2 ? "run again after ".concat(y.e(j3 - nanoTime)) : "scheduled after ".concat(y.e(j3 - nanoTime)));
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
        byte[] bArr = l1.b.f3252a;
        synchronized (this.f3286a) {
            this.f3288c = true;
            if (b()) {
                this.f3286a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3287b;
    }
}
