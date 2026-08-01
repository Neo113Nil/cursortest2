package b1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g0 implements f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x0.a f978d = new x0.a(0);

    public final boolean f(int i3) {
        return (i3 & this.f978d.get()) != 0;
    }

    public final void g(int i3) {
        x0.a aVar;
        int i10;
        do {
            aVar = this.f978d;
            i10 = aVar.get();
            if ((i10 & i3) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i10, i10 | i3));
    }
}
