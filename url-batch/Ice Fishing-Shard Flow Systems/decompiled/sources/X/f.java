package X;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f2793d.mark(Integer.MAX_VALUE);
    }

    public final void d(long j) {
        int i2 = this.f2794e;
        if (i2 > j) {
            this.f2794e = 0;
            this.f2793d.reset();
        } else {
            j -= i2;
        }
        a((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f2793d.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
