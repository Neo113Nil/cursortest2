package a2;

import java.io.OutputStream;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173b extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f3084d;

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f3084d++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3084d += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i5) {
        int i7;
        if (i2 >= 0 && i2 <= bArr.length && i5 >= 0 && (i7 = i2 + i5) <= bArr.length && i7 >= 0) {
            this.f3084d += i5;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
