package cn.hutool.core.io.copy;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.s;
import cn.hutool.core.lang.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public class a extends b {
    public a() {
        this(8192);
    }

    private long doCopy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer, s sVar) {
        int read;
        long j8 = this.count;
        if (j8 <= 0) {
            j8 = Long.MAX_VALUE;
        }
        long j9 = 0;
        while (j8 > 0 && (read = readableByteChannel.read(byteBuffer)) >= 0) {
            byteBuffer.flip();
            writableByteChannel.write(byteBuffer);
            byteBuffer.clear();
            long j10 = read;
            j8 -= j10;
            j9 += j10;
            if (sVar != null) {
                sVar.a(this.count, j9);
            }
        }
        return j9;
    }

    public a(int i8) {
        this(i8, -1L);
    }

    @Override // cn.hutool.core.io.copy.b
    public long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) {
        q.notNull(readableByteChannel, "InputStream is null !", new Object[0]);
        q.notNull(writableByteChannel, "OutputStream is null !", new Object[0]);
        try {
            return doCopy(readableByteChannel, writableByteChannel, ByteBuffer.allocate(bufferSize(this.count)), null);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public a(int i8, long j8) {
        this(i8, j8, null);
    }

    public a(int i8, long j8, s sVar) {
        super(i8, j8, sVar);
    }
}
