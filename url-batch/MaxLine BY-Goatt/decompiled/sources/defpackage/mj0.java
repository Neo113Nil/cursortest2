package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mj0 extends ij0 {
    public mj0(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.m.mark(Integer.MAX_VALUE);
        } else {
            lh.e("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void f(long j) {
        int i = this.n;
        if (i > j) {
            this.n = 0;
            this.m.reset();
        } else {
            j -= i;
        }
        b((int) j);
    }

    public mj0(byte[] bArr) {
        super(bArr);
        this.m.mark(Integer.MAX_VALUE);
    }
}
