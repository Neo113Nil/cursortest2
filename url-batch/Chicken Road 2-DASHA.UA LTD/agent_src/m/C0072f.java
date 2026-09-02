package m;

import java.io.InputStream;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072f extends C0068b {
    public C0072f(byte[] bArr) {
        super(bArr);
        this.f934b.mark(Integer.MAX_VALUE);
    }

    public final void b(long j2) {
        int i2 = this.f935c;
        if (i2 > j2) {
            this.f935c = 0;
            this.f934b.reset();
        } else {
            j2 -= i2;
        }
        a((int) j2);
    }

    public C0072f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f934b.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
