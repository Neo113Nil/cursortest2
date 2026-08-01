package m;

import l.InterfaceC0154C;

/* renamed from: m.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191I extends AbstractViewOnTouchListenerC0252z0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0196N f2927j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0199Q f2928k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191I(C0199Q c0199q, C0199Q c0199q2, C0196N c0196n) {
        super(c0199q2);
        this.f2928k = c0199q;
        this.f2927j = c0196n;
    }

    @Override // m.AbstractViewOnTouchListenerC0252z0
    public final InterfaceC0154C b() {
        return this.f2927j;
    }

    @Override // m.AbstractViewOnTouchListenerC0252z0
    public final boolean c() {
        C0199Q c0199q = this.f2928k;
        if (c0199q.getInternalPopup().a()) {
            return true;
        }
        c0199q.f2978f.g(c0199q.getTextDirection(), c0199q.getTextAlignment());
        return true;
    }
}
