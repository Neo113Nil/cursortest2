package H5;

/* loaded from: classes.dex */
public abstract class M implements Runnable, Comparable, H {
    private volatile Object _heap;

    /* renamed from: f, reason: collision with root package name */
    public long f1037f;

    /* renamed from: g, reason: collision with root package name */
    public int f1038g = -1;

    public M(long j4) {
        this.f1037f = j4;
    }

    public final int a(long j4, N n7, O o7) {
        synchronized (this) {
            if (this._heap == AbstractC0165z.f1115b) {
                return 2;
            }
            synchronized (n7) {
                try {
                    M[] mArr = n7.f1632a;
                    M m4 = mArr != null ? mArr[0] : null;
                    if (O.f1042n.get(o7) != 0) {
                        return 1;
                    }
                    if (m4 == null) {
                        n7.f1039c = j4;
                    } else {
                        long j7 = m4.f1037f;
                        if (j7 - j4 < 0) {
                            j4 = j7;
                        }
                        if (j4 - n7.f1039c > 0) {
                            n7.f1039c = j4;
                        }
                    }
                    long j8 = this.f1037f;
                    long j9 = n7.f1039c;
                    if (j8 - j9 < 0) {
                        this.f1037f = j9;
                    }
                    n7.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // H5.H
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                M5.v vVar = AbstractC0165z.f1115b;
                if (obj == vVar) {
                    return;
                }
                N n7 = obj instanceof N ? (N) obj : null;
                if (n7 != null) {
                    synchronized (n7) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof M5.y ? (M5.y) obj2 : null) != null) {
                            n7.b(this.f1038g);
                        }
                    }
                }
                this._heap = vVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = this.f1037f - ((M) obj).f1037f;
        if (j4 > 0) {
            return 1;
        }
        return j4 < 0 ? -1 : 0;
    }

    public final void d(N n7) {
        if (this._heap == AbstractC0165z.f1115b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = n7;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1037f + ']';
    }
}
