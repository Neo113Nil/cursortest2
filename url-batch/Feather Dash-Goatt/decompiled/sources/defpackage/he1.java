package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class he1 implements ge1 {
    public final ha d = new ha(0);

    public final boolean f(int i) {
        return (this.d.get() & i) != 0;
    }

    public final void g(int i) {
        ha haVar;
        int i2;
        do {
            haVar = this.d;
            i2 = haVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!haVar.compareAndSet(i2, i2 | i));
    }
}
