package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class og extends xk {
    public static final og i;
    public ff h;

    static {
        int i2 = m80.c;
        int i3 = m80.d;
        long j = m80.e;
        String str = m80.a;
        og ogVar = new og();
        ogVar.h = new ff(i2, i3, j, str);
        i = ogVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.bf
    public final void q(ye yeVar, Runnable runnable) {
        this.h.g(runnable, false);
    }

    @Override // defpackage.bf
    public final String toString() {
        return "Dispatchers.Default";
    }
}
