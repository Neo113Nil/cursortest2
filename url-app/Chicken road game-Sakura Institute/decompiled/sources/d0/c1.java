package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 implements g2.q {

    /* renamed from: a, reason: collision with root package name */
    public int f1876a;

    /* renamed from: b, reason: collision with root package name */
    public int f1877b;

    public /* synthetic */ c1(int i7, int i8) {
        this.f1876a = i7;
        this.f1877b = i8;
    }

    @Override // g2.q
    public int a(int i7) {
        if (i7 >= 0 && i7 <= this.f1877b) {
            w.g0.u(i7, this.f1876a, i7);
        }
        return i7;
    }

    @Override // g2.q
    public int b(int i7) {
        if (i7 >= 0 && i7 <= this.f1876a) {
            w.g0.t(i7, this.f1877b, i7);
        }
        return i7;
    }
}
