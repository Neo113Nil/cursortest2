package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dz extends Writer {
    public final StringBuilder g = new StringBuilder(128);
    public final String f = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        i();
    }

    public final void i() {
        StringBuilder sb = this.g;
        if (sb.length() > 0) {
            Log.d(this.f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                i();
            } else {
                this.g.append(c);
            }
        }
    }
}
