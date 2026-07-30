package O7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class M implements Runnable, Comparable, H {
    private volatile Object _heap;

    /* renamed from: n, reason: collision with root package name */
    public long f2561n;

    /* renamed from: u, reason: collision with root package name */
    public int f2562u = -1;

    public M(long j9) {
        this.f2561n = j9;
    }

    @Override // O7.H
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                T7.v vVar = AbstractC0399y.f2644b;
                if (obj == vVar) {
                    return;
                }
                N n9 = obj instanceof N ? (N) obj : null;
                if (n9 != null) {
                    synchronized (n9) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof T7.y ? (T7.y) obj2 : null) != null) {
                            n9.b(this.f2562u);
                        }
                    }
                }
                this._heap = vVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j9, N n9, O o9) {
        synchronized (this) {
            if (this._heap == AbstractC0399y.f2644b) {
                return 2;
            }
            synchronized (n9) {
                try {
                    M[] mArr = n9.f3177a;
                    M m8 = mArr != null ? mArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O.f2566z;
                    o9.getClass();
                    if (O.f2565B.get(o9) != 0) {
                        return 1;
                    }
                    if (m8 == null) {
                        n9.f2563c = j9;
                    } else {
                        long j10 = m8.f2561n;
                        if (j10 - j9 < 0) {
                            j9 = j10;
                        }
                        if (j9 - n9.f2563c > 0) {
                            n9.f2563c = j9;
                        }
                    }
                    long j11 = this.f2561n;
                    long j12 = n9.f2563c;
                    if (j11 - j12 < 0) {
                        this.f2561n = j12;
                    }
                    n9.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j9 = this.f2561n - ((M) obj).f2561n;
        if (j9 > 0) {
            return 1;
        }
        return j9 < 0 ? -1 : 0;
    }

    public final void d(N n9) {
        if (this._heap == AbstractC0399y.f2644b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = n9;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f2561n + ']';
    }
}
