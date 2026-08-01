package a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g.i f15g;

    public /* synthetic */ e(g.i iVar, int i) {
        this.f14f = i;
        this.f15g = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14f) {
            case 0:
                this.f15g.invalidateOptionsMenu();
                break;
            default:
                m.d(this.f15g);
                break;
        }
    }
}
