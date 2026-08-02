package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvr implements Closeable {
    public final long a;

    public gvr(long j) {
        this.a = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fao.d(new gfm(this, 16), 5000L);
    }
}
