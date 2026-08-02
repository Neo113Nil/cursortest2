package O;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f1952a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j4) {
        int i4 = this.f1953b;
        if (i4 > j4) {
            this.f1953b = 0;
            this.f1952a.reset();
        } else {
            j4 -= i4;
        }
        a((int) j4);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f1952a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
