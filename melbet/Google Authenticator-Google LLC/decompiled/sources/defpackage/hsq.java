package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hsq implements Runnable {
    final hsw a;
    final hvi b;

    public hsq(hsw hswVar, hvi hviVar) {
        this.a = hswVar;
        this.b = hviVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.valueField != this) {
            return;
        }
        if (hte.u(this.a, this, hsw.i(this.b))) {
            hsw.k(this.a, false);
        }
    }
}
