package c4;

/* loaded from: classes.dex */
final class r1 extends l1 {
    r1() {
    }

    @Override // c4.l1
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
