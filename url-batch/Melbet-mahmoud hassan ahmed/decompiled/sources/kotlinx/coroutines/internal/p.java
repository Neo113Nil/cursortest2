package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m6.p0;

/* loaded from: classes.dex */
public final class p<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f18365a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18366b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18367c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f18368d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f18361e = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final y f18364h = new y("REMOVE_FROZEN");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18362f = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f18363g = AtomicLongFieldUpdater.newUpdater(p.class, "_state");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final int a(long j7) {
            return (j7 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j7, int i7) {
            return d(j7, 1073741823L) | (i7 << 0);
        }

        public final long c(long j7, int i7) {
            return d(j7, 1152921503533105152L) | (i7 << 30);
        }

        public final long d(long j7, long j8) {
            return j7 & (j8 ^ (-1));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f18369a;

        public b(int i7) {
            this.f18369a = i7;
        }
    }

    public p(int i7, boolean z6) {
        this.f18365a = i7;
        this.f18366b = z6;
        int i8 = i7 - 1;
        this.f18367c = i8;
        this.f18368d = new AtomicReferenceArray(i7);
        if (!(i8 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i7 & i8) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final p<E> b(long j7) {
        p<E> pVar = new p<>(this.f18365a * 2, this.f18366b);
        int i7 = (int) ((1073741823 & j7) >> 0);
        int i8 = (int) ((1152921503533105152L & j7) >> 30);
        while (true) {
            int i9 = this.f18367c;
            if ((i7 & i9) == (i8 & i9)) {
                pVar._state = f18361e.d(j7, 1152921504606846976L);
                return pVar;
            }
            Object obj = this.f18368d.get(i9 & i7);
            if (obj == null) {
                obj = new b(i7);
            }
            pVar.f18368d.set(pVar.f18367c & i7, obj);
            i7++;
        }
    }

    private final p<E> c(long j7) {
        while (true) {
            p<E> pVar = (p) this._next;
            if (pVar != null) {
                return pVar;
            }
            androidx.work.impl.utils.futures.b.a(f18362f, this, null, b(j7));
        }
    }

    private final p<E> e(int i7, E e7) {
        Object obj = this.f18368d.get(this.f18367c & i7);
        if (!(obj instanceof b) || ((b) obj).f18369a != i7) {
            return null;
        }
        this.f18368d.set(i7 & this.f18367c, e7);
        return this;
    }

    private final long h() {
        long j7;
        long j8;
        do {
            j7 = this._state;
            if ((j7 & 1152921504606846976L) != 0) {
                return j7;
            }
            j8 = j7 | 1152921504606846976L;
        } while (!f18363g.compareAndSet(this, j7, j8));
        return j8;
    }

    private final p<E> k(int i7, int i8) {
        long j7;
        a aVar;
        int i9;
        do {
            j7 = this._state;
            aVar = f18361e;
            i9 = (int) ((1073741823 & j7) >> 0);
            if (p0.a()) {
                if (!(i9 == i7)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j7) != 0) {
                return i();
            }
        } while (!f18363g.compareAndSet(this, j7, aVar.b(j7, i8)));
        this.f18368d.set(this.f18367c & i9, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(E e7) {
        while (true) {
            long j7 = this._state;
            if ((3458764513820540928L & j7) != 0) {
                return f18361e.a(j7);
            }
            a aVar = f18361e;
            int i7 = (int) ((1073741823 & j7) >> 0);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            int i9 = this.f18367c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            if (!this.f18366b && this.f18368d.get(i8 & i9) != null) {
                int i10 = this.f18365a;
                if (i10 < 1024 || ((i8 - i7) & 1073741823) > (i10 >> 1)) {
                    break;
                }
            } else if (f18363g.compareAndSet(this, j7, aVar.c(j7, (i8 + 1) & 1073741823))) {
                this.f18368d.set(i8 & i9, e7);
                p<E> pVar = this;
                while ((pVar._state & 1152921504606846976L) != 0 && (pVar = pVar.i().e(i8, e7)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j7;
        do {
            j7 = this._state;
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!f18363g.compareAndSet(this, j7, j7 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j7 = this._state;
        return 1073741823 & (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j7) >> 0)));
    }

    public final boolean g() {
        long j7 = this._state;
        return ((int) ((1073741823 & j7) >> 0)) == ((int) ((j7 & 1152921503533105152L) >> 30));
    }

    public final p<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j7 = this._state;
            if ((1152921504606846976L & j7) != 0) {
                return f18364h;
            }
            a aVar = f18361e;
            int i7 = (int) ((1073741823 & j7) >> 0);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            int i9 = this.f18367c;
            if ((i8 & i9) == (i7 & i9)) {
                return null;
            }
            Object obj = this.f18368d.get(i9 & i7);
            if (obj == null) {
                if (this.f18366b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i10 = (i7 + 1) & 1073741823;
                if (f18363g.compareAndSet(this, j7, aVar.b(j7, i10))) {
                    this.f18368d.set(this.f18367c & i7, null);
                    return obj;
                }
                if (this.f18366b) {
                    p<E> pVar = this;
                    do {
                        pVar = pVar.k(i7, i10);
                    } while (pVar != null);
                    return obj;
                }
            }
        }
    }
}
