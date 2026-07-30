package U3;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class b extends OutputStream {

    /* renamed from: n, reason: collision with root package name */
    public long f3284n;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f3284n++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3284n += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) {
        int i9;
        if (i >= 0 && i <= bArr.length && i4 >= 0 && (i9 = i + i4) <= bArr.length && i9 >= 0) {
            this.f3284n += i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
