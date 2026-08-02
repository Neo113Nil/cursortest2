package w2;

import a.AbstractC0124a;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class f extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i4) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) {
        bArr.getClass();
        AbstractC0124a.r(i4, i5 + i4, bArr.length);
    }
}
