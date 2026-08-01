package l;

import k.InterfaceC0149C;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185H extends AbstractViewOnTouchListenerC0239v0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0190M f2809j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0193P f2810k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185H(C0193P c0193p, C0193P c0193p2, C0190M c0190m) {
        super(c0193p2);
        this.f2810k = c0193p;
        this.f2809j = c0190m;
    }

    @Override // l.AbstractViewOnTouchListenerC0239v0
    public final InterfaceC0149C b() {
        return this.f2809j;
    }

    @Override // l.AbstractViewOnTouchListenerC0239v0
    public final boolean c() {
        C0193P c0193p = this.f2810k;
        if (c0193p.getInternalPopup().a()) {
            return true;
        }
        c0193p.f2845f.g(c0193p.getTextDirection(), c0193p.getTextAlignment());
        return true;
    }
}
