package androidx.media3.common.audio;

import androidx.annotation.GuardedBy;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

@UnstableApi
/* loaded from: classes4.dex */
public final class SpeedChangingAudioProcessor extends BaseAudioProcessor {
    private long bytesRead;

    @GuardedBy
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;

    @GuardedBy
    private LongArray inputSegmentStartTimesUs;

    @GuardedBy
    private long lastProcessedInputTimeUs;

    @GuardedBy
    private long lastSpeedAdjustedInputTimeUs;

    @GuardedBy
    private long lastSpeedAdjustedOutputTimeUs;
    private final Object lock;

    @GuardedBy
    private LongArray outputSegmentStartTimesUs;

    @GuardedBy
    private final LongArrayQueue pendingCallbackInputTimesUs;

    @GuardedBy
    private final Queue<TimestampConsumer> pendingCallbacks;
    private final SynchronizedSonicAudioProcessor sonicAudioProcessor;

    @GuardedBy
    private long speedAdjustedTimeAsyncInputTimeUs;
    private final SpeedProvider speedProvider;

    private static double divide(long j, long j2) {
        return j / j2;
    }

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        this.speedProvider = speedProvider;
        Object obj = new Object();
        this.lock = obj;
        this.sonicAudioProcessor = new SynchronizedSonicAudioProcessor(obj);
        this.pendingCallbackInputTimesUs = new LongArrayQueue();
        this.pendingCallbacks = new ArrayDeque();
        this.speedAdjustedTimeAsyncInputTimeUs = -9223372036854775807L;
        resetState();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return this.sonicAudioProcessor.configure(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int i;
        long j = this.bytesRead;
        AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, audioFormat.sampleRate * audioFormat.bytesPerFrame);
        updateSpeed(this.speedProvider.getSpeed(scaleLargeTimestamp), scaleLargeTimestamp);
        int limit = byteBuffer.limit();
        long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(scaleLargeTimestamp);
        if (nextSpeedChangeTimeUs != -9223372036854775807L) {
            long j2 = nextSpeedChangeTimeUs - scaleLargeTimestamp;
            AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
            i = (int) Util.scaleLargeValue(j2, audioFormat2.sampleRate * audioFormat2.bytesPerFrame, 1000000L, RoundingMode.CEILING);
            int i2 = this.inputAudioFormat.bytesPerFrame;
            int i3 = i2 - (i % i2);
            if (i3 != i2) {
                i += i3;
            }
            byteBuffer.limit(Math.min(limit, byteBuffer.position() + i));
        } else {
            i = -1;
        }
        long position = byteBuffer.position();
        if (isUsingSonic()) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
            if (i != -1 && byteBuffer.position() - position == i) {
                this.sonicAudioProcessor.queueEndOfStream();
                this.endOfStreamQueuedToSonic = true;
            }
        } else {
            ByteBuffer replaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                replaceOutputBuffer.put(byteBuffer);
            }
            replaceOutputBuffer.flip();
        }
        this.bytesRead += byteBuffer.position() - position;
        updateLastProcessedInputTime();
        byteBuffer.limit(limit);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onQueueEndOfStream() {
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer output = isUsingSonic() ? this.sonicAudioProcessor.getOutput() : super.getOutput();
        processPendingCallbacks();
        return output;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.sonicAudioProcessor.isEnded();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onFlush() {
        resetState();
        this.sonicAudioProcessor.flush();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onReset() {
        resetState();
        this.sonicAudioProcessor.reset();
    }

    public void getSpeedAdjustedTimeAsync(long j, TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            try {
                Assertions.checkArgument(this.speedAdjustedTimeAsyncInputTimeUs < j);
                this.speedAdjustedTimeAsyncInputTimeUs = j;
                if (j <= this.lastProcessedInputTimeUs) {
                    if (!this.pendingCallbackInputTimesUs.isEmpty()) {
                    }
                    timestampConsumer.onTimestamp(calculateSpeedAdjustedTime(j));
                }
                if (!isEnded()) {
                    this.pendingCallbackInputTimesUs.add(j);
                    this.pendingCallbacks.add(timestampConsumer);
                    return;
                }
                timestampConsumer.onTimestamp(calculateSpeedAdjustedTime(j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long getMediaDurationUs(long j) {
        long round;
        long j2;
        synchronized (this.lock) {
            try {
                int size = this.outputSegmentStartTimesUs.size() - 1;
                while (size > 0 && this.outputSegmentStartTimesUs.get(size) > j) {
                    size--;
                }
                long j3 = j - this.outputSegmentStartTimesUs.get(size);
                if (size == this.outputSegmentStartTimesUs.size() - 1) {
                    round = getMediaDurationUsAtCurrentSpeed(j3);
                } else {
                    int i = size + 1;
                    round = Math.round(j3 * divide(this.inputSegmentStartTimesUs.get(i) - this.inputSegmentStartTimesUs.get(size), this.outputSegmentStartTimesUs.get(i) - this.outputSegmentStartTimesUs.get(size)));
                }
                j2 = this.inputSegmentStartTimesUs.get(size) + round;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    private long calculateSpeedAdjustedTime(long j) {
        long round;
        int size = this.inputSegmentStartTimesUs.size() - 1;
        while (size > 0 && this.inputSegmentStartTimesUs.get(size) > j) {
            size--;
        }
        if (size == this.inputSegmentStartTimesUs.size() - 1) {
            if (this.lastSpeedAdjustedInputTimeUs < this.inputSegmentStartTimesUs.get(size)) {
                this.lastSpeedAdjustedInputTimeUs = this.inputSegmentStartTimesUs.get(size);
                this.lastSpeedAdjustedOutputTimeUs = this.outputSegmentStartTimesUs.get(size);
            }
            round = getPlayoutDurationUsAtCurrentSpeed(j - this.lastSpeedAdjustedInputTimeUs);
        } else {
            int i = size + 1;
            round = Math.round((j - this.lastSpeedAdjustedInputTimeUs) * divide(this.outputSegmentStartTimesUs.get(i) - this.outputSegmentStartTimesUs.get(size), this.inputSegmentStartTimesUs.get(i) - this.inputSegmentStartTimesUs.get(size)));
        }
        this.lastSpeedAdjustedInputTimeUs = j;
        long j2 = this.lastSpeedAdjustedOutputTimeUs + round;
        this.lastSpeedAdjustedOutputTimeUs = j2;
        return j2;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            while (!this.pendingCallbacks.isEmpty() && (this.pendingCallbackInputTimesUs.element() <= this.lastProcessedInputTimeUs || isEnded())) {
                try {
                    this.pendingCallbacks.remove().onTimestamp(calculateSpeedAdjustedTime(this.pendingCallbackInputTimesUs.remove()));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void updateSpeed(float f, long j) {
        synchronized (this.lock) {
            try {
                if (f != this.currentSpeed) {
                    updateSpeedChangeArrays(j);
                    this.currentSpeed = f;
                    if (isUsingSonic()) {
                        this.sonicAudioProcessor.setSpeed(f);
                        this.sonicAudioProcessor.setPitch(f);
                    }
                    this.sonicAudioProcessor.flush();
                    this.endOfStreamQueuedToSonic = false;
                    super.getOutput();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void updateSpeedChangeArrays(long j) {
        long j2 = this.outputSegmentStartTimesUs.get(r0.size() - 1);
        long j3 = j - this.inputSegmentStartTimesUs.get(r2.size() - 1);
        this.inputSegmentStartTimesUs.add(j);
        this.outputSegmentStartTimesUs.add(j2 + getPlayoutDurationUsAtCurrentSpeed(j3));
    }

    private long getPlayoutDurationUsAtCurrentSpeed(long j) {
        return isUsingSonic() ? this.sonicAudioProcessor.getPlayoutDuration(j) : j;
    }

    private long getMediaDurationUsAtCurrentSpeed(long j) {
        return isUsingSonic() ? this.sonicAudioProcessor.getMediaDuration(j) : j;
    }

    private void updateLastProcessedInputTime() {
        synchronized (this.lock) {
            try {
                if (isUsingSonic()) {
                    long processedInputBytes = this.sonicAudioProcessor.getProcessedInputBytes();
                    AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
                    this.lastProcessedInputTimeUs = this.inputSegmentStartTimesUs.get(r3.size() - 1) + Util.scaleLargeTimestamp(processedInputBytes, 1000000L, audioFormat.bytesPerFrame * audioFormat.sampleRate);
                } else {
                    long j = this.bytesRead;
                    AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
                    this.lastProcessedInputTimeUs = Util.scaleLargeTimestamp(j, 1000000L, audioFormat2.bytesPerFrame * audioFormat2.sampleRate);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean isUsingSonic() {
        boolean z;
        synchronized (this.lock) {
            z = this.currentSpeed != 1.0f;
        }
        return z;
    }

    private void resetState() {
        synchronized (this.lock) {
            this.inputSegmentStartTimesUs = new LongArray();
            this.outputSegmentStartTimesUs = new LongArray();
            this.inputSegmentStartTimesUs.add(0L);
            this.outputSegmentStartTimesUs.add(0L);
            this.lastProcessedInputTimeUs = 0L;
            this.lastSpeedAdjustedInputTimeUs = 0L;
            this.lastSpeedAdjustedOutputTimeUs = 0L;
            this.currentSpeed = 1.0f;
        }
        this.bytesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }
}
