package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class si0 implements Runnable, Comparable, ec0 {
    private volatile Object _heap;
    public long m;
    public int n = -1;

    public si0(long j) {
        this.m = j;
    }

    @Override // defpackage.ec0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ng0 ng0Var = s93.j;
                if (obj == ng0Var) {
                    return;
                }
                ti0 ti0Var = obj instanceof ti0 ? (ti0) obj : null;
                if (ti0Var != null) {
                    synchronized (ti0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof fx2 ? (fx2) obj2 : null) != null) {
                            ti0Var.b(this.n);
                        }
                    }
                }
                this._heap = ng0Var;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, ti0 ti0Var, ui0 ui0Var) {
        synchronized (this) {
            if (this._heap == s93.j) {
                return 2;
            }
            synchronized (ti0Var) {
                try {
                    si0[] si0VarArr = ti0Var.a;
                    si0 si0Var = si0VarArr != null ? si0VarArr[0] : null;
                    if (ui0.u.get(ui0Var) != 0) {
                        return 1;
                    }
                    if (si0Var == null) {
                        ti0Var.c = j;
                    } else {
                        long j2 = si0Var.m;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - ti0Var.c > 0) {
                            ti0Var.c = j;
                        }
                    }
                    long j3 = this.m;
                    long j4 = ti0Var.c;
                    if (j3 - j4 < 0) {
                        this.m = j4;
                    }
                    ti0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.m - ((si0) obj).m;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(ti0 ti0Var) {
        if (this._heap != s93.j) {
            this._heap = ti0Var;
        } else {
            lh.e("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.m + ']';
    }
}
