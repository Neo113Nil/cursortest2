package q3;

/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f20329f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ z f20330g;

    w(z zVar, int i7) {
        this.f20330g = zVar;
        this.f20329f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20330g.c(this.f20329f);
    }
}
