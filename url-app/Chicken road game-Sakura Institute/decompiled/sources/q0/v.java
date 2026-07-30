package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class v implements u {

    /* renamed from: f, reason: collision with root package name */
    public final g0.e f7463f = new g0.e(0);

    public final boolean c(int i7) {
        return (i7 & this.f7463f.get()) != 0;
    }

    public final void d(int i7) {
        g0.e eVar;
        int i8;
        do {
            eVar = this.f7463f;
            i8 = eVar.get();
            if ((i8 & i7) != 0) {
                return;
            }
        } while (!eVar.compareAndSet(i8, i8 | i7));
    }
}
