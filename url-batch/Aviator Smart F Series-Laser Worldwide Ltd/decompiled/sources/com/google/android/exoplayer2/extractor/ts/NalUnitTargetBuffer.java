package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i8, int i9) {
        this.targetType = i8;
        byte[] bArr = new byte[i9 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i8, int i9) {
        if (this.isFilling) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i11 = this.nalLength;
            if (length < i11 + i10) {
                this.nalData = Arrays.copyOf(bArr2, (i11 + i10) * 2);
            }
            System.arraycopy(bArr, i8, this.nalData, this.nalLength, i10);
            this.nalLength += i10;
        }
    }

    public boolean endNalUnit(int i8) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i8;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void startNalUnit(int i8) {
        Assertions.checkState(!this.isFilling);
        boolean z7 = i8 == this.targetType;
        this.isFilling = z7;
        if (z7) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }
}
