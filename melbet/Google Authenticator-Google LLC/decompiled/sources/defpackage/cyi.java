package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyi implements AutoCloseable {
    public static final cyi a = new cyi(1);
    private final /* synthetic */ int b;

    public cyi(String str, int i, byte[] bArr) {
        this.b = i;
        Trace.beginSection(str.length() > 127 ? String.valueOf(str.substring(0, 124)).concat("...") : str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i == 0) {
            Trace.endSection();
        } else if (i != 1) {
            Trace.endSection();
        }
    }

    public cyi(String str, int i) {
        this.b = i;
        Trace.beginSection(str);
    }

    private cyi(int i) {
        this.b = i;
    }
}
