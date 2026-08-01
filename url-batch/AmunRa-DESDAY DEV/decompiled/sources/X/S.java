package X;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class S extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f913b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f912a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final void f() {
        StringBuilder sb = this.f913b;
        if (sb.length() > 0) {
            Log.d(this.f912a, sb.toString());
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
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                f();
            } else {
                this.f913b.append(c2);
            }
        }
    }
}
