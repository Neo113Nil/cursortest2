package n;

import m.InterfaceC0214C;

/* renamed from: n.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253I extends AbstractViewOnTouchListenerC0311y0 {
    public final /* synthetic */ C0258N j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0261Q f3457k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253I(C0261Q c0261q, C0261Q c0261q2, C0258N c0258n) {
        super(c0261q2);
        this.f3457k = c0261q;
        this.j = c0258n;
    }

    @Override // n.AbstractViewOnTouchListenerC0311y0
    public final InterfaceC0214C b() {
        return this.j;
    }

    @Override // n.AbstractViewOnTouchListenerC0311y0
    public final boolean c() {
        C0261Q c0261q = this.f3457k;
        if (c0261q.getInternalPopup().a()) {
            return true;
        }
        c0261q.f3514f.f(c0261q.getTextDirection(), c0261q.getTextAlignment());
        return true;
    }
}
