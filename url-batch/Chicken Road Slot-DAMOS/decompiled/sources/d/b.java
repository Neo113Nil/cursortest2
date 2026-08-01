package d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f3211e;

    public /* synthetic */ b(k kVar, int i3) {
        this.f3210d = i3;
        this.f3211e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3210d) {
            case 0:
                k.h(this.f3211e);
                break;
            default:
                this.f3211e.invalidateOptionsMenu();
                break;
        }
    }
}
