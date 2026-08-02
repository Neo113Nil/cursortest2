package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hsp {
    static final hsp a;
    static final hsp b;
    final boolean c;
    final Throwable d;

    static {
        if (hte.l) {
            b = null;
            a = null;
        } else {
            b = new hsp(false, null);
            a = new hsp(true, null);
        }
    }

    public hsp(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
