package okio;

import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyTerminationReason;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferOutStatus;
import com.squareup.protos.franklin.common.SetPasscodeResponse;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import java.io.IOException;
import java.io.Serializable;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* loaded from: classes3.dex */
public class AsyncTimeout extends Timeout {
    public static final long IDLE_TIMEOUT_MILLIS;
    public static final long IDLE_TIMEOUT_NANOS;
    public static final Condition condition;
    public static AsyncTimeout idleSentinel;
    public static final ReentrantLock lock;
    public static final PriorityQueue queue;
    public int index = -1;
    public int state;
    public long timeoutAt;

    public final class Watchdog extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            AsyncTimeout awaitTimeout;
            while (true) {
                try {
                    PriorityQueue priorityQueue = AsyncTimeout.queue;
                    reentrantLock = AsyncTimeout.lock;
                    reentrantLock.lock();
                    try {
                        awaitTimeout = Companion.awaitTimeout();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (awaitTimeout == AsyncTimeout.idleSentinel) {
                    AsyncTimeout.idleSentinel = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (awaitTimeout != null) {
                        awaitTimeout.timedOut();
                    }
                }
            }
        }
    }

    static {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.f1547array = new AsyncTimeout[8];
        queue = priorityQueue;
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        condition = newCondition;
        IDLE_TIMEOUT_MILLIS = 60000L;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void enter() {
        long j = this.timeoutNanos;
        boolean z = this.hasDeadline;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.access$insertIntoQueue(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            queue.remove(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        throw null;
    }

    public void timedOut() {
    }

    public final class Companion {
        public static final void access$insertIntoQueue(AsyncTimeout asyncTimeout) {
            PriorityQueue priorityQueue = AsyncTimeout.queue;
            if (AsyncTimeout.idleSentinel == null) {
                AsyncTimeout.idleSentinel = new AsyncTimeout();
                Watchdog watchdog = new Watchdog("Okio Watchdog");
                watchdog.setDaemon(true);
                watchdog.start();
            }
            long nanoTime = System.nanoTime();
            long j = asyncTimeout.timeoutNanos;
            boolean z = asyncTimeout.hasDeadline;
            if (j != 0 && z) {
                asyncTimeout.timeoutAt = Math.min(j, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j != 0) {
                asyncTimeout.timeoutAt = nanoTime + j;
            } else {
                if (!z) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                }
                asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
            }
            PriorityQueue priorityQueue2 = AsyncTimeout.queue;
            int i = priorityQueue2.size + 1;
            priorityQueue2.size = i;
            AsyncTimeout[] asyncTimeoutArr = (AsyncTimeout[]) priorityQueue2.f1547array;
            if (i == asyncTimeoutArr.length) {
                AsyncTimeout[] asyncTimeoutArr2 = new AsyncTimeout[i * 2];
                ArraysKt___ArraysJvmKt.copyInto$default(0, 0, 14, asyncTimeoutArr, asyncTimeoutArr2);
                priorityQueue2.f1547array = asyncTimeoutArr2;
            }
            priorityQueue2.heapifyUp(i, asyncTimeout);
            if (asyncTimeout.index == 1) {
                AsyncTimeout.condition.signal();
            }
        }

        public static AsyncTimeout awaitTimeout() {
            PriorityQueue priorityQueue = AsyncTimeout.queue;
            AsyncTimeout asyncTimeout = ((AsyncTimeout[]) priorityQueue.f1547array)[1];
            if (asyncTimeout == null) {
                long nanoTime = System.nanoTime();
                AsyncTimeout.condition.await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                if (((AsyncTimeout[]) priorityQueue.f1547array)[1] != null || System.nanoTime() - nanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.idleSentinel;
            }
            long nanoTime2 = asyncTimeout.timeoutAt - System.nanoTime();
            if (nanoTime2 > 0) {
                AsyncTimeout.condition.await(nanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            priorityQueue.remove(asyncTimeout);
            asyncTimeout.state = 2;
            return asyncTimeout;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PopupMessage.Placement m4327fromValue(int i) {
            switch (i) {
                case 1:
                    return PopupMessage.Placement.BALANCE_TAB;
                case 2:
                    return PopupMessage.Placement.CARD_TAB;
                case 3:
                    return PopupMessage.Placement.PAYMENT_PAD_TAB;
                case 4:
                    return PopupMessage.Placement.INVESTING_TAB;
                case 5:
                    return PopupMessage.Placement.ACTIVITY_TAB;
                case 6:
                    return PopupMessage.Placement.BITCOIN_TAB;
                case 7:
                    return PopupMessage.Placement.OFFERS_TAB;
                case 8:
                    return PopupMessage.Placement.DISCOVER_TAB;
                case 9:
                    return PopupMessage.Placement.LOCAL_TAB;
                default:
                    return null;
            }
        }

        public Object decode(Serializable serializable) {
            Instant ofEpochMilli = Instant.ofEpochMilli(((Number) serializable).longValue());
            ofEpochMilli.getClass();
            return ofEpochMilli;
        }

        public Object encode(Object obj) {
            Instant instant = (Instant) obj;
            instant.getClass();
            return Long.valueOf(instant.toEpochMilli());
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static EnableCryptocurrencyTransferOutStatus m4329fromValue(int i) {
            if (i == 1) {
                return EnableCryptocurrencyTransferOutStatus.DISALLOWED;
            }
            if (i == 2) {
                return EnableCryptocurrencyTransferOutStatus.CAN_ENABLE;
            }
            if (i == 3) {
                return EnableCryptocurrencyTransferOutStatus.PENDING_REVIEW;
            }
            if (i == 4) {
                return EnableCryptocurrencyTransferOutStatus.ENABLED;
            }
            if (i != 5) {
                return null;
            }
            return EnableCryptocurrencyTransferOutStatus.MISMATCHED_IDV;
        }

        public static JourneyTerminationReason fromValue(int i) {
            if (i == 0) {
                return JourneyTerminationReason.JOURNEY_TERMINATION_REASON_UNSPECIFIED;
            }
            if (i == 1) {
                return JourneyTerminationReason.JOURNEY_TERMINATION_REASON_TIMEOUT_WITH_ACTIVE_USER;
            }
            if (i == 2) {
                return JourneyTerminationReason.JOURNEY_TERMINATION_REASON_TIMEOUT_WITH_IDLE_USER;
            }
            if (i == 3) {
                return JourneyTerminationReason.JOURNEY_TERMINATION_REASON_JOURNEY_RESTARTED;
            }
            if (i != 4) {
                return null;
            }
            return JourneyTerminationReason.JOURNEY_TERMINATION_REASON_MISSING_BLOCKER_FLOW_OUTCOME;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static SetPasscodeResponse.Status m4330fromValue(int i) {
            if (i == 0) {
                return SetPasscodeResponse.Status.INVALID;
            }
            if (i == 1) {
                return SetPasscodeResponse.Status.SUCCESS;
            }
            if (i == 2) {
                return SetPasscodeResponse.Status.CONCURRENT_MODIFICATION;
            }
            if (i == 3) {
                return SetPasscodeResponse.Status.RETRYABLE_FAILURE;
            }
            if (i != 4) {
                return null;
            }
            return SetPasscodeResponse.Status.NONRETRYABLE_FAILURE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static HistoricalRange m4331fromValue(int i) {
            if (i == 1) {
                return HistoricalRange.DAY;
            }
            if (i == 2) {
                return HistoricalRange.WEEK;
            }
            if (i == 3) {
                return HistoricalRange.MONTH;
            }
            if (i == 6) {
                return HistoricalRange.YEAR;
            }
            if (i != 7) {
                return null;
            }
            return HistoricalRange.ALL;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static VerifyPasscodeResponse.Status m4328fromValue(int i) {
            if (i == 0) {
                return VerifyPasscodeResponse.Status.INVALID;
            }
            if (i == 1) {
                return VerifyPasscodeResponse.Status.SUCCESS;
            }
            if (i == 3) {
                return VerifyPasscodeResponse.Status.INVALID_PASSCODE;
            }
            if (i == 4) {
                return VerifyPasscodeResponse.Status.TOO_MANY_ATTEMPTS;
            }
            if (i == 5) {
                return VerifyPasscodeResponse.Status.CARD_BLOCKED;
            }
            if (i != 6) {
                return null;
            }
            return VerifyPasscodeResponse.Status.FAILURE;
        }
    }
}
