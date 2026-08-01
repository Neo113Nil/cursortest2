package l;

import k.InterfaceC0142C;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188H extends AbstractViewOnTouchListenerC0240u0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0193M f2851j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0196P f2852k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188H(C0196P c0196p, C0196P c0196p2, C0193M c0193m) {
        super(c0196p2);
        this.f2852k = c0196p;
        this.f2851j = c0193m;
    }

    @Override // l.AbstractViewOnTouchListenerC0240u0
    public final InterfaceC0142C b() {
        return this.f2851j;
    }

    @Override // l.AbstractViewOnTouchListenerC0240u0
    public final boolean c() {
        C0196P c0196p = this.f2852k;
        if (c0196p.getInternalPopup().a()) {
            return true;
        }
        c0196p.f2887f.g(c0196p.getTextDirection(), c0196p.getTextAlignment());
        return true;
    }
}
