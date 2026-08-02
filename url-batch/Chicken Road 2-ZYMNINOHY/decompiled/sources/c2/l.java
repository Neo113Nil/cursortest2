package c2;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f5681b;

    public l(m mVar, int i4) {
        this.f5681b = mVar;
        this.f5680a = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5681b.i(this.f5680a);
    }
}
