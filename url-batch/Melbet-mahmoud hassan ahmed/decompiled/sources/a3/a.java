package a3;

/* loaded from: classes.dex */
final class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b0 f34f;

    a(b0 b0Var) {
        this.f34f = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34f.f43b = Thread.currentThread();
        this.f34f.a();
    }
}
