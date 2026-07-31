package n;

import a0.C0238c;
import e2.InterfaceC0422a;
import r0.InterfaceC0919p;

/* renamed from: n.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675a0 extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f7084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0675a0(c0 c0Var, int i3) {
        super(0);
        this.f7083e = i3;
        this.f7084f = c0Var;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f7083e) {
            case 0:
                InterfaceC0919p interfaceC0919p = (InterfaceC0919p) this.f7084f.D.getValue();
                return new C0238c(interfaceC0919p != null ? interfaceC0919p.N(0L) : 9205357640488583168L);
            case 1:
                return new C0238c(this.f7084f.f7098F);
            default:
                this.f7084f.A0();
                return R1.y.f4171a;
        }
    }
}
