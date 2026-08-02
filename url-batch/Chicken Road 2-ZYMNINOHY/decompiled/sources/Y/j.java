package Y;

import a.AbstractC0124a;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final h f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final k f3696b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3698d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3699e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3697c = new byte[1];

    public j(h hVar, k kVar) {
        this.f3695a = hVar;
        this.f3696b = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3699e) {
            return;
        }
        this.f3695a.close();
        this.f3699e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f3697c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        AbstractC0124a.t(!this.f3699e);
        boolean z = this.f3698d;
        h hVar = this.f3695a;
        if (!z) {
            hVar.b(this.f3696b);
            this.f3698d = true;
        }
        int read = hVar.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
