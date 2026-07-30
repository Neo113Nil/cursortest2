package O7;

/* loaded from: classes2.dex */
public final class e0 extends c0 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f2588A;

    /* renamed from: x, reason: collision with root package name */
    public final h0 f2589x;

    /* renamed from: y, reason: collision with root package name */
    public final f0 f2590y;

    /* renamed from: z, reason: collision with root package name */
    public final C0386k f2591z;

    public e0(h0 h0Var, f0 f0Var, C0386k c0386k, Object obj) {
        this.f2589x = h0Var;
        this.f2590y = f0Var;
        this.f2591z = c0386k;
        this.f2588A = obj;
    }

    @Override // O7.c0
    public final void i(Throwable th) {
        H G7;
        C0386k c0386k = this.f2591z;
        h0 h0Var = this.f2589x;
        h0Var.getClass();
        C0386k M8 = h0.M(c0386k);
        f0 f0Var = this.f2590y;
        Object obj = this.f2588A;
        if (M8 != null) {
            do {
                G7 = M8.f2611x.G((r5 & 1) == 0, (r5 & 2) != 0, new e0(h0Var, f0Var, M8, obj));
                if (G7 != l0.f2612n) {
                    return;
                } else {
                    M8 = h0.M(M8);
                }
            } while (M8 != null);
        }
        h0Var.k(h0Var.v(f0Var, obj));
    }

    @Override // E7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return q7.v.f40183a;
    }
}
