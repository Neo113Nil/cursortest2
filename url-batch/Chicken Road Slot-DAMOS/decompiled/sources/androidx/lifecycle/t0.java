package androidx.lifecycle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final w f726d;

    /* renamed from: e, reason: collision with root package name */
    public final o f727e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f728i;

    public t0(w wVar, o oVar) {
        wVar.getClass();
        oVar.getClass();
        this.f726d = wVar;
        this.f727e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f728i) {
            return;
        }
        this.f726d.d(this.f727e);
        this.f728i = true;
    }
}
