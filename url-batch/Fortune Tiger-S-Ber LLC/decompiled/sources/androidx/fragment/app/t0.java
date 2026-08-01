package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t0 extends Writer {
    public final StringBuilder g = new StringBuilder(128);

    /* renamed from: f, reason: collision with root package name */
    public final String f519f = "FragmentManager";

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
            Log.d(this.f519f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c = cArr[i4 + i6];
            if (c == '\n') {
                m();
            } else {
                this.g.append(c);
            }
        }
    }
}
