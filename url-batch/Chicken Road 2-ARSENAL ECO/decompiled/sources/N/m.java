package N;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class m extends Writer {

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f1674g = new StringBuilder(128);

    /* renamed from: f, reason: collision with root package name */
    public final String f1673f = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f1674g;
        if (sb.length() > 0) {
            Log.d(this.f1673f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                a();
            } else {
                this.f1674g.append(c7);
            }
        }
    }
}
