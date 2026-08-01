package l;

import k.InterfaceC0145C;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195I extends AbstractViewOnTouchListenerC0248v0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0200N f2872j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0203Q f2873k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0195I(C0203Q c0203q, C0203Q c0203q2, C0200N c0200n) {
        super(c0203q2);
        this.f2873k = c0203q;
        this.f2872j = c0200n;
    }

    @Override // l.AbstractViewOnTouchListenerC0248v0
    public final InterfaceC0145C b() {
        return this.f2872j;
    }

    @Override // l.AbstractViewOnTouchListenerC0248v0
    public final boolean c() {
        C0203Q c0203q = this.f2873k;
        if (c0203q.getInternalPopup().a()) {
            return true;
        }
        c0203q.f2908f.f(c0203q.getTextDirection(), c0203q.getTextAlignment());
        return true;
    }
}
