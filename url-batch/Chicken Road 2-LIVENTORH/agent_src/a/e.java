package a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g.j f16g;

    public /* synthetic */ e(g.j jVar, int i) {
        this.f15f = i;
        this.f16g = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15f) {
            case 0:
                this.f16g.invalidateOptionsMenu();
                break;
            default:
                m.f(this.f16g);
                break;
        }
    }
}
