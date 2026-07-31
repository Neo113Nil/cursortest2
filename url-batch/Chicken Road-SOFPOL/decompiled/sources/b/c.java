package b;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f965e;

    public /* synthetic */ c(l lVar, int i) {
        this.f964d = i;
        this.f965e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f964d) {
            case 0:
                l.h(this.f965e);
                break;
            default:
                this.f965e.invalidateOptionsMenu();
                break;
        }
    }
}
