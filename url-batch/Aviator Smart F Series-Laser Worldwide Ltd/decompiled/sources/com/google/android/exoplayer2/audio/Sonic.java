package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.ShortBuffer;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private final int channelCount;
    private final short[] downSampleBuffer;
    private short[] inputBuffer;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private int maxDiff;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private int minDiff;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private short[] outputBuffer;
    private int outputFrameCount;
    private final float pitch;
    private short[] pitchBuffer;
    private int pitchFrameCount;
    private int prevMinDiff;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    public Sonic(int i8, int i9, float f8, float f9, int i10) {
        this.inputSampleRateHz = i8;
        this.channelCount = i9;
        this.speed = f8;
        this.pitch = f9;
        this.rate = i8 / i10;
        this.minPeriod = i8 / 400;
        int i11 = i8 / 65;
        this.maxPeriod = i11;
        int i12 = i11 * 2;
        this.maxRequiredFrameCount = i12;
        this.downSampleBuffer = new short[i12];
        this.inputBuffer = new short[i12 * i9];
        this.outputBuffer = new short[i12 * i9];
        this.pitchBuffer = new short[i12 * i9];
    }

    private void adjustRate(float f8, int i8) {
        int i9;
        int i10;
        if (this.outputFrameCount == i8) {
            return;
        }
        int i11 = this.inputSampleRateHz;
        int i12 = (int) (i11 / f8);
        while (true) {
            if (i12 <= 16384 && i11 <= 16384) {
                break;
            }
            i12 /= 2;
            i11 /= 2;
        }
        moveNewSamplesToPitchBuffer(i8);
        int i13 = 0;
        while (true) {
            int i14 = this.pitchFrameCount;
            if (i13 >= i14 - 1) {
                removePitchFrames(i14 - 1);
                return;
            }
            while (true) {
                i9 = this.oldRatePosition;
                int i15 = (i9 + 1) * i12;
                i10 = this.newRatePosition;
                if (i15 <= i10 * i11) {
                    break;
                }
                this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.channelCount;
                    if (i16 < i17) {
                        this.outputBuffer[(this.outputFrameCount * i17) + i16] = interpolate(this.pitchBuffer, (i17 * i13) + i16, i11, i12);
                        i16++;
                    }
                }
                this.newRatePosition++;
                this.outputFrameCount++;
            }
            int i18 = i9 + 1;
            this.oldRatePosition = i18;
            if (i18 == i11) {
                this.oldRatePosition = 0;
                Assertions.checkState(i10 == i12);
                this.newRatePosition = 0;
            }
            i13++;
        }
    }

    private void changeSpeed(float f8) {
        int skipPitchPeriod;
        int i8 = this.inputFrameCount;
        if (i8 < this.maxRequiredFrameCount) {
            return;
        }
        int i9 = 0;
        do {
            if (this.remainingInputToCopyFrameCount > 0) {
                skipPitchPeriod = copyInputToOutput(i9);
            } else {
                int findPitchPeriod = findPitchPeriod(this.inputBuffer, i9);
                skipPitchPeriod = ((double) f8) > 1.0d ? findPitchPeriod + skipPitchPeriod(this.inputBuffer, i9, f8, findPitchPeriod) : insertPitchPeriod(this.inputBuffer, i9, f8, findPitchPeriod);
            }
            i9 += skipPitchPeriod;
        } while (this.maxRequiredFrameCount + i9 <= i8);
        removeProcessedInputFrames(i9);
    }

    private int copyInputToOutput(int i8) {
        int min = Math.min(this.maxRequiredFrameCount, this.remainingInputToCopyFrameCount);
        copyToOutput(this.inputBuffer, i8, min);
        this.remainingInputToCopyFrameCount -= min;
        return min;
    }

    private void copyToOutput(short[] sArr, int i8, int i9) {
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i9);
        this.outputBuffer = ensureSpaceForAdditionalFrames;
        int i10 = this.channelCount;
        System.arraycopy(sArr, i8 * i10, ensureSpaceForAdditionalFrames, this.outputFrameCount * i10, i10 * i9);
        this.outputFrameCount += i9;
    }

    private void downSampleInput(short[] sArr, int i8, int i9) {
        int i10 = this.maxRequiredFrameCount / i9;
        int i11 = this.channelCount;
        int i12 = i9 * i11;
        int i13 = i8 * i11;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                i15 += sArr[(i14 * i12) + i13 + i16];
            }
            this.downSampleBuffer[i14] = (short) (i15 / i12);
        }
    }

    private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i8, int i9) {
        int length = sArr.length;
        int i10 = this.channelCount;
        int i11 = length / i10;
        return i8 + i9 <= i11 ? sArr : Arrays.copyOf(sArr, (((i11 * 3) / 2) + i9) * i10);
    }

    private int findPitchPeriod(short[] sArr, int i8) {
        int i9;
        int i10 = this.inputSampleRateHz;
        int i11 = i10 > 4000 ? i10 / 4000 : 1;
        if (this.channelCount == 1 && i11 == 1) {
            i9 = findPitchPeriodInRange(sArr, i8, this.minPeriod, this.maxPeriod);
        } else {
            downSampleInput(sArr, i8, i11);
            int findPitchPeriodInRange = findPitchPeriodInRange(this.downSampleBuffer, 0, this.minPeriod / i11, this.maxPeriod / i11);
            if (i11 != 1) {
                int i12 = findPitchPeriodInRange * i11;
                int i13 = i11 * 4;
                int i14 = i12 - i13;
                int i15 = i12 + i13;
                int i16 = this.minPeriod;
                if (i14 < i16) {
                    i14 = i16;
                }
                int i17 = this.maxPeriod;
                if (i15 > i17) {
                    i15 = i17;
                }
                if (this.channelCount == 1) {
                    i9 = findPitchPeriodInRange(sArr, i8, i14, i15);
                } else {
                    downSampleInput(sArr, i8, 1);
                    i9 = findPitchPeriodInRange(this.downSampleBuffer, 0, i14, i15);
                }
            } else {
                i9 = findPitchPeriodInRange;
            }
        }
        int i18 = previousPeriodBetter(this.minDiff, this.maxDiff) ? this.prevPeriod : i9;
        this.prevMinDiff = this.minDiff;
        this.prevPeriod = i9;
        return i18;
    }

    private int findPitchPeriodInRange(short[] sArr, int i8, int i9, int i10) {
        int i11 = i8 * this.channelCount;
        int i12 = 255;
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        while (i9 <= i10) {
            int i16 = 0;
            for (int i17 = 0; i17 < i9; i17++) {
                i16 += Math.abs(sArr[i11 + i17] - sArr[(i11 + i9) + i17]);
            }
            if (i16 * i14 < i13 * i9) {
                i14 = i9;
                i13 = i16;
            }
            if (i16 * i12 > i15 * i9) {
                i12 = i9;
                i15 = i16;
            }
            i9++;
        }
        this.minDiff = i13 / i14;
        this.maxDiff = i15 / i12;
        return i14;
    }

    private int insertPitchPeriod(short[] sArr, int i8, float f8, int i9) {
        int i10;
        if (f8 < 0.5f) {
            i10 = (int) ((i9 * f8) / (1.0f - f8));
        } else {
            this.remainingInputToCopyFrameCount = (int) ((i9 * ((2.0f * f8) - 1.0f)) / (1.0f - f8));
            i10 = i9;
        }
        int i11 = i9 + i10;
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i11);
        this.outputBuffer = ensureSpaceForAdditionalFrames;
        int i12 = this.channelCount;
        System.arraycopy(sArr, i8 * i12, ensureSpaceForAdditionalFrames, this.outputFrameCount * i12, i12 * i9);
        overlapAdd(i10, this.channelCount, this.outputBuffer, this.outputFrameCount + i9, sArr, i8 + i9, sArr, i8);
        this.outputFrameCount += i11;
        return i10;
    }

    private short interpolate(short[] sArr, int i8, int i9, int i10) {
        short s7 = sArr[i8];
        short s8 = sArr[i8 + this.channelCount];
        int i11 = this.newRatePosition * i9;
        int i12 = this.oldRatePosition;
        int i13 = i12 * i10;
        int i14 = (i12 + 1) * i10;
        int i15 = i14 - i11;
        int i16 = i14 - i13;
        return (short) (((s7 * i15) + ((i16 - i15) * s8)) / i16);
    }

    private void moveNewSamplesToPitchBuffer(int i8) {
        int i9 = this.outputFrameCount - i8;
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.pitchBuffer, this.pitchFrameCount, i9);
        this.pitchBuffer = ensureSpaceForAdditionalFrames;
        short[] sArr = this.outputBuffer;
        int i10 = this.channelCount;
        System.arraycopy(sArr, i8 * i10, ensureSpaceForAdditionalFrames, this.pitchFrameCount * i10, i10 * i9);
        this.outputFrameCount = i8;
        this.pitchFrameCount += i9;
    }

    private static void overlapAdd(int i8, int i9, short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12) {
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = (i10 * i9) + i13;
            int i15 = (i12 * i9) + i13;
            int i16 = (i11 * i9) + i13;
            for (int i17 = 0; i17 < i8; i17++) {
                sArr[i14] = (short) (((sArr2[i16] * (i8 - i17)) + (sArr3[i15] * i17)) / i8);
                i14 += i9;
                i16 += i9;
                i15 += i9;
            }
        }
    }

    private boolean previousPeriodBetter(int i8, int i9) {
        return i8 != 0 && this.prevPeriod != 0 && i9 <= i8 * 3 && i8 * 2 > this.prevMinDiff * 3;
    }

    private void processStreamInput() {
        int i8 = this.outputFrameCount;
        float f8 = this.speed;
        float f9 = this.pitch;
        float f10 = f8 / f9;
        float f11 = this.rate * f9;
        double d8 = f10;
        if (d8 > 1.00001d || d8 < 0.99999d) {
            changeSpeed(f10);
        } else {
            copyToOutput(this.inputBuffer, 0, this.inputFrameCount);
            this.inputFrameCount = 0;
        }
        if (f11 != 1.0f) {
            adjustRate(f11, i8);
        }
    }

    private void removePitchFrames(int i8) {
        if (i8 == 0) {
            return;
        }
        short[] sArr = this.pitchBuffer;
        int i9 = this.channelCount;
        System.arraycopy(sArr, i8 * i9, sArr, 0, (this.pitchFrameCount - i8) * i9);
        this.pitchFrameCount -= i8;
    }

    private void removeProcessedInputFrames(int i8) {
        int i9 = this.inputFrameCount - i8;
        short[] sArr = this.inputBuffer;
        int i10 = this.channelCount;
        System.arraycopy(sArr, i8 * i10, sArr, 0, i10 * i9);
        this.inputFrameCount = i9;
    }

    private int skipPitchPeriod(short[] sArr, int i8, float f8, int i9) {
        int i10;
        if (f8 >= 2.0f) {
            i10 = (int) (i9 / (f8 - 1.0f));
        } else {
            this.remainingInputToCopyFrameCount = (int) ((i9 * (2.0f - f8)) / (f8 - 1.0f));
            i10 = i9;
        }
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i10);
        this.outputBuffer = ensureSpaceForAdditionalFrames;
        overlapAdd(i10, this.channelCount, ensureSpaceForAdditionalFrames, this.outputFrameCount, sArr, i8, sArr, i8 + i9);
        this.outputFrameCount += i10;
        return i10;
    }

    public void flush() {
        this.inputFrameCount = 0;
        this.outputFrameCount = 0;
        this.pitchFrameCount = 0;
        this.oldRatePosition = 0;
        this.newRatePosition = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.prevPeriod = 0;
        this.prevMinDiff = 0;
        this.minDiff = 0;
        this.maxDiff = 0;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.channelCount, this.outputFrameCount);
        shortBuffer.put(this.outputBuffer, 0, this.channelCount * min);
        int i8 = this.outputFrameCount - min;
        this.outputFrameCount = i8;
        short[] sArr = this.outputBuffer;
        int i9 = this.channelCount;
        System.arraycopy(sArr, min * i9, sArr, 0, i8 * i9);
    }

    public int getOutputSize() {
        return this.outputFrameCount * this.channelCount * 2;
    }

    public int getPendingInputBytes() {
        return this.inputFrameCount * this.channelCount * 2;
    }

    public void queueEndOfStream() {
        int i8;
        int i9 = this.inputFrameCount;
        float f8 = this.speed;
        float f9 = this.pitch;
        int i10 = this.outputFrameCount + ((int) ((((i9 / (f8 / f9)) + this.pitchFrameCount) / (this.rate * f9)) + 0.5f));
        this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, i9, (this.maxRequiredFrameCount * 2) + i9);
        int i11 = 0;
        while (true) {
            i8 = this.maxRequiredFrameCount;
            int i12 = this.channelCount;
            if (i11 >= i8 * 2 * i12) {
                break;
            }
            this.inputBuffer[(i12 * i9) + i11] = 0;
            i11++;
        }
        this.inputFrameCount += i8 * 2;
        processStreamInput();
        if (this.outputFrameCount > i10) {
            this.outputFrameCount = i10;
        }
        this.inputFrameCount = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.pitchFrameCount = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i8 = this.channelCount;
        int i9 = remaining / i8;
        short[] ensureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.inputBuffer, this.inputFrameCount, i9);
        this.inputBuffer = ensureSpaceForAdditionalFrames;
        shortBuffer.get(ensureSpaceForAdditionalFrames, this.inputFrameCount * this.channelCount, ((i8 * i9) * 2) / 2);
        this.inputFrameCount += i9;
        processStreamInput();
    }
}
