package D;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f35a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f36b;

    public H(I i2) {
        this.f36b = i2;
    }

    public final void a(boolean z2) {
        if (this.f35a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f35a = true;
        I i2 = this.f36b;
        int i3 = i2.f38b - 1;
        i2.f38b = i3;
        boolean z3 = z2 | i2.f39c;
        i2.f39c = z3;
        if (i3 != 0 || z3) {
            return;
        }
        i2.f40d.g(i2.f37a);
    }
}
