package v7;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import r6.k;
import u3.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f9165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9166b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9167c;

    /* renamed from: d, reason: collision with root package name */
    public a f9168d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9169e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9170f;

    public c(d dVar, String str) {
        k.f(str, "name");
        this.f9165a = dVar;
        this.f9166b = str;
        this.f9169e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = t7.b.f8932a;
        synchronized (this.f9165a) {
            if (b()) {
                this.f9165a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f9168d;
        if (aVar != null && aVar.f9160b) {
            this.f9170f = true;
        }
        ArrayList arrayList = this.f9169e;
        boolean z8 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f9160b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.f9172i.isLoggable(Level.FINE)) {
                    z.d(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z8 = true;
            }
        }
        return z8;
    }

    public final void c(a aVar, long j8) {
        k.f(aVar, "task");
        synchronized (this.f9165a) {
            if (!this.f9167c) {
                if (d(aVar, j8, false)) {
                    this.f9165a.d(this);
                }
            } else if (aVar.f9160b) {
                if (d.f9172i.isLoggable(Level.FINE)) {
                    z.d(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.f9172i.isLoggable(Level.FINE)) {
                    z.d(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j8, boolean z8) {
        k.f(aVar, "task");
        c cVar = aVar.f9161c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f9161c = this;
        }
        long nanoTime = System.nanoTime();
        long j9 = nanoTime + j8;
        ArrayList arrayList = this.f9169e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f9162d <= j9) {
                if (d.f9172i.isLoggable(Level.FINE)) {
                    z.d(aVar, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        aVar.f9162d = j9;
        if (d.f9172i.isLoggable(Level.FINE)) {
            z.d(aVar, this, z8 ? "run again after ".concat(z.h(j9 - nanoTime)) : "scheduled after ".concat(z.h(j9 - nanoTime)));
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i7 = -1;
                break;
            }
            Object obj = arrayList.get(i8);
            i8++;
            if (((a) obj).f9162d - nanoTime > j8) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            i7 = arrayList.size();
        }
        arrayList.add(i7, aVar);
        return i7 == 0;
    }

    public final void e() {
        byte[] bArr = t7.b.f8932a;
        synchronized (this.f9165a) {
            this.f9167c = true;
            if (b()) {
                this.f9165a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f9166b;
    }
}
