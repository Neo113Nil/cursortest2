package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import javax.crypto.Mac;

/* loaded from: classes9.dex */
class MacUpdatingOutputStream extends OutputStream {
    private Mac mac;

    public MacUpdatingOutputStream(Mac mac) {
        this.mac = mac;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.mac.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.mac.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.mac.update(bArr, i, i2);
    }
}
