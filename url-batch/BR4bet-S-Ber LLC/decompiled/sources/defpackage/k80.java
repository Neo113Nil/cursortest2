package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class k80 {
    public final l80 a;
    public final String b;
    public boolean c;
    public h80 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public k80(l80 l80Var, String str) {
        this.a = l80Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = cb0.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        h80 h80Var = this.d;
        if (h80Var != null && h80Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((h80) arrayList.get(size)).b) {
                h80 h80Var2 = (h80) arrayList.get(size);
                if (l80.i.isLoggable(Level.FINE)) {
                    la0.c(h80Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(h80 h80Var, long j) {
        h80Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(h80Var, j, false)) {
                    this.a.d(this);
                }
            } else if (h80Var.b) {
                if (l80.i.isLoggable(Level.FINE)) {
                    la0.c(h80Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (l80.i.isLoggable(Level.FINE)) {
                    la0.c(h80Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(h80 h80Var, long j, boolean z) {
        h80Var.getClass();
        k80 k80Var = h80Var.c;
        if (k80Var != this) {
            if (k80Var != null) {
                g9.s("task is in multiple queues");
                return false;
            }
            h80Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(h80Var);
        if (indexOf != -1) {
            if (h80Var.d <= j2) {
                if (l80.i.isLoggable(Level.FINE)) {
                    la0.c(h80Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        h80Var.d = j2;
        if (l80.i.isLoggable(Level.FINE)) {
            la0.c(h80Var, this, z ? "run again after ".concat(la0.u(j2 - nanoTime)) : "scheduled after ".concat(la0.u(j2 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((h80) obj).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, h80Var);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = cb0.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
