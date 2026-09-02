package n6;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public f f5519f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5520g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f5521h;

    /* renamed from: i, reason: collision with root package name */
    public int f5522i = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5519f == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f5519f = null;
        this.f5521h = null;
        this.f5522i = -1;
    }
}
