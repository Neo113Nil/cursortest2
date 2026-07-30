package n3;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends Writer {

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f6552g = new StringBuilder(128);

    /* renamed from: f, reason: collision with root package name */
    public final String f6551f = "FragmentManager";

    public final void b() {
        StringBuilder sb = this.f6552g;
        if (sb.length() > 0) {
            Log.d(this.f6551f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c4 = cArr[i7 + i9];
            if (c4 == '\n') {
                b();
            } else {
                this.f6552g.append(c4);
            }
        }
    }
}
