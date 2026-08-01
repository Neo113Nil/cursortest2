package l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f0 extends s1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0 f2444o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o0 f2445p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(o0 o0Var, o0 o0Var2, l0 l0Var) {
        super(o0Var2);
        this.f2445p = o0Var;
        this.f2444o = l0Var;
    }

    @Override // l.s1
    public final k.c0 b() {
        return this.f2444o;
    }

    @Override // l.s1
    public final boolean c() {
        o0 o0Var = this.f2445p;
        if (o0Var.getInternalPopup().b()) {
            return true;
        }
        o0Var.f2518k.m(o0Var.getTextDirection(), o0Var.getTextAlignment());
        return true;
    }
}
