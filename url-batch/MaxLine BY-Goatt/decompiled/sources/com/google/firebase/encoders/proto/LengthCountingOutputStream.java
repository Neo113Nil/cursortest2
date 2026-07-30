package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class LengthCountingOutputStream extends OutputStream {
    private long length = 0;

    public long getLength() {
        return this.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.length += i2;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.length += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.length++;
    }
}
