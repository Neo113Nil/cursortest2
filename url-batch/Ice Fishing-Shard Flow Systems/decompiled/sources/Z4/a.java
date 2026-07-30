package Z4;

import a5.C0182a;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final C0182a f3026d;

    public a(C0182a c0182a) {
        this.f3026d = c0182a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        int i2;
        RandomAccessFile randomAccessFile = this.f3026d.f3102d;
        int i5 = 0;
        try {
            i2 = randomAccessFile.read();
        } catch (IOException unused) {
        }
        if (i2 != -1) {
            if ((i2 & 128) != 0) {
                i2 &= 127;
                int i7 = 7;
                while (true) {
                    if (i7 >= 32) {
                        while (i7 < 64) {
                            int read = randomAccessFile.read();
                            if (read == -1) {
                                throw new IllegalStateException();
                            }
                            if ((read & 128) != 0) {
                                i7 += 7;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    int read2 = randomAccessFile.read();
                    if (read2 == -1) {
                        throw new IllegalStateException();
                    }
                    i2 |= (read2 & 127) << i7;
                    if ((read2 & 128) == 0) {
                        break;
                    }
                    i7 += 7;
                }
            }
            if (i2 >= 1) {
                return null;
            }
            byte[] bArr = new byte[i2];
            do {
                int read3 = randomAccessFile.read(bArr, i5, i2 - i5);
                i5 += read3;
                if (read3 == -1) {
                    break;
                }
            } while (i5 < i2);
            if (i5 != i2) {
                return null;
            }
            return bArr;
        }
        i2 = 0;
        if (i2 >= 1) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3026d.close();
    }
}
