package E1;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f376b;

    public /* synthetic */ p(int i3, Object obj) {
        this.f375a = i3;
        this.f376b = obj;
    }

    @Override // D.a
    public final void accept(Object obj) {
        switch (this.f375a) {
            case 0:
                ((t) this.f376b).setWindowInfoListenerDisplayFeatures((g0.j) obj);
                break;
            default:
                ((v2.o) ((v2.p) this.f376b)).j((g0.j) obj);
                break;
        }
    }
}
