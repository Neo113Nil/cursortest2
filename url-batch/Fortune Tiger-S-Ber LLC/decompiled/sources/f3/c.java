package f3;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f1742a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1743b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public a f1744d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1745e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1746f;

    public c(d dVar, String str) {
        u2.c.e(str, "name");
        this.f1742a = dVar;
        this.f1743b = str;
        this.f1745e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = d3.c.f1490a;
        synchronized (this.f1742a) {
            if (b()) {
                this.f1742a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f1744d;
        if (aVar != null && aVar.f1738b) {
            this.f1746f = true;
        }
        ArrayList arrayList = this.f1745e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f1738b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.f1747i.isLoggable(Level.FINE)) {
                    k3.d.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void c(a aVar, long j4) {
        u2.c.e(aVar, "task");
        synchronized (this.f1742a) {
            if (!this.c) {
                if (d(aVar, j4, false)) {
                    this.f1742a.d(this);
                }
            } else if (aVar.f1738b) {
                if (d.f1747i.isLoggable(Level.FINE)) {
                    k3.d.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.f1747i.isLoggable(Level.FINE)) {
                    k3.d.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j4, boolean z3) {
        u2.c.e(aVar, "task");
        c cVar = aVar.c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.c = this;
        }
        long nanoTime = System.nanoTime();
        long j5 = nanoTime + j4;
        ArrayList arrayList = this.f1745e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f1739d <= j5) {
                if (d.f1747i.isLoggable(Level.FINE)) {
                    k3.d.a(aVar, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        aVar.f1739d = j5;
        if (d.f1747i.isLoggable(Level.FINE)) {
            k3.d.a(aVar, this, z3 ? "run again after ".concat(k3.d.B(j5 - nanoTime)) : "scheduled after ".concat(k3.d.B(j5 - nanoTime)));
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i4 = -1;
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            if (((a) obj).f1739d - nanoTime > j4) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = arrayList.size();
        }
        arrayList.add(i4, aVar);
        return i4 == 0;
    }

    public final void e() {
        byte[] bArr = d3.c.f1490a;
        synchronized (this.f1742a) {
            this.c = true;
            if (b()) {
                this.f1742a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f1743b;
    }
}
