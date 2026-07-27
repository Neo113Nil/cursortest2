package W2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class Q implements Runnable, Comparable, L {
    private volatile Object _heap;

    /* renamed from: d, reason: collision with root package name */
    public long f4233d;

    /* renamed from: e, reason: collision with root package name */
    public int f4234e = -1;

    public Q(long j4) {
        this.f4233d = j4;
    }

    @Override // W2.L
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                b3.t tVar = B.f4209b;
                if (obj == tVar) {
                    return;
                }
                S s4 = obj instanceof S ? (S) obj : null;
                if (s4 != null) {
                    synchronized (s4) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof b3.w ? (b3.w) obj2 : null) != null) {
                            s4.b(this.f4234e);
                        }
                    }
                }
                this._heap = tVar;
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = this.f4233d - ((Q) obj).f4233d;
        if (j4 > 0) {
            return 1;
        }
        return j4 < 0 ? -1 : 0;
    }

    public final int e(long j4, S s4, T t4) {
        synchronized (this) {
            if (this._heap == B.f4209b) {
                return 2;
            }
            synchronized (s4) {
                try {
                    Q[] qArr = s4.f5696a;
                    Q q2 = qArr != null ? qArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f4236m;
                    t4.getClass();
                    if (T.f4238o.get(t4) != 0) {
                        return 1;
                    }
                    if (q2 == null) {
                        s4.f4235c = j4;
                    } else {
                        long j5 = q2.f4233d;
                        if (j5 - j4 < 0) {
                            j4 = j5;
                        }
                        if (j4 - s4.f4235c > 0) {
                            s4.f4235c = j4;
                        }
                    }
                    long j6 = this.f4233d;
                    long j7 = s4.f4235c;
                    if (j6 - j7 < 0) {
                        this.f4233d = j7;
                    }
                    s4.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h(S s4) {
        if (this._heap == B.f4209b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = s4;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4233d + ']';
    }
}
