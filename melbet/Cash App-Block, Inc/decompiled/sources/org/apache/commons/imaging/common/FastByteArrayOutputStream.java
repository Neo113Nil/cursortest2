package org.apache.commons.imaging.common;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.OutputStream;

/* loaded from: classes9.dex */
class FastByteArrayOutputStream extends OutputStream {
    private final byte[] bytes;
    private int count;

    public FastByteArrayOutputStream(int i) {
        this.bytes = new byte[i];
    }

    public int getBytesWritten() {
        return this.count;
    }

    public byte[] toByteArray() {
        int i = this.count;
        byte[] bArr = this.bytes;
        if (i >= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        int i2 = this.count;
        byte[] bArr = this.bytes;
        if (i2 < bArr.length) {
            bArr[i2] = (byte) i;
            this.count = i2 + 1;
        } else {
            StringBuilder sb = new StringBuilder("Write exceeded expected length (");
            sb.append(this.count);
            sb.append(", ");
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bytes.length, ")", sb));
        }
    }
}
