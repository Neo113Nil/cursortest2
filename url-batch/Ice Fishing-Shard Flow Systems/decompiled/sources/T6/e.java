package T6;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public f f2612d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2613e;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f2614i;

    /* renamed from: l, reason: collision with root package name */
    public int f2615l = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2612d == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f2612d = null;
        this.f2614i = null;
        this.f2615l = -1;
    }
}
