package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rd {
    static final rd a;
    static final rd b;
    final boolean c;
    final Throwable d;

    static {
        if (rl.a) {
            b = null;
            a = null;
        } else {
            b = new rd(false, null);
            a = new rd(true, null);
        }
    }

    public rd(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
