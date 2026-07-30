package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;

@Deprecated
/* loaded from: classes3.dex */
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    public ChannelMixingMatrix(int i8, int i9, float[] fArr) {
        Assertions.checkArgument(i8 > 0, "Input channel count must be positive.");
        Assertions.checkArgument(i9 > 0, "Output channel count must be positive.");
        Assertions.checkArgument(fArr.length == i8 * i9, "Coefficient array length is invalid.");
        this.inputChannelCount = i8;
        this.outputChannelCount = i9;
        this.coefficients = checkCoefficientsValid(fArr);
        int i10 = 0;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        while (i10 < i8) {
            int i11 = 0;
            while (i11 < i9) {
                float mixingCoefficient = getMixingCoefficient(i10, i11);
                boolean z10 = i10 == i11;
                if (mixingCoefficient != 1.0f && z10) {
                    z9 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z7 = false;
                    if (!z10) {
                        z8 = false;
                    }
                }
                i11++;
            }
            i10++;
        }
        this.isZero = z7;
        boolean z11 = isSquare() && z8;
        this.isDiagonal = z11;
        this.isIdentity = z11 && z9;
    }

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i8 = 0; i8 < fArr.length; i8++) {
            if (fArr[i8] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i8 + " is negative.");
            }
        }
        return fArr;
    }

    public static ChannelMixingMatrix create(int i8, int i9) {
        return new ChannelMixingMatrix(i8, i9, createMixingCoefficients(i8, i9));
    }

    private static float[] createMixingCoefficients(int i8, int i9) {
        if (i8 == i9) {
            return initializeIdentityMatrix(i9);
        }
        if (i8 == 1 && i9 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i8 == 2 && i9 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i8 + "->" + i9 + " are not yet implemented.");
    }

    private static float[] initializeIdentityMatrix(int i8) {
        float[] fArr = new float[i8 * i8];
        for (int i9 = 0; i9 < i8; i9++) {
            fArr[(i8 * i9) + i9] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i8, int i9) {
        return this.coefficients[(i8 * this.outputChannelCount) + i9];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f8) {
        float[] fArr = new float[this.coefficients.length];
        int i8 = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i8 >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i8] = fArr2[i8] * f8;
            i8++;
        }
    }
}
