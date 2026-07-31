package s;

/* renamed from: s.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882y extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7498g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0882y(int i3, int i4, int i5) {
        super(0);
        this.f7496e = i5;
        this.f7497f = i3;
        this.f7498g = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f7496e) {
            case 0:
                return new C0880w(this.f7497f, this.f7498g);
            default:
                return new t.y(this.f7497f, this.f7498g);
        }
    }
}
