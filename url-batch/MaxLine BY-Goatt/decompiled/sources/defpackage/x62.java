package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x62 implements Closeable {
    public final mb0 m;

    public x62(mb0 mb0Var) {
        this.m = mb0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }
}
