package O;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f1082a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j3) {
        int i3 = this.f1083b;
        if (i3 > j3) {
            this.f1083b = 0;
            this.f1082a.reset();
        } else {
            j3 -= i3;
        }
        a((int) j3);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f1082a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
