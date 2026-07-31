package D3;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f457b;

    public /* synthetic */ p(int i7, Object obj) {
        this.f456a = i7;
        this.f457b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f456a) {
            case 0:
                ((t) this.f457b).setWindowInfoListenerDisplayFeatures((f0.j) obj);
                break;
            default:
                ((J5.p) ((J5.q) this.f457b)).g((f0.j) obj);
                break;
        }
    }
}
