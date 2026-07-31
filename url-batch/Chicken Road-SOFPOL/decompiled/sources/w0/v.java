package w0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class v implements u {

    /* renamed from: d, reason: collision with root package name */
    public final u0.a f7571d = new u0.a(0);

    public final boolean e(int i) {
        return (i & this.f7571d.get()) != 0;
    }

    public final void f(int i) {
        u0.a aVar;
        int i8;
        do {
            aVar = this.f7571d;
            i8 = aVar.get();
            if ((i8 & i) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i8, i8 | i));
    }
}
