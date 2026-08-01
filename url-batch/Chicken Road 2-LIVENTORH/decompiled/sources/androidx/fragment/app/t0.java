package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t0 extends Writer {

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f534g = new StringBuilder(128);

    /* renamed from: f, reason: collision with root package name */
    public final String f533f = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f534g;
        if (sb.length() > 0) {
            Log.d(this.f533f, sb.toString());
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
    public final void write(char[] cArr, int i, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c4 = cArr[i + i5];
            if (c4 == '\n') {
                a();
            } else {
                this.f534g.append(c4);
            }
        }
    }
}
