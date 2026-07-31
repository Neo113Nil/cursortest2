package F;

import e2.InterfaceC0422a;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class K0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f1210g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K0(boolean z3, InterfaceC0422a interfaceC0422a, int i3) {
        super(1);
        this.f1208e = i3;
        this.f1209f = z3;
        this.f1210g = interfaceC0422a;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f1208e) {
            case 0:
                ((b0.O) obj).b(this.f1209f ? 1.0f : ((Number) this.f1210g.b()).floatValue());
                break;
            default:
                ((b0.O) obj).e(!this.f1209f && ((Boolean) this.f1210g.b()).booleanValue());
                break;
        }
        return R1.y.f4171a;
    }
}
