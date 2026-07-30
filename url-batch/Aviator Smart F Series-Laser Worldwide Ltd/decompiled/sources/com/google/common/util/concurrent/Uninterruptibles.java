package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Uninterruptibles {
    private Uninterruptibles() {
    }

    @GwtIncompatible
    public static void awaitTerminationUninterruptibly(ExecutorService executorService) {
        Verify.verify(awaitTerminationUninterruptibly(executorService, Long.MAX_VALUE, TimeUnit.NANOSECONDS));
    }

    @GwtIncompatible
    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        boolean z7 = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getUninterruptibly(Future<V> future) {
        V v7;
        boolean z7 = false;
        while (true) {
            try {
                v7 = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return v7;
    }

    @GwtIncompatible
    public static void joinUninterruptibly(Thread thread) {
        boolean z7 = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    @GwtIncompatible
    public static <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e8) {
        boolean z7 = false;
        while (true) {
            try {
                blockingQueue.put(e8);
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    @GwtIncompatible
    public static void sleepUninterruptibly(long j8, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = nanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @GwtIncompatible
    public static <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z7 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, long j8, TimeUnit timeUnit) {
        return tryAcquireUninterruptibly(semaphore, 1, j8, timeUnit);
    }

    @GwtIncompatible
    public static boolean tryLockUninterruptibly(Lock lock, long j8, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return lock.tryLock(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @GwtIncompatible
    public static boolean awaitTerminationUninterruptibly(ExecutorService executorService, long j8, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return executorService.awaitTermination(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, int i8, long j8, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return semaphore.tryAcquire(i8, nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j8, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    @GwtIncompatible
    public static <V> V getUninterruptibly(Future<V> future, long j8, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return future.get(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @GwtIncompatible
    public static void joinUninterruptibly(Thread thread, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(thread);
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = nanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @GwtIncompatible
    public static boolean awaitUninterruptibly(Condition condition, long j8, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return condition.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
