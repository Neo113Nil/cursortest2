package n;

/* loaded from: classes.dex */
public final class j0 extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f6101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, int i3) {
        super(0);
        this.f6100e = i3;
        this.f6101f = k0Var;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f6100e) {
            case 0:
                return Boolean.valueOf(this.f6101f.f6106a.g() > 0);
            default:
                k0 k0Var = this.f6101f;
                return Boolean.valueOf(k0Var.f6106a.g() < k0Var.f6109d.g());
        }
    }
}
