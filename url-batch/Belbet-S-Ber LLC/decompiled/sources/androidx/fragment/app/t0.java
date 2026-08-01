package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t0 extends Writer {

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f643g = new StringBuilder(128);

    /* renamed from: f, reason: collision with root package name */
    public final String f642f = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m();
    }

    public final void m() {
        StringBuilder sb = this.f643g;
        if (sb.length() > 0) {
            Log.d(this.f642f, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c5 = cArr[i + i5];
            if (c5 == '\n') {
                m();
            } else {
                this.f643g.append(c5);
            }
        }
    }
}
