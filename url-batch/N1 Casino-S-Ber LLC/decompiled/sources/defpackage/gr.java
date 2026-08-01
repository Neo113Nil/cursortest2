package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class gr extends Writer {
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
