package l1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f5798e;

    public /* synthetic */ m(q qVar, int i3) {
        this.f5797d = i3;
        this.f5798e = qVar;
    }

    @Override // l1.i
    public final double a(double d10) {
        switch (this.f5797d) {
            case 0:
                return be.f.a(this.f5798e.f5811k.a(d10), r10.f5807e, r10.f5808f);
            default:
                return this.f5798e.f5814n.a(be.f.a(d10, r0.f5807e, r0.f5808f));
        }
    }
}
