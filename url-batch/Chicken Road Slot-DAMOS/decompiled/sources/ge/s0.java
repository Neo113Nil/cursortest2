package ge;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class s0 implements Runnable, Comparable, m0 {
    private volatile Object _heap;

    /* renamed from: d, reason: collision with root package name */
    public long f4398d;

    /* renamed from: e, reason: collision with root package name */
    public int f4399e = -1;

    public s0(long j) {
        this.f4398d = j;
    }

    @Override // ge.m0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                a8.f fVar = a0.f4324b;
                if (obj == fVar) {
                    return;
                }
                t0 t0Var = obj instanceof t0 ? (t0) obj : null;
                if (t0Var != null) {
                    synchronized (t0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof le.y ? (le.y) obj2 : null) != null) {
                            t0Var.b(this.f4399e);
                        }
                    }
                }
                this._heap = fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, t0 t0Var, u0 u0Var) {
        synchronized (this) {
            if (this._heap == a0.f4324b) {
                return 2;
            }
            synchronized (t0Var) {
                try {
                    s0[] s0VarArr = t0Var.f6011a;
                    s0 s0Var = s0VarArr != null ? s0VarArr[0] : null;
                    if (u0.f4406w.get(u0Var) == 1) {
                        return 1;
                    }
                    if (s0Var == null) {
                        t0Var.f4401c = j;
                    } else {
                        long j3 = s0Var.f4398d;
                        if (j3 - j < 0) {
                            j = j3;
                        }
                        if (j - t0Var.f4401c > 0) {
                            t0Var.f4401c = j;
                        }
                    }
                    long j10 = this.f4398d;
                    long j11 = t0Var.f4401c;
                    if (j10 - j11 < 0) {
                        this.f4398d = j11;
                    }
                    t0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f4398d - ((s0) obj).f4398d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(t0 t0Var) {
        if (this._heap != a0.f4324b) {
            this._heap = t0Var;
        } else {
            te.a1.e("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4398d + ']';
    }
}
