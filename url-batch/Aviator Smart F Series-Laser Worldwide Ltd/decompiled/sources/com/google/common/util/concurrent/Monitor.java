package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Monitor {

    @CheckForNull
    @GuardedBy("lock")
    private Guard activeGuards;
    private final boolean fair;
    private final ReentrantLock lock;

    public static abstract class Guard {
        final Condition condition;

        @Weak
        final Monitor monitor;

        @CheckForNull
        @GuardedBy("monitor.lock")
        Guard next;

        @GuardedBy("monitor.lock")
        int waiterCount = 0;

        protected Guard(Monitor monitor) {
            this.monitor = (Monitor) Preconditions.checkNotNull(monitor, "monitor");
            this.condition = monitor.lock.newCondition();
        }

        public abstract boolean isSatisfied();
    }

    public Monitor() {
        this(false);
    }

    @GuardedBy("lock")
    private void await(Guard guard, boolean z7) {
        if (z7) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.condition.await();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    @GuardedBy("lock")
    private boolean awaitNanos(Guard guard, long j8, boolean z7) {
        boolean z8 = true;
        while (j8 > 0) {
            if (z8) {
                if (z7) {
                    try {
                        signalNextWaiter();
                    } catch (Throwable th) {
                        if (!z8) {
                            endWaitingFor(guard);
                        }
                        throw th;
                    }
                }
                beginWaitingFor(guard);
                z8 = false;
            }
            j8 = guard.condition.awaitNanos(j8);
            if (guard.isSatisfied()) {
                if (!z8) {
                    endWaitingFor(guard);
                }
                return true;
            }
        }
        if (!z8) {
            endWaitingFor(guard);
        }
        return false;
    }

    @GuardedBy("lock")
    private void awaitUninterruptibly(Guard guard, boolean z7) {
        if (z7) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.condition.awaitUninterruptibly();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    @GuardedBy("lock")
    private void beginWaitingFor(Guard guard) {
        int i8 = guard.waiterCount;
        guard.waiterCount = i8 + 1;
        if (i8 == 0) {
            guard.next = this.activeGuards;
            this.activeGuards = guard;
        }
    }

    @GuardedBy("lock")
    private void endWaitingFor(Guard guard) {
        int i8 = guard.waiterCount - 1;
        guard.waiterCount = i8;
        if (i8 == 0) {
            Guard guard2 = this.activeGuards;
            Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.next;
            }
            if (guard3 == null) {
                this.activeGuards = guard2.next;
            } else {
                guard3.next = guard2.next;
            }
            guard2.next = null;
        }
    }

    private static long initNanoTime(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime == 0) {
            return 1L;
        }
        return nanoTime;
    }

    @GuardedBy("lock")
    private boolean isSatisfied(Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (Throwable th) {
            signalAllWaiters();
            throw th;
        }
    }

    private static long remainingNanos(long j8, long j9) {
        if (j9 <= 0) {
            return 0L;
        }
        return j9 - (System.nanoTime() - j8);
    }

    @GuardedBy("lock")
    private void signalAllWaiters() {
        for (Guard guard = this.activeGuards; guard != null; guard = guard.next) {
            guard.condition.signalAll();
        }
    }

    @GuardedBy("lock")
    private void signalNextWaiter() {
        for (Guard guard = this.activeGuards; guard != null; guard = guard.next) {
            if (isSatisfied(guard)) {
                guard.condition.signal();
                return;
            }
        }
    }

    private static long toSafeNanos(long j8, TimeUnit timeUnit) {
        return Longs.constrainToRange(timeUnit.toNanos(j8), 0L, 6917529027641081853L);
    }

    public void enter() {
        this.lock.lock();
    }

    public boolean enterIf(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isSatisfied = guard.isSatisfied();
            if (!isSatisfied) {
            }
            return isSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean enterIfInterruptibly(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        try {
            boolean isSatisfied = guard.isSatisfied();
            if (!isSatisfied) {
            }
            return isSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void enterInterruptibly() {
        this.lock.lockInterruptibly();
    }

    public void enterWhen(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            await(guard, isHeldByCurrentThread);
        } catch (Throwable th) {
            leave();
            throw th;
        }
    }

    public void enterWhenUninterruptibly(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            awaitUninterruptibly(guard, isHeldByCurrentThread);
        } catch (Throwable th) {
            leave();
            throw th;
        }
    }

    public int getOccupiedDepth() {
        return this.lock.getHoldCount();
    }

    public int getQueueLength() {
        return this.lock.getQueueLength();
    }

    public int getWaitQueueLength(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        this.lock.lock();
        try {
            return guard.waiterCount;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean hasQueuedThread(Thread thread) {
        return this.lock.hasQueuedThread(thread);
    }

    public boolean hasQueuedThreads() {
        return this.lock.hasQueuedThreads();
    }

    public boolean hasWaiters(Guard guard) {
        return getWaitQueueLength(guard) > 0;
    }

    public boolean isFair() {
        return this.fair;
    }

    public boolean isOccupied() {
        return this.lock.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.lock.isHeldByCurrentThread();
    }

    public void leave() {
        ReentrantLock reentrantLock = this.lock;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                signalNextWaiter();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean tryEnter() {
        return this.lock.tryLock();
    }

    public boolean tryEnterIf(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean isSatisfied = guard.isSatisfied();
            if (!isSatisfied) {
            }
            return isSatisfied;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void waitFor(Guard guard) {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        await(guard, true);
    }

    public void waitForUninterruptibly(Guard guard) {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        awaitUninterruptibly(guard, true);
    }

    public Monitor(boolean z7) {
        this.activeGuards = null;
        this.fair = z7;
        this.lock = new ReentrantLock(z7);
    }

    public boolean enter(long j8, TimeUnit timeUnit) {
        boolean tryLock;
        long safeNanos = toSafeNanos(j8, timeUnit);
        ReentrantLock reentrantLock = this.lock;
        boolean z7 = true;
        if (!this.fair && reentrantLock.tryLock()) {
            return true;
        }
        boolean interrupted = Thread.interrupted();
        try {
            long nanoTime = System.nanoTime();
            long j9 = safeNanos;
            while (true) {
                try {
                    try {
                        tryLock = reentrantLock.tryLock(j9, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th) {
                        th = th;
                        if (z7) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    j9 = remainingNanos(nanoTime, safeNanos);
                    interrupted = true;
                }
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            return tryLock;
        } catch (Throwable th2) {
            th = th2;
            z7 = interrupted;
        }
    }

    public boolean enterInterruptibly(long j8, TimeUnit timeUnit) {
        return this.lock.tryLock(j8, timeUnit);
    }

    public boolean waitFor(Guard guard, long j8, TimeUnit timeUnit) {
        long safeNanos = toSafeNanos(j8, timeUnit);
        if (guard.monitor == this && this.lock.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return true;
            }
            if (!Thread.interrupted()) {
                return awaitNanos(guard, safeNanos, true);
            }
            throw new InterruptedException();
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean waitForUninterruptibly(Guard guard, long j8, TimeUnit timeUnit) {
        long safeNanos = toSafeNanos(j8, timeUnit);
        if (guard.monitor == this && this.lock.isHeldByCurrentThread()) {
            boolean z7 = true;
            if (guard.isSatisfied()) {
                return true;
            }
            long initNanoTime = initNanoTime(safeNanos);
            boolean interrupted = Thread.interrupted();
            long j9 = safeNanos;
            boolean z8 = true;
            while (true) {
                try {
                    try {
                        boolean awaitNanos = awaitNanos(guard, j9, z8);
                        if (interrupted) {
                            Thread.currentThread().interrupt();
                        }
                        return awaitNanos;
                    } catch (Throwable th) {
                        th = th;
                        if (z7) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    if (guard.isSatisfied()) {
                        Thread.currentThread().interrupt();
                        return true;
                    }
                    j9 = remainingNanos(initNanoTime, safeNanos);
                    z8 = false;
                    interrupted = true;
                } catch (Throwable th2) {
                    th = th2;
                    z7 = interrupted;
                    if (z7) {
                    }
                    throw th;
                }
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    public boolean enterIf(Guard guard, long j8, TimeUnit timeUnit) {
        if (guard.monitor == this) {
            if (!enter(j8, timeUnit)) {
                return false;
            }
            try {
                boolean isSatisfied = guard.isSatisfied();
                if (!isSatisfied) {
                }
                return isSatisfied;
            } finally {
                this.lock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(Guard guard, long j8, TimeUnit timeUnit) {
        if (guard.monitor == this) {
            ReentrantLock reentrantLock = this.lock;
            if (!reentrantLock.tryLock(j8, timeUnit)) {
                return false;
            }
            try {
                boolean isSatisfied = guard.isSatisfied();
                if (!isSatisfied) {
                }
                return isSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (awaitNanos(r11, r0, r3) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enterWhen(Guard guard, long j8, TimeUnit timeUnit) {
        long initNanoTime;
        long safeNanos = toSafeNanos(j8, timeUnit);
        if (guard.monitor == this) {
            ReentrantLock reentrantLock = this.lock;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean z7 = false;
            try {
                if (!this.fair) {
                    if (!Thread.interrupted()) {
                        if (reentrantLock.tryLock()) {
                            initNanoTime = 0;
                            if (!guard.isSatisfied()) {
                                if (initNanoTime != 0) {
                                    safeNanos = remainingNanos(initNanoTime, safeNanos);
                                }
                            }
                            z7 = true;
                            if (!z7) {
                            }
                            return z7;
                        }
                    } else {
                        throw new InterruptedException();
                    }
                }
                if (!guard.isSatisfied()) {
                }
                z7 = true;
                if (!z7) {
                }
                return z7;
            } catch (Throwable th) {
                if (!isHeldByCurrentThread) {
                    try {
                        signalNextWaiter();
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                throw th;
            }
            initNanoTime = initNanoTime(safeNanos);
            if (!reentrantLock.tryLock(j8, timeUnit)) {
                return false;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0023, blocks: (B:5:0x0012, B:7:0x001a, B:22:0x004f, B:33:0x005c, B:34:0x005f, B:35:0x0025, B:38:0x002a, B:13:0x0032, B:17:0x003d, B:18:0x0049, B:27:0x0045), top: B:4:0x0012, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enterWhenUninterruptibly(Guard guard, long j8, TimeUnit timeUnit) {
        long initNanoTime;
        long remainingNanos;
        long safeNanos = toSafeNanos(j8, timeUnit);
        if (guard.monitor == this) {
            ReentrantLock reentrantLock = this.lock;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean interrupted = Thread.interrupted();
            try {
                boolean z7 = true;
                if (!this.fair && reentrantLock.tryLock()) {
                    initNanoTime = 0;
                    while (!guard.isSatisfied()) {
                        try {
                            if (initNanoTime == 0) {
                                initNanoTime = initNanoTime(safeNanos);
                                remainingNanos = safeNanos;
                            } else {
                                remainingNanos = remainingNanos(initNanoTime, safeNanos);
                            }
                            z7 = awaitNanos(guard, remainingNanos, isHeldByCurrentThread);
                        } catch (InterruptedException unused) {
                            isHeldByCurrentThread = false;
                            interrupted = true;
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    if (!z7) {
                        reentrantLock.unlock();
                    }
                    if (interrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return z7;
                }
                initNanoTime = initNanoTime(safeNanos);
                long j9 = safeNanos;
                while (true) {
                    try {
                        try {
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            interrupted = true;
                            if (interrupted) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused2) {
                        j9 = remainingNanos(initNanoTime, safeNanos);
                        interrupted = true;
                    }
                }
                if (!reentrantLock.tryLock(j9, TimeUnit.NANOSECONDS)) {
                    if (interrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
                while (!guard.isSatisfied()) {
                }
                if (!z7) {
                }
                if (interrupted) {
                }
                return z7;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }
}
