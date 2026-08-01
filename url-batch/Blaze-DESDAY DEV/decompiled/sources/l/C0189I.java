package l;

import k.InterfaceC0151C;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189I extends AbstractViewOnTouchListenerC0242v0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0194N f2836j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0197Q f2837k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189I(C0197Q c0197q, C0197Q c0197q2, C0194N c0194n) {
        super(c0197q2);
        this.f2837k = c0197q;
        this.f2836j = c0194n;
    }

    @Override // l.AbstractViewOnTouchListenerC0242v0
    public final InterfaceC0151C b() {
        return this.f2836j;
    }

    @Override // l.AbstractViewOnTouchListenerC0242v0
    public final boolean c() {
        C0197Q c0197q = this.f2837k;
        if (c0197q.getInternalPopup().a()) {
            return true;
        }
        c0197q.f2872f.g(c0197q.getTextDirection(), c0197q.getTextAlignment());
        return true;
    }
}
