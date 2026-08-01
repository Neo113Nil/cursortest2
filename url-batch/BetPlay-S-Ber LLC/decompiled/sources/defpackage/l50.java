package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class l50 {
    public final m50 a;
    public final String b;
    public boolean c;
    public k50 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public l50(m50 m50Var, String str) {
        this.a = m50Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = y70.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        k50 k50Var = this.d;
        if (k50Var != null && k50Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((k50) arrayList.get(size)).b) {
                k50 k50Var2 = (k50) arrayList.get(size);
                if (m50.i.isLoggable(Level.FINE)) {
                    vw.d(k50Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(k50 k50Var, long j) {
        k50Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(k50Var, j, false)) {
                    this.a.d(this);
                }
            } else if (k50Var.b) {
                if (m50.i.isLoggable(Level.FINE)) {
                    vw.d(k50Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (m50.i.isLoggable(Level.FINE)) {
                    vw.d(k50Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(k50 k50Var, long j, boolean z) {
        k50Var.getClass();
        l50 l50Var = k50Var.c;
        if (l50Var != this) {
            if (l50Var != null) {
                o8.t("task is in multiple queues");
                return false;
            }
            k50Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(k50Var);
        if (indexOf != -1) {
            if (k50Var.d <= j2) {
                if (m50.i.isLoggable(Level.FINE)) {
                    vw.d(k50Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        k50Var.d = j2;
        if (m50.i.isLoggable(Level.FINE)) {
            vw.d(k50Var, this, z ? "run again after ".concat(vw.x(j2 - nanoTime)) : "scheduled after ".concat(vw.x(j2 - nanoTime)));
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
            if (((k50) obj).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, k50Var);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = y70.a;
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
