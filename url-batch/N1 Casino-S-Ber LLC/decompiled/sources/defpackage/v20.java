package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public interface v20 extends Closeable, Flushable {
    v50 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close();

    void e(long j, u8 u8Var);

    void flush();
}
