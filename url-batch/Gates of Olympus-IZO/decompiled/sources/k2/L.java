package k2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class L implements Runnable, Comparable, G {
    private volatile Object _heap;

    /* renamed from: d, reason: collision with root package name */
    public long f5320d;

    /* renamed from: e, reason: collision with root package name */
    public int f5321e = -1;

    public L(long j3) {
        this.f5320d = j3;
    }

    @Override // k2.G
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                j1.p pVar = AbstractC0552y.f5401b;
                if (obj == pVar) {
                    return;
                }
                M m3 = obj instanceof M ? (M) obj : null;
                if (m3 != null) {
                    synchronized (m3) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof p2.v ? (p2.v) obj2 : null) != null) {
                            m3.b(this.f5321e);
                        }
                    }
                }
                this._heap = pVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j3, M m3, N n3) {
        synchronized (this) {
            if (this._heap == AbstractC0552y.f5401b) {
                return 2;
            }
            synchronized (m3) {
                try {
                    L[] lArr = m3.f6810a;
                    L l3 = lArr != null ? lArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N.f5323j;
                    n3.getClass();
                    if (N.f5325l.get(n3) != 0) {
                        return 1;
                    }
                    if (l3 == null) {
                        m3.f5322c = j3;
                    } else {
                        long j4 = l3.f5320d;
                        if (j4 - j3 < 0) {
                            j3 = j4;
                        }
                        if (j3 - m3.f5322c > 0) {
                            m3.f5322c = j3;
                        }
                    }
                    long j5 = this.f5320d;
                    long j6 = m3.f5322c;
                    if (j5 - j6 < 0) {
                        this.f5320d = j6;
                    }
                    m3.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f5320d - ((L) obj).f5320d;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    public final void d(M m3) {
        if (this._heap == AbstractC0552y.f5401b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = m3;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f5320d + ']';
    }
}
