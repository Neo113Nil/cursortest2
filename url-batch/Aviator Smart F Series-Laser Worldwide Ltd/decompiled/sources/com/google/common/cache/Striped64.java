package com.google.common.cache;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;

    @CheckForNull
    volatile transient Cell[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    static final class Cell {
        private static final Unsafe UNSAFE;
        private static final long valueOffset;

        /* renamed from: p0, reason: collision with root package name */
        volatile long f14973p0;

        /* renamed from: p1, reason: collision with root package name */
        volatile long f14974p1;

        /* renamed from: p2, reason: collision with root package name */
        volatile long f14975p2;

        /* renamed from: p3, reason: collision with root package name */
        volatile long f14976p3;

        /* renamed from: p4, reason: collision with root package name */
        volatile long f14977p4;

        /* renamed from: p5, reason: collision with root package name */
        volatile long f14978p5;

        /* renamed from: p6, reason: collision with root package name */
        volatile long f14979p6;

        /* renamed from: q0, reason: collision with root package name */
        volatile long f14980q0;

        /* renamed from: q1, reason: collision with root package name */
        volatile long f14981q1;

        /* renamed from: q2, reason: collision with root package name */
        volatile long f14982q2;

        /* renamed from: q3, reason: collision with root package name */
        volatile long f14983q3;

        /* renamed from: q4, reason: collision with root package name */
        volatile long f14984q4;

        /* renamed from: q5, reason: collision with root package name */
        volatile long f14985q5;

        /* renamed from: q6, reason: collision with root package name */
        volatile long f14986q6;
        volatile long value;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                UNSAFE = unsafe;
                valueOffset = unsafe.objectFieldOffset(Cell.class.getDeclaredField("value"));
            } catch (Exception e8) {
                throw new Error(e8);
            }
        }

        Cell(long j8) {
            this.value = j8;
        }

        final boolean cas(long j8, long j9) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, j8, j9);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(TtmlNode.RUBY_BASE));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("busy"));
        } catch (Exception e8) {
            throw new Error(e8);
        }
    }

    Striped64() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e8) {
                throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
    }

    final boolean casBase(long j8, long j9) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j8, j9);
    }

    final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    abstract long fn(long j8, long j9);

    final void internalReset(long j8) {
        Cell[] cellArr = this.cells;
        this.base = j8;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = j8;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void retryUpdate(long j8, @CheckForNull int[] iArr, boolean z7) {
        int i8;
        int[] iArr2;
        boolean z8;
        int length;
        boolean z9;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            threadHashCode.set(iArr2);
            i8 = rng.nextInt();
            if (i8 == 0) {
                i8 = 1;
            }
            iArr2[0] = i8;
        } else {
            i8 = iArr[0];
            iArr2 = iArr;
        }
        int i9 = i8;
        boolean z10 = false;
        boolean z11 = z7;
        while (true) {
            Cell[] cellArr = this.cells;
            if (cellArr != null && (length = cellArr.length) > 0) {
                Cell cell = cellArr[(length - 1) & i9];
                if (cell == null) {
                    if (this.busy == 0) {
                        Cell cell2 = new Cell(j8);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                Cell[] cellArr2 = this.cells;
                                if (cellArr2 != null && (length2 = cellArr2.length) > 0) {
                                    int i10 = (length2 - 1) & i9;
                                    if (cellArr2[i10] == null) {
                                        cellArr2[i10] = cell2;
                                        z9 = true;
                                        if (!z9) {
                                            return;
                                        }
                                    }
                                }
                                z9 = false;
                                if (!z9) {
                                }
                            } finally {
                            }
                        }
                    }
                    z10 = false;
                } else if (z11) {
                    long j9 = cell.value;
                    if (cell.cas(j9, fn(j9, j8))) {
                        return;
                    }
                    if (length < NCPU && this.cells == cellArr) {
                        if (!z10) {
                            z10 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == cellArr) {
                                    Cell[] cellArr3 = new Cell[length << 1];
                                    for (int i11 = 0; i11 < length; i11++) {
                                        cellArr3[i11] = cellArr[i11];
                                    }
                                    this.cells = cellArr3;
                                }
                                this.busy = 0;
                                z10 = false;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    z10 = false;
                } else {
                    z11 = true;
                }
                int i12 = i9 ^ (i9 << 13);
                int i13 = i12 ^ (i12 >>> 17);
                i9 = i13 ^ (i13 << 5);
                iArr2[0] = i9;
            } else if (this.busy == 0 && this.cells == cellArr && casBusy()) {
                try {
                    if (this.cells == cellArr) {
                        Cell[] cellArr4 = new Cell[2];
                        cellArr4[i9 & 1] = new Cell(j8);
                        this.cells = cellArr4;
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        return;
                    }
                } finally {
                }
            } else {
                long j10 = this.base;
                if (casBase(j10, fn(j10, j8))) {
                    return;
                }
            }
        }
    }
}
