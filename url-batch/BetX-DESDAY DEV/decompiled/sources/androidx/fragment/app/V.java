package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class V extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f1290b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f1289a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        g();
    }

    public final void g() {
        StringBuilder sb = this.f1290b;
        if (sb.length() > 0) {
            Log.d(this.f1289a, sb.toString());
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
                this.f1290b.append(c2);
            }
        }
    }
}
