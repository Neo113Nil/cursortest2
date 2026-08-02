package org.bouncycastle.est;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public class CTEChunkedInputStream extends InputStream {
    int chunkLen = 0;
    private InputStream src;

    public CTEChunkedInputStream(InputStream inputStream) {
        this.src = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        return r0.toString().trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String readEOL() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = this.src.read();
            if (read != -1) {
                byteArrayOutputStream.write(read & 255);
                if (read == 10) {
                    break;
                }
            } else if (byteArrayOutputStream.size() == 0) {
                return null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        String readEOL;
        int i = this.chunkLen;
        if (i == Integer.MIN_VALUE) {
            return -1;
        }
        if (i == 0) {
            do {
                readEOL = readEOL();
                if (readEOL == null) {
                    break;
                }
            } while (readEOL.length() == 0);
            if (readEOL == null) {
                return -1;
            }
            int parseInt = Integer.parseInt(readEOL.trim(), 16);
            this.chunkLen = parseInt;
            if (parseInt == 0) {
                readEOL();
                this.chunkLen = PKIFailureInfo.systemUnavail;
                return -1;
            }
        }
        this.chunkLen--;
        return this.src.read();
    }
}
