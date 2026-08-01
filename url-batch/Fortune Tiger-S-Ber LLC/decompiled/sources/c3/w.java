package c3;

import java.io.Closeable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class w implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d3.c.b(o());
    }

    public abstract long m();

    public abstract o n();

    public abstract p3.h o();
}
