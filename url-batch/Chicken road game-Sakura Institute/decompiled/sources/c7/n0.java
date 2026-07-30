package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class n0 implements Runnable, Comparable, i0 {
    private volatile Object _heap;

    /* renamed from: f, reason: collision with root package name */
    public long f1716f;

    /* renamed from: g, reason: collision with root package name */
    public int f1717g = -1;

    public n0(long j8) {
        this.f1716f = j8;
    }

    @Override // c7.i0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                h7.s sVar = a0.f1661b;
                if (obj == sVar) {
                    return;
                }
                o0 o0Var = obj instanceof o0 ? (o0) obj : null;
                if (o0Var != null) {
                    synchronized (o0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof h7.u ? (h7.u) obj2 : null) != null) {
                            o0Var.b(this.f1717g);
                        }
                    }
                }
                this._heap = sVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j8 = this.f1716f - ((n0) obj).f1716f;
        if (j8 > 0) {
            return 1;
        }
        return j8 < 0 ? -1 : 0;
    }

    public final int g(long j8, o0 o0Var, p0 p0Var) {
        synchronized (this) {
            if (this._heap == a0.f1661b) {
                return 2;
            }
            synchronized (o0Var) {
                try {
                    n0[] n0VarArr = o0Var.f4710a;
                    n0 n0Var = n0VarArr != null ? n0VarArr[0] : null;
                    if (p0.f1728n.get(p0Var) != 0) {
                        return 1;
                    }
                    if (n0Var == null) {
                        o0Var.f1723c = j8;
                    } else {
                        long j9 = n0Var.f1716f;
                        if (j9 - j8 < 0) {
                            j8 = j9;
                        }
                        if (j8 - o0Var.f1723c > 0) {
                            o0Var.f1723c = j8;
                        }
                    }
                    long j10 = this.f1716f;
                    long j11 = o0Var.f1723c;
                    if (j10 - j11 < 0) {
                        this.f1716f = j11;
                    }
                    o0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h(o0 o0Var) {
        if (this._heap == a0.f1661b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = o0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1716f + ']';
    }
}
