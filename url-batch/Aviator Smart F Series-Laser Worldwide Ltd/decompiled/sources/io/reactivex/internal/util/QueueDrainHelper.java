package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z7, boolean z8, c cVar, boolean z9, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z7) {
            return false;
        }
        if (z9) {
            if (!z8) {
                return false;
            }
            Throwable error = queueDrain.error();
            if (error != null) {
                cVar.onError(error);
            } else {
                cVar.onComplete();
            }
            return true;
        }
        Throwable error2 = queueDrain.error();
        if (error2 != null) {
            simpleQueue.clear();
            cVar.onError(error2);
            return true;
        }
        if (!z8) {
            return false;
        }
        cVar.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i8) {
        return i8 < 0 ? new SpscLinkedArrayQueue(-i8) : new SpscArrayQueue(i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r1 = r15.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T, U> void drainLoop(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z7, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        int i8 = 1;
        while (!checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer, z7, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean done = observableQueueDrain.done();
                T poll = simplePlainQueue.poll();
                boolean z8 = poll == null;
                if (checkTerminated(done, z8, observer, z7, simplePlainQueue, disposable, observableQueueDrain)) {
                    return;
                }
                if (z8) {
                    break;
                } else {
                    observableQueueDrain.accept(observer, poll);
                }
            }
        }
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, c cVar, boolean z7, Disposable disposable, QueueDrain<T, U> queueDrain) {
        int i8 = 1;
        while (true) {
            boolean done = queueDrain.done();
            T poll = simplePlainQueue.poll();
            boolean z8 = poll == null;
            if (checkTerminated(done, z8, cVar, z7, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else if (z8) {
                i8 = queueDrain.leave(-i8);
                if (i8 == 0) {
                    return;
                }
            } else {
                long requested = queueDrain.requested();
                if (requested == 0) {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (queueDrain.accept(cVar, poll) && requested != Long.MAX_VALUE) {
                    queueDrain.produced(1L);
                }
            }
        }
    }

    static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> void postComplete(c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j8;
        long j9;
        if (queue.isEmpty()) {
            cVar.onComplete();
            return;
        }
        if (postCompleteDrain(atomicLong.get(), cVar, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j8 = atomicLong.get();
            if ((j8 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j9 = j8 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j8, j9));
        if (j8 != 0) {
            postCompleteDrain(j9, cVar, queue, atomicLong, booleanSupplier);
        }
    }

    static <T> boolean postCompleteDrain(long j8, c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j9 = j8 & Long.MIN_VALUE;
        while (true) {
            if (j9 != j8) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T poll = queue.poll();
                if (poll == null) {
                    cVar.onComplete();
                    return true;
                }
                cVar.onNext(poll);
                j9++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    cVar.onComplete();
                    return true;
                }
                j8 = atomicLong.get();
                if (j8 == j9) {
                    long addAndGet = atomicLong.addAndGet(-(j9 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j8 = addAndGet;
                    j9 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j8, c cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j9;
        do {
            j9 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j9, BackpressureHelper.addCap(Long.MAX_VALUE & j9, j8) | (j9 & Long.MIN_VALUE)));
        if (j9 != Long.MIN_VALUE) {
            return false;
        }
        postCompleteDrain(j8 | Long.MIN_VALUE, cVar, queue, atomicLong, booleanSupplier);
        return true;
    }

    public static void request(d dVar, int i8) {
        dVar.request(i8 < 0 ? Long.MAX_VALUE : i8);
    }

    public static <T, U> boolean checkTerminated(boolean z7, boolean z8, Observer<?> observer, boolean z9, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z7) {
            return false;
        }
        if (z9) {
            if (!z8) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable error = observableQueueDrain.error();
            if (error != null) {
                observer.onError(error);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable error2 = observableQueueDrain.error();
        if (error2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(error2);
            return true;
        }
        if (!z8) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }
}
