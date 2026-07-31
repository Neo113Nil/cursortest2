package F;

/* loaded from: classes.dex */
public final class Z implements I0.t {

    /* renamed from: a, reason: collision with root package name */
    public final int f1457a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1458b;

    public /* synthetic */ Z(int i3, int i4) {
        this.f1457a = i3;
        this.f1458b = i4;
    }

    @Override // I0.t
    public int a(int i3) {
        if (i3 >= 0 && i3 <= this.f1458b) {
            x.N.u(i3, this.f1457a, i3);
        }
        return i3;
    }

    @Override // I0.t
    public int b(int i3) {
        if (i3 >= 0 && i3 <= this.f1457a) {
            x.N.t(i3, this.f1458b, i3);
        }
        return i3;
    }
}
