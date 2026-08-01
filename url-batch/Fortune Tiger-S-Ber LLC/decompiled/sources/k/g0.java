package k;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g0 extends s1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0 f2547o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o0 f2548p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o0 o0Var, o0 o0Var2, l0 l0Var) {
        super(o0Var2);
        this.f2548p = o0Var;
        this.f2547o = l0Var;
    }

    @Override // k.s1
    public final j.c0 b() {
        return this.f2547o;
    }

    @Override // k.s1
    public final boolean c() {
        o0 o0Var = this.f2548p;
        if (o0Var.getInternalPopup().b()) {
            return true;
        }
        o0Var.f2608k.m(o0Var.getTextDirection(), o0Var.getTextAlignment());
        return true;
    }
}
