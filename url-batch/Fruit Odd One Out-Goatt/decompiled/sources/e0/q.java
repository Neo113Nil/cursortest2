package e0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements k.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f199b;

    public /* synthetic */ q(int i2, Object obj) {
        this.f198a = i2;
        this.f199b = obj;
    }

    @Override // k.a
    public final void accept(Object obj) {
        switch (this.f198a) {
            case 0:
                ((u) this.f199b).setWindowInfoListenerDisplayFeatures((w.j) obj);
                break;
            default:
                ((m1.q) this.f199b).c((w.j) obj);
                break;
        }
    }
}
