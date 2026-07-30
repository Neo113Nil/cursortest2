package h;

import cn.hutool.core.io.IORuntimeException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class b implements Closeable {
    private InputStream source;
    private OutputStream target;

    public b(InputStream inputStream, OutputStream outputStream) {
        this.source = inputStream;
        this.target = outputStream;
    }

    public static b of(InputStream inputStream, OutputStream outputStream) {
        return new b(inputStream, outputStream);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cn.hutool.core.io.n.close((Closeable) this.target);
        cn.hutool.core.io.n.close((Closeable) this.source);
    }

    public OutputStream getTarget() {
        return this.target;
    }

    public b gzip() {
        try {
            OutputStream outputStream = this.target;
            GZIPOutputStream gZIPOutputStream = outputStream instanceof GZIPOutputStream ? (GZIPOutputStream) outputStream : new GZIPOutputStream(this.target);
            this.target = gZIPOutputStream;
            cn.hutool.core.io.n.copy(this.source, gZIPOutputStream);
            ((GZIPOutputStream) this.target).finish();
            return this;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public b unGzip() {
        try {
            InputStream inputStream = this.source;
            GZIPInputStream gZIPInputStream = inputStream instanceof GZIPInputStream ? (GZIPInputStream) inputStream : new GZIPInputStream(this.source);
            this.source = gZIPInputStream;
            cn.hutool.core.io.n.copy(gZIPInputStream, this.target);
            return this;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }
}
