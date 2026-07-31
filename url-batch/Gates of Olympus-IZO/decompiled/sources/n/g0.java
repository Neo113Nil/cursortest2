package n;

/* loaded from: classes.dex */
public final class g0 extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f6086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(h0 h0Var, int i3) {
        super(0);
        this.f6085e = i3;
        this.f6086f = h0Var;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f6085e) {
            case 0:
                return Float.valueOf(this.f6086f.f6088q.f6106a.g());
            default:
                return Float.valueOf(this.f6086f.f6088q.f6109d.g());
        }
    }
}
