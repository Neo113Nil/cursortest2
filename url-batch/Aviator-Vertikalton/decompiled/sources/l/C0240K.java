package l;

import k.InterfaceC0185C;

/* renamed from: l.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240K extends AbstractViewOnTouchListenerC0295x0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0245P f3258j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T f3259k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240K(T t2, T t3, C0245P c0245p) {
        super(t3);
        this.f3259k = t2;
        this.f3258j = c0245p;
    }

    @Override // l.AbstractViewOnTouchListenerC0295x0
    public final InterfaceC0185C b() {
        return this.f3258j;
    }

    @Override // l.AbstractViewOnTouchListenerC0295x0
    public final boolean c() {
        T t2 = this.f3259k;
        if (t2.getInternalPopup().a()) {
            return true;
        }
        t2.f3298f.g(t2.getTextDirection(), t2.getTextAlignment());
        return true;
    }
}
