package cn.hutool.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
public class a extends InputStream {
    private static final int BOM_SIZE = 4;
    private String charset;
    private final String defaultCharset;
    private final PushbackInputStream in;
    private boolean isInited;

    public a(InputStream inputStream) {
        this(inputStream, cn.hutool.core.util.l.UTF_8);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isInited = true;
        this.in.close();
    }

    public String getCharset() {
        if (!this.isInited) {
            try {
                init();
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
        return this.charset;
    }

    public String getDefaultCharset() {
        return this.defaultCharset;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void init() {
        int i8;
        if (this.isInited) {
            return;
        }
        byte[] bArr = new byte[4];
        int read = this.in.read(bArr, 0, 4);
        byte b8 = bArr[0];
        if (b8 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) {
            this.charset = "UTF-32BE";
        } else {
            if (b8 != -1 || bArr[1] != -2 || bArr[2] != 0 || bArr[3] != 0) {
                if (b8 == -17 && bArr[1] == -69 && bArr[2] == -65) {
                    this.charset = cn.hutool.core.util.l.UTF_8;
                    i8 = read - 3;
                } else {
                    if (b8 == -2 && bArr[1] == -1) {
                        this.charset = "UTF-16BE";
                    } else if (b8 == -1 && bArr[1] == -2) {
                        this.charset = "UTF-16LE";
                    } else {
                        this.charset = this.defaultCharset;
                        i8 = read;
                    }
                    i8 = read - 2;
                }
                if (i8 > 0) {
                    this.in.unread(bArr, read - i8, i8);
                }
                this.isInited = true;
            }
            this.charset = "UTF-32LE";
        }
        i8 = read - 4;
        if (i8 > 0) {
        }
        this.isInited = true;
    }

    @Override // java.io.InputStream
    public int read() {
        this.isInited = true;
        return this.in.read();
    }

    public a(InputStream inputStream, String str) {
        this.isInited = false;
        this.in = new PushbackInputStream(inputStream, 4);
        this.defaultCharset = str;
    }
}
