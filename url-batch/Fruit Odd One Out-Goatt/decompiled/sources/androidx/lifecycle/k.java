package androidx.lifecycle;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38c;

    public /* synthetic */ k(int i2, Object obj) {
        this.f37b = i2;
        this.f38c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37b) {
            case 0:
                o oVar = (o) this.f38c;
                j jVar = oVar.f47f;
                if (oVar.f43b == 0) {
                    oVar.f44c = true;
                    jVar.a(d.ON_PAUSE);
                }
                if (oVar.f42a == 0 && oVar.f44c) {
                    jVar.a(d.ON_STOP);
                    oVar.f45d = true;
                    break;
                }
                break;
            case 1:
                ((io.flutter.plugin.platform.j) this.f38c).d(false);
                break;
            default:
                ((j0.b) this.f38c).f650b.f658f.prefetchDefaultFontManager();
                break;
        }
    }
}
