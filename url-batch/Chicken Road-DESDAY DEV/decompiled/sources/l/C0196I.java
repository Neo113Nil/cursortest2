package l;

import k.InterfaceC0146C;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196I extends AbstractViewOnTouchListenerC0251w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0201N f2817j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0204Q f2818k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196I(C0204Q c0204q, C0204Q c0204q2, C0201N c0201n) {
        super(c0204q2);
        this.f2818k = c0204q;
        this.f2817j = c0201n;
    }

    @Override // l.AbstractViewOnTouchListenerC0251w0
    public final InterfaceC0146C b() {
        return this.f2817j;
    }

    @Override // l.AbstractViewOnTouchListenerC0251w0
    public final boolean c() {
        C0204Q c0204q = this.f2818k;
        if (c0204q.getInternalPopup().a()) {
            return true;
        }
        c0204q.f2853f.g(c0204q.getTextDirection(), c0204q.getTextAlignment());
        return true;
    }
}
