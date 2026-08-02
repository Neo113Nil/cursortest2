package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bap implements Closeable {
    public final Charset a;
    public int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    public bap(InputStream inputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(baq.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.c = inputStream;
        this.a = charset;
        this.d = new byte[8192];
    }

    private final void b() {
        byte[] bArr = this.d;
        int length = bArr.length;
        int read = this.c.read(bArr, 0, 8192);
        if (read == -1) {
            throw new EOFException();
        }
        this.e = 0;
        this.b = read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r2[r4] != 13) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final String a() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.c) {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.b) {
                b();
            }
            for (int i3 = this.e; i3 != this.b; i3++) {
                byte[] bArr2 = this.d;
                if (bArr2[i3] == 10) {
                    int i4 = this.e;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                    }
                    i2 = i3;
                    String str = new String(bArr2, i4, i2 - i4, this.a.name());
                    this.e = i3 + 1;
                    return str;
                }
            }
            bao baoVar = new bao(this, (this.b - this.e) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.d;
                int i5 = this.e;
                baoVar.write(bArr3, i5, this.b - i5);
                this.b = -1;
                b();
                i = this.e;
                while (i != this.b) {
                    bArr = this.d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.e;
            if (i != i6) {
                baoVar.write(bArr, i6, i - i6);
            }
            this.e = i + 1;
            return baoVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.c;
        synchronized (inputStream) {
            if (this.d != null) {
                this.d = null;
                inputStream.close();
            }
        }
    }
}
