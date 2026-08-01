package l;

import k.InterfaceC0152C;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189H extends AbstractViewOnTouchListenerC0242u0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0194M f2866j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0197P f2867k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189H(C0197P c0197p, C0197P c0197p2, C0194M c0194m) {
        super(c0197p2);
        this.f2867k = c0197p;
        this.f2866j = c0194m;
    }

    @Override // l.AbstractViewOnTouchListenerC0242u0
    public final InterfaceC0152C b() {
        return this.f2866j;
    }

    @Override // l.AbstractViewOnTouchListenerC0242u0
    public final boolean c() {
        C0197P c0197p = this.f2867k;
        if (c0197p.getInternalPopup().a()) {
            return true;
        }
        c0197p.f2902f.g(c0197p.getTextDirection(), c0197p.getTextAlignment());
        return true;
    }
}
