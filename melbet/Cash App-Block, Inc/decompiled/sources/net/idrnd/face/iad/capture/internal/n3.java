package net.idrnd.face.iad.capture.internal;

/* loaded from: classes9.dex */
public final class n3 implements AutoCloseable {
    public boolean c;
    public final Object a = new Object();
    public final r b = new r();
    public final Object d = new Object();
    public final Object e = new Object();
    public final Object f = new Object();
    public final Object g = new Object();

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.c) {
                return;
            }
            synchronized (this.a) {
                this.b.shutdown();
            }
            synchronized (this.g) {
            }
            synchronized (this.f) {
            }
            this.c = true;
        }
    }
}
