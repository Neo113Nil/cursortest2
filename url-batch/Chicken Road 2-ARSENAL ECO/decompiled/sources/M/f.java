package M;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f1527f.mark(Integer.MAX_VALUE);
    }

    public final void d(long j4) {
        int i7 = this.f1528g;
        if (i7 > j4) {
            this.f1528g = 0;
            this.f1527f.reset();
        } else {
            j4 -= i7;
        }
        a((int) j4);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f1527f.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
