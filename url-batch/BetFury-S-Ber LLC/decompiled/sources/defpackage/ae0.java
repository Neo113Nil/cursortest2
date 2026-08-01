package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public interface ae0 extends Closeable, Flushable {
    gi0 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    void v(long j, t9 t9Var);
}
