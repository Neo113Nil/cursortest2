package h4;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends Writer {

    /* renamed from: e, reason: collision with root package name */
    public final StringBuilder f3202e = new StringBuilder(128);

    /* renamed from: d, reason: collision with root package name */
    public final String f3201d = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f3202e;
        if (sb.length() > 0) {
            Log.d(this.f3201d, sb.toString());
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
    public final void write(char[] cArr, int i, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c8 = cArr[i + i9];
            if (c8 == '\n') {
                a();
            } else {
                this.f3202e.append(c8);
            }
        }
    }
}
