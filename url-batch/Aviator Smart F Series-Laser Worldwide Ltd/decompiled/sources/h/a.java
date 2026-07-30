package h;

import cn.hutool.core.io.IORuntimeException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

/* loaded from: classes.dex */
public class a implements Closeable {
    private final boolean nowrap;
    private final InputStream source;
    private OutputStream target;

    public a(InputStream inputStream, OutputStream outputStream, boolean z7) {
        this.source = inputStream;
        this.target = outputStream;
        this.nowrap = z7;
    }

    public static a of(InputStream inputStream, OutputStream outputStream, boolean z7) {
        return new a(inputStream, outputStream, z7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cn.hutool.core.io.n.close((Closeable) this.target);
        cn.hutool.core.io.n.close((Closeable) this.source);
    }

    public a deflater(int i8) {
        OutputStream outputStream = this.target;
        DeflaterOutputStream deflaterOutputStream = outputStream instanceof DeflaterOutputStream ? (DeflaterOutputStream) outputStream : new DeflaterOutputStream(this.target, new Deflater(i8, this.nowrap));
        this.target = deflaterOutputStream;
        cn.hutool.core.io.n.copy(this.source, deflaterOutputStream);
        try {
            ((DeflaterOutputStream) this.target).finish();
            return this;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public OutputStream getTarget() {
        return this.target;
    }

    public a inflater() {
        OutputStream outputStream = this.target;
        InflaterOutputStream inflaterOutputStream = outputStream instanceof InflaterOutputStream ? (InflaterOutputStream) outputStream : new InflaterOutputStream(this.target, new Inflater(this.nowrap));
        this.target = inflaterOutputStream;
        cn.hutool.core.io.n.copy(this.source, inflaterOutputStream);
        try {
            ((InflaterOutputStream) this.target).finish();
            return this;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }
}
