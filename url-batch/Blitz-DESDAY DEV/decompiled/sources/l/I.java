package l;

import k.InterfaceC0160C;

/* loaded from: classes.dex */
public final class I extends AbstractViewOnTouchListenerC0219w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N f2889j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q f2890k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q2, Q q3, N n2) {
        super(q3);
        this.f2890k = q2;
        this.f2889j = n2;
    }

    @Override // l.AbstractViewOnTouchListenerC0219w0
    public final InterfaceC0160C b() {
        return this.f2889j;
    }

    @Override // l.AbstractViewOnTouchListenerC0219w0
    public final boolean c() {
        Q q2 = this.f2890k;
        if (q2.getInternalPopup().a()) {
            return true;
        }
        q2.f2926f.g(q2.getTextDirection(), q2.getTextAlignment());
        return true;
    }
}
