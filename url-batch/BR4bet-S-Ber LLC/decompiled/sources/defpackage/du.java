package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class du extends Writer {
    public final StringBuilder g = new StringBuilder(128);
    public final String f = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final void f() {
        StringBuilder sb = this.g;
        if (sb.length() > 0) {
            Log.d(this.f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        f();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                f();
            } else {
                this.g.append(c);
            }
        }
    }
}
