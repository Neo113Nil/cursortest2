package n2;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class n extends InputStream {

    /* renamed from: f, reason: collision with root package name */
    private final l f19474f;

    /* renamed from: g, reason: collision with root package name */
    private final p f19475g;

    /* renamed from: k, reason: collision with root package name */
    private long f19479k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19477i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19478j = false;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f19476h = new byte[1];

    public n(l lVar, p pVar) {
        this.f19474f = lVar;
        this.f19475g = pVar;
    }

    private void b() {
        if (this.f19477i) {
            return;
        }
        this.f19474f.b(this.f19475g);
        this.f19477i = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19478j) {
            return;
        }
        this.f19474f.close();
        this.f19478j = true;
    }

    public void f() {
        b();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f19476h) == -1) {
            return -1;
        }
        return this.f19476h[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        o2.a.f(!this.f19478j);
        b();
        int read = this.f19474f.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        this.f19479k += read;
        return read;
    }
}
