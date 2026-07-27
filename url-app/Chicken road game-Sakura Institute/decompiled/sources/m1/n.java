package m1;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class n extends Writer {

    /* renamed from: e, reason: collision with root package name */
    public final StringBuilder f8296e = new StringBuilder(128);

    /* renamed from: d, reason: collision with root package name */
    public final String f8295d = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f8296e;
        if (sb.length() > 0) {
            Log.d(this.f8295d, sb.toString());
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
    public final void write(char[] cArr, int i2, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c4 = cArr[i2 + i5];
            if (c4 == '\n') {
                a();
            } else {
                this.f8296e.append(c4);
            }
        }
    }
}
