package l;

import k.InterfaceC0187C;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241J extends AbstractViewOnTouchListenerC0295w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0246O f3258j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0249S f3259k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0241J(C0249S c0249s, C0249S c0249s2, C0246O c0246o) {
        super(c0249s2);
        this.f3259k = c0249s;
        this.f3258j = c0246o;
    }

    @Override // l.AbstractViewOnTouchListenerC0295w0
    public final InterfaceC0187C b() {
        return this.f3258j;
    }

    @Override // l.AbstractViewOnTouchListenerC0295w0
    public final boolean c() {
        C0249S c0249s = this.f3259k;
        if (c0249s.getInternalPopup().a()) {
            return true;
        }
        c0249s.f3298f.g(c0249s.getTextDirection(), c0249s.getTextAlignment());
        return true;
    }
}
