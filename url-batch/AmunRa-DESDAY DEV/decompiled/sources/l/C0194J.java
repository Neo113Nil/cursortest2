package l;

import k.InterfaceC0143C;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194J extends AbstractViewOnTouchListenerC0248w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0199O f2967j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0202S f2968k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194J(C0202S c0202s, C0202S c0202s2, C0199O c0199o) {
        super(c0202s2);
        this.f2968k = c0202s;
        this.f2967j = c0199o;
    }

    @Override // l.AbstractViewOnTouchListenerC0248w0
    public final InterfaceC0143C b() {
        return this.f2967j;
    }

    @Override // l.AbstractViewOnTouchListenerC0248w0
    public final boolean c() {
        C0202S c0202s = this.f2968k;
        if (c0202s.getInternalPopup().a()) {
            return true;
        }
        c0202s.f3003f.g(c0202s.getTextDirection(), c0202s.getTextAlignment());
        return true;
    }
}
