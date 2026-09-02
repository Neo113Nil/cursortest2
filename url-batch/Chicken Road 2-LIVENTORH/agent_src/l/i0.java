package l;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i0 extends v1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o0 f2345o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r0 f2346p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r0 r0Var, r0 r0Var2, o0 o0Var) {
        super(r0Var2);
        this.f2346p = r0Var;
        this.f2345o = o0Var;
    }

    @Override // l.v1
    public final k.c0 b() {
        return this.f2345o;
    }

    @Override // l.v1
    public final boolean c() {
        r0 r0Var = this.f2346p;
        if (r0Var.getInternalPopup().b()) {
            return true;
        }
        r0Var.f2429k.e(r0Var.getTextDirection(), r0Var.getTextAlignment());
        return true;
    }
}
