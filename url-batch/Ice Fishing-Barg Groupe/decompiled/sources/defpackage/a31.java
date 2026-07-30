package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a31 extends Writer {
    public final StringBuilder OPXfSBeufaJ8 = new StringBuilder(128);
    public final String rtx2ld2ELZv4 = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lS5Rgt96tfkO();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        lS5Rgt96tfkO();
    }

    public final void lS5Rgt96tfkO() {
        StringBuilder sb = this.OPXfSBeufaJ8;
        if (sb.length() > 0) {
            Log.d(this.rtx2ld2ELZv4, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                lS5Rgt96tfkO();
            } else {
                this.OPXfSBeufaJ8.append(c);
            }
        }
    }
}
