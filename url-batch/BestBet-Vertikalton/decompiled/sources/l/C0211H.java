package l;

import k.InterfaceC0174D;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211H extends AbstractViewOnTouchListenerC0263u0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0216M f3289j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0219P f3290k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211H(C0219P c0219p, C0219P c0219p2, C0216M c0216m) {
        super(c0219p2);
        this.f3290k = c0219p;
        this.f3289j = c0216m;
    }

    @Override // l.AbstractViewOnTouchListenerC0263u0
    public final InterfaceC0174D b() {
        return this.f3289j;
    }

    @Override // l.AbstractViewOnTouchListenerC0263u0
    public final boolean c() {
        C0219P c0219p = this.f3290k;
        if (c0219p.getInternalPopup().a()) {
            return true;
        }
        c0219p.f3325f.g(c0219p.getTextDirection(), c0219p.getTextAlignment());
        return true;
    }
}
