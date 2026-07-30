package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class u {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private volatile Object _next;
    private volatile long _state;
    private final AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;
    public static final a Companion = new a(null);
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_next");
    private static final AtomicLongFieldUpdater _state$FU = AtomicLongFieldUpdater.newUpdater(u.class, "_state");
    public static final g0 REMOVE_FROZEN = new g0("REMOVE_FROZEN");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final int addFailReason(long j8) {
            return (j8 & u.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public final long updateHead(long j8, int i8) {
            return wo(j8, u.HEAD_MASK) | i8;
        }

        public final long updateTail(long j8, int i8) {
            return wo(j8, u.TAIL_MASK) | (i8 << 30);
        }

        public final <T> T withState(long j8, f6.p pVar) {
            return (T) pVar.invoke(Integer.valueOf((int) (u.HEAD_MASK & j8)), Integer.valueOf((int) ((j8 & u.TAIL_MASK) >> 30)));
        }

        public final long wo(long j8, long j9) {
            return j8 & (~j9);
        }
    }

    public static final class b {
        public final int index;

        public b(int i8) {
            this.index = i8;
        }
    }

    public u(int i8, boolean z7) {
        this.capacity = i8;
        this.singleConsumer = z7;
        int i9 = i8 - 1;
        this.mask = i9;
        this.array = new AtomicReferenceArray(i8);
        if (i9 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i8 & i9) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final u allocateNextCopy(long j8) {
        u uVar = new u(this.capacity * 2, this.singleConsumer);
        int i8 = (int) (HEAD_MASK & j8);
        int i9 = (int) ((TAIL_MASK & j8) >> 30);
        while (true) {
            int i10 = this.mask;
            if ((i8 & i10) == (i9 & i10)) {
                _state$FU.set(uVar, Companion.wo(j8, FROZEN_MASK));
                return uVar;
            }
            Object obj = this.array.get(i10 & i8);
            if (obj == null) {
                obj = new b(i8);
            }
            uVar.array.set(uVar.mask & i8, obj);
            i8++;
        }
    }

    private final u allocateOrGetNextCopy(long j8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (uVar != null) {
                return uVar;
            }
            androidx.concurrent.futures.a.a(_next$FU, this, null, allocateNextCopy(j8));
        }
    }

    private final u fillPlaceholder(int i8, Object obj) {
        Object obj2 = this.array.get(this.mask & i8);
        if (!(obj2 instanceof b) || ((b) obj2).index != i8) {
            return null;
        }
        this.array.set(i8 & this.mask, obj);
        return this;
    }

    private final void loop$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final long markFrozen() {
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & FROZEN_MASK) != 0) {
                return j8;
            }
            j9 = j8 | FROZEN_MASK;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j9));
        return j9;
    }

    private final u removeSlowPath(int i8, int i9) {
        long j8;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            i10 = (int) (HEAD_MASK & j8);
            if ((FROZEN_MASK & j8) != 0) {
                return next();
            }
        } while (!_state$FU.compareAndSet(this, j8, Companion.updateHead(j8, i9)));
        this.array.set(this.mask & i10, null);
        return null;
    }

    private final void update$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, f6.l lVar, Object obj) {
        long j8;
        do {
            j8 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j8, ((Number) lVar.invoke(Long.valueOf(j8))).longValue()));
    }

    private final long updateAndGet$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, f6.l lVar, Object obj) {
        long j8;
        Number number;
        do {
            j8 = atomicLongFieldUpdater.get(obj);
            number = (Number) lVar.invoke(Long.valueOf(j8));
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j8, number.longValue()));
        return number.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int addLast(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j8) != 0) {
                return Companion.addFailReason(j8);
            }
            int i8 = (int) (HEAD_MASK & j8);
            int i9 = (int) ((TAIL_MASK & j8) >> 30);
            int i10 = this.mask;
            if (((i9 + 2) & i10) == (i8 & i10)) {
                return 1;
            }
            if (!this.singleConsumer && this.array.get(i9 & i10) != null) {
                int i11 = this.capacity;
                if (i11 < 1024 || ((i9 - i8) & MAX_CAPACITY_MASK) > (i11 >> 1)) {
                    break;
                }
            } else if (_state$FU.compareAndSet(this, j8, Companion.updateTail(j8, (i9 + 1) & MAX_CAPACITY_MASK))) {
                this.array.set(i9 & i10, obj);
                u uVar = this;
                while ((_state$FU.get(uVar) & FROZEN_MASK) != 0 && (uVar = uVar.next().fillPlaceholder(i9, obj)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean close() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & CLOSED_MASK) != 0) {
                return true;
            }
            if ((FROZEN_MASK & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j8 | CLOSED_MASK));
        return true;
    }

    public final int getSize() {
        long j8 = _state$FU.get(this);
        return 1073741823 & (((int) ((j8 & TAIL_MASK) >> 30)) - ((int) (HEAD_MASK & j8)));
    }

    public final boolean isClosed() {
        return (_state$FU.get(this) & CLOSED_MASK) != 0;
    }

    public final boolean isEmpty() {
        long j8 = _state$FU.get(this);
        return ((int) (HEAD_MASK & j8)) == ((int) ((j8 & TAIL_MASK) >> 30));
    }

    public final <R> List<R> map(f6.l lVar) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j8 = _state$FU.get(this);
        int i8 = (int) (HEAD_MASK & j8);
        int i9 = (int) ((j8 & TAIL_MASK) >> 30);
        while (true) {
            int i10 = this.mask;
            if ((i8 & i10) == (i9 & i10)) {
                return arrayList;
            }
            Object obj = this.array.get(i10 & i8);
            if (obj != null && !(obj instanceof b)) {
                arrayList.add(lVar.invoke(obj));
            }
            i8++;
        }
    }

    public final u next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if ((FROZEN_MASK & j8) != 0) {
                return REMOVE_FROZEN;
            }
            int i8 = (int) (HEAD_MASK & j8);
            int i9 = (int) ((TAIL_MASK & j8) >> 30);
            int i10 = this.mask;
            if ((i9 & i10) == (i8 & i10)) {
                return null;
            }
            Object obj = this.array.get(i10 & i8);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i11 = (i8 + 1) & MAX_CAPACITY_MASK;
                if (_state$FU.compareAndSet(this, j8, Companion.updateHead(j8, i11))) {
                    this.array.set(this.mask & i8, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    u uVar = this;
                    do {
                        uVar = uVar.removeSlowPath(i8, i11);
                    } while (uVar != null);
                    return obj;
                }
            }
        }
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }
}
