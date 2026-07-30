package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class b0 extends Writer {

    /* renamed from: e, reason: collision with root package name */
    public final StringBuilder f3714e = new StringBuilder(128);

    /* renamed from: d, reason: collision with root package name */
    public final String f3713d = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f3714e;
        if (sb.length() > 0) {
            Log.d(this.f3713d, sb.toString());
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
    public final void write(char[] cArr, int i2, int i5) {
        for (int i7 = 0; i7 < i5; i7++) {
            char c7 = cArr[i2 + i7];
            if (c7 == '\n') {
                a();
            } else {
                this.f3714e.append(c7);
            }
        }
    }
}
