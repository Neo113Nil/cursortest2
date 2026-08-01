package s8;

import java.io.OutputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f9152d;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i10) {
        int i11;
        if (i3 < 0 || i3 > bArr.length || i10 < 0 || (i11 = i3 + i10) > bArr.length || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f9152d += i10;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f9152d += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f9152d++;
    }
}
