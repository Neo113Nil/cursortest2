package w3;

import i3.d;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f3825a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3826b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3827c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3828e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3829f;

    public b(c cVar, String str) {
        d.e(str, "name");
        this.f3825a = cVar;
        this.f3826b = str;
        this.f3828e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = u3.b.f3581a;
        synchronized (this.f3825a) {
            if (b()) {
                this.f3825a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3823b) {
            this.f3829f = true;
        }
        ArrayList arrayList = this.f3828e;
        boolean z4 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3823b) {
                a aVar2 = (a) arrayList.get(size);
                if (c.i.isLoggable(Level.FINE)) {
                    s.a.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    public final void c(a aVar, long j2) {
        d.e(aVar, "task");
        synchronized (this.f3825a) {
            if (!this.f3827c) {
                if (d(aVar, j2, false)) {
                    this.f3825a.d(this);
                }
            } else if (aVar.f3823b) {
                if (c.i.isLoggable(Level.FINE)) {
                    s.a.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (c.i.isLoggable(Level.FINE)) {
                    s.a.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z4) {
        d.e(aVar, "task");
        b bVar = aVar.f3824c;
        if (bVar != this) {
            if (bVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3824c = this;
        }
        long nanoTime = System.nanoTime();
        long j4 = nanoTime + j2;
        ArrayList arrayList = this.f3828e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j4) {
                if (c.i.isLoggable(Level.FINE)) {
                    s.a.a(aVar, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j4;
        if (c.i.isLoggable(Level.FINE)) {
            s.a.a(aVar, this, z4 ? "run again after ".concat(s.a.k(j4 - nanoTime)) : "scheduled after ".concat(s.a.k(j4 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            if (((a) obj).d - nanoTime > j2) {
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
        byte[] bArr = u3.b.f3581a;
        synchronized (this.f3825a) {
            this.f3827c = true;
            if (b()) {
                this.f3825a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3826b;
    }
}
