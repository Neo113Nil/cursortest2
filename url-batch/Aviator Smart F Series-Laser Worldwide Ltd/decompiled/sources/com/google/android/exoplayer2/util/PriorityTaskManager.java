package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

@Deprecated
/* loaded from: classes3.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i8, int i9) {
            super("Priority too low [priority=" + i8 + ", highest=" + i9 + "]");
        }
    }

    public void add(int i8) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i8));
            this.highestPriority = Math.max(this.highestPriority, i8);
        }
    }

    public void proceed(int i8) {
        synchronized (this.lock) {
            while (this.highestPriority != i8) {
                try {
                    this.lock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i8) {
        boolean z7;
        synchronized (this.lock) {
            z7 = this.highestPriority == i8;
        }
        return z7;
    }

    public void proceedOrThrow(int i8) {
        synchronized (this.lock) {
            try {
                if (this.highestPriority != i8) {
                    throw new PriorityTooLowException(i8, this.highestPriority);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void remove(int i8) {
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i8));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : ((Integer) Util.castNonNull(this.queue.peek())).intValue();
            this.lock.notifyAll();
        }
    }
}
