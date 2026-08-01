package X;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class S extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f956b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f955a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        g();
    }

    public final void g() {
        StringBuilder sb = this.f956b;
        if (sb.length() > 0) {
            Log.d(this.f955a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                g();
            } else {
                this.f956b.append(c2);
            }
        }
    }
}
