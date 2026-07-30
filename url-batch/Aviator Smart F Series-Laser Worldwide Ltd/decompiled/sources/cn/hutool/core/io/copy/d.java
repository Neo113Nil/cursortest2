package cn.hutool.core.io.copy;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.s;
import cn.hutool.core.lang.q;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class d extends b {
    public d() {
        this(8192);
    }

    private long doCopy(InputStream inputStream, OutputStream outputStream, byte[] bArr, s sVar) {
        int read;
        long j8 = this.count;
        if (j8 <= 0) {
            j8 = Long.MAX_VALUE;
        }
        long j9 = 0;
        while (j8 > 0 && (read = inputStream.read(bArr, 0, bufferSize(j8))) >= 0) {
            outputStream.write(bArr, 0, read);
            if (this.flushEveryBuffer) {
                outputStream.flush();
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

    public d(int i8) {
        this(i8, -1L);
    }

    @Override // cn.hutool.core.io.copy.b
    public long copy(InputStream inputStream, OutputStream outputStream) {
        q.notNull(inputStream, "InputStream is null !", new Object[0]);
        q.notNull(outputStream, "OutputStream is null !", new Object[0]);
        try {
            long doCopy = doCopy(inputStream, outputStream, new byte[bufferSize(this.count)], null);
            outputStream.flush();
            return doCopy;
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public d(int i8, long j8) {
        this(i8, j8, null);
    }

    public d(int i8, long j8, s sVar) {
        super(i8, j8, sVar);
    }
}
