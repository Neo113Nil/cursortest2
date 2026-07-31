package t0;

import e2.InterfaceC0422a;
import s0.InterfaceC0957c;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989b extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0990c f8700f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0989b(C0990c c0990c, int i3) {
        super(0);
        this.f8699e = i3;
        this.f8700f = c0990c;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f8699e) {
            case 0:
                this.f8700f.A0();
                break;
            default:
                C0990c c0990c = this.f8700f;
                U.o oVar = c0990c.f8723q;
                f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC0957c) oVar).j(c0990c);
                break;
        }
        return R1.y.f4171a;
    }
}
