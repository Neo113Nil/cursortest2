package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nt2 {
    public final pt2 a;
    public final String b;
    public boolean c;
    public it2 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public nt2(pt2 pt2Var, String str) {
        this.a = pt2Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = n33.a;
        synchronized (this.a) {
            try {
                if (b()) {
                    this.a.d(this);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        it2 it2Var = this.d;
        if (it2Var != null && it2Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((it2) arrayList.get(size)).b) {
                it2 it2Var2 = (it2) arrayList.get(size);
                pt2 pt2Var = pt2.h;
                if (pt2.i.isLoggable(Level.FINE)) {
                    ci2.b(it2Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(it2 it2Var, long j) {
        it2Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(it2Var, j, false)) {
                    this.a.d(this);
                }
                Unit unit = Unit.a;
            } else if (it2Var.b) {
                pt2 pt2Var = pt2.h;
                if (pt2.i.isLoggable(Level.FINE)) {
                    ci2.b(it2Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                pt2 pt2Var2 = pt2.h;
                if (pt2.i.isLoggable(Level.FINE)) {
                    ci2.b(it2Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(it2 it2Var, long j, boolean z) {
        it2Var.getClass();
        nt2 nt2Var = it2Var.c;
        if (nt2Var != this) {
            if (nt2Var != null) {
                lh.g("task is in multiple queues");
                return false;
            }
            it2Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(it2Var);
        if (indexOf != -1) {
            if (it2Var.d <= j2) {
                pt2 pt2Var = pt2.h;
                if (pt2.i.isLoggable(Level.FINE)) {
                    ci2.b(it2Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        it2Var.d = j2;
        pt2 pt2Var2 = pt2.h;
        if (pt2.i.isLoggable(Level.FINE)) {
            ci2.b(it2Var, this, z ? "run again after ".concat(ci2.c(j2 - nanoTime)) : "scheduled after ".concat(ci2.c(j2 - nanoTime)));
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
            if (((it2) obj).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, it2Var);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = n33.a;
        synchronized (this.a) {
            try {
                this.c = true;
                if (b()) {
                    this.a.d(this);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
