package w1;

import java.io.OutputStream;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714b extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public long f6179f;

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.f6179f++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f6179f += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 >= 0 && i7 <= bArr.length && i8 >= 0 && (i9 = i7 + i8) <= bArr.length && i9 >= 0) {
            this.f6179f += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
