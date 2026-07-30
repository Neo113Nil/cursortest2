package okio;

import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public final class t extends i {
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z7, RandomAccessFile randomAccessFile) {
        super(z7);
        kotlin.jvm.internal.s.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // okio.i
    protected synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // okio.i
    protected synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // okio.i
    protected synchronized int protectedRead(long j8, byte[] array, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        this.randomAccessFile.seek(j8);
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            int read = this.randomAccessFile.read(array, i8, i9 - i10);
            if (read != -1) {
                i10 += read;
            } else if (i10 == 0) {
                return -1;
            }
        }
        return i10;
    }

    @Override // okio.i
    protected synchronized void protectedResize(long j8) {
        try {
            long size = size();
            long j9 = j8 - size;
            if (j9 > 0) {
                int i8 = (int) j9;
                protectedWrite(size, new byte[i8], 0, i8);
            } else {
                this.randomAccessFile.setLength(j8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okio.i
    protected synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // okio.i
    protected synchronized void protectedWrite(long j8, byte[] array, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        this.randomAccessFile.seek(j8);
        this.randomAccessFile.write(array, i8, i9);
    }
}
