package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j0 implements Runnable, Comparable, e0 {
    private volatile Object _heap;

    /* renamed from: d, reason: collision with root package name */
    public long f267d;

    /* renamed from: e, reason: collision with root package name */
    public int f268e = -1;

    public j0(long j7) {
        this.f267d = j7;
    }

    @Override // a7.e0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                d4.t tVar = x.f311b;
                if (obj == tVar) {
                    return;
                }
                k0 k0Var = obj instanceof k0 ? (k0) obj : null;
                if (k0Var != null) {
                    synchronized (k0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof f7.u ? (f7.u) obj2 : null) != null) {
                            k0Var.b(this.f268e);
                        }
                    }
                }
                this._heap = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j7, k0 k0Var, l0 l0Var) {
        synchronized (this) {
            if (this._heap == x.f311b) {
                return 2;
            }
            synchronized (k0Var) {
                try {
                    j0[] j0VarArr = k0Var.f2803a;
                    j0 j0Var = j0VarArr != null ? j0VarArr[0] : null;
                    if (l0.f273l.get(l0Var) != 0) {
                        return 1;
                    }
                    if (j0Var == null) {
                        k0Var.f269c = j7;
                    } else {
                        long j8 = j0Var.f267d;
                        if (j8 - j7 < 0) {
                            j7 = j8;
                        }
                        if (j7 - k0Var.f269c > 0) {
                            k0Var.f269c = j7;
                        }
                    }
                    long j9 = this.f267d;
                    long j10 = k0Var.f269c;
                    if (j9 - j10 < 0) {
                        this.f267d = j10;
                    }
                    k0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j7 = this.f267d - ((j0) obj).f267d;
        if (j7 > 0) {
            return 1;
        }
        return j7 < 0 ? -1 : 0;
    }

    public final void d(k0 k0Var) {
        if (this._heap == x.f311b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = k0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f267d + ']';
    }
}
