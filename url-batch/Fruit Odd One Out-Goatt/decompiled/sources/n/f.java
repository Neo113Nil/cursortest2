package n;

import java.io.InputStream;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f extends b {
    public f(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f888b.mark(Integer.MAX_VALUE);
    }

    public final void b(long j2) {
        int i2 = this.f889c;
        if (i2 > j2) {
            this.f889c = 0;
            this.f888b.reset();
        } else {
            j2 -= i2;
        }
        a((int) j2);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.f888b.mark(Integer.MAX_VALUE);
    }
}
