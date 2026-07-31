package s4;

import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import t4.C0664a;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632a implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final C0664a f5880f;

    public C0632a(C0664a c0664a) {
        this.f5880f = c0664a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        int i7;
        RandomAccessFile randomAccessFile = this.f5880f.f5961f;
        int i8 = 0;
        try {
            i7 = randomAccessFile.read();
        } catch (IOException unused) {
        }
        if (i7 != -1) {
            if ((i7 & 128) != 0) {
                i7 &= 127;
                int i9 = 7;
                while (true) {
                    if (i9 >= 32) {
                        while (i9 < 64) {
                            int read = randomAccessFile.read();
                            if (read == -1) {
                                throw new IllegalStateException();
                            }
                            if ((read & 128) != 0) {
                                i9 += 7;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    int read2 = randomAccessFile.read();
                    if (read2 == -1) {
                        throw new IllegalStateException();
                    }
                    i7 |= (read2 & 127) << i9;
                    if ((read2 & 128) == 0) {
                        break;
                    }
                    i9 += 7;
                }
            }
            if (i7 >= 1) {
                return null;
            }
            byte[] bArr = new byte[i7];
            do {
                int read3 = randomAccessFile.read(bArr, i8, i7 - i8);
                i8 += read3;
                if (read3 == -1) {
                    break;
                }
            } while (i8 < i7);
            if (i8 != i7) {
                return null;
            }
            return bArr;
        }
        i7 = 0;
        if (i7 >= 1) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5880f.close();
    }
}
