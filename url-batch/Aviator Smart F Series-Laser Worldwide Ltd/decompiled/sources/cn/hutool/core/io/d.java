package cn.hutool.core.io;

import cn.hutool.core.util.e0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class d extends OutputStream {
    private final e buffer;

    public d() {
        this(1024);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void reset() {
        this.buffer.reset();
    }

    public int size() {
        return this.buffer.size();
    }

    public byte[] toByteArray() {
        return this.buffer.toArray();
    }

    public String toString() {
        return toString(cn.hutool.core.util.l.defaultCharset());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        this.buffer.append(bArr, i8, i9);
    }

    public void writeTo(OutputStream outputStream) {
        int index = this.buffer.index();
        if (index < 0) {
            return;
        }
        for (int i8 = 0; i8 < index; i8++) {
            try {
                outputStream.write(this.buffer.array(i8));
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
        outputStream.write(this.buffer.array(index), 0, this.buffer.offset());
    }

    public d(int i8) {
        this.buffer = new e(i8);
    }

    public String toString(String str) {
        return toString(cn.hutool.core.util.l.charset(str));
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        this.buffer.append((byte) i8);
    }

    public String toString(Charset charset) {
        return new String(toByteArray(), (Charset) e0.defaultIfNull(charset, cn.hutool.core.util.l.defaultCharset()));
    }
}
