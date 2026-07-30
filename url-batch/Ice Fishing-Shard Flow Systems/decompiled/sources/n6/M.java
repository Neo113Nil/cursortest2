package n6;

import kotlin.Unit;
import l0.C0654a;

/* loaded from: classes.dex */
public abstract class M implements Runnable, Comparable, H {
    private volatile Object _heap;

    /* renamed from: d, reason: collision with root package name */
    public long f7020d;

    /* renamed from: e, reason: collision with root package name */
    public int f7021e = -1;

    public M(long j) {
        this.f7020d = j;
    }

    public final int a(long j, N n7, O o7) {
        synchronized (this) {
            if (this._heap == AbstractC0792z.f7096b) {
                return 2;
            }
            synchronized (n7) {
                try {
                    M[] mArr = n7.f7862a;
                    M m2 = mArr != null ? mArr[0] : null;
                    if (O.f7025q.get(o7) != 0) {
                        return 1;
                    }
                    if (m2 == null) {
                        n7.f7022c = j;
                    } else {
                        long j7 = m2.f7020d;
                        if (j7 - j < 0) {
                            j = j7;
                        }
                        if (j - n7.f7022c > 0) {
                            n7.f7022c = j;
                        }
                    }
                    long j8 = this.f7020d;
                    long j9 = n7.f7022c;
                    if (j8 - j9 < 0) {
                        this.f7020d = j9;
                    }
                    n7.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(N n7) {
        if (this._heap == AbstractC0792z.f7096b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = n7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f7020d - ((M) obj).f7020d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // n6.H
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0654a c0654a = AbstractC0792z.f7096b;
                if (obj == c0654a) {
                    return;
                }
                N n7 = obj instanceof N ? (N) obj : null;
                if (n7 != null) {
                    synchronized (n7) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof s6.v ? (s6.v) obj2 : null) != null) {
                            n7.b(this.f7021e);
                        }
                    }
                }
                this._heap = c0654a;
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f7020d + ']';
    }
}
