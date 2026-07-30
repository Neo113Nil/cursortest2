package cn.hutool.core.io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class b extends Reader {
    private InputStreamReader reader;

    public b(InputStream inputStream) {
        cn.hutool.core.lang.q.notNull(inputStream, "InputStream must be not null!", new Object[0]);
        a aVar = inputStream instanceof a ? (a) inputStream : new a(inputStream);
        try {
            this.reader = new InputStreamReader(aVar, aVar.getCharset());
        } catch (UnsupportedEncodingException unused) {
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.reader.close();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i8, int i9) {
        return this.reader.read(cArr, i8, i9);
    }
}
