package q;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public class c extends Writer {

    /* renamed from: f, reason: collision with root package name */
    private final String f20158f;

    /* renamed from: g, reason: collision with root package name */
    private StringBuilder f20159g = new StringBuilder(128);

    public c(String str) {
        this.f20158f = str;
    }

    private void b() {
        if (this.f20159g.length() > 0) {
            Log.d(this.f20158f, this.f20159g.toString());
            StringBuilder sb = this.f20159g;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                b();
            } else {
                this.f20159g.append(c7);
            }
        }
    }
}
