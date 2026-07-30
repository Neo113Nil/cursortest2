package cn.hutool.core.io.copy;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.s;
import cn.hutool.core.lang.q;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes.dex */
public class c extends b {
    public c() {
        this(8192);
    }

    private long doCopy(Reader reader, Writer writer, char[] cArr, s sVar) {
        int read;
        long j8 = this.count;
        if (j8 <= 0) {
            j8 = Long.MAX_VALUE;
        }
        long j9 = 0;
        while (j8 > 0 && (read = reader.read(cArr, 0, bufferSize(j8))) >= 0) {
            writer.write(cArr, 0, read);
            if (this.flushEveryBuffer) {
                writer.flush();
            }
            long j10 = read;
            j8 -= j10;
            j9 += j10;
            if (sVar != null) {
                sVar.a(this.count, j9);
            }
        }
        return j9;
    }

    public c(int i8) {
        this(i8, -1L);
    }

    @Override // cn.hutool.core.io.copy.b
    public long copy(Reader reader, Writer writer) {
        q.notNull(reader, "InputStream is null !", new Object[0]);
        q.notNull(writer, "OutputStream is null !", new Object[0]);
        try {
            long doCopy = doCopy(reader, writer, new char[bufferSize(this.count)], null);
            writer.flush();
            return doCopy;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public c(int i8, long j8) {
        this(i8, j8, null);
    }

    public c(int i8, long j8, s sVar) {
        super(i8, j8, sVar);
    }
}
