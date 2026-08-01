package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public interface i30 extends Closeable, Flushable {
    d60 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(long j, p8 p8Var);

    @Override // java.io.Flushable
    void flush();
}
