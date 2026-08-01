package l;

import k.InterfaceC0143C;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214J extends AbstractViewOnTouchListenerC0268w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0219O f2872j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0222S f2873k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214J(C0222S c0222s, C0222S c0222s2, C0219O c0219o) {
        super(c0222s2);
        this.f2873k = c0222s;
        this.f2872j = c0219o;
    }

    @Override // l.AbstractViewOnTouchListenerC0268w0
    public final InterfaceC0143C b() {
        return this.f2872j;
    }

    @Override // l.AbstractViewOnTouchListenerC0268w0
    public final boolean c() {
        C0222S c0222s = this.f2873k;
        if (c0222s.getInternalPopup().a()) {
            return true;
        }
        c0222s.f2908f.g(c0222s.getTextDirection(), c0222s.getTextAlignment());
        return true;
    }
}
