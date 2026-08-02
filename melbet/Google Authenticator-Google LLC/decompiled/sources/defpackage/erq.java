package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class erq implements ero {
    private final koe b;
    private final Object a = new Object();
    private int c = 0;
    private long d = 0;

    public erq(koe koeVar) {
        this.b = koeVar;
    }

    @Override // defpackage.ero
    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.a) {
            this.c++;
            if (elapsedRealtime - this.d > 1000) {
                this.c = 0;
                this.d = elapsedRealtime;
            }
        }
    }

    @Override // defpackage.ero
    public final boolean b() {
        int intValue = ((Integer) this.b.b()).intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue == Integer.MAX_VALUE) {
            return false;
        }
        synchronized (this.a) {
            if (this.c < intValue) {
                return false;
            }
            return SystemClock.elapsedRealtime() - this.d <= 1000;
        }
    }
}
