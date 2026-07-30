package c0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1781a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f1782b;

    public z(A a2) {
        this.f1782b = a2;
    }

    public final void a(boolean z2) {
        if (this.f1781a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f1781a = true;
        A a2 = this.f1782b;
        int i2 = a2.f1662b - 1;
        a2.f1662b = i2;
        boolean z3 = z2 | a2.f1663c;
        a2.f1663c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        a2.f1664d.F(a2.f1661a);
    }
}
