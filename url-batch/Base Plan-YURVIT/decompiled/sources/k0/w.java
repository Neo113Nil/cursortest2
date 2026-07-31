package k0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2758a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f2759b;

    public w(x xVar) {
        this.f2759b = xVar;
    }

    public final void a(boolean z2) {
        if (this.f2758a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f2758a = true;
        x xVar = this.f2759b;
        int i2 = xVar.f2761b - 1;
        xVar.f2761b = i2;
        boolean z3 = z2 | xVar.f2762c;
        xVar.f2762c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        xVar.f2763d.E(xVar.f2760a);
    }
}
