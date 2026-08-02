package org.bouncycastle.est;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes9.dex */
class CTEBase64InputStream extends InputStream {
    protected final byte[] data;
    protected final OutputStream dataOutputStream;
    protected boolean end;
    protected final Long max;
    protected final byte[] rawBuf;
    protected long read;
    protected int rp;
    protected final InputStream src;
    protected int wp;

    public CTEBase64InputStream(InputStream inputStream, Long l) {
        this.rawBuf = new byte[1024];
        this.data = new byte[768];
        this.src = inputStream;
        this.dataOutputStream = new OutputStream() { // from class: org.bouncycastle.est.CTEBase64InputStream.1
            @Override // java.io.OutputStream
            public void write(int i) {
                CTEBase64InputStream cTEBase64InputStream = CTEBase64InputStream.this;
                byte[] bArr = cTEBase64InputStream.data;
                int i2 = cTEBase64InputStream.wp;
                cTEBase64InputStream.wp = i2 + 1;
                bArr[i2] = (byte) i;
            }
        };
        this.max = l;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.src.close();
    }

    public int pullFromSrc() {
        int read;
        String str;
        int i = 0;
        do {
            Long l = this.max;
            if (l != null && this.read > l.longValue()) {
                return -1;
            }
            read = this.src.read();
            if (read >= 33 || read == 13 || read == 10) {
                byte[] bArr = this.rawBuf;
                if (i >= bArr.length) {
                    str = "Content Transfer Encoding, base64 line length > 1024";
                    a$$ExternalSyntheticBUOutline0.m$4(str);
                    return 0;
                }
                bArr[i] = (byte) read;
                this.read++;
                i++;
            } else if (read >= 0) {
                this.read++;
            }
            if (read <= -1 || i >= this.rawBuf.length) {
                break;
            }
        } while (read != 10);
        if (i > 0) {
            try {
                Base64.decode(this.rawBuf, 0, i, this.dataOutputStream);
            } catch (Exception e) {
                str = Boxes$$ExternalSyntheticOutline1.m(e, "Decode Base64 Content-Transfer-Encoding: ");
            }
        } else if (read == -1) {
            return -1;
        }
        return this.wp;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.rp == this.wp) {
            this.rp = 0;
            this.wp = 0;
            int pullFromSrc = pullFromSrc();
            if (pullFromSrc == -1) {
                return pullFromSrc;
            }
        }
        byte[] bArr = this.data;
        int i = this.rp;
        this.rp = i + 1;
        return bArr[i] & 255;
    }

    public CTEBase64InputStream(InputStream inputStream) {
        this(inputStream, null);
    }
}
