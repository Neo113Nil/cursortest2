package D;

/* loaded from: classes.dex */
public final class Z implements G0.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f1685a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1686b;

    public /* synthetic */ Z(int i2, int i4) {
        this.f1685a = i2;
        this.f1686b = i4;
    }

    @Override // G0.s
    public int a(int i2) {
        if (i2 >= 0 && i2 <= this.f1686b) {
            w.M.u(i2, this.f1685a, i2);
        }
        return i2;
    }

    @Override // G0.s
    public int b(int i2) {
        if (i2 >= 0 && i2 <= this.f1685a) {
            w.M.t(i2, this.f1686b, i2);
        }
        return i2;
    }
}
