package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etx implements Closeable {
    public final Inflater a = new Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.end();
    }
}
