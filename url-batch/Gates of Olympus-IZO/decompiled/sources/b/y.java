package b;

/* loaded from: classes.dex */
public final class y extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f4206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(F f3, int i3) {
        super(0);
        this.f4205e = i3;
        this.f4206f = f3;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f4205e) {
            case 0:
                this.f4206f.c();
                break;
            case 1:
                this.f4206f.b();
                break;
            default:
                this.f4206f.c();
                break;
        }
        return L1.z.f2729a;
    }
}
