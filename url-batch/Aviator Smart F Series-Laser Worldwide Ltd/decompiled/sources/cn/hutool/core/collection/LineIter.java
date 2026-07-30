package cn.hutool.core.collection;

import cn.hutool.core.io.IORuntimeException;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes.dex */
public class LineIter extends w implements m0, Closeable, Serializable {
    private static final long serialVersionUID = 1;
    private final BufferedReader bufferedReader;

    public LineIter(InputStream inputStream, Charset charset) {
        this(cn.hutool.core.io.n.getReader(inputStream, charset));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.finish();
        cn.hutool.core.io.n.close((Closeable) this.bufferedReader);
    }

    protected boolean isValidLine(String str) {
        return true;
    }

    @Override // cn.hutool.core.collection.m0, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return l0.a(this);
    }

    public LineIter(Reader reader) {
        cn.hutool.core.lang.q.notNull(reader, "Reader must not be null", new Object[0]);
        this.bufferedReader = cn.hutool.core.io.n.getReader(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.collection.w
    public String computeNext() {
        String readLine;
        do {
            try {
                readLine = this.bufferedReader.readLine();
                if (readLine == null) {
                    return null;
                }
            } catch (IOException e8) {
                close();
                throw new IORuntimeException(e8);
            }
        } while (!isValidLine(readLine));
        return readLine;
    }
}
