package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class e50 {
    public final f50 a;
    public final String b;
    public boolean c;
    public d50 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public e50(f50 f50Var, String str) {
        this.a = f50Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = r70.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        d50 d50Var = this.d;
        if (d50Var != null && d50Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((d50) arrayList.get(size)).b) {
                d50 d50Var2 = (d50) arrayList.get(size);
                if (f50.i.isLoggable(Level.FINE)) {
                    o8.b(d50Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(d50 d50Var, long j) {
        d50Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(d50Var, j, false)) {
                    this.a.d(this);
                }
            } else if (d50Var.b) {
                if (f50.i.isLoggable(Level.FINE)) {
                    o8.b(d50Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (f50.i.isLoggable(Level.FINE)) {
                    o8.b(d50Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(d50 d50Var, long j, boolean z) {
        d50Var.getClass();
        e50 e50Var = d50Var.c;
        if (e50Var != this) {
            if (e50Var != null) {
                t8.t("task is in multiple queues");
                return false;
            }
            d50Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(d50Var);
        if (indexOf != -1) {
            if (d50Var.d <= j2) {
                if (f50.i.isLoggable(Level.FINE)) {
                    o8.b(d50Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        d50Var.d = j2;
        if (f50.i.isLoggable(Level.FINE)) {
            o8.b(d50Var, this, z ? "run again after ".concat(o8.t(j2 - nanoTime)) : "scheduled after ".concat(o8.t(j2 - nanoTime)));
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
            if (((d50) obj).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, d50Var);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = r70.a;
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
