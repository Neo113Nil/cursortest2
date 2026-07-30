package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ig0 extends OutputStream {
    public long d;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.d += i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.d += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.d++;
    }
}
