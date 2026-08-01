package com.bytedance.sdk.component.NB.vG.pvs.pvs;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
class vG implements Closeable {
    private int Jd;
    private int NB;
    private final Charset icD;
    private final InputStream pvs;
    private byte[] vG;

    public vG(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public vG(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(Jd.pvs)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.pvs = inputStream;
        this.icD = charset;
        this.vG = new byte[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.pvs) {
            if (this.vG != null) {
                this.vG = null;
                this.pvs.close();
            }
        }
    }

    public String pvs() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.pvs) {
            if (this.vG == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.Jd >= this.NB) {
                vG();
            }
            for (int i3 = this.Jd; i3 != this.NB; i3++) {
                byte[] bArr2 = this.vG;
                if (bArr2[i3] == 10) {
                    if (i3 != this.Jd) {
                        i2 = i3 - 1;
                        if (bArr2[i2] == 13) {
                            byte[] bArr3 = this.vG;
                            int i4 = this.Jd;
                            String str = new String(bArr3, i4, i2 - i4, this.icD.name());
                            this.Jd = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    byte[] bArr32 = this.vG;
                    int i42 = this.Jd;
                    String str2 = new String(bArr32, i42, i2 - i42, this.icD.name());
                    this.Jd = i3 + 1;
                    return str2;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.NB - this.Jd) + 80) { // from class: com.bytedance.sdk.component.NB.vG.pvs.pvs.vG.1
                @Override // java.io.ByteArrayOutputStream
                public String toString() {
                    try {
                        return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, vG.this.icD.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr4 = this.vG;
                int i5 = this.Jd;
                byteArrayOutputStream.write(bArr4, i5, this.NB - i5);
                this.NB = -1;
                vG();
                i = this.Jd;
                while (i != this.NB) {
                    bArr = this.vG;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.Jd;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.Jd = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public boolean icD() {
        return this.NB == -1;
    }

    private void vG() throws IOException {
        InputStream inputStream = this.pvs;
        byte[] bArr = this.vG;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.Jd = 0;
        this.NB = read;
    }
}
