package t2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final a f46253e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46254f = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_next$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f46255g = AtomicLongFieldUpdater.newUpdater(t.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final G f46256h = new G("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f46257a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46258b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46259c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f46260d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j4) {
            return (j4 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j4, int i4) {
            return d(j4, 1073741823L) | i4;
        }

        public final long c(long j4, int i4) {
            return d(j4, 1152921503533105152L) | (i4 << 30);
        }

        public final long d(long j4, long j5) {
            return j4 & (~j5);
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f46261a;

        public b(int i4) {
            this.f46261a = i4;
        }
    }

    public t(int i4, boolean z4) {
        this.f46257a = i4;
        this.f46258b = z4;
        int i5 = i4 - 1;
        this.f46259c = i5;
        this.f46260d = new AtomicReferenceArray(i4);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i4 & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final t b(long j4) {
        t tVar = new t(this.f46257a * 2, this.f46258b);
        int i4 = (int) (1073741823 & j4);
        int i5 = (int) ((1152921503533105152L & j4) >> 30);
        while (true) {
            int i6 = this.f46259c;
            if ((i4 & i6) == (i6 & i5)) {
                f46255g.set(tVar, f46253e.d(j4, 1152921504606846976L));
                return tVar;
            }
            Object obj = f().get(this.f46259c & i4);
            if (obj == null) {
                obj = new b(i4);
            }
            tVar.f().set(tVar.f46259c & i4, obj);
            i4++;
        }
    }

    private final t c(long j4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46254f;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            if (tVar != null) {
                return tVar;
            }
            androidx.concurrent.futures.b.a(f46254f, this, null, b(j4));
        }
    }

    private final t e(int i4, Object obj) {
        Object obj2 = f().get(this.f46259c & i4);
        if (!(obj2 instanceof b) || ((b) obj2).f46261a != i4) {
            return null;
        }
        f().set(i4 & this.f46259c, obj);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f46260d;
    }

    private final long k() {
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46255g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                return j4;
            }
            j5 = 1152921504606846976L | j4;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j5));
        return j5;
    }

    private final t n(int i4, int i5) {
        long j4;
        int i6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46255g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            i6 = (int) (1073741823 & j4);
            if ((1152921504606846976L & j4) != 0) {
                return l();
            }
        } while (!f46255g.compareAndSet(this, j4, f46253e.b(j4, i5)));
        f().set(this.f46259c & i6, null);
        return null;
    }

    public final int a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46255g;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return f46253e.a(j4);
            }
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            int i6 = this.f46259c;
            if (((i5 + 2) & i6) == (i4 & i6)) {
                return 1;
            }
            if (!this.f46258b && f().get(i5 & i6) != null) {
                int i7 = this.f46257a;
                if (i7 < 1024 || ((i5 - i4) & 1073741823) > (i7 >> 1)) {
                    break;
                }
            } else if (f46255g.compareAndSet(this, j4, f46253e.c(j4, (i5 + 1) & 1073741823))) {
                f().set(i5 & i6, obj);
                t tVar = this;
                while ((f46255g.get(tVar) & 1152921504606846976L) != 0 && (tVar = tVar.l().e(i5, obj)) != null) {
                }
                return 0;
            }
        }
        return 1;
    }

    public final boolean d() {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46255g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 2305843009213693952L | j4));
        return true;
    }

    public final int g() {
        long j4 = f46255g.get(this);
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    public final boolean j() {
        long j4 = f46255g.get(this);
        return ((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30));
    }

    public final t l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46255g;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j4) != 0) {
                return f46256h;
            }
            int i4 = (int) (1073741823 & j4);
            int i5 = this.f46259c;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i5) == (i5 & i4)) {
                return null;
            }
            Object obj = f().get(this.f46259c & i4);
            if (obj == null) {
                if (this.f46258b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i6 = (i4 + 1) & 1073741823;
                if (f46255g.compareAndSet(this, j4, f46253e.b(j4, i6))) {
                    f().set(this.f46259c & i4, null);
                    return obj;
                }
                if (this.f46258b) {
                    t tVar = this;
                    do {
                        tVar = tVar.n(i4, i6);
                    } while (tVar != null);
                    return obj;
                }
            }
        }
    }
}
