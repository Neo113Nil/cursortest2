package M0;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f929b;

    public l(m mVar, int i3) {
        this.f929b = mVar;
        this.f928a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f929b.i(this.f928a);
    }
}
