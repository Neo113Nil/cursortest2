package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ur extends Writer {
    public final StringBuilder g = new StringBuilder(128);
    public final String f = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m();
    }

    public final void m() {
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
                m();
            } else {
                this.g.append(c);
            }
        }
    }
}
