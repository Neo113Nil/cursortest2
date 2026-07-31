package D2;

import A2.g;
import M1.B;
import Z1.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f592a;

    /* renamed from: b, reason: collision with root package name */
    public final String f593b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f594c;

    /* renamed from: d, reason: collision with root package name */
    public a f595d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f596e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f597f;

    public c(e eVar, String str) {
        i.f(eVar, "taskRunner");
        i.f(str, "name");
        this.f592a = eVar;
        this.f593b = str;
        this.f596e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = B2.c.f415a;
        synchronized (this.f592a) {
            if (b()) {
                this.f592a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f595d;
        if (aVar != null && aVar.f587b) {
            this.f597f = true;
        }
        ArrayList arrayList = this.f596e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f587b) {
                a aVar2 = (a) arrayList.get(size);
                if (e.f601i.isLoggable(Level.FINE)) {
                    B.k(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void c(a aVar, long j3) {
        i.f(aVar, "task");
        synchronized (this.f592a) {
            if (!this.f594c) {
                if (d(aVar, j3, false)) {
                    this.f592a.d(this);
                }
            } else if (aVar.f587b) {
                if (e.f601i.isLoggable(Level.FINE)) {
                    B.k(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f601i.isLoggable(Level.FINE)) {
                    B.k(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j3, boolean z3) {
        i.f(aVar, "task");
        c cVar = aVar.f588c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f588c = this;
        }
        g gVar = this.f592a.f602a;
        long nanoTime = System.nanoTime();
        long j4 = nanoTime + j3;
        ArrayList arrayList = this.f596e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f589d <= j4) {
                if (e.f601i.isLoggable(Level.FINE)) {
                    B.k(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f589d = j4;
        if (e.f601i.isLoggable(Level.FINE)) {
            B.k(aVar, this, z3 ? "run again after ".concat(B.A(j4 - nanoTime)) : "scheduled after ".concat(B.A(j4 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (((a) it.next()).f589d - nanoTime > j3) {
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
        byte[] bArr = B2.c.f415a;
        synchronized (this.f592a) {
            this.f594c = true;
            if (b()) {
                this.f592a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f593b;
    }
}
