package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gg1 extends Writer {
    public final StringBuilder n = new StringBuilder(128);
    public final String m = "FragmentManager";

    public final void b() {
        StringBuilder sb = this.n;
        if (sb.length() > 0) {
            Log.d(this.m, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                b();
            } else {
                this.n.append(c);
            }
        }
    }
}
