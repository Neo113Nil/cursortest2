package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jh0 {
    public final kh0 a;
    public final String b;
    public boolean c;
    public gh0 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public jh0(kh0 kh0Var, String str) {
        this.a = kh0Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = zk0.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        gh0 gh0Var = this.d;
        if (gh0Var != null && gh0Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((gh0) arrayList.get(size)).b) {
                gh0 gh0Var2 = (gh0) arrayList.get(size);
                if (kh0.i.isLoggable(Level.FINE)) {
                    zb0.a(gh0Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(gh0 gh0Var, long j) {
        gh0Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(gh0Var, j, false)) {
                    this.a.d(this);
                }
            } else if (gh0Var.b) {
                if (kh0.i.isLoggable(Level.FINE)) {
                    zb0.a(gh0Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (kh0.i.isLoggable(Level.FINE)) {
                    zb0.a(gh0Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(gh0 gh0Var, long j, boolean z) {
        gh0Var.getClass();
        jh0 jh0Var = gh0Var.c;
        if (jh0Var != this) {
            if (jh0Var != null) {
                s9.u("task is in multiple queues");
                return false;
            }
            gh0Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(gh0Var);
        if (indexOf != -1) {
            if (gh0Var.d <= j2) {
                if (kh0.i.isLoggable(Level.FINE)) {
                    zb0.a(gh0Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        gh0Var.d = j2;
        if (kh0.i.isLoggable(Level.FINE)) {
            zb0.a(gh0Var, this, z ? "run again after ".concat(zb0.g(j2 - nanoTime)) : "scheduled after ".concat(zb0.g(j2 - nanoTime)));
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
            if (((gh0) obj).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, gh0Var);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = zk0.a;
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
