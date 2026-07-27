package U1;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f3153a;

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f3153a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3153a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        int i6;
        if (i2 >= 0 && i2 <= bArr.length && i3 >= 0 && (i6 = i2 + i3) <= bArr.length && i6 >= 0) {
            this.f3153a += i3;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
