package defpackage;

import android.content.Context;
import android.os.SystemClock;
import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyh implements AutoCloseable {
    private final int c;
    private final Context d;
    private final float e;
    private int f = 13;
    private final long a = System.currentTimeMillis();
    private final long b = SystemClock.uptimeMillis();

    public cyh(Context context, int i, float f) {
        this.c = i;
        this.d = context;
        this.e = f;
    }

    public final void a() {
        this.f = 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Context context = this.d;
        if (cyg.a == null) {
            synchronized (cyg.b) {
                if (cyg.a == null) {
                    cyg.a = new cyg(context);
                }
            }
        }
        int i = this.c;
        cyg cygVar = cyg.a;
        int i2 = this.f;
        long j = this.a;
        long j2 = this.b;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis() - j2;
        if (ThreadLocalRandom.current().nextFloat() < this.e) {
            cygVar.a(i, i2, j, currentTimeMillis, (int) uptimeMillis);
        }
    }
}
