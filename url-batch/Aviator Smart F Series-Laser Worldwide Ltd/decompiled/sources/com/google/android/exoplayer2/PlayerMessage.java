package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes3.dex */
public final class PlayerMessage {
    private final Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;

    @Nullable
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private long positionMs = C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i8, @Nullable Object obj);
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i8, Clock clock, Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i8;
    }

    public synchronized boolean blockUntilDelivered() {
        try {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            while (!this.isProcessed) {
                wait();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }

    @CanIgnoreReturnValue
    public synchronized PlayerMessage cancel() {
        Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Looper getLooper() {
        return this.looper;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    @Nullable
    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z7) {
        this.isDelivered = z7 | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    @CanIgnoreReturnValue
    public PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == C.TIME_UNSET) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setDeleteAfterDelivery(boolean z7) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z7;
        return this;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public PlayerMessage setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    @CanIgnoreReturnValue
    public PlayerMessage setLooper(Looper looper) {
        Assertions.checkState(!this.isSent);
        this.looper = looper;
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPayload(@Nullable Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPosition(long j8) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j8;
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setType(int i8) {
        Assertions.checkState(!this.isSent);
        this.type = i8;
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPosition(int i8, long j8) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j8 != C.TIME_UNSET);
        if (i8 < 0 || (!this.timeline.isEmpty() && i8 >= this.timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(this.timeline, i8, j8);
        }
        this.mediaItemIndex = i8;
        this.positionMs = j8;
        return this;
    }

    public synchronized boolean blockUntilDelivered(long j8) {
        boolean z7;
        try {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.looper.getThread() != Thread.currentThread());
            long elapsedRealtime = this.clock.elapsedRealtime() + j8;
            while (true) {
                z7 = this.isProcessed;
                if (z7 || j8 <= 0) {
                    break;
                }
                this.clock.onThreadBlocked();
                wait(j8);
                j8 = elapsedRealtime - this.clock.elapsedRealtime();
            }
            if (!z7) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }
}
