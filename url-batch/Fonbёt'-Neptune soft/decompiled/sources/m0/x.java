package m0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3220a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f3221b;

    public x(y yVar) {
        this.f3221b = yVar;
    }

    public final void a(boolean z2) {
        if (this.f3220a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f3220a = true;
        y yVar = this.f3221b;
        int i2 = yVar.f3223b - 1;
        yVar.f3223b = i2;
        boolean z3 = z2 | yVar.f3224c;
        yVar.f3224c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        yVar.f3225d.K(yVar.f3222a);
    }
}
