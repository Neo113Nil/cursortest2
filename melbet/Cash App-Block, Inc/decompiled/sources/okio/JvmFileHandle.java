package okio;

import java.io.RandomAccessFile;

/* loaded from: classes9.dex */
public final class JvmFileHandle extends FileHandle {
    public final RandomAccessFile randomAccessFile;

    public JvmFileHandle(RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    @Override // okio.FileHandle
    public final synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // okio.FileHandle
    public final synchronized int protectedRead(long j, int i, int i2, byte[] bArr) {
        bArr.getClass();
        this.randomAccessFile.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.randomAccessFile.read(bArr, i, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // okio.FileHandle
    public final synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }
}
