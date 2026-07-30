package cn.hutool.core.io;

import cn.hutool.core.util.c1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class q {
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final int DEFAULT_LARGE_BUFFER_SIZE = 32768;
    public static final int DEFAULT_MIDDLE_BUFFER_SIZE = 16384;
    public static final int EOF = -1;

    public static void close(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static long copy(FileChannel fileChannel, FileChannel fileChannel2) {
        cn.hutool.core.lang.q.notNull(fileChannel, "In channel is null!", new Object[0]);
        cn.hutool.core.lang.q.notNull(fileChannel2, "Out channel is null!", new Object[0]);
        try {
            return copySafely(fileChannel, fileChannel2);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static long copyByNIO(InputStream inputStream, OutputStream outputStream, int i8, s sVar) {
        return copyByNIO(inputStream, outputStream, i8, -1L, sVar);
    }

    private static long copySafely(FileChannel fileChannel, FileChannel fileChannel2) {
        long size = fileChannel.size();
        long j8 = size;
        long j9 = 0;
        while (j8 > 0) {
            long transferTo = fileChannel.transferTo(j9, j8, fileChannel2);
            j9 += transferTo;
            j8 -= transferTo;
        }
        return size;
    }

    public static String read(ReadableByteChannel readableByteChannel, Charset charset) {
        d read = read(readableByteChannel);
        return charset == null ? read.toString() : read.toString(charset);
    }

    public static String readUtf8(FileChannel fileChannel) {
        return read(fileChannel, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static long copyByNIO(InputStream inputStream, OutputStream outputStream, int i8, long j8, s sVar) {
        long copy = copy(Channels.newChannel(inputStream), Channels.newChannel(outputStream), i8, j8, sVar);
        n.flush(outputStream);
        return copy;
    }

    public static d read(ReadableByteChannel readableByteChannel) {
        d dVar = new d();
        copy(readableByteChannel, Channels.newChannel(dVar));
        return dVar;
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) {
        return copy(readableByteChannel, writableByteChannel, 8192);
    }

    public static String read(FileChannel fileChannel, String str) {
        return read(fileChannel, cn.hutool.core.util.l.charset(str));
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel, int i8) {
        return copy(readableByteChannel, writableByteChannel, i8, null);
    }

    public static String read(FileChannel fileChannel, Charset charset) {
        try {
            return c1.str((ByteBuffer) fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannel.size()).load(), charset);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel, int i8, s sVar) {
        return copy(readableByteChannel, writableByteChannel, i8, -1L, sVar);
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel, int i8, long j8, s sVar) {
        return new cn.hutool.core.io.copy.a(i8, j8, sVar).copy(readableByteChannel, writableByteChannel);
    }
}
