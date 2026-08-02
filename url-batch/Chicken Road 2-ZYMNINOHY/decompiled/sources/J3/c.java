package J3;

import a.AbstractC0124a;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f1202a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1203b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1204c;

    /* renamed from: d, reason: collision with root package name */
    public a f1205d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1206e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1207f;

    public c(d dVar, String name) {
        i.e(name, "name");
        this.f1202a = dVar;
        this.f1203b = name;
        this.f1206e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = H3.b.f1103a;
        synchronized (this.f1202a) {
            if (b()) {
                this.f1202a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f1205d;
        if (aVar != null && aVar.f1197b) {
            this.f1207f = true;
        }
        ArrayList arrayList = this.f1206e;
        int size = arrayList.size() - 1;
        boolean z = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i4 = size - 1;
            if (((a) arrayList.get(size)).f1197b) {
                a aVar2 = (a) arrayList.get(size);
                a2.i iVar = d.f1208h;
                if (d.f1210j.isLoggable(Level.FINE)) {
                    AbstractC0124a.b(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
            if (i4 < 0) {
                return z;
            }
            size = i4;
        }
    }

    public final void c(a task, long j4) {
        i.e(task, "task");
        synchronized (this.f1202a) {
            if (!this.f1204c) {
                if (d(task, j4, false)) {
                    this.f1202a.d(this);
                }
            } else if (task.f1197b) {
                a2.i iVar = d.f1208h;
                if (d.f1210j.isLoggable(Level.FINE)) {
                    AbstractC0124a.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                a2.i iVar2 = d.f1208h;
                if (d.f1210j.isLoggable(Level.FINE)) {
                    AbstractC0124a.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a task, long j4, boolean z) {
        i.e(task, "task");
        c cVar = task.f1198c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f1198c = this;
        }
        long nanoTime = System.nanoTime();
        long j5 = nanoTime + j4;
        ArrayList arrayList = this.f1206e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f1199d <= j5) {
                a2.i iVar = d.f1208h;
                if (d.f1210j.isLoggable(Level.FINE)) {
                    AbstractC0124a.b(task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f1199d = j5;
        a2.i iVar2 = d.f1208h;
        if (d.f1210j.isLoggable(Level.FINE)) {
            AbstractC0124a.b(task, this, z ? i.h(AbstractC0124a.w(j5 - nanoTime), "run again after ") : i.h(AbstractC0124a.w(j5 - nanoTime), "scheduled after "));
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
            if (((a) obj).f1199d - nanoTime > j4) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = arrayList.size();
        }
        arrayList.add(i4, task);
        return i4 == 0;
    }

    public final void e() {
        byte[] bArr = H3.b.f1103a;
        synchronized (this.f1202a) {
            this.f1204c = true;
            if (b()) {
                this.f1202a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f1203b;
    }
}
