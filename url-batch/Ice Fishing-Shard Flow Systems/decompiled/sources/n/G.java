package n;

import m.InterfaceC0675D;

/* loaded from: classes.dex */
public final class G extends AbstractViewOnTouchListenerC0748z0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O f6637r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S f6638s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(S s7, S s8, O o7) {
        super(s8);
        this.f6638s = s7;
        this.f6637r = o7;
    }

    @Override // n.AbstractViewOnTouchListenerC0748z0
    public final InterfaceC0675D b() {
        return this.f6637r;
    }

    @Override // n.AbstractViewOnTouchListenerC0748z0
    public final boolean c() {
        S s7 = this.f6638s;
        if (s7.getInternalPopup().b()) {
            return true;
        }
        s7.f6704n.l(I.b(s7), I.a(s7));
        return true;
    }
}
