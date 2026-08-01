package f4;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends Writer {

    /* renamed from: e, reason: collision with root package name */
    public final StringBuilder f4103e = new StringBuilder(128);

    /* renamed from: d, reason: collision with root package name */
    public final String f4102d = "FragmentManager";

    public final void a() {
        StringBuilder sb2 = this.f4103e;
        if (sb2.length() > 0) {
            Log.d(this.f4102d, sb2.toString());
            sb2.delete(0, sb2.length());
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
    public final void write(char[] cArr, int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i3 + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.f4103e.append(c10);
            }
        }
    }
}
