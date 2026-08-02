package com.squareup.cash.taptopay.encryption.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class HieroglyphPanData {
    public final byte[] encryptedPanBlock;
    public final byte[] encryptionIv;
    public final byte[] hmacPan;

    public HieroglyphPanData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.encryptedPanBlock = bArr;
        this.encryptionIv = bArr2;
        this.hmacPan = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HieroglyphPanData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        if (Arrays.equals(this.encryptedPanBlock, ((HieroglyphPanData) obj).encryptedPanBlock)) {
            return !Arrays.equals(this.encryptionIv, r4.encryptionIv);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.encryptionIv) + (Arrays.hashCode(this.encryptedPanBlock) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.encryptedPanBlock);
        String arrays2 = Arrays.toString(this.encryptionIv);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HieroglyphPanData(encryptedPanBlock=", arrays, ", encryptionIv=", arrays2, ", hmacPan="), Arrays.toString(this.hmacPan), ")");
    }
}
