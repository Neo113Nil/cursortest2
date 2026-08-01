package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public interface x50 extends Closeable, Flushable {
    f90 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close();

    void e(long j, h9 h9Var);

    void flush();
}
