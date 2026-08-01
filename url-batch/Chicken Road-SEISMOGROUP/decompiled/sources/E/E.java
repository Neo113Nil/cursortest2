package E;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public boolean f113a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f114b;

    public E(F f2) {
        this.f114b = f2;
    }

    public final void a(boolean z) {
        if (this.f113a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f113a = true;
        F f2 = this.f114b;
        int i2 = f2.f116b - 1;
        f2.f116b = i2;
        boolean z2 = z | f2.f117c;
        f2.f117c = z2;
        if (i2 != 0 || z2) {
            return;
        }
        f2.f118d.f(f2.f115a);
    }
}
