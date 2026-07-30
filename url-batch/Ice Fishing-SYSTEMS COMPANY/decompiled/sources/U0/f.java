package U0;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final k f3228n;

    /* renamed from: u, reason: collision with root package name */
    public final J3.a f3229u;

    public f(k kVar, J3.a aVar) {
        this.f3228n = kVar;
        this.f3229u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3228n.f3237n != this) {
            return;
        }
        if (i.f3235y.d(this.f3228n, this, i.f(this.f3229u))) {
            i.b(this.f3228n);
        }
    }
}
