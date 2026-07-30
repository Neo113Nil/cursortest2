package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public abstract class e {
    private static final g0 CLOSED = new g0("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final boolean addConditionally$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i8, f6.l lVar) {
        int i9;
        do {
            i9 = atomicIntegerFieldUpdater.get(obj);
            if (!((Boolean) lVar.invoke(Integer.valueOf(i9))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i9, i9 + i8));
        return true;
    }

    private static final boolean addConditionally$atomicfu$array(Object obj, AtomicIntegerArray atomicIntegerArray, int i8, int i9, f6.l lVar) {
        int i10;
        do {
            i10 = atomicIntegerArray.get(i8);
            if (!((Boolean) lVar.invoke(Integer.valueOf(i10))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i8, i10, i10 + i9));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.f] */
    public static final <N extends f> N close(N n8) {
        while (true) {
            Object nextOrClosed = n8.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n8;
            }
            ?? r02 = (f) nextOrClosed;
            if (r02 != 0) {
                n8 = r02;
            } else if (n8.markAsClosed()) {
                return n8;
            }
        }
    }

    public static final Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j8, d0 d0Var, f6.p pVar) {
        Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(d0Var, j8, pVar);
            if (!e0.m1279isClosedimpl(findSegmentInternal)) {
                d0 m1277getSegmentimpl = e0.m1277getSegmentimpl(findSegmentInternal);
                while (true) {
                    d0 d0Var2 = (d0) atomicReferenceFieldUpdater.get(obj);
                    if (d0Var2.id >= m1277getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1277getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, d0Var2, m1277getSegmentimpl)) {
                        if (d0Var2.decPointers$kotlinx_coroutines_core()) {
                            d0Var2.remove();
                        }
                    } else if (m1277getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1277getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    public static final Object findSegmentAndMoveForward$atomicfu$array(Object obj, AtomicReferenceArray atomicReferenceArray, int i8, long j8, d0 d0Var, f6.p pVar) {
        Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(d0Var, j8, pVar);
            if (!e0.m1279isClosedimpl(findSegmentInternal)) {
                d0 m1277getSegmentimpl = e0.m1277getSegmentimpl(findSegmentInternal);
                while (true) {
                    d0 d0Var2 = (d0) atomicReferenceArray.get(i8);
                    if (d0Var2.id >= m1277getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1277getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (com.google.common.util.concurrent.s.a(atomicReferenceArray, i8, d0Var2, m1277getSegmentimpl)) {
                        if (d0Var2.decPointers$kotlinx_coroutines_core()) {
                            d0Var2.remove();
                        }
                    } else if (m1277getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1277getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    public static final <S extends d0> Object findSegmentInternal(S s7, long j8, f6.p pVar) {
        while (true) {
            if (s7.id >= j8 && !s7.isRemoved()) {
                return e0.m1274constructorimpl(s7);
            }
            Object nextOrClosed = s7.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return e0.m1274constructorimpl(CLOSED);
            }
            f fVar = (d0) ((f) nextOrClosed);
            if (fVar == null) {
                fVar = (d0) pVar.invoke(Long.valueOf(s7.id + 1), s7);
                if (s7.trySetNext(fVar)) {
                    if (s7.isRemoved()) {
                        s7.remove();
                    }
                }
            }
            s7 = fVar;
        }
    }

    public static final boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, d0 d0Var) {
        while (true) {
            d0 d0Var2 = (d0) atomicReferenceFieldUpdater.get(obj);
            if (d0Var2.id >= d0Var.id) {
                return true;
            }
            if (!d0Var.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, d0Var2, d0Var)) {
                if (d0Var2.decPointers$kotlinx_coroutines_core()) {
                    d0Var2.remove();
                }
                return true;
            }
            if (d0Var.decPointers$kotlinx_coroutines_core()) {
                d0Var.remove();
            }
        }
    }

    public static final boolean moveForward$atomicfu$array(Object obj, AtomicReferenceArray atomicReferenceArray, int i8, d0 d0Var) {
        while (true) {
            d0 d0Var2 = (d0) atomicReferenceArray.get(i8);
            if (d0Var2.id >= d0Var.id) {
                return true;
            }
            if (!d0Var.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (com.google.common.util.concurrent.s.a(atomicReferenceArray, i8, d0Var2, d0Var)) {
                if (d0Var2.decPointers$kotlinx_coroutines_core()) {
                    d0Var2.remove();
                }
                return true;
            }
            if (d0Var.decPointers$kotlinx_coroutines_core()) {
                d0Var.remove();
            }
        }
    }
}
