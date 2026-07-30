package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];
    private float mLastComputedVelocity = 0.0f;
    private int mDataPointsBufferSize = 0;
    private int mDataPointsBufferLastUsedIndex = 0;

    VelocityTrackerFallback() {
    }

    private void clear() {
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = 0.0f;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j8;
        int i8 = this.mDataPointsBufferSize;
        if (i8 < 2) {
            return 0.0f;
        }
        int i9 = this.mDataPointsBufferLastUsedIndex;
        int i10 = ((i9 + 20) - (i8 - 1)) % 20;
        long j9 = this.mEventTimes[i9];
        while (true) {
            jArr = this.mEventTimes;
            j8 = jArr[i10];
            if (j9 - j8 <= RANGE_MS) {
                break;
            }
            this.mDataPointsBufferSize--;
            i10 = (i10 + 1) % 20;
        }
        int i11 = this.mDataPointsBufferSize;
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = (i10 + 1) % 20;
            if (j8 == jArr[i12]) {
                return 0.0f;
            }
            return this.mMovements[i12] / (r2 - j8);
        }
        int i13 = 0;
        float f8 = 0.0f;
        for (int i14 = 0; i14 < this.mDataPointsBufferSize - 1; i14++) {
            int i15 = i14 + i10;
            long[] jArr2 = this.mEventTimes;
            long j10 = jArr2[i15 % 20];
            int i16 = (i15 + 1) % 20;
            if (jArr2[i16] != j10) {
                i13++;
                float kineticEnergyToVelocity = kineticEnergyToVelocity(f8);
                float f9 = this.mMovements[i16] / (this.mEventTimes[i16] - j10);
                f8 += (f9 - kineticEnergyToVelocity) * Math.abs(f9);
                if (i13 == 1) {
                    f8 *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(f8);
    }

    private static float kineticEnergyToVelocity(float f8) {
        return (f8 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
    }

    void addMovement(@NonNull MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.mDataPointsBufferSize != 0 && eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex] > ASSUME_POINTER_STOPPED_MS) {
            clear();
        }
        int i8 = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        this.mDataPointsBufferLastUsedIndex = i8;
        int i9 = this.mDataPointsBufferSize;
        if (i9 != 20) {
            this.mDataPointsBufferSize = i9 + 1;
        }
        this.mMovements[i8] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
    }

    void computeCurrentVelocity(int i8) {
        computeCurrentVelocity(i8, Float.MAX_VALUE);
    }

    float getAxisVelocity(int i8) {
        if (i8 != 26) {
            return 0.0f;
        }
        return this.mLastComputedVelocity;
    }

    void computeCurrentVelocity(int i8, float f8) {
        float currentVelocity = getCurrentVelocity() * i8;
        this.mLastComputedVelocity = currentVelocity;
        if (currentVelocity < (-Math.abs(f8))) {
            this.mLastComputedVelocity = -Math.abs(f8);
        } else if (this.mLastComputedVelocity > Math.abs(f8)) {
            this.mLastComputedVelocity = Math.abs(f8);
        }
    }
}
