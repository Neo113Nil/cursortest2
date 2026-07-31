package J2;

import B.Y;
import O2.l;
import f2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f3191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3192b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3193c;

    /* renamed from: d, reason: collision with root package name */
    public a f3194d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3195e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3196f;

    public c(e eVar, String str) {
        j.f(eVar, "taskRunner");
        j.f(str, "name");
        this.f3191a = eVar;
        this.f3192b = str;
        this.f3195e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = H2.b.f2632a;
        synchronized (this.f3191a) {
            if (b()) {
                this.f3191a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f3194d;
        if (aVar != null && aVar.f3186b) {
            this.f3196f = true;
        }
        ArrayList arrayList = this.f3195e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3186b) {
                a aVar2 = (a) arrayList.get(size);
                if (e.f3200i.isLoggable(Level.FINE)) {
                    l.L(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void c(a aVar, long j3) {
        j.f(aVar, "task");
        synchronized (this.f3191a) {
            if (!this.f3193c) {
                if (d(aVar, j3, false)) {
                    this.f3191a.d(this);
                }
            } else if (aVar.f3186b) {
                if (e.f3200i.isLoggable(Level.FINE)) {
                    l.L(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f3200i.isLoggable(Level.FINE)) {
                    l.L(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j3, boolean z3) {
        j.f(aVar, "task");
        c cVar = aVar.f3187c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3187c = this;
        }
        Y y3 = this.f3191a.f3201a;
        long nanoTime = System.nanoTime();
        long j4 = nanoTime + j3;
        ArrayList arrayList = this.f3195e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f3188d <= j4) {
                if (e.f3200i.isLoggable(Level.FINE)) {
                    l.L(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f3188d = j4;
        if (e.f3200i.isLoggable(Level.FINE)) {
            l.L(aVar, this, z3 ? "run again after ".concat(l.b0(j4 - nanoTime)) : "scheduled after ".concat(l.b0(j4 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (((a) it.next()).f3188d - nanoTime > j3) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            i3 = arrayList.size();
        }
        arrayList.add(i3, aVar);
        return i3 == 0;
    }

    public final void e() {
        byte[] bArr = H2.b.f2632a;
        synchronized (this.f3191a) {
            this.f3193c = true;
            if (b()) {
                this.f3191a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3192b;
    }
}
