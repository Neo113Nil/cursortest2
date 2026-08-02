package P;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class n extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f1251b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f1250a = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f1251b;
        if (sb.length() > 0) {
            Log.d(this.f1250a, sb.toString());
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
    public final void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = cArr[i3 + i5];
            if (c3 == '\n') {
                a();
            } else {
                this.f1251b.append(c3);
            }
        }
    }
}
