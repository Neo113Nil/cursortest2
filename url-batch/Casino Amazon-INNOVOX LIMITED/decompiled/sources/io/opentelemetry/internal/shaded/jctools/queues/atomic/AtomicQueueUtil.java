package io.opentelemetry.internal.shaded.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class AtomicQueueUtil {
    public static int calcCircularLongElementOffset(long j, int i) {
        return (int) (j & i);
    }

    public static int calcCircularRefElementOffset(long j, long j2) {
        return (int) (j & j2);
    }

    public static int calcLongElementOffset(long j) {
        return (int) j;
    }

    public static int calcRefElementOffset(long j) {
        return (int) j;
    }

    public static int modifiedCalcCircularRefElementOffset(long j, long j2) {
        return ((int) (j & j2)) >> 1;
    }

    public static <E> E lvRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public static <E> E lpRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public static <E> void spRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    public static void soRefElement(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    public static <E> void svRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.set(i, e);
    }

    public static <E> AtomicReferenceArray<E> allocateRefArray(int i) {
        return new AtomicReferenceArray<>(i);
    }

    public static void spLongElement(AtomicLongArray atomicLongArray, int i, long j) {
        atomicLongArray.lazySet(i, j);
    }

    public static void soLongElement(AtomicLongArray atomicLongArray, int i, long j) {
        atomicLongArray.lazySet(i, j);
    }

    public static long lpLongElement(AtomicLongArray atomicLongArray, int i) {
        return atomicLongArray.get(i);
    }

    public static long lvLongElement(AtomicLongArray atomicLongArray, int i) {
        return atomicLongArray.get(i);
    }

    public static AtomicLongArray allocateLongArray(int i) {
        return new AtomicLongArray(i);
    }

    public static int length(AtomicReferenceArray<?> atomicReferenceArray) {
        return atomicReferenceArray.length();
    }

    public static int nextArrayOffset(AtomicReferenceArray<?> atomicReferenceArray) {
        return length(atomicReferenceArray) - 1;
    }
}
